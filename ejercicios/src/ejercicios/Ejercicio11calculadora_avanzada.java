package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio11calculadora_avanzada {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("1- hipotenusa de un triangulo\n"//la \n se usa para hacer un intro
				+ "2- superficie de un cirvulo\n"
				+ "3- perimetro de una circunferencia\n"
				+ "4- area del rectangulo\n"
				+ "5- area del triangulo\n\n"
				+ "escribe un numero :");
		int opcion=	Integer.parseInt(str);
		
		switch(opcion){
			case 1:// calcular una hipotenusa
				str = JOptionPane.showInputDialog("escribe el cateto1");
				int cateto1 = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("escribe el cateto2");
				int cateto2 = Integer.parseInt(str);
				float hipotenusa =(float) Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
				System.out.println("la hipotenusa es" + hipotenusa);
				break;
			case 2://superficie de un circulo
				str = JOptionPane.showInputDialog("escribe el radio");
				int radio = Integer.parseInt(str);
				System.out.println("el radio vale" + Math.PI * Math.pow(radio, 2));
				break;
			case 3:// perimetro de una circunferencia
				str = JOptionPane.showInputDialog("escribe el radio");
				radio = Integer.parseInt(str);
				System.out.println("el radio vale" + 2 * Math.PI * radio);
				break;
			case 4:// area del rectangulo
				str = JOptionPane.showInputDialog("escribe el base");
				int base = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("escribe el altura");
				int altura = Integer.parseInt(str);
				System.out.println("la hipotenusa es" + (base * altura));
				break;
			case 5:// area del triangulo
				str = JOptionPane.showInputDialog("escribe el base");
				base = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("escribe el altura");
				altura = Integer.parseInt(str);
				System.out.println("el area es" + ((base * altura)/ 2));
				break;
			default:
				System.out.println("este numero no es valido");
		}


	}

}
