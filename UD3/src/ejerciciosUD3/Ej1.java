package ejerciciosUD3;
import java.util.Scanner;
public class Ej1 {
public static void main(String[] args) {
	
	//Declaracion
	Scanner teclado = new Scanner(System.in);
	int num[] = new int[10];
	
	//Inclusion de datos
	for(int i=0;i<=9;i++) {
	System.out.println("Introduce un numero: ");
	num[i] = teclado.nextInt();
	}
	teclado.close(); //Cerrar el scanner teclado
	
	//Mostrar datos en pantalla
	System.out.print("Los números que has escrito son: ");
	for(int i=0;i<=10;i++) {
		System.out.print(num[i]+" ");
	}
}
}