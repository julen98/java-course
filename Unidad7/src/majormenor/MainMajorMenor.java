package majormenor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMajorMenor {

	public static void main(String[] args) {
		double nRdm = Math.random() * (500 - 1) + 1;
		int numeroAdivinar = (int) nRdm;
		int numero = 0;
		int cont = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println(numeroAdivinar);
		do {
			try {
				System.out.println("Introduce un numero: ");
				numero = teclado.nextInt();
				cont++;
				
			if (numero < 0 || numero > 500) {
				throw new IllegalArgumentException("El numero debe estar entre 1 y 500.");
			} if (numeroAdivinar < numero) {
				System.out.println("El numero es menor.");
			} if (numeroAdivinar > numero) {
				System.out.println("El numero es mayor.");
			} if (numeroAdivinar == numero) {
				System.out.println("Enhorabuena, has acertado el número, te ha costado " + cont + " intentos.");
				break;
			}
				
			} catch (InputMismatchException ex) {
				System.out.println("Valor introducido incorrecto " + ex);
			} catch (IllegalArgumentException ex2) {
				System.out.println(ex2.getMessage());
			}
			teclado.nextLine();
	} while (numero != numeroAdivinar);
}
}
