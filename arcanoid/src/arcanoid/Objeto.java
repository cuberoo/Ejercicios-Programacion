package arcanoid;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;




public abstract class Objeto {
	public  int x;
	public int y;
	public int alto;
	public int ancho;
	protected boolean markedForRemoval = false;
	protected int velocidadDeCambioDeSprite = 0;
	protected List<BufferedImage> sprites = new ArrayList<BufferedImage>();
	protected BufferedImage spriteActual = null;
	
	public Objeto(int x, int y, int alto, int ancho) {
		this.x = x;
		this.y = y;
		this.alto = alto;
		this.ancho = ancho;
	}

	public abstract void act();
	
	public Objeto() {
		
	}
	
	public Objeto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Objeto (String spriteNames[]) {
		this.velocidadDeCambioDeSprite = 1;
		cargarImagenesDesdeSpriteNames(spriteNames);
	}
	
	public Objeto (String spriteNames[], int velocidadDeCambioDeSprite) {
		this.velocidadDeCambioDeSprite = velocidadDeCambioDeSprite;
		cargarImagenesDesdeSpriteNames(spriteNames);
	}
	

	private void cargarImagenesDesdeSpriteNames (String spriteNames[]) {
		// Obtengo las im�genes de este actor, a partir del patr�n de dise�o Singleton con el que se encuentra
		// el spritesRepository
		for (String sprite : spriteNames) {
			this.sprites.add(SpritesRepository.getInstance().getSprite(sprite));
		}
		// ajusto el primer sprite del actor
		if (this.sprites.size() > 0) {
			this.spriteActual = this.sprites.get(0);
			
		}
		if(this.getSpriteActual().equals(this.sprites.get(this.sprites.size()-1))) {
			this.setMarkedForRemoval(true);
		}
		
	}

	private void adjustHeightAndWidth () {
		// Una vez que tengo las im�genes que representa a este actor, obtengo el ancho y el alto m�ximos de las mismas y se
		// los traspaso a objeto actual.
		if (this.sprites.size() > 0) {
			this.alto = this.sprites.get(0).getHeight();
			this.ancho = this.sprites.get(0).getWidth();
		}
		for (BufferedImage sprite : this.sprites) {
			// Ajusto el m�ximo width como el width del actor
			if (sprite.getWidth() > this.ancho) {
				this.ancho = sprite.getWidth();
			}
			// Lo mismo que el anterior, pero con el m�ximo height
			if (sprite.getHeight() > this.alto) {
				this.alto = sprite.getHeight();
			}
		}
	}
	
	
	public void collisionWith (Objeto actorCollisioned) {}

	public abstract void paint (Graphics g);
	
	public boolean isMarkedForRemoval() { return markedForRemoval; }
	public void setMarkedForRemoval(boolean markedForRemoval) { this.markedForRemoval = markedForRemoval; }

	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the alto
	 */
	public int getAlto() {
		return alto;
	}

	/**
	 * @param alto the alto to set
	 */
	public void setAlto(int alto) {
		this.alto = alto;
	}

	/**
	 * @return the ancho
	 */
	public int getAncho() {
		return ancho;
	}

	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	/**
	 * @return the velocidadDeCambioDeSprite
	 */
	public int getVelocidadDeCambioDeSprite() {
		return velocidadDeCambioDeSprite;
	}

	/**
	 * @param velocidadDeCambioDeSprite the velocidadDeCambioDeSprite to set
	 */
	public void setVelocidadDeCambioDeSprite(int velocidadDeCambioDeSprite) {
		this.velocidadDeCambioDeSprite = velocidadDeCambioDeSprite;
	}

	/**
	 * @return the sprites
	 */
	public List<BufferedImage> getSprites() {
		return sprites;
	}

	/**
	 * @param sprites the sprites to set
	 */
	public void setSprites(List<BufferedImage> sprites) {
		this.sprites = sprites;
	}

	/**
	 * @return the spriteActual
	 */
	public BufferedImage getSpriteActual() {
		return spriteActual;
	}

	/**
	 * @param spriteActual the spriteActual to set
	 */
	public void setSpriteActual(BufferedImage spriteActual) {
		this.spriteActual = spriteActual;
	}
	
	
}
