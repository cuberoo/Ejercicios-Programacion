package antigüedades;

public class libros extends antigüedades {
	private String titulo;
	private String autor;
	
	public libros(int anio_fabricacion, String origen, float precio, String titulo, String autor) {
		super(anio_fabricacion, origen, precio);
		this.autor = autor;
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "libros [titulo=" + titulo + ", autor=" + autor + ", getAnio_fabricacion()=" + getAnio_fabricacion()
		+ ", getOrigen()=" + getOrigen() + ", getPrecio()=" + getPrecio() + "]";
	}


	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
