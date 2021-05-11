package ejerciciosUD3;
import java.util.*;
public class Ej10 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	
	//Declaración
	
	Scanner teclado = new Scanner(System.in);
	int numN;
	int i;
	int alturas;
	int suma=0;
	
	//Inclusión de datos
	
	System.out.println("Dime cuantas alturas quieres poner: ");
	numN = teclado.nextInt();
	int vector[] = new int[numN];
	
	//Bucle para guardar las alturas
	
		for(i=0;i<vector.length;i++) {
			System.out.println("Escribe una altura: ");
			alturas = teclado.nextInt();
			vector[i]=alturas;
			}
		teclado.close(); //Cerrar el Scanner teclado
		int max=vector[0];
		int min=vector[0];
		
		//Bucle para calcular la media
		
		for(i=0;i<vector.length;i++) {
			suma+=vector[i];
		}
		
		//Bucle para calcular el máximo y el mínimo

		for (i=0;i<vector.length;i++){
			if (max < vector[i]) {
				max = vector[i];
			}
			if (min > vector[i]) {
				min = vector[i];
			}
		}
		
		//System.out
		
		System.out.println("La media es: "+suma/vector.length);
		System.out.println("La altura máxima es: "+max);
		System.out.println("La altura mínima es: "+min);
}
}