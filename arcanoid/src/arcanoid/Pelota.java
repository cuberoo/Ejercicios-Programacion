package arcanoid;

import java.awt.Color;
import java.awt.Graphics;
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
	protected int vx; // Cantidad de p�xeles que aumentar� la posici�n del jugador en cada iteraci�n
						// del bucle principal del juego
	protected int vy; // igual a la anterior en el eje vertical
	TrayectoriaRecta trayectoria = null;
	PuntoAltaPrecision coordenada = null;

	public Pelota() {
		super();
	}

	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(this.x, this.y, this.alto, this.ancho);
	}

	@Override
	public void act() {
		if (trayectoria == null) {
			this.x = Game.getInstance().naves.x + Game.getInstance().naves.ancho / 2;
			this.y = Game.getInstance().naves.y - this.alto;
		} else {

			this.coordenada =this.trayectoria.getPuntoADistanciaDePunto(this.coordenada, 5);
			this.x=Math.round(this.coordenada.x);
			this.y=Math.round(this.coordenada.y);
			
			if(this.x>=Game.getInstance().getWidth()- this.ancho) {
				trayectoria.reflejarHaciaIzquierda(coordenada);
			}

			if(-this.y>=Game.getInstance().getHeight()- this.alto) {
				trayectoria.reflejarHaciaAbajo(coordenada);
			}
		}

	}

	public void collisionWith(Objeto actorCollisioned) {
		if (actorCollisioned instanceof Ladrillos) {
			crearexplosiones();
			this.velDeLaX = -velDeLaX;
			velDeLaY = -velDeLaY;
			crearexplosiones();
			SoundsRepostories.getInstance().playSound("explosion.wav");
		}
		if (actorCollisioned instanceof Nave) {
			this.velDeLaX = -velDeLaX;
			velDeLaY = -velDeLaY;

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
		this.coordenada=new PuntoAltaPrecision(this.x, this.y);
		this.trayectoria=new TrayectoriaRecta(-3f, coordenada, true);
			break;
		}
		updateSpeed();
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}
