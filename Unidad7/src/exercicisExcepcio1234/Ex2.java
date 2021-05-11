package exercicisExcepcio1234;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int A;
		int B;
		int resultado;
		
		try {
		System.out.println("Introduce un entero: ");
		A = teclado.nextInt();
		
		System.out.println("Introduce un entero: ");
		B = teclado.nextInt();
		
		resultado = A/B;
		
		System.out.println("Resultado: " + resultado);
		}
		
		catch (InputMismatchException exception){
			System.out.println("Valor introducido incorrecto: " + exception);
		}
		
		catch (ArithmeticException exception) {
			System.out.println("No se puede dividir por 0: " + exception);
		}
		
	}
}
