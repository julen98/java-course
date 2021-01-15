package ud4;
import java.util.Scanner;
public class Ej9 {
	public static int masElevado(int num1, int num2) {
		int mayor=num1;
		
		if(num1<num2)
			mayor=num2;
		
		return mayor;
	}
	public static void main(String[] args) {
		
		//Declaración
		
		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		
		//Inclusion de datos
		
		System.out.println("Escribe un número: ");
		num1 = teclado.nextInt();
		System.out.println("Escribe un número: ");
		num2 = teclado.nextInt();
		System.out.println("Escribe un número: ");
		num3 = teclado.nextInt();
		int mayor=masElevado(num1,num2);
		
		if(masElevado(num1,num2)<num3)
			mayor=num3;
		
		System.out.println("El número más elevado es: "+mayor);
		
		teclado.close();
	}
	
}
