package antigüedades;

public class antigüedades {
 private int anio_fabricacion;
 private String origen;
 private float precio;
 
 
 public antigüedades() {
	 super();
 }
 
 public antigüedades(int anio_fabricacion, String origen, float precio) {
	super();
	this.anio_fabricacion = anio_fabricacion; 
	this.origen = origen;
	this.precio = precio;
 }

/**
 * @return the anio_fabricacion
 */
public int getAnio_fabricacion() {
	return anio_fabricacion;
}

/**
 * @param anio_fabricacion the anio_fabricacion to set
 */
public void setAnio_fabricacion(int anio_fabricacion) {
	this.anio_fabricacion = anio_fabricacion;
}

/**
 * @return the origen
 */
public String getOrigen() {
	return origen;
}

/**
 * @param origen the origen to set
 */
public void setOrigen(String origen) {
	this.origen = origen;
}

/**
 * @return the precio
 */
public float getPrecio() {
	return precio;
}

/**
 * @param precio the precio to set
 */
public void setPrecio(float precio) {
	this.precio = precio;
}
 
 
}
