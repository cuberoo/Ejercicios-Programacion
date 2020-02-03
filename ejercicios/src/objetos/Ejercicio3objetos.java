package objetos;

import javax.swing.JOptionPane;

public class Ejercicio3objetos {

	public static void main(String[] args) {
		usuario usuario1 =new usuario();
		int respuesta = 1;
		do {
			respuesta= Integer.parseInt(JOptionPane.showInputDialog("¿quieres un usuario? \n1- no\n0-no: "));
			if(respuesta!=0) {
				usuario1.nombre=JOptionPane.showInputDialog("escribe tu nombre: ");
				usuario1.apellido=JOptionPane.showInputDialog("escribe tu apellido: ");
				usuario1.DNI=JOptionPane.showInputDialog("escribe tu DNI: ");
				usuario1.direccion=JOptionPane.showInputDialog("escribe tu direccion: ");
				usuario1.telefono=Integer.parseInt(JOptionPane.showInputDialog("escribe tu telefono: "));
			}
		}while(respuesta!=0);

	}

}
