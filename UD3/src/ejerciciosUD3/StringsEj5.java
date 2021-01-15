package ejerciciosUD3;
import java.util.Scanner;
public class StringsEj5 {
public static void main(String[] args) {
	
	//Declaracion
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Dime una frase: ");
	String entrada = teclado.nextLine();
	teclado.close(); //Cerrar el scanner teclado
	
	String espacios=entrada.replace(" ", "");
	String minusculas=espacios.toLowerCase();
	int incremento = 0;
	int decremento = minusculas.length()-1;
	boolean error = false;
	
	//Inclusion de datos
	
	while ((incremento<decremento) && (!error)){
		
		if (minusculas.charAt(incremento)==minusculas.charAt(decremento)){				
			incremento++;
			decremento--;
		} else {
			error = true;
		}
	}
	
	//Mostrar datos en pantalla
	
	if (!error) {
		System.out.println(entrada + " es un palindromo");
	} else {
		System.out.println(entrada + " no es un palindromo");
	}
}
}