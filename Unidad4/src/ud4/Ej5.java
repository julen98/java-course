package ud4;
import java.util.Scanner;
public class Ej5 {
	public static double millas_a_kilometros(double millas) {
		double millas_a_km;
		double km=1.60934;
		
		millas_a_km=km*millas;
		
		return millas_a_km;
	}
	public static void main(String[] args) {
		
		//Declaración
		
		Scanner teclado = new Scanner(System.in);
		int millas;

		//Inclusion de datos
		
		System.out.println("Escribe el número de millas a convertir: ");
		millas = teclado.nextInt();
				
		//Mostrar en pantalla
				
		System.out.println("Son "+millas_a_kilometros(millas)+" kilómetros.");
		
		teclado.close();
	}
	
}
