package examen_progamaciion;

import javax.swing.JOptionPane;

public class utils {

/**
 * 
 * @param max
 * @param numinf
 * @param numsup
 * @return
 */
public static int[] obtenerarray (int max , int numinf, int numsup) {
	int array[]= new int[max];
	for (int i = 0; i < array.length; i++) {
		array[i] = (int) Math.round(Math.random()* (numsup-numinf)+numinf);
	}
	return array;
	}
/**
 * 
 * @param array
 */
public static void mostrar_array (int[] array) {
	System.out.print("el array es: ");
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i] + " ");
	}
}
/**
 * 
 * @param mensaje
 * @return
 */
public static int obtenernumusuario (String mensaje) {
	int num =Integer.parseInt(JOptionPane.showInputDialog(mensaje));
	return num;
}
}
