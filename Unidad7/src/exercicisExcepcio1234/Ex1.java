package exercicisExcepcio1234;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int A;
		try {
		System.out.println("Introduce un entero: ");
		A = teclado.nextInt();
		
		System.out.println("Valor introducido: " + A); 
		}
		catch (InputMismatchException exception){
			System.out.println("Valor introducido incorrecto: " + exception);
		}
		
	}
}
