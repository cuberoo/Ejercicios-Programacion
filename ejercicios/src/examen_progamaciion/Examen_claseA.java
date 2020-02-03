package examen_progamaciion;

import javax.swing.JOptionPane;


public class Examen_claseA {

	public static void main(String[] args) {
		// ejercicio1
		// declaramos las variables de las operaciones que vamnos a realizar 
		int numero[] = new int [100];
		int suma=0;
		int media=0;
		int mayor=0;
		int menor=0;
		//recorremos el array y realizamos las operaciones
		for(int i =0; i< numero.length;i++) {
			numero[i]= (int) Math.round(Math.random()*1000);
			suma += numero[i];
			media= (int) ((float) suma/numero[i]);
		//hemos realizado la suma y la media ahora haremos los maximos y minimos
			if(i == 0) {
				mayor= numero [i];
				menor= numero [i];
			}				
			else {
				if(menor>numero[i]) {
					menor=numero[i];
				}
				if(mayor<numero[i]) {
					mayor=numero[i];
				
			}
		}
		//comparamos los numeros del array para comprobar el minimo y el maximo
		System.out.print(numero[i] + " ");
	}
		System.out.println();
		System.out.println("la suma de los numeros es "+ suma);
		System.out.println("la media de los numeros es " + media);
		System.out.println("el numero mayor es "+ mayor);
		System.out.println("el numero menor es "+ menor);
		//mostramos en pantalla los resultados 
		System.out.println();
		
		//ejercicio 2
		int array1[]= new int[100];
		//declaramos los limites del array y lo recorremos 
		int numinf=Integer.parseInt(JOptionPane.showInputDialog("escribe el limite inferior"));
		int numsup=Integer.parseInt(JOptionPane.showInputDialog("escribe el limite superior"));
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) Math.round(Math.random()* (numsup-numinf)+numinf);
		
		System.out.print(array1[i] + " ");
		}
		//recorremos el array de manera inversa y lo mostramos en pantalla
		System.out.println();
		for (int i = array1.length -1; i > -1; i--) {
			System.out.print(array1[i] + " ");
		}
		System.out.println("\n");
		
		//ejercicio 3
		//creamos el array y lo recorremos
		int array2[]=new int[20];
		//recorremos el array y creamos una condicional que dice que muestres los numeros pares del array
		for (int i = 0; i <array2.length; i++) {
			array2[i] = (int) Math.round(Math.random()* (100-25)+25);
			if(array2[i] %2 ==0 ) {
			System.out.print(array2[i] + " ");
			}
		}
		System.out.println("\n");
		
		//ejercicio 4 
		
		//creamos los arrays y los recorremos
		int array3[]=utils.obtenerarray(5, 0, 100);
		
		utils.mostrar_array(array3);
		
		int arraycopia[]=new int[5];
		
		for (int i = 0; i < array3.length*2; i++) {
			//
			for (int j = 0; j < arraycopia.length; j++) {
				int num = (int) Math.round(Math.random()*4);
				boolean estaNumeroArray =false;
				for(int k = 0 ; k < arraycopia.length && !estaNumeroArray ;k++) {
					if(array3[j]==arraycopia[k]) {
						estaNumeroArray = true;
					}
				}
				for(int l = num ; j < arraycopia.length && !estaNumeroArray ; l++) {
					arraycopia[l]= array3[j];
					break;
				}
			}
		}
		System.out.println();
		utils.mostrar_array(arraycopia);
		
		//ejercicio 5
		int array4[] = new int[20];
		
		for (int i = 0; i < array4.length; i++) {
			// Declaro aux fuera del do porque lo necesito en la cla�sula while
			int aux; // Numero generado al azar que se propone para ocupar la posici�nd array[i]
			boolean existeNumeroEnArray;  // Bandera que indique que el candidato es o no es utilizable
			// comienzo un bucle que tiene como objetivo determinar un numero n�mero al azar no 
			// repetido en el array
			do {
				aux = (int) Math.round(Math.random()* (40-0)+0);
				// Compruebo ahora si el "candidato" existe en las posiciones del array previas a i
				existeNumeroEnArray = false;
				for (int j = 0; j < i; j++) {
					if (array4[j] == aux) {
						existeNumeroEnArray = true;
					}
				}
			} while (existeNumeroEnArray);
			// Cuando llego aqu� s� que el candidato no se repite en el array, es utilizable
			array4[i] = aux;
		}
		
		// Muestro el array
		for (int i = 0; i < array4.length; i++) {
			System.out.print(array4[i] + " ");
	}
	}
	}
	
	
		
	

	
	
	
