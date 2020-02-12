package arcanoid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Pelota extends Objeto implements KeyListener {
	public int velDeLaX = 4;
	public int velDeLaY = 4;
	public int alto = 10;
	public int ancho = 10;
	public int x = 200;
	public int y = 490;
	private boolean space;
	private boolean pintargameover = false;
	protected int vx; // Cantidad de p�xeles que aumentar� la posici�n del jugador en cada
						// iteraci�n
						// del bucle principal del juego
	protected int vy; // igual a la anterior en el eje vertical
	TrayectoriaRecta trayectoria = null;
	PuntoAltaPrecision coordenada = null;
	public int puntosVida = 3;
	private float velocidadPorFrame = 2.5f;
	private float factorIncrementoVelocidadBola = 1.00055f;
	private static final float velMax = 5;
	static int golpes = 0 ;

	public Pelota() {
		super();
	}

	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(this.x, this.y, this.alto, this.ancho);
		if (pintargameover) {
			g.drawImage(SpritesRepository.getInstance().getSprite("gameOver.jpg"), 190, 230, null);
		}
		for(int i =0; i<this.puntosVida;i++) {
			g.drawImage(SpritesRepository.getInstance().getSprite("nave-25x7.png"), 50*i, 600, null);
			
		}
	}

	@Override
	public void act() {
		if (trayectoria == null) {
			this.x = Game.getInstance().naves.x + Game.getInstance().naves.ancho / 2;
			this.y = Game.getInstance().naves.y - this.alto;
		} else {
			this.coordenada = this.trayectoria.getPuntoADistanciaDePunto(this.coordenada,velocidadPorFrame );
			this.x = Math.round(this.coordenada.x);
			this.y = Math.round(this.coordenada.y);

			if (this.x > (Game.getInstance().getWidth() - this.ancho) || this.x < 0) {
				this.trayectoria.reflejarHorizontalmenteRespectoAPunto(coordenada);
			}

			if (this.y > (Game.getInstance().getHeight() - this.alto) || this.y < 0) {
				this.trayectoria.reflejarVerticalmenteRespectoAPunto(coordenada);
			}

			// Calculo del nuevo punto de la trayectoria de la bola
			PuntoAltaPrecision nuevoPuntoEnLaTrayectoria = this.trayectoria.getPuntoADistanciaDePunto(this.coordenada,
					this.velocidadPorFrame);
			this.coordenada = nuevoPuntoEnLaTrayectoria;
			// Actualizo las coordenadas enteras del supertipo Actor, ya que es conforme a
			// estas con las que se pinta en pantalla
			// y se detectan las colisiones.
			this.x = Math.round(this.coordenada.x);
			this.y = Math.round(this.coordenada.y);

			if (this.velocidadPorFrame < velMax) {
				this.velocidadPorFrame *= this.factorIncrementoVelocidadBola;
			}

			if (this.y > (Game.getInstance().getHeight() - this.alto)) {
				puntosVida--;
				this.trayectoria=null;
				finDePartida();
				
				
			}
		}

	}

	public void collisionWith(Objeto actorCollisioned) {
		if (actorCollisioned instanceof Ladrillos) {
			//this.trayectoria.reflejarVerticalmenteRespectoAPunto(coordenada);
			colisionConLadrillo(actorCollisioned);
			crearexplosiones();
			int golpes = 0 ;
			SoundsRepostories.getInstance().playSound("explosion.wav");
		}
		if (actorCollisioned instanceof Nave) {
			//this.trayectoria.reflejarHaciaArriba(coordenada);
			colisionConNave(Game.getInstance().naves);
		}
		
	}

	public void crearexplosiones() {
		Explosion boom = new Explosion();
		boom.setX(this.x);
		boom.setY(this.y);
		Game.getInstance().actores.add(boom);

	}

	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_SPACE:
			space = false;
			break;
		}
		updateSpeed();
	}

	protected void updateSpeed() {
		vx = Game.getInstance().naves.x;
		vy = Game.getInstance().naves.y - 6;
		if (space)
			x = vx;
		if (space)
			y = vy;

	}

	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_SPACE:
			this.coordenada = new PuntoAltaPrecision(this.x, this.y);
			this.trayectoria = new TrayectoriaRecta(-3f, coordenada, true);
			break;
		}
		updateSpeed();
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void finDePartida() {
		if(puntosVida==0){
				pintargameover=true;
				this.trayectoria=null;
		}	
	}
	
	private void colisionConNave (Nave nave) {
		// Creo rect�ngulos para determinar la zona de la nave con la que choca la bola
		int anchoZonaEspecial = 7; // p�xeles que delimitan la zona de rebote especial de la nave
		Rectangle rectIzqNave = new Rectangle(nave.x, nave.y, anchoZonaEspecial, nave.alto);
		Rectangle rectDerNave = new Rectangle(nave.x + nave.ancho - anchoZonaEspecial, nave.y, anchoZonaEspecial, nave.alto);
		Rectangle rectBola = new Rectangle(this.x, this.y, this.ancho, this.alto);
		
		// Colisi�n con el lado derecho de la nave
		if (rectBola.intersects(rectDerNave)) {
			this.y = nave.y - nave.getAlto();
			this.coordenada.y = this.y;
			if (Math.abs(this.trayectoria.getPendiente()) > 1 ) { // La bola viene on una pendiente mayor a 1
				this.trayectoria.setPendiente(-(float) (Math.random() * (0.8 - 0.3) + 0.3), this.coordenada, true);
			}
			else { // La bola viene con una pendiente suave ( > 0 y < 1 )
				this.trayectoria.setPendiente(-(float) (Math.random() * (10 - 2) + 2), this.coordenada, true);
			}
			return;
		}
		// Colisi�n con el lado izquierdo de la nave
		if (rectBola.intersects(rectIzqNave)) {
			this.y = nave.y - nave.getAlto();
			this.coordenada.y = this.y;
			if (Math.abs(this.trayectoria.getPendiente()) > 1 ) { // La bola viene con una pendiente mayor a 1
				this.trayectoria.setPendiente((float) (Math.random() * (0.8 - 0.3) + 0.3), this.coordenada, false);
			}
			else { // La bola viene con una pendiente suave ( > 0 y < 1 )
				this.trayectoria.setPendiente((float) (Math.random() * (10 - 2) + 2), this.coordenada, false);
			}
			return;
		}
		else { // La bola intersecta la parte central de la nave
			this.trayectoria.reflejarHaciaArriba(this.coordenada);
			return;
		}
	}
	
	public Rectangle getRectanguloParaColisiones () {
		return new Rectangle(this.x + this.ancho / 2 - 4, this.y + this.alto / 2 - 4, 8, 8);
	}
	
	private void colisionConLadrillo (Objeto actorColisionado) {
		int margenLateral = 4; // Este mare
		// Creo peque�os rect�ngulos que coincidir�n con los bordes del ladrillo
		Rectangle rectArribaActor = new Rectangle(actorColisionado.getX(), actorColisionado.getY(), actorColisionado.getAncho(), 1);
		Rectangle rectAbajoActor = new Rectangle(actorColisionado.getX(), actorColisionado.getY() + actorColisionado.getAlto()-1, actorColisionado.getAncho(), 1);
		Rectangle rectIzquierdaActor = new Rectangle(actorColisionado.getX(), actorColisionado.getY() + margenLateral, 1, actorColisionado.getAlto() - 2 * margenLateral);
		Rectangle rectDerechaActor = new Rectangle(actorColisionado.getX() + actorColisionado.getAncho()-1, actorColisionado.getY() + margenLateral, 1, actorColisionado.getAlto() - 2 * margenLateral);

		// variables booleanas que me indicar�n una colsi�n por cada lado del ladrillo
		boolean arriba = false, abajo = false, derecha = false, izquierda = false;
		
		if (this.getRectanguloParaColisiones().intersects(rectArribaActor))  arriba = true;
		if (this.getRectanguloParaColisiones().intersects(rectAbajoActor))  abajo = true;
		if (this.getRectanguloParaColisiones().intersects(rectIzquierdaActor))  izquierda = true;
		if (this.getRectanguloParaColisiones().intersects(rectDerechaActor))  derecha = true;
		
		if (arriba && izquierda) { // Colisi�n con esquina superior izquierda
			// Coloco la bola en la esquina
			this.x = actorColisionado.x;
			this.y = actorColisionado.y;
			this.coordenada.x = this.x; this.coordenada.y = this.y;
			// Recalculo la pendiente
			this.trayectoria.setPendiente(Math.abs(this.trayectoria.getPendiente()), this.coordenada, false);
			return;
		}
		if (arriba && derecha) {
			this.x = actorColisionado.x + actorColisionado.ancho;
			this.y = actorColisionado.y;
			this.coordenada.x = this.x; this.coordenada.y = this.y;
			this.trayectoria.setPendiente(0-Math.abs(this.trayectoria.getPendiente()), this.coordenada, true);
			return;
		}
		if (abajo && izquierda) {
			this.x = actorColisionado.x;
			this.y = actorColisionado.y + actorColisionado.alto;
			this.coordenada.x = this.x; this.coordenada.y = this.y;
			this.trayectoria.setPendiente(0-Math.abs(this.trayectoria.getPendiente()), this.coordenada, false);
			return;
		}
		if (abajo && derecha) {
			this.x = actorColisionado.x + actorColisionado.ancho;
			this.y = actorColisionado.y + actorColisionado.alto;
			this.coordenada.x = this.x; this.coordenada.y = this.y;
			this.trayectoria.setPendiente(Math.abs(this.trayectoria.getPendiente()), this.coordenada, true);
			return;
		}
		if (abajo) {
			this.y = actorColisionado.y + actorColisionado.alto;
			this.coordenada.y = this.y;
			this.trayectoria.reflejarHaciaAbajo(this.coordenada);
			return;
		}
		if (arriba) {
			this.y = actorColisionado.y;
			this.coordenada.y = this.y;
			this.trayectoria.reflejarHaciaArriba(this.coordenada);
			return;
		}
		if (izquierda) {
			this.x = actorColisionado.x;
			this.coordenada.x = this.x;
			this.trayectoria.reflejarHaciaIzquierda(this.coordenada);
			return;
		}
		if (derecha) {
			this.x = actorColisionado.x + actorColisionado.ancho;
			this.coordenada.x = this.x;
			this.trayectoria.reflejarHaciaDerecha(this.coordenada);
			return;
		}
	}
}
