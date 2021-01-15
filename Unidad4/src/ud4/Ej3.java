package ud4;
import java.util.Scanner;
public class Ej3 {
	public static int minimo(int n1, int n2) {
		int menor=0;
		
		if(n2>n1)
		   menor=n1;
		else menor=n2;
		
		return menor;
	}
	public static void main(String[] args) {
		
		//Declaración
		
		Scanner teclado = new Scanner(System.in);
		int n1;
		int n2;

		//Inclusion de datos
		
		System.out.println("Dime un número: ");
		n1 = teclado.nextInt();
		System.out.println("Dime un número: ");
		n2 = teclado.nextInt();
				
		//Mostrar en pantalla
				
		System.out.println("El menor es: "+minimo(n1,n2));
		
		teclado.close();
	}
	
}
