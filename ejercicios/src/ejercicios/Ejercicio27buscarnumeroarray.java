package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio27buscarnumeroarray {

	public static void main(String[] args) {
		int array[]= new int[5];
		
		for (int i = 0; i < array.length; i++) {
			array[i]= (int) Math.round(Math.random()*100);
		}
		
		int numerobuscado = Integer.parseInt(JOptionPane.showInputDialog("escribe el numero que quieres buscar"));
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		
		int contadorapariciones=0;
		for (int i = 0; i < array.length; i++) {
			if(numerobuscado == array[i]) {
				System.out.println("\n he encontrado el numero "+ numerobuscado +"en posicion "+ i);
			contadorapariciones ++;	
			}
		}
		if (contadorapariciones == 0) {
			System.out.println("no se encuentra el numero "+ numerobuscado);
		}
	}

}
