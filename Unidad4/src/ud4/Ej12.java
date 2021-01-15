package ud4;
import java.util.Scanner;
public class Ej12 {
	public static double kilometros_a_millas(double km) {
		double km_a_millas;
		double millas=0.621371;
		
		km_a_millas=km*millas;
		
		return km_a_millas;
	}
	public static void main(String[] args) {
		
		//Declaración
		
		Scanner teclado = new Scanner(System.in);
		int km;

		//Inclusion de datos
		
		System.out.println("Escribe el número de kilometros a convertir: ");
		km = teclado.nextInt();
				
		//Mostrar en pantalla
				
		System.out.println("Son "+kilometros_a_millas(km)+" millas.");
		
		teclado.close();
	}
	
}
