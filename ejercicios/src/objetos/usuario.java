package objetos;

public class usuario {
	//creamos las propiedades del usuario  Nombre, Apellidos, DNI, dirección, teléfono
	public String nombre;
	public String apellido;
	public String DNI;
	public String direccion;
	public int telefono;
	
public void datos () {
	System.out.println("el usuario es: "+ nombre + " "+ apellido + "con DNI: "+ DNI +" "+ "direccion: "+ direccion + " " + "y telefono: "+ telefono);
}
}
