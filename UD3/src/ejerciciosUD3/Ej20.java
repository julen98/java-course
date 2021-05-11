package ejerciciosUD3;
import java.util.*;
public class Ej20 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner teclado = new Scanner(System.in);
	
	//Declaración

	int vector[] = new int[1000];
	int i;
	int num;
	int contador=0;
	
	//Bucle para dar el valor random al vector
	
	for(i=0;i<vector.length;i++) {
	vector[i]=(int)(Math.random()*(0-100)+100);
	}
	
	//System.out
	
	System.out.println("Introduce un número para comprobar en el array: \n");
	num=teclado.nextInt();
	
	//Bucle para comprobar el num en el array
	
	for(i=0;i<vector.length;i++) {
		if(vector[i]==num) {
			System.out.print(vector[i]+" ");
			contador++;
		}
	}
	
	//System.out
	
	System.out.println("\n\nSe encuentra "+contador+" veces en el vector.");
		teclado.close();
	}
	}