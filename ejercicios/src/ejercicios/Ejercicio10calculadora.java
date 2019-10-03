package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio10calculadora {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("1- raiz cuadrada\n"//la \n se usa para hacer un intro
				+ "2- potencia\n"
				+ "3-division\n\n"
				+ "escribe un numero del uno al tres");
		int opcion=	Integer.parseInt(str);
		
		switch(opcion){
			case 1:// raiz cuadrada
				str = JOptionPane.showInputDialog("escribe el radicando");
				int radicando = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("escribe el indice");
				int indice = Integer.parseInt(str);
				float raiz =(float) Math.pow(radicando, 1f / indice);
				System.out.println("la raiz es" + raiz);
				break;
			case 2://potencia
				str = JOptionPane.showInputDialog("escribe la base");
				int base = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("escribe el exponente");
				int exponente= Integer.parseInt(str);
				System.out.println("la potencia vale" + Math.pow(base, exponente));
				break;
			case 3://modulo de division
				str = JOptionPane.showInputDialog("escribe un dividendo");
				int dividendo = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("escribe un divisor");
				int divisor = Integer.parseInt(str);
				System.out.println("el modulo es " + (dividendo % divisor));
				break;
			default:
				System.out.println("este numero no es valido");
		}


	}

}
