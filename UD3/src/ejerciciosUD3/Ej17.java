package ejerciciosUD3;
import java.util.*;
public class Ej17 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner teclado = new Scanner(System.in);
	
	//Declaración

	int vector[] = new int[10];
	int valorvector1;
	int vector2[] = new int[10];
	int valorvector2;
	int i;
	
	//Bucle para dar al vector el valor introducido por teclado
	
	for(i=0;i<10;i++) {
		System.out.println("Introduce el número "+(i+1)+" del primer vector: ");
		valorvector1 = teclado.nextInt();
		vector[i]=valorvector1;
	}
	
	//Bucle para dar al vector el valor introducido por teclado
	
	for(i=0;i<10;i++) {
		System.out.println("Introduce el número "+(i+1)+" del segundo vector: ");
		valorvector2 = teclado.nextInt();
		vector2[i]=valorvector2;
	}
	
	//Ordenar arrays
	
	Arrays.sort(vector);
	Arrays.sort(vector2);
	
	//Condicional para saber si los vectores son iguales
	
	if(Arrays.equals(vector,vector2)) {
		System.out.println("\nLos dos vectores son iguales.");
	}else {
		System.out.println("\nLos dos vectores no son iguales.");
	}
	teclado.close();
	}
	}