package ud4;
import java.util.Scanner;
public class Ej6 {
	public static double precioConIVA(double precio) {
		double iva;
		
		iva=(precio*0.21)+precio;
		
		return iva;
	}
	public static void main(String[] args) {
		
		//Declaración
		
		Scanner teclado = new Scanner(System.in);
		double vector[] = new double[5];

		//Inclusion de datos
		
		for(int i=0;i<vector.length;i++) {
		System.out.println("\nEscribe el número al que sumarle el IVA: ");
		vector[i] = teclado.nextDouble();
		System.out.println("El precio de venta es "+precioConIVA(vector[i])+"€.");
		}
		
		teclado.close();
	}
	
}
