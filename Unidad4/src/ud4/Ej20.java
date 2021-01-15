package ud4;
import java.util.Scanner;
public class Ej20 {
	public static void tablaDeMultiplicar(int numero) {
		System.out.println("La tabla de multiplicar de "+numero+" es: ");
		int tabla=0;
		for(int i=0;i<=10;i++) {
			tabla=i*numero;
			System.out.println(i+" * "+numero+" = "+tabla);
		}
	}
	public static void main(String[] args) {
		
		//Declaración
		
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		//Inclusion de datos
		
		System.out.println("Introduce un número: ");
		numero=teclado.nextInt();
				
		tablaDeMultiplicar(numero);
		
		teclado.close();
	}
	
}
