package ejerciciosUD3;
import java.util.Scanner;
public class StringsEj2 {
public static void main(String[] args) {
	
	//Declaracion
	Scanner teclado = new Scanner(System.in);
	String entrada;
	String entrada2;
	boolean comparar=false;
	boolean compararMayus=false;
	
	//Inclusion de datos
	
	System.out.println("Introduce una frase: ");
	entrada = teclado.nextLine();
	System.out.println("Introduce otra frase: ");
	entrada2 = teclado.nextLine();
	teclado.close(); //Cerrar el scanner teclado
	
	//Mostrar datos en pantalla
	
	if(comparar=entrada.equals(entrada2)) {
		System.out.println("Las dos frases son iguales.");
	}else{
		System.out.println("Las dos frases no son iguales.");
	}
	if(compararMayus=entrada.equalsIgnoreCase(entrada2)) {
		System.out.println("Las dos frases son iguales sin tener en cuenta mayúsculas.");
	}else{
		System.out.println("Las dos frases no son iguales sin tener en cuenta mayúsculas.");
	}
	
}
}