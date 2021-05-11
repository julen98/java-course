package ejerciciosUD3;
import java.util.Scanner;
public class StringsEj3 {
public static void main(String[] args) {
	
	//Declaracion
	
	Scanner teclado = new Scanner(System.in);
	String nombre;
	String apellido1;
	String apellido2;
	String concatenar;
	String concatenar2;
	
	//Inclusion de datos
	
	System.out.println("Introduce tu nombre: ");
	nombre = teclado.nextLine();
	System.out.println("Introduce tu primer apellido: ");
	apellido1 = teclado.nextLine();
	System.out.println("Introduce tu segundo apellido: ");
	apellido2 = teclado.nextLine();
	teclado.close(); //Cerrar el scanner teclado
	
	//Mostrar datos en pantalla
	
	nombre=nombre.toUpperCase().substring(0,3);
	apellido1=apellido1.toUpperCase().substring(0,3);
	apellido2=apellido2.toUpperCase().substring(0,3);
	concatenar=nombre.concat(apellido1);
	concatenar2=concatenar.concat(apellido2);
	System.out.println(concatenar2);
	
}
}