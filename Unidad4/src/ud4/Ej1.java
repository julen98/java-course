package ud4;
import java.util.Scanner;
public class Ej1 {
	public static double multi(double n1, double n2) {
		double resmulti=n1*n2;
		return resmulti;
	}
	public static void main(String[] args) {
		
		//Declaración
		
		Scanner teclado = new Scanner(System.in);
		double n1;
		double n2;
		
		//Inclusion de datos
		
		System.out.println("Dime un número: ");
		n1 = teclado.nextDouble();
		System.out.println("Dime un número: ");
		n2 = teclado.nextDouble();
				
		//Mostrar en pantalla
				
		System.out.println("La multiplicación es: "+multi(n1,n2));
		
		teclado.close();
	}
	
}
