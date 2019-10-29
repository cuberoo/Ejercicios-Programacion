package ejercicios;

public class Ejercicio34_ordenamiento_insercion {

	public static void main(String[] args) {
		int array[] = utils.obtenernumero(5, 0, 5);
		utils.mostrar_array(array);
		int actual = 0;
		int j;
		for (int i = 1; i < array.length; i++) {
			actual = array[i];
			for (j = i ; j > 0 && array[j-1]>actual; j--) {
			array[j]=array[j-1];
			}
			array[j]=actual;
		}
		System.out.println();
		utils.mostrar_array(array);
	}

}
