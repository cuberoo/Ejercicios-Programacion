package arcanoid;

import java.awt.Graphics;

public class Explosion  extends Objeto{
	private int unidadDeTiempo = 0;
	
	private static String[] imagenes =new String[] {
			"sprite-explosion1.png", "sprite-explosion2.png", "sprite-explosion3.png", "sprite-explosion4.png", "sprite-explosion5.png", "sprite-explosion6.png"
			, "sprite-explosion7.png", "sprite-explosion8.png", "sprite-explosion9.png"
	};
	public Explosion() {
		super(imagenes, 2);
		
	}

	@Override
	public void act() {
		if(this.getSpriteActual().equals(this.sprites.get(this.sprites.size()-1))) {
			this.setMarkedForRemoval(true);
		}
		
		// En el caso de que exista un array de sprites el actor actual se tratar� de una animaci�n, para eso llevaremos a cabo los siguientes pasos
		if (this.sprites != null && this.sprites.size() > 1) {
			// cada vez que llaman a "act()" se incrementar� esta unidad, siempre que existan sprites
			unidadDeTiempo++;
			// Si la unidad de tiemplo coincide o es m�ltiplo de la velocidad de cambio de sprite, entramos al if
			if (unidadDeTiempo % velocidadDeCambioDeSprite == 0){
				// Reiniciamos la unidad de tiempo
				unidadDeTiempo = 0;
				// Obtengo el �ndice del spriteActual, dentro de la lista de �ndices
				int indiceSpriteActual = sprites.indexOf(this.spriteActual);
				// Obtengo el siguiente �ndice de sprite, teniendo en cuenta que los sprites cambian de uno a otro en ciclo
				int indiceSiguienteSprite = (indiceSpriteActual + 1) % sprites.size();
				// Se selecciona el nuevo spriteActual
				this.spriteActual = sprites.get(indiceSiguienteSprite);
			}
		}
		

	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(spriteActual, x, y, null);
	}

}
