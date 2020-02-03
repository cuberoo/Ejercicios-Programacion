package restaurante_ejercicio;

public class Restaurante {

	public static void main(String[] args) {
		
		
		//primeros platos
			Plato macarrones =new Plato("macarrones con tomate", 5f);
			Plato tortilla =new Plato("Tortilla", 3f);
			Plato solomillo =new Plato("Solomillo", 10f);
			Plato pizza =new Plato("Pizza", 7.5f);
			Plato flamenquines =new Plato("Flamenquin", 9f);
			Plato sanjacobo =new Plato("San Jacobo", 11f);
			Plato habicholones =new Plato("Habicholones", 4f);
			
			//segundo plato
			Plato solomilloRoquefort =new Plato("Solomillo Roquefort", 7f);
			Plato bacalao =new Plato("Bacalao", 10f);
			Plato lenguado =new Plato("Lenguado", 12f);
			Plato pulpo =new Plato("Pulpo a la Gallega", 15f);
			Plato ensalada =new Plato("Ensalada", 5f);
			Plato calamares =new Plato("Calamares", 8f);
			
			//postre
			Plato tarta =new Plato("Tarta de la abuela", 4f);
			Plato natillas =new Plato("Natillas", 4f);
			Plato tartaqueso =new Plato("Tarta de queso", 4.5f);
			Plato tarta3chocolates =new Plato("Tarta 3 chocolates", 6f);
			Plato fruta =new Plato("Fruta del tiempo", 3f);
			
			//construimos menu
			Menu menus[]=new Menu[3];
			menus[0]  = new Menu(lenguado, pulpo, fruta);
			menus[1] = new Menu(flamenquines, ensalada, natillas);
			menus[2] = new Menu(flamenquines, solomilloRoquefort, tarta3chocolates );
			
			//imprimo menu
			for (int i = 0; i < menus.length; i++) {
				System.out.println(menus[i].toString());
				System.out.println("precio:" + menus[i].getprecio());
			}
	}
}
