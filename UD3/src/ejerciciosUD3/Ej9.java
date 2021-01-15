package ejerciciosUD3;
import java.util.*;
public class Ej9 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	//Declaración
	
	Scanner teclado = new Scanner(System.in);
	int vector[] = new int[100];
	int numN;
	int i;

	//Bucle para dar el valor random a vector
	for(i=0;i<vector.length;i++) {
		vector[i]=(int)(Math.random()*(1-10)+10);
	}
	//Inclusión de datos
		System.out.println("Introduce un numero: ");
		numN = teclado.nextInt();
		teclado.close(); //Cerrar el Scanner teclado
		
		//System.out
		System.out.println(" ");
		System.out.println("El número "+numN+" es igual en las posiciones: ");
		
		//Bucle para mostrar en que posición hay números iguales a N
		for(i=0;i<vector.length;i++) {
			if(vector[i]==numN) {
				System.out.print(i+" ");
			}
		}
}
}