package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
	String str = JOptionPane.showInputDialog("escribe un numero");
	int numero1 = Integer.parseInt(str);
	str = JOptionPane.showInputDialog("escribe un numero");
	int numero2 = Integer.parseInt(str);
	str = JOptionPane.showInputDialog("escribe un numero");
	int numero3 = Integer.parseInt(str);
	str = JOptionPane.showInputDialog("escribe un numero");
	int numero4 = Integer.parseInt(str);
	str = JOptionPane.showInputDialog("escribe un numero");
	int numero5 = Integer.parseInt(str);
	
	if(numero1>=numero2 && numero1>=numero3 && numero1>=numero4 && numero1>=numero5){
		System.out.println("el numero mas alto es" + numero1);
	}
	else {
		if(numero2>=numero3 && numero2>=numero4 && numero2>=numero5){
			System.out.println("el numero mas alto es " + numero2);
		}
		else {
			if(numero3>=numero4 && numero3>=numero5){
				System.out.println("el numero mas alto es " + numero3);
			}
			else {
				if(numero4>=numero5){
					System.out.println("el numero mas alto es " + numero4);
				}
				else {
					System.out.println("el numero mas alto es " + numero5);
				}
			}
		}
	}
	}
	}
	


