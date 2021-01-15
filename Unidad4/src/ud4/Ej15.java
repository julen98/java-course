package ud4;
import java.util.Scanner;
public class Ej15 {
	public static void calcularArray(int[] vector) {
	int suma=0;
		for(int i=0;i<vector.length;i++) {
			suma=suma+vector[i];
			}
		System.out.println("La suma total del vector es: "+suma);
		System.out.println("La media del vector es: "+suma/vector.length);
	}
	public static void main(String[] args) {
		
		//Declaración
		
		Scanner teclado = new Scanner(System.in);

		int vector[]=new int[100];

		//Inclusion de datos
		
		for(int i=0;i<vector.length;i++) {
			vector[i]=i+1;
		}
				
		//Mostrar en pantalla
				
		calcularArray(vector);
		
		teclado.close();
	}
	
}
