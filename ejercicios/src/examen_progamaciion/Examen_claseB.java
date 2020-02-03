package examen_progamaciion;

import javax.swing.JOptionPane;


public class Examen_claseB {

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
		//pedimos el numero al usuario para saber cual sera primo y creamos las otras variables
		int numero1 =Integer.parseInt(JOptionPane.showInputDialog("escribe el numero"));
		int contador = 2;
		boolean primo=true;
		 //creamos el bucle para ir dividiendo el numero pedido con el contador y si sale de resto 0 el numero no es primo
		while ((primo) && (contador!=numero1)){
		  if (numero1 % contador == 0)
		    primo = false;
		  contador++;
		}
		//mostramos en pantalla si el numero es primo o no
		if(primo) {
			System.out.println("el numoero " + numero1 + " es primo");
		}
		else {
			System.out.println("el numoero " + numero1 + " no es primo");
		}
		System.out.println();	
		
		
		//ejercicio 3
		//creamos el array y creamos un contador
		 int array2[] = new int[20];
		    int primo1 = 1;
		    //recorremos el array y vamos sumando los numeros del contador y de la i del array
		    for (int i = 0; i < array2.length; i++) {
		        while (i != 20) {
		            if (primo1 % 2 != 0) {//si se cumple la condicion y el numero es primo se le añade al array y si no solo sumamos el contador
		                array2[i] = primo1;
		                i++;
		                primo1++;
		            } else {
		                primo1++;
		            }
		        }

		    }//recorremos el array por segunda vez y lo mostramos en pantalla
		    for (int i = 0; i < array2.length; i++) {
		        System.out.print(array2[i] + " ");
		    }
		    System.out.println("\n");
		
		//ejercicio 4 
		int array3[]= new int[100];// creamos el array y generamos un numero entero aleatorio y hacemos un bucle que se repita diez veces
		for (int i = 0; i < 10; i++) {
			int numeroaleatorio = (int) Math.round(Math.random()* (99-0)+0);
			if(array3[numeroaleatorio]==0) {
				array3[numeroaleatorio]=1;
			}//si el numero aleatorio que se ha generado es 0 se pone un 1 y si no se vuelve atras, asi hasta que halla 10 numeros 
			else {
				i--;
			}
			}// se muestra el array 
		for (int j = 0; j < array3.length; j++) {
			System.out.print(array3[j] + " ");	
		}
		System.out.println("\n");
		
		//ejercicio 5
		
	    int arrayfigonachi[] = new int[100];//creamos el array y ponemos las dos primeras posiciones a 1 
	    arrayfigonachi[0] = 0;
	    arrayfigonachi[1] = 1;
	    for (int i = 2; i < arrayfigonachi.length; i++) { //a partir de ahi hacemnos un bucle que recorra el array y vallan sumando los numeros de atras 1 a 1
	    	arrayfigonachi[i] = arrayfigonachi[i - 1] + arrayfigonachi[i - 2];
	    	System.out.print(arrayfigonachi[i - 1] + " ");//mostramos el array desde la primera posicion
	    }
		
	}
	}
	
	
		
	

	
	
	
