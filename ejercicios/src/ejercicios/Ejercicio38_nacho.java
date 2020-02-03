package ejercicios;

public class Ejercicio38_nacho {

	public static void main(String[] args) {
		int matriz[][]= new int[10][10];
		int matriz2[][] = new int[3][3];
		int suma = 0;
		int media= 0;
		int contador= 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
			matriz[i][j]=(int) Math.round(Math.random()* (10-0)+0);
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				for (int j2 = i; j2 < matriz2.length; j2++) {
					for (int k = j; k < matriz2.length; k++) {
						if(i != j2 && j != k) {
							suma+=matriz[j2][k];
							contador++;
						}
					}
					media = suma/contador;
					matriz[i][j]+=media;
				}
			}
			
		}
		
	}
}
