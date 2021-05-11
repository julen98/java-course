package exercicisExcepcio1234;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) throws Exception {
		Scanner teclado = new Scanner (System.in);
		int vector[] = new int[100];
		int valor;
		int numero = 1;
		
		try {
		for(int i = 0; i < vector.length; i++) {
			valor = (int) (Math.floor(Math.random() * 10) + 1);
			
			vector[i] = valor;
		}
		
		
		while (numero >= 0) {
			System.out.println("Introduce la posicion del vector que quieres ver");
			numero = teclado.nextInt();
			
			if(numero < 0)
				throw new IllegalArgumentException("El numero introducido es negativo");
			
			System.out.println("Numero: " + vector[numero]);
		}
		}
		
		catch (IllegalArgumentException exception) {
			System.out.println(exception.getMessage());
		}
		
		catch (InputMismatchException exception){
			System.out.println("Valor introducido incorrecto: " + exception);
		}
		
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("El tamaño del vector es " + vector.length + ", te has pasado!! " + exception);
		}
	}
}
