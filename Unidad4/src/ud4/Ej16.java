package ud4;
import java.util.Scanner;
public class Ej16 {
	public static void rellenarArray(double[] vector) {
		for(int i=0;i<vector.length;i++) {
			vector[i]=Math.random()*((1-vector.length)+vector.length);
			}
	}
	public static void main(String[] args) {
		
		//Declaración
		
		Scanner teclado = new Scanner(System.in);
		int longitud;

		//Inclusion de datos
		
		System.out.println("Introduce la longitud del vector: ");
		longitud=teclado.nextInt();
		double vector[]=new double[longitud];
		
		//Mostrar en pantalla
				
		rellenarArray(vector);
		teclado.close();
	}
	
}
