package ejercicioB2;
import java.util.Scanner;

public class UD5EjercicioA2 {
	public static void main (String[] args) {
	
	// Declaracion de objetos
	
	Scanner teclado = new Scanner(System.in);
	String nombre = "";
	String apellidos = "";
	int edad = 0;
	Persona persona1 = new Persona(nombre, apellidos, edad);
	Persona persona2 = new Persona(nombre, apellidos, edad);
	
	// Dar valor a variables
	
	System.out.println("Introduce el nombre de la primera persona: ");
	persona1.nombre = teclado.nextLine();
	System.out.println("Introduce los apellidos de la primera persona: ");
	persona1.apellidos = teclado.nextLine();
	System.out.println("Introduce el DNI de la primera persona: ");
	persona1.DNI = teclado.nextLine();
	System.out.println("Introduce la edad de la primera persona: ");
	persona1.edad = teclado.nextInt();

	teclado.nextLine();
	
	System.out.println("Introduce el nombre de la segunda persona: ");
	persona2.nombre = teclado.nextLine();
	System.out.println("Introduce los apellidos de la segunda persona: ");
	persona2.apellidos = teclado.nextLine();
	System.out.println("Introduce el DNI de la segunda persona: ");
	persona2.DNI = teclado.nextLine();
	System.out.println("Introduce la edad de la segunda persona: ");
	persona2.edad = teclado.nextInt();
	
	// Condicionales para saber si es mayor de edad
	
	if(persona1.edad >= 18) {
		System.out.println(persona1.nombre+" "+persona1.apellidos+" con DNI "+persona1.DNI+" es mayor de edad.");	
	}else {
		System.out.println(persona1.nombre+" "+persona1.apellidos+" con DNI "+persona1.DNI+" no es mayor de edad.");	
	}
	
	if(persona2.edad >= 18) {
		System.out.println(persona2.nombre+" "+persona2.apellidos+" con DNI "+persona2.DNI+" es mayor de edad.");	
	}else {
		System.out.println(persona2.nombre+" "+persona2.apellidos+" con DNI "+persona2.DNI+" no es mayor de edad.");	
	}
	
	}
}
