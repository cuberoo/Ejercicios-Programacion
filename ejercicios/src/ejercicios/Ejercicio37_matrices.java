package ejercicios;

public class Ejercicio37_matrices {

	public static void main(String[] args) {
		int matriz[][]=new int [5][5];
		
		iniciarmatrizconnumerosalazar(matriz, 0, 100);
		mostrarmatriz(matriz);

	}
	/**
	 * 
	 * @param matriz
	 * @param min
	 * @param max
	 */
	public static void iniciarmatrizconnumerosalazar(int matriz[][], int filas, int columnas) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=utils.numeroazar(filas, columnas);
			}
		}
	}
	/**
	 * 
	 * @param matriz
	 */
	public static void mostrarmatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+ "\t");
			}
			System.out.println();
		}
	}

}
