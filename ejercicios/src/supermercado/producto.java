package supermercado;

public class producto {

	private String codigo;
	private String nombre;
	private int precio;
	
	/**
	 * 
	 */
	public producto() {
		
	}
	
	/**
	 * @param codigo
	 * @param nombre
	 * @param precio
	 */
	public producto(String codigo, String nombre, int precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
}
