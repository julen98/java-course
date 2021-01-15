package ejerciciosUD3;

import java.util.Scanner;
import java.util.Arrays;

public class EntregaClaseArrays {
	public static void main(String[] args) {
		
		// Declaración
		
		Scanner teclado = new Scanner(System.in);
		int vector[] = new int[10];
		int suma=0;
		
		// a) Vector de tamaño 10 con valores aleatorios entre 0 y 30
		
		System.out.println("Vector de tamaño 10 con valores aleatorios entre 0 y 30\n");
		
		//Bucle para darle el valor al vector y mostrarlo
		
		for(int i=0;i<vector.length;i++) {
			vector[i]=(int)(Math.random()*(0-30)+30);
			System.out.print(vector[i]+" ");
		}
		
		// b) Suma y media de todos los valores del vector
		
		System.out.println("\n\n\n\nSuma y media de todos los valores del vector");
		
		//Bucle para darle valor a la variable suma
		
		for(int i=0;i<vector.length;i++) {
			suma+=vector[i];
		}
		System.out.println("\nLa suma es: "+suma);
		System.out.println("\nLa media es: "+suma/vector.length+"\n");
		
		// c) Ordenar el vector
		
		Arrays.sort(vector); //Ordenar el vector
		System.out.println("\n\nOrdenar el vector\n");
		for(int i=0;i<vector.length;i++) {
			System.out.print(vector[i]+" ");
		}
		
		// d) Máximo y mínimo
		
		System.out.println("\n\n\n\nNumero mínimo: "+vector[0]);
		System.out.println("\nNumero máximo: "+vector[9]);
		
		// e) Vector con todos los valores -10
		
		System.out.println("\n\n\nVector con todos los valores -10\n");
		
		Arrays.fill(vector, -10); //Rellenar el vector
		
		//Bucle para mostrar el vector
		
		for(int i=0;i<vector.length;i++) {
			System.out.print(vector[i]+" ");
		}
		
		// f) Crear copia vector
		
		int copia[] = new int[vector.length];
		
		System.arraycopy(vector,0,copia,0,vector.length);
		
		// g) Del vector copiado, asigna el valor 3 a las posiciones de 5 a 9
		
		System.out.println("\n\n\n\nAsignar valores\n");
					
		Arrays.fill(copia, 5,10,3); //Rellenar el vector
		for(int i=0;i<copia.length;i++) {
			System.out.print(copia[i]+" ");
		}
		
		// h) Crea un vector que multiplique el primer vector con el último
		
		System.out.println("\n\n\n\nCrea un vector que multiplique el primer vector con el último\n");
		
		int multiplicar[] = new int[vector.length];
		
		//Bucle para darle el valor al vector y mostrarlo
		
		for(int i=0;i<multiplicar.length;i++) {
			multiplicar[i]=vector[i]*copia[i];
			System.out.print(multiplicar[i]+" ");
		}
		
		// i)  Ordena el vector multiplicado
		
		System.out.println("\n\n\n\nOrdena el vector multiplicado\n");
		
		Arrays.sort(multiplicar); //Ordenar el vector
		
		//Bucle para mostrar el vector
		
		for(int i=0;i<multiplicar.length;i++) {
			System.out.print(multiplicar[i]+" ");
		}
		teclado.close(); //Cerrar el scanner teclado
	}
}