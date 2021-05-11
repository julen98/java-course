package ud4;
import java.util.Scanner;
public class Ej17 {
	public static void esPrimo(int numprimo) {
		int cont = 0;
		for(int i=numprimo;i>0;i--) {
		    if(numprimo%i==0) {
		        cont++;
		    }
		}
		if(cont == 2){
		    System.out.println("El número es primo.");
		}else {
		    System.out.println("El número no es primo.");
		}
	}
	public static void main(String[] args) {
		
		//Declaración
		
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		//Inclusion de datos
		
		for(int i=1;i>0;i++) {
		System.out.println("Introduce un número (0 para parar el programa): ");
		numero=teclado.nextInt();
		if(numero!=0)
		esPrimo(numero);
		else break;
		}
		
		teclado.close();
	}
	
}
