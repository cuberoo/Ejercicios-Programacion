package arcanoid;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class Game extends Canvas {
	JFrame Ventana = new JFrame ("Arcanoid");
	
	private  int JFRAME_WIDTH=500;
	private  int JFRAME_HEIGHT=700;
	
	private int FPS = 60;
	private long usedTime;

	// BufferStrategy usado para conseguir la t�cnica de doble b�ffer
	private BufferStrategy strategy;
	private static Game instance= null;
	
	private boolean quedanLadrillos = false;
	private boolean siguienteFase =false;
	
	List<Objeto> actores=new ArrayList<Objeto>();
	List<Ladrillos> newActorsForNextIteration = new ArrayList<Ladrillos>();
	
	
	Nave naves = new Nave(180,500);
	Pelota bola = new Pelota();

	private Object fase;
	
	
	public Game () {
		SoundsRepostories.getInstance().loopSound("arkanoid-zx-spectrum-musicas.wav");
		// Obtengo referencia al panel principal de la ventana
				JPanel panel = (JPanel) Ventana.getContentPane();
				// Establezco una plantilla en el panel, para poder incorporar el Canvas
				panel.setLayout(new BorderLayout());
				// Agrego el Canvas al panel
				panel.add(this, BorderLayout.CENTER);
				// Dimensiono la ventana
				Ventana.setBounds(0,0, JFRAME_WIDTH, JFRAME_HEIGHT);
				// Muestro la ventana en pantalla
				Ventana.setVisible(true);
				Ventana.addWindowListener( new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						cerrarAplicacion();
					}
				});
				// Con ignoreRepaint le decimos al JFrame que no debe repintarse cuando el Sistema Operativo se lo indique,
				// nosotros nos ocupamos totalmente del refresco de la pantalla
				Ventana.setIgnoreRepaint(true);
				// El Canvas se dibujar� en pantalla con una estrategia de doble b�ffer
				this.createBufferStrategy(2);
				// Obtengo una referencia a la estrategia de doble b�ffer.
				strategy = getBufferStrategy();
				// El foco de Windows ir� al Canvas, para que directamente podamos controlar este juego a trav�s del teclado
				this.requestFocus();
				this.addMouseMotionListener(naves);
			Ventana.setResizable(false);
			
	}
	
	private void cerrarAplicacion() {
		String [] opciones ={"Aceptar","Cancelar"};
		int eleccion = JOptionPane.showOptionDialog(Ventana,"¿Desea cerrar la aplicacion?","Salir de la aplicacion",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		if (eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
					
	public void World() {
		this.addKeyListener(naves);
		this.addKeyListener( bola);
		
		// Puede ocurrir que existan actores que se deben eliminar para el siguiente pintado de escena.
				// Cuando estoy recorriendo una lista no puedo eliminar elementos sin arriesgarme a provocar un problema de
				// concurrencia de acceso. Por ello lo que hago es crear una nueva lista con los elementos a eliminar. Despu�s
				// se recorre esa lista eliminando los elementos de la lista principal y, por �ltimo, limpio la lista
				List<Objeto> actorsForRemoval = new ArrayList<Objeto>();
				for (Objeto actor : this.actores) {
					if (actor.isMarkedForRemoval()) {
						actorsForRemoval.add(actor);
					}
				}
				// Elimino los actores marcados para su eliminaci�n
				for (Objeto actor : actorsForRemoval) {
					this.actores.remove(actor);
				}
				// Limpio la lista de actores para eliminar
				actorsForRemoval.clear();
				
				
				// Adem�s de eliminar actores, tambi�n puede haber actores nuevos que se deban insertar en la siguiente iteraci�n.
				// Se insertan y despu�s se limpia la lista de nuevos actores a insertar
				this.actores.addAll(newActorsForNextIteration);
				this.newActorsForNextIteration.clear();

				// Finalmente, se llama al m�todo "act" de cada actor, para que cada uno recalcule por si mismo sus valores.
				for (Objeto actor : actores) {
					actor.act();
				}
				
				Rectangle rectangulobola =new Rectangle(bola.x + bola.ancho / 2 - 4, bola.y + bola.alto / 2 - 4, 8, 8);
				
				for (Objeto actor : actores) {
					
					if (!actor.equals(bola)) {
						Rectangle rectangulo = new Rectangle(actor.x, actor.y, actor.ancho, actor.alto);
						Rectangle rectangulonaves = new Rectangle(naves.x, naves.y, naves.ancho, naves.alto);
						if(rectangulobola.intersects(rectangulo)) {
							actor.collisionWith(bola);
							bola.collisionWith(actor);
							break;
						}
						if(rectangulobola.intersects(rectangulonaves)) {
							naves.collisionWith(bola);
							bola.collisionWith(naves);
							break;
						}
					}
				}
				if(siguienteFase==true) {
					Fase1 fase =new Fase1();
					this.actores.clear();
					this.actores.addAll(fase.actores);
				}
				
	}
	
	public void updateNave() {
			naves.act();
	}
				
	public void bloques() {
		int cX =40;
		int cY=30;
		for (int i = 0; i <Ladrillos.colores.length ; i++) {
			for(int j=0; j< 11;j++) {
				actores.add(new Ladrillos(cX,cY ,35,20, Ladrillos.getColores(),i));
			
				cX+=40;
			}
			cX=40;
			cY+=30;
		}
		
		actores.add(bola);
		actores.add(naves);
		
		if(siguienteFase==true) {
			Fase1 fase =new Fase1();
			fase.inicializaFase();
		}
		
		
		
	}
	
	public void fps() {
	// El bucle se ejecutar� mientras el objeto Canvas sea visible
		bloques();
		while (this.isVisible()) {
			long startTime = System.currentTimeMillis(); // Tomo el tiempo, en millis, antes de crear el siguiente Frame del juego
			// actualizo y pinto la escena
			World();
			paintWorld();
			updateNave();
			comprobarSiHayLadrillos();
			segundaFase();
			// Calculo el tiempo que se ha tardado en la ejecuci�n
			usedTime = System.currentTimeMillis()-startTime;
			// Hago que el bucle pare una serie de millis, antes de generar el siguiente FPS
			// El c�lculo hecho "duerme" el proceso para no generar m�s de los SPEED_FPS que se haya espec�ficado
			try { 
				int millisToSleep = (int) (1000/FPS - usedTime);
				if (millisToSleep < 0) {
					millisToSleep = 0;
				}
				Thread.sleep(millisToSleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			  }
		}
	}
					
		public void paintWorld() {
			// Resuelve un problema de sincronizaci�n de memoria de v�deo en Linux
			Toolkit.getDefaultToolkit().sync();
			// Obtengo el objeto gr�fico que me permita pintar en el doble b�ffer
			Graphics2D g = (Graphics2D)strategy.getDrawGraphics();
			// Pinto un rect�ngulo negro que ocupe toda la escarg0ena
			g.setColor(Color.black);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
			for(Objeto actor:actores) {
				actor.paint(g);
			}

			// Muestro en pantalla el buffer con el nuevo frame creado para el juego
			strategy.show();
			
		}
		
		private BufferedImage loadImage(String resourceName) {
			// Para localizar el archivo se utiliza un objeto de tipo URL
			URL url=null;
			
			// Se intenta cargar el recurso del disco duro, si no se pudiera se capturar� la excepci�n y se
			// mostrar� un mensaje en pantalla
			try {
				url = getClass().getResource(resourceName);
				return ImageIO.read(url);
			} catch (Exception e) {
				// Aqu� dentro capturamos y tratamos el error que pueda haberse ocasionado
				System.out.println("No se pudo cargar la imagen " + resourceName +" de "+url);
				System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
				System.exit(0); // Fin del programa
			}
			return null; // S�lo se llegar� a esta l�nea si no se ha podido cargar el recurso correctamente
		}
		
		public void comprobarSiHayLadrillos() {
			quedanLadrillos = false;
			for(Objeto actor :this.actores) {
				if(actor instanceof Ladrillos)  {
					quedanLadrillos = true;
					break;
				}
			}
			
		}
		public void segundaFase() {
			if(quedanLadrillos == false && siguienteFase == false) {
				bola.trayectoria=null;
				Fase1 fase =new Fase1();
				fase.inicializaFase();
				siguienteFase = true;
			}
		}
					
		public static Game getInstance() {
			if (instance == null) {
				instance = new Game();
			}
			return instance;
		}
		
}
