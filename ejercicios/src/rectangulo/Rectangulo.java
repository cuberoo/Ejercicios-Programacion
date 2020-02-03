package rectangulo;

public class Rectangulo {
	private int alto;
	private int ancho;
	
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
	
	public  Rectangulo(int ancho, int alto) {
		super();
		this.alto = alto;
		this.ancho = ancho;
	}
	
	public void imprimeconsola() {
		for (int i = 0; i < this.ancho; i++) {
			for (int j = 0; j < this.alto; j++) {
			System.out.print("  *  ");
			}
			System.out.println();
		}
		
	}
	}
