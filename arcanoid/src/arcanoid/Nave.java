package arcanoid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.net.URL;

import javax.imageio.ImageIO;

public class Nave extends Objeto  implements KeyListener ,  MouseMotionListener{
	protected int vx; // Cantidad de p�xeles que aumentar� la posici�n del jugador en cada iteraci�n del bucle principal del juego
	protected int vy; // igual a la anterior en el eje vertical
	private boolean up,down,left,right; // Booleanas que determinan si el player se est� moviendo actualmente
	protected static final int PLAYER_SPEED = 4; // velocidad del movimiento de la nave en los dos ejes
	public int alto = 35;
	public int ancho = 50;
	
	public Nave(int x, int y ) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(loadImage("../resources/nave-50x15.png"),x,y,null);
		
	}
	
	public void act() {
		// Movimiento en el eje horizontal
		this.x += this.vx; // En cada iteraci�n del bucle principal, el monstruo cambiar� su posici�n en el eje X, sum�ndole a esta el valor de vx
		// si la nave intenta salir por la derecha no se lo permitimos
		if (this.x <  0) {
			this.x = 0;
		}
		// si la nave intenta salir por la izquierda no se lo permitimos
		if (this.x >  (Game.getInstance().getWidth() - this.ancho)) {
			this.x = (Game.getInstance().getWidth() - this.ancho);
		}
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

	/**
	 * Cuando una tecla se libera se desactiva la bandera booleana que se hab�a activado al pulsarla
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
  			case KeyEvent.VK_LEFT : left = false; break; 
  			case KeyEvent.VK_RIGHT : right = false;break;
		}
		updateSpeed();
	}
	  
	/**
	 * Este m�todo no se utiliza pero es necesario implementarlo por el KeyListener
	 */
	@Override
	public void keyTyped(KeyEvent e) {}
	
	/**
	 * En funci�n de las banderas booleanas de movimiento, actualizamos las velocidades en los dos ejes
	 */
	protected void updateSpeed() {
		vx=0;vy=0;
		if (left) vx = -PLAYER_SPEED;
		if (right) vx = PLAYER_SPEED;
	}
		  
	
	// M�todos Getters y Setters
	public int getVx() { return vx; }
	public void setVx(int vx) { this.vx = vx; }

	public int getVy() { return vy; }
	public void setVy(int vy) { this.vy = vy; }

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT : left = true; break; 
			case KeyEvent.VK_RIGHT : right = true;break;
	}
	updateSpeed();
	}
	
	public void collisionWith(Objeto actorCollisioned) {
		super.collisionWith(actorCollisioned);
		// Debo comprobar el tipo del actor que colisiona con este
		if (actorCollisioned instanceof Pelota) {
			// Si este actor colisiona con un misil o una bomba, debo eliminar el monstruo
		
		
		}
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		Point puntoPoint = MouseInfo.getPointerInfo().getLocation();
		this.x=puntoPoint.x;
		
	}


}
	


