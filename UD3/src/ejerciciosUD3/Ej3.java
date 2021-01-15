package ejerciciosUD3;
import java.util.Scanner;
public class Ej3 {
public static void main(String[] args) {
	
	//Declaracion
	Scanner teclado = new Scanner(System.in);
	int num[]=new int[10];
	int max=0;
	int min=0;
	
	//Inclusion de datos
	for(int i=0;i<=9;i++) {
	System.out.println("Introduce un numero: ");
	num[i] = teclado.nextInt();
	}
	teclado.close(); //Cerrar el scanner teclado
	for (int i=0;i<10;i++){
		if (max < num[i])
			max = num[i];
		if (min > num[i])
			min = num[i];
	}
	System.out.println("El máximo es: "+max);
	System.out.println("El mínimo es: "+min);
	}
}