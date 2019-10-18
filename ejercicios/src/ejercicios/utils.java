package ejercicios;

public class utils {

		
public static int[] obtenernumero (int max , int numinf, int numsup) {
	int array[]= new int[max];
	for (int i = 0; i < array.length; i++) {
		array[i] = (int) Math.round(Math.random()* (numsup-numinf)+numinf);
	}
	return array;
	}

public static void mostrar_array (int[] array) {
	System.out.print("el array es: ");
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i] + " ");
	}
}
}
