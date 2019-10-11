package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio17mayor_y_menor {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("introduce cuantos numeros quieres comparar: "));
		int mayor =0;
		int menor =0;
		for(int i=0; i<num; i++) {
			if(i==0) {
			int pedido = Integer.parseInt(JOptionPane.showInputDialog("introduce cuantos numeros quieres comparar: "));
			mayor = pedido;
			menor = pedido;
			}
			else {
			int pedido = Integer.parseInt(JOptionPane.showInputDialog("introduce cuantos numeros quieres comparar: "));
			if(pedido>mayor) {
				mayor=pedido;
			}
			else {
				menor=pedido;
			}
			}
		}
		System.out.println("el numero mayor es: "+ mayor + " el numero menor es: "+ menor);
	}

}
