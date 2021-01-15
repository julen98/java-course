package ud4;
import java.util.Scanner;
public class Calculadora {
	public static double suma(double n1, double n2) {
		double ressuma=n1+n2;
		return ressuma;
	}
	public static double resta(double n1, double n2) {
		double resresta=n1-n2;
		return resresta;
	}
	public static double multi(double n1, double n2) {
		double resmulti=n1*n2;
		return resmulti;
	}
	public static double division(double n1, double n2) {
		double resdivision=n1/n2;
		return resdivision;
	}
	public static void main(String[] args){
		
		//Declaración
		
		Scanner teclado = new Scanner(System.in);
		double n1;
		double n2;
		
		//Inclusion de datos
		
		System.out.println("Dime un número: ");
		n1 = teclado.nextDouble();
		System.out.println("Dime un número: ");
		n2 = teclado.nextDouble();
		
		//Mostrar en pantalla
		
		System.out.println("La suma es: "+suma(n1,n2));
		System.out.println("La resta es: "+resta(n1,n2));
		System.out.println("La multiplicación es: "+multi(n1,n2));
		System.out.println("La división es: "+division(n1,n2));
		
		teclado.close(); //Cerrar el Scanner
	}
}