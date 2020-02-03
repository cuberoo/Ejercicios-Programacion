package examen_progamaciion;

import javax.swing.JOptionPane;


public class Examen_claseC {

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
		int array2[] = new int[100];
		for (int i = 0; i < array2.length ; i++) {
			array2[i] = i + 1;
		}
		for (int i = array2.length - 1; i > -1; i--) {
			System.out.print(array2[i]-1 + " ");
		}
		System.out.println("\n");
		//ejercicio 3
		int array3[]= utils.obtenerarray(20, 0, 100);
		utils.mostrar_array(array3);
		int num;
		System.out.println();
		for (int i = 0; i < array3.length; i++) {
			num =0;
			System.out.println("buscamos los numeros divisibles de " + array3[i]);
			for (int j = 0; j < array3.length; j++) {
				num++;
				if(array3[i] % num ==0) {
					System.out.println("el numero " + array3[i] + " es divisor de " + num);
				}
			}
		}
		System.out.println("\n");
		//ejercicio 4 
		int array4[]= new int[100];//creamos el array y una variable donde el usuario nos pondra el nunero que busca
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("escribe el numero que quieres buscar"));
		for (int i = 0; i < array4.length; i++) {//recorremos y generamos los numeros del array
			array4[i]= (int) Math.round(Math.random()*100);
			System.out.print(array4[i] + " ");
			
		}
		System.out.println();//dividimos entre diez los numeros del array ya que eso nos genera la ultima cifra y la mostramos
		for (int j = 0; j < array4.length; j++) {
			if(array4[j]%10 == numero1) {
				System.out.print("los numeros son" + array4[j] + " " + "\n");
		}
		}
		System.out.println("\n");
		//ejercicio 5
int array41[] = new int[20];
		
		for (int i = 0; i < array41.length; i++) {
			// Declaro aux fuera del do porque lo necesito en la claúsula while
			int aux; // Número generado al azar que se propone para ocupar la posiciónd array[i]
			boolean existeNumeroEnArray;  // Bandera que indique que el candidato es o no es utilizable
			// comienzo un bucle que tiene como objetivo determinar un numero número al azar no 
			// repetido en el array
			do {
				aux = (int) Math.round(Math.random()* (40-0)+0);
				// Compruebo ahora si el "candidato" existe en las posiciones del array previas a i
				existeNumeroEnArray = false;
				for (int j = 0; j < i; j++) {
					if (array41[j] == aux) {
						existeNumeroEnArray = true;
					}
				}
			} while (existeNumeroEnArray);
			// Cuando llego aquí sé que el candidato no se repite en el array, es utilizable
			array41[i] = aux;
		}
		
		// Muestro el array
		for (int i = 0; i < array41.length; i++) {
			System.out.print(array41[i] + " ");
	
		}
	}
	}
	
	
		
	

	
	
	
