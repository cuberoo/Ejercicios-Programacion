package antigüedades;

public class principal {

	public static void main(String[] args) {
		joyas joya1 = new joyas(2000,"minas",1600f,"diamente" );
		joyas joya2 = new joyas(2000,"minas",1600f,"diamente" );
		joyas joya3 = new joyas(1600,"minas",1300f,"oro" );
		joyas joya4 = new joyas(1972,"minas",800f,"metal" );
		
		libros libro1 = new libros(1946, "españa", 30f, "me lo invento", "yo");
		libros libro2 = new libros(1900, "alemania", 20f, "me lo invento", "yo");
		libros libro3 = new libros(1930, "francia", 35f, "me lo invento", "yo");
		libros libro4 = new libros(1630, "italia", 20f, "me lo invento", "yo");
		System.out.println(joya1 + "\n" + joya2 + "\n" + joya3 + "\n" + joya4 + "\n");
		System.out.println(libro1 + "\n" + libro4 + "\n" + libro3 + "\n" + libro2 + "\n");
	}

}
