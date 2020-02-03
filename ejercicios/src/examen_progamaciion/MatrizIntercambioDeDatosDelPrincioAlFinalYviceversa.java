package examen_progamaciion;

public class MatrizIntercambioDeDatosDelPrincioAlFinalYviceversa {

	public static void main(String[] args) {

		// Creamos la matriz con numeros aleatorios.
		int matriz[][] = UtilisMatriz.HacerUnaMatriz(5, 5, 0, 100);
		//Declaracion de variables.
		int aux = 0;
		int contador = 0;
		//Mostramos la matriz.
		UtilisMatriz.MostrarMatriz(matriz);
		
		//Hacemos el intercambio de datos.
		
		for (int i = 0; i < matriz.length; i++) { //Bucle para las filas
			for (int j = 0; j < matriz[i].length; j++) { // bucle para las columnas.
				
				if(i == contador && j == 0) {//Si el if se cumple entra.
					
					aux = matriz[i][j]; // Guarda el primer dato en la variable aux.
					matriz[i][j] = matriz[i][matriz[i].length -1]; // guarda el ultimo dato de esa misma fila en el primero.
					matriz[i][matriz[i].length -1] = aux; // guarda en el ultimo hueco el dato guardado en aux, de la misma fila.
					contador++; //Para cambiar de fila, en el if.
				}
				
			}
		}
		//Mostrar la matriz en pantalla.
		System.out.println();
		UtilisMatriz.MostrarMatriz(matriz);
	}

}
