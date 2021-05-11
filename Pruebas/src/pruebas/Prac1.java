package pruebas;
import java.util.Scanner;

public class Prac1 {
	public static void main(String[]args) {
		
		//Declaracion variables
		
		double num1, num2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce un numero: ");
		num2 = teclado.nextInt();
		
		if(num1>num2)
			System.out.println(num1+", "+num2);
		else
			System.out.println(num2+", "+num1);
		
		teclado.close();
	}
}