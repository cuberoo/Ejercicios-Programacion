package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("escribe un numero");
		int numero1 = Integer.parseInt(str);
		
		int resto ;
		resto= numero1%2 ;
		
		if(resto==1){
			System.out.println("el numero es impar");
		}
		else {
			System.out.println("el numero es par");
		}

		//ejercicio 7 decribir numeros pares e impares de otra forma
		
		str = JOptionPane.showInputDialog("escribe otro numero");
		int numero2 = Integer.parseInt(str);
		
		int resto1 ;
		resto1= numero2&1 ;
		
		if(resto1==1){
			System.out.println("el numero es impar");
		}
		else {
			System.out.println("el numero es par");
		}

		
	}

}
