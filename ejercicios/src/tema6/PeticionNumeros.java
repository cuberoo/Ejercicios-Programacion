package tema6;

import javax.swing.JOptionPane;

import ejercicios.utils;

public class PeticionNumeros {

	public static void main(String[] args) {

		pideNumeroPar();

	}

	public static void pideNumeroPar(){
		
		
		//int numeroPedido = utils.obtenernumusuario("escribe un numero par");
		//int numeroPedido = numeroPedido("escribe un numero par");
		
		try {
			int numeroPedido = numeroPedido("escribe un numero par");
		}
		catch(NumeroImparException ex) {
			System.out.println("el numero pedido a dado un error " + ex.getMessage());
		}
	}
	
	public static int numeroPedido(String mensaje) throws NumeroImparException   {
		int num =Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		
		if(num%2 ==1) {
		throw new NumeroImparException("este numero no es par");
		}
		else {
			System.out.println("el numero " + num + " es correcto");
		}
		return num; 
	}
}
