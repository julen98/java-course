package exercicisExcepcio1234;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		double vector[] = new double[5];
		
		try {
		for(int i = 0; i < vector.length; i++) {
			System.out.println("Introduce un entero: ");
			double valor = teclado.nextInt();
			
			vector[i] = valor;
		}
		}
		
		catch (InputMismatchException exception){
			System.out.println("Valor introducido incorrecto: " + exception);
		}
		
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("El tamaño del vector es " + vector.length + ", te has pasado!! " + exception);
		}
	}
}
