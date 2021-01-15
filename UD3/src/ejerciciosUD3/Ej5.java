package ejerciciosUD3;
import java.util.Scanner;
public class Ej5 {
public static void main(String[] args) {
	
	//Declaracion
	Scanner teclado = new Scanner(System.in);
	int num[]=new int[20];
	int suma=0;
	
	//Inclusion de datos
	for(int i=0;i<num.length;i++) {
	System.out.println("Introduce un numero: ");
	num[i] = teclado.nextInt();
	}
	teclado.close(); //Cerrar el scanner teclado
	
	//Bucle para calcular la media
	for(int i=0;i<num.length;i++) {
		suma+=num[i];
	}
	
	//System.out
	System.out.println("La media es: "+suma/num.length);
	}
}