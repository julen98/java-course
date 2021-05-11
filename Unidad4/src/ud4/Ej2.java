package ud4;
import java.util.Scanner;
public class Ej2 {
	public static boolean esMayorEdad(int edad) {
		boolean mayoria=false;
		if(edad>=18)
			mayoria=true;
		return mayoria;
	}
	public static void main(String[] args) {
		
		//Declaración
		
		Scanner teclado = new Scanner(System.in);
		int edad;

		//Inclusion de datos
		
		System.out.println("Dime tu edad: ");
		edad = teclado.nextInt();
				
		//Mostrar en pantalla
				
		if(esMayorEdad(edad)==false) {
			System.out.println("No eres mayor de edad.");
		}else {
			System.out.println("Eres mayor de edad.");
		}
		teclado.close();
	}
	
}
