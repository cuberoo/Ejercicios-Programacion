package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio10calculadora {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("escribe un numero del uno al tres");
		int num =	Integer.parseInt(str);
		
		switch(num){
			case 1://se realiza una division
				str = JOptionPane.showInputDialog("escribe un numero");
				num = Integer.parseInt(str);
				double raiz = Math.pow(num, (1/2));
				System.out.println("la raiz de" + num + "es" + raiz);
				break;
			case 2:
				str = JOptionPane.showInputDialog("escribe un numero");
				num = Integer.parseInt(str);
				raiz = Math.PI * Math.pow(num, 2);
				break;
			case 3:
				str = JOptionPane.showInputDialog("escribe un dividendo");
				int dividendo = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("escribe un divisor");
				int divisor = Integer.parseInt(str);
				System.out.println("el conciente es " + (dividendo /(float)divisor));
				break;
			default:
				System.out.println("este numero no es valido");
		}


	}

}
