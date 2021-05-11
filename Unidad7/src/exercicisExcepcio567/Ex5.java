package exercicisExcepcio567;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n1 = -5;
		int n2 = 5;
		int teclado1;
		
		try {
		imprimePositivo(n1);
		imprimePositivo(n2);
		imprimeNegativo(n1);
		imprimeNegativo(n2);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Introduce un numero: ");
			teclado1 = teclado.nextInt();
			imprimePositivo(teclado1);
			imprimeNegativo(teclado1);
		}
		}
		
		catch (InputMismatchException exception){
			System.out.println("Valor introducido incorrecto: " + exception);
		}
	}
	
	public static void imprimePositivo(int p) {
		try {
		System.out.println("Valor p: " + p);
		if (p < 0)
			throw new IllegalArgumentException("El numero introducido es negativo");
		}
		
		catch (IllegalArgumentException exception) {
			System.out.println(exception.getMessage());
		}
		
		catch (InputMismatchException exception){
			System.out.println("Valor introducido incorrecto: " + exception);
		}
	}
	
	public static void imprimeNegativo(int p) {
		try {
		System.out.println("Valor p: " + p);
		if (p >= 0)
			throw new IllegalArgumentException("El numero introducido es positivo");
		}
		
		catch (IllegalArgumentException exception) {
			System.out.println(exception.getMessage());
		}
		
		catch (InputMismatchException exception){
			System.out.println("Valor introducido incorrecto: " + exception);
		}
	}
	
	
}
