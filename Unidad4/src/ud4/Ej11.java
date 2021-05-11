package ud4;
import java.util.Scanner;
public class Ej11 {
	public static void tablaMultiplicar(int num) {
		int tabla[]=new int[11];
		
		for(int i=0;i<11;i++) {
			tabla[i]=num*i;
			System.out.print(i+" * "+num+" = "+tabla[i]+"\n");
		}
	}
	public static void main(String[] args) {
		
		//Declaración
		
		Scanner teclado = new Scanner(System.in);
		int num;
		
		//Inclusion de datos
		
		System.out.println("Escribe un número: ");
		num = teclado.nextInt();
		
		tablaMultiplicar(num);
					
		teclado.close();
	}
	
}
