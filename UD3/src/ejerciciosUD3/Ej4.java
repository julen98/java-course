package ejerciciosUD3;
import java.util.Scanner;
public class Ej4 {
public static void main(String[] args) {
	
	//Declaracion
	Scanner teclado = new Scanner(System.in);
	int num[]=new int[20];
	
	//Inclusion de datos
	for(int i=0;i<num.length;i++) {
	System.out.println("Introduce un numero: ");
	num[i] = teclado.nextInt();
	}
	teclado.close(); //Cerrar el scanner teclado
	
	//System.out
	System.out.println("Los números positivos son: ");
	
	//Bucle para mostrar los numeros positivos
	for(int i=0;i<num.length;i++) {
	if(num[i]>0) {
		System.out.print(num[i]+" ");
	}
	}
	
	//System.out
	System.out.println(" ");
	System.out.println("Los números negativos son: ");
	
	//Bucle para mostrar los numeros negativos
	for(int i=0;i<num.length;i++) {
	if(num[i]<0) {
		System.out.print(+num[i]+" ");
	}
	}
}
}