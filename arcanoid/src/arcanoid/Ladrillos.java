package arcanoid;

import java.awt.Color;
import java.awt.Graphics;



public class Ladrillos extends Objeto{
	private Color color;
	
	public static  Color colores[] = new Color[] {
			Color.red,Color.blue,Color.green,Color.yellow,Color.white
	};

	public Ladrillos(int x, int y, int alto, int ancho,Color colores[] , int indice) {
		super(x, y, alto, ancho);
		this.color=colores[indice];
	}
	
	public void collisionWith(Objeto actorCollisioned) {
		super.collisionWith(actorCollisioned);
		// Debo comprobar el tipo del actor que colisiona con este
		if (actorCollisioned instanceof Pelota) {
			// Si este actor colisiona con un misil o una bomba, debo eliminar el monstruo
			this.setMarkedForRemoval(true);
		
		}
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(this.color);
		g.fillRect(x, y, alto,ancho);
	
	}


	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}


	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}


	/**
	 * @return the colores
	 */
	public static Color[] getColores() {
		return colores;
	}


	/**
	 * @param colores the colores to set
	 */
	public static void setColores(Color[] colores) {
		Ladrillos.colores = colores;
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}
	

}
