package examen_progamaciion;

public class UtilisMatriz {

	/**
	 * Creamos un metodo para crear una matriz indicando las filas y las columnas.
	 * Tambien le indicamos los el limite de numeros al azar para asignarselos a la
	 * matriz.
	 * 
	 * @param longitudFilas
	 * @param longitudColumnas
	 * @param limiteInferior
	 * @param limiteSuperior
	 * @return
	 */
	public static int[][] HacerUnaMatriz(int longitudFilas, int longitudColumnas, int limiteInferior,
			int limiteSuperior) {
		// creamos la matriz
		int array[][] = new int[longitudFilas][longitudColumnas];

		// Le asignamos numeros al azar a la matriz.
		for (int i = 0; i < array.length; i++) { // la i es las filas y la j es las columnas.

			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) Math.round(Math.random() * (limiteSuperior - limiteInferior) + limiteInferior);
			}
		}

		return array;

	}

	/**
	 * Creamos un metodo para recorrer la matriz y mostrarlo por pantalla.
	 * 
	 * @param matriz
	 */
	public static void MostrarMatriz(int[][] matriz) {

		for (int i = 0; i < matriz.length; i++) { // la i es las filas y la j es las columnas.

			for (int j = 0; j < matriz[i].length; j++) {

				System.out.print(matriz[i][j] + "\t");

			}
			System.out.println();
		}

		return;
	}

	/**
	 * Metodo para comprobar si la matriz es positiva. todos los n�meros tienen que
	 * ser positivos y si hay uno negativo ya no es positiva.
	 * 
	 * @param matriz
	 */
	public static void ComprobarSiLaMatrizEsPositiva(int[][] matriz) {
		boolean esPositava = true;
		for (int i = 0; i < matriz.length; i++) {// la i es las filas de la matriz y la j es las columnas de la matriz
			for (int j = 0; j < matriz[i].length; j++) {

				if (matriz[i][j] >= 0) { // comprobamos los n�meros de la matriz para saber si es positiva o no.

					// se que es verdadero. (Es positivo).

				} else {
					// es negativo
					esPositava = false;

				}
			}
		}

		if (esPositava) { // si es positiva se lo decimos al usuario y si es negativa tambien.
			System.out.println("La matriz es positiva.");
		} else {
			System.out.println("La matriz es negativa.");
		}

		return;

	}

	/**
	 * Metodo para comprobar si la matriz es diagonal.
	 * 
	 * @param matriz
	 */
	public static boolean ComprobarSiLaMatrizEsDiagonal(int[][] matriz) {
		boolean esDiagonal = true;
		for (int i = 0; i < matriz.length; i++) { // bucle para recorrer las filas.
			for (int j = 0; j < matriz[i].length; j++) { // bucle para recorrer las columnas.

				// Comprobamos el dato de cada posici�n de la matriz.
				if (i == j && matriz[i][j] != 0) { // Si i y j son iguales y el dato de la matriz es distinto de cero
													// entra.

					// Puede ser diagonal
				} else {//
					if (matriz[i][j] == 0) {
						// si la i es igual a cero tambien puede ser diagonal

						// Puede ser diagonal si la i y j es destinta.
					} else {
						return false;
					}
				}
			}
		}

		return esDiagonal;

	}

	/**
	 * Metodo Para comprobar si la matriz es triangular superior, la parte de abajo
	 * de diagonal son nulos.
	 * 
	 * @param matriz
	 * @return
	 */
	public static boolean ComprobarSiLaMatrizEsTriangularSuperior(int[][] matriz) {
		boolean esTriangularSuperior = true;

		// Una forma de hacer el metodo
//		int numeroIgual = 0;
//		for (int i = 0; i < matriz.length; i++) { // bucle para recorrer las filas de la matriz.
//			
//			for (int j = 0; j < matriz[i].length; j++) { // bucle para recorrer las columnas de la matriz.
//				
//				if(i == j) { // cuando la i y la j es igual se guarda en la variable numero igual.
//					numeroIgual = i;
//				}
//				// le pregunta a la parte de triangulo superior
//				if(i != j && j >= numeroIgual && numeroIgual == i  ) {// si la i y la j es destinta y la i es igual al numeroigual y la j
//					//es mayor que el nuemroIgual entra
//																
//					if(matriz[j][i] == 0) {  //la j som las filas y la i las columas.
//						//Por ahora puede ser triangular superior
//					}
//					else {
//						//Ya no es triangular superior
//						return false;
//					}
//				}// la parte de arriba de la linia diagonal no da igual el resultado por eso no se pone else.
//			}
//			
//		}

		// Segunda forma de hacer el metodo y mas corto.
		for (int i = 0; i < matriz.length; i++) { // la i son las filas
			for (int j = 0; j < matriz[i].length; j++) { // la j son las columnas.
				// Comprobaremos solo la parte superior
				// si la i y la j son distintos y la i es mayor que j.
				// Asi nos aseguramos que es unicamente la parte superior la otra parte da igual
				// el dato que tenga.

				if (i != j && j < i) {
					if (matriz[i][j] != 0) {
						return false;
					}
				}

			}

		}

		return esTriangularSuperior;
	}

	/**
	 * Comprobaci�n si la matriz es dispersa Tiene al menos en cada columna y fila
	 * un cero minimo.
	 * 
	 * @param matriz
	 * @return
	 */
	public static boolean ComprobarSiLaMatrizEsDispersa(int matriz[][]) {
		boolean noHayCero = false; // por ahora digo que no hay ceros.
		// Comprobamos las filas en busca que cada una de ellas tenga un cero.
		for (int i = 0; i < matriz.length; i++) { // la i recorre las filas
			noHayCero = false;
			for (int j = 0; j < matriz[i].length; j++) { // la j recorre las columnas.
				// Recorremos la fila completa en busca de un n�mero cero, si no encuentra
				// ninguno en la fila se sabe que ya no es dispersa.

				if (matriz[i][j] == 0) { // si la matriz encuentra el cero entonces es true porque si hay cero.
					noHayCero = true;
				}

			}

			if (!noHayCero) { // sino ha encontrado en la fila ning�n cero entonces noHayCero es false y sale
								// afuero con false para decir que no hay ceros.
				return false;
			}

		}

		// Ahora comprobamos cada columna
		for (int i = 0; i < matriz.length; i++) { // la i recorre las columnas
			noHayCero = false;
			for (int j = 0; j < matriz[i].length; j++) { // la j recorre las filas.
				// Recorremos la columnas completa en busca de un n�mero cero, si no encuentra
				// ninguno en la columna se sabe que ya no es dispersa.

				if (matriz[j][i] == 0) { // si la matriz encuentra el cero entonces es true porque si hay cero.
					noHayCero = true;
				}

			}

			if (!noHayCero) { // sino ha encontrado en la fila ning�n cero entonces noHayCero es false y sale
								// afuero con false para decir que no hay ceros.
				return false;
			}

		}

		// Si recorre toda la matriz y en cuentra todos los ceros entonces si es
		// dispersa.
		// entonces sera true.

		return true;
	}

	/**
	 * Contruir un array unidimensional con todos los elementos de la matriz.
	 * 
	 * @param matriz
	 * @return
	 */
	public static int[] ContruirUnArrayUnidimensionalConTodosLosElementosDeLaMatriz(int matriz[][]) {

		// Recorreremos la matriz y guardaremos los datos en un array.
		// Contaremos con una varible contador la longitud que tiene que tener el array.
		int contador = 0;

		for (int i = 0; i < matriz.length; i++) {// la i recorre las filas.
			for (int j = 0; j < matriz[i].length; j++) { // la j recorre las columnas.
				contador++; // varible para contar los hueco que va a tener el array.
			}
		}
		// Creamos el array con los huecos corectos. Y la variable indice para saber la
		// posici�n de donde guardar el dato en el array.
		int array[] = new int[contador];
		int indice = 0;
		for (int i = 0; i < matriz.length; i++) {// la i recorre las filas.
			for (int j = 0; j < matriz[i].length; j++) { // la j recorre las columnas.

				// el dato actual lo guardaremos en el array.
				array[indice] = matriz[i][j];
				indice++;// le sumamos uno al indice.

			}
		}
		// Cuando este contruido el array termina.
		return array;
	}

	/**
	 * M�todo que compruebA si la matriz es sim�trica. (Los elementos de la matriz
	 * (i, j) y (j, i), si existen, son iguales).
	 * 
	 * @param matriz
	 * @return
	 */
	public static boolean comprobarSiLaMatrizEsSimetrica(int matriz[][]) {

		// Recorreremos la matriz y comprobaremos si i,j existe y j,i si existe y son
		// igules, si no existe o no son iguales ya no es simetrica.
		boolean esSimetrica = true;
		for (int i = 0; i < matriz.length; i++) { // la i representa las filas.
			for (int j = 0; j < matriz[i].length; j++) {// La j representa las columnas.

				if (matriz[i][j] != matriz[j][i]) {

					// Ya la matriz no es Simetrica.
					return false;
				}
			}
		}
		// Si ha llegado hasta aqui quiere dicir que si es simetra la matriz.
		return esSimetrica;
	}

	/**
	 * Hacemos la matriz que hay la pasamos a traspuesta.
	 * 
	 * @param matriz
	 * @return
	 */
	public static int[][] CreaMatrizTraspuestaDeLaQueRecibe(int matriz[][]) {
		// a la matriz le ponemsos en donde va las filas la colunas de la matriz que
		// ponemos y en donde va las columnas ponemos las filas.
		int matriz1[][] = new int[matriz[0].length][matriz.length];
		// Recorremos la matriz las filas y columnas y hacemos el intercabio.
		for (int i = 0; i < matriz1.length; i++) { // la i repesenta las filas
			for (int j = 0; j < matriz1[i].length; j++) { // la j representa las columnas.

				// hacemos intercambio de datos.
				matriz1[i][j] = matriz[j][i];
			}
		}
		return matriz1;
	}

	/**
	 * m�todo que realiza la matiz opuesta de la que recibe (le cambia los signo a
	 * los n�meros.)
	 * 
	 * @param matriz
	 */
	public static void CrearLaMatizOpuesta(int matriz[][]) {

		// Recorreremos la matriz y a cada dato le ponemos el signo distinto.
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				// al dato de la matriz lo multiplicamos por -1 y hace la funci�n de cambiar el
				// signo.
				matriz[i][j] *= -1;

			}
		}
		return;
	}

	/**
	 * Un m�todo que pida al usuario un n�mero de fila sobre la matriz. Debes crear
	 * una matriz igual a la original pero eliminando el n�mero de fila que el
	 * usuario ha especificado
	 * 
	 * @param matriz
	 * @param numeroDeLiniaAEliminar
	 * @return
	 */
	public static int[][] CrearUnaMatrizIgualALaOriginalPeroEliminandoElNumeroDeFilaQueElUsuarioHaEspecificado(
			int matriz[][], int numeroDeLiniaAEliminar) {

		// Creamos una matriz.
		int longitudFilas = matriz.length;
		int matrizPedida[][] = new int[longitudFilas -= 1][matriz[0].length];
		int contadorIndice = -1;
		// Recorreremos la matriz dada por el usuario y buscamos la fila que quiere
		// eliminar el usuario y a�adimos a la matriz nueva todas las filas que no
		// quiere eliminar el usuario.
		for (int i = 0; i < matriz.length; i++) {

			// Si el usuario pone un n�mero incorreto a eliminar, pues devuelve la matriz
			// vacia.
			if (numeroDeLiniaAEliminar < 0 || numeroDeLiniaAEliminar >= matriz.length) {
				return matrizPedida;
			}
			// buscamos el numeros de linia diferente que ha pedido el usuario para meter
			// los datos a la nueva matriz.
			if (numeroDeLiniaAEliminar != i) {
				contadorIndice++; // Contador para saber la posici�n correcta de la fila para la matriz nueva.
				for (int j = 0; j < matriz[i].length; j++) {
					// guardamos los datos de la matriz original a la matriz nueva que ha pedido el
					// usuario.
					matrizPedida[contadorIndice][j] = matriz[i][j];

				}
			}

		}
		return matrizPedida;

	}

}
