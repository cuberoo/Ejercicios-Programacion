package antigüedades;

public class joyas extends antigüedades {

	private String material_fabricacion;

	
	public joyas(int anio_fabricacion, String origen, float precio, String material_fabricacion ) {
		super(anio_fabricacion, origen, precio);
		this.material_fabricacion = material_fabricacion;
	}

	@Override
	public String toString() {
		return "joyas [material_fabricacion=" + material_fabricacion + ", Anio_fabricacion="
				+ getAnio_fabricacion() + ", Origen=" + getOrigen() + ", Precio=" + getPrecio() + "]";
	}



	/**
	 * @return the maerial_fabricacion
	 */
	public String getMaerial_fabricacion() {
		return material_fabricacion;
	}

	/**
	 * @param maerial_fabricacion the maerial_fabricacion to set
	 */
	public void setMaerial_fabricacion(String maerial_fabricacion) {
		this.material_fabricacion = maerial_fabricacion;
	}

}
