package ejerciciosUD3;
import java.util.Scanner;
public class Ej2 {
public static void main(String[] args) {
	
	//Declaracion
	Scanner teclado = new Scanner(System.in);
	int num[]=new int[10];
	int suma=0;
	
	//Inclusion de datos
	for(int i=0;i<=9;i++) {
	System.out.println("Introduce un numero: ");
	num[i] = teclado.nextInt();
	suma+=num[i];
	}
	teclado.close(); //Cerrar el scanner teclado
	
	//Mostrar datos en pantalla
	System.out.print("La suma de los números que has escrito es: "+suma);
}
}