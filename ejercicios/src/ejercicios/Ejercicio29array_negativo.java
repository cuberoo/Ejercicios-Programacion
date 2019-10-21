package ejercicios;

public class Ejercicio29array_negativo {

	public static void main(String[] args) {
		int[] array = utils.obtenernumero(150, 0, 100);
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2==0) {
				 array[i] *= -1;
				}
		}
		utils.mostrar_array(array);		
	}
	

}
