package arcanoid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.List;

public class Fase1{
	
	int golpes=0;
	List<Objeto> actores = new ArrayList<Objeto>();
	
	Color colores[] = new Color[] {
			Color.GREEN,Color.orange,Color.pink,Color.yellow,Color.DARK_GRAY
	};
	public static final int ESPACIO_SUPERIOR_SOBRE_LADRILLOS = 60;
	public Fase1() {
		inicializaFase();
		
	}
	public void inicializaFase() {

		int cX =35;
		int cY=30;
		for (int i = 0; i <colores.length ; i++) {
			for(int j=0; j< 11;j++) {
				actores.add(new Ladrillos(cX,cY ,35,20, colores,i));
			
				cX+=40;
			}
			cX=35;
			cY+=35;
		}
		
		actores.add(Game.getInstance().bola);
		actores.add(Game.getInstance().naves);
		
		if( actores instanceof Pelota) {
			((Objeto) actores).setMarkedForRemoval(true);
		}
		
	}

}
	





