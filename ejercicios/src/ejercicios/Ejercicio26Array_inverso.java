package ejercicios;

public class Ejercicio26Array_inverso {

	public static void main(String[] args) {
		int array[] = new int[150];
		
		for (int i = array.length -1; i > -1; i--) {
			array[i]=(int) Math.round(Math.random()*100);
			System.out.println(array[i] + " ");
		}
	}

}
