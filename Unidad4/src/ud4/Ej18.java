package ud4;
import java.util.Scanner;
public class Ej18 {
	public static char letraDNI(int DNI) {
		char letra;
		int resto=DNI%23;
		char vector[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		letra=vector[resto];
		return letra;
	}
	public static void main(String[] args) {
		
		//Declaración
		
		Scanner teclado = new Scanner(System.in);
		int DNI;
		
		//Inclusion de datos
		
		System.out.println("Introduce el DNI: ");
		DNI=teclado.nextInt();
		
		System.out.println("La letra del DNI es: "+letraDNI(DNI));
		
		teclado.close();
	}
	
}
