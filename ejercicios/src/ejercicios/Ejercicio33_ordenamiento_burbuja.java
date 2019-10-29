package ejercicios;

public class Ejercicio33_ordenamiento_burbuja {

	public static void main(String[] args) {
		int aux = 0;
		int array[] = utils.obtenernumero(5, 0, 5);
		utils.mostrar_array(array);
		int contador = 1;
		for (; contador!=0 ;) {
		contador=0;
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					aux=array[j];
					array[j]=array[j+1];
					array[j+1]=aux;
					contador++;
				}
			}

		}
		System.out.println(" ");
		utils.mostrar_array(array);

	}

}
