package ejerciciosUD3;
import java.util.Scanner;
public class Ej6 {
public static void main(String[] args) {
	
	//Declaracion
	Scanner teclado = new Scanner(System.in);
	int num1;
	int num2;
	
	//Inclusion de datos
	System.out.println("Introduce un numero: ");
	num1 = teclado.nextInt();
	System.out.println("Introduce un numero: ");
	num2 = teclado.nextInt();
	teclado.close(); //Cerrar el scanner teclado
	
	//Declaracion
	int num3[]=new int[num1]; 
	
	//Bucle para mostrar el valor de num3
	for(int i=0;i<num3.length;i++) {
	num3[i]=num2;
	System.out.print(num3[i]+" ");
	}
	}
}