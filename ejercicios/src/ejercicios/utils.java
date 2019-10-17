package ejercicios;

public class utils {

		
public static int[] obtenernumero () {
	int array[]= new int[150];
	for (int i = 0; i < array.length; i++) {
		array[i] = (int) Math.round(Math.random()*100);
	}
	return array;
	}

}
