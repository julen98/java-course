package ejerciciosUD3;
import java.util.Scanner;
public class StringsEj1 {
public static void main(String[] args) {
	
	//Declaracion
	Scanner teclado = new Scanner(System.in);
	String entrada;
	
	//Inclusion de datos
	
	System.out.println("Introduce una frase: ");
	entrada = teclado.nextLine();
	teclado.close(); //Cerrar el scanner teclado
	
	//Mostrar datos en pantalla
	System.out.println(entrada=entrada.replace(' ', '\n'));
}
}