package ejerciciosUD3;
import java.util.Scanner;
public class Ej7 {
public static void main(String[] args) {
	
	//Declaracion
	Scanner teclado = new Scanner(System.in);
	int numP;
	int numQ;
	
	
	//Inclusion de datos
	System.out.println("Introduce un numero: ");
	numP = teclado.nextInt();
	System.out.println("Introduce un numero: ");
	numQ = teclado.nextInt();
	teclado.close(); //Cerrar el scanner teclado

	//Declaracion
	int vector[] = new int[numQ];
	
	//Bucle para mostrar el valor de num3
	for(int i=0;numP<=vector.length;i++) {
			vector[i]=numP;
			numP++;
	System.out.print(vector[i]+" ");
	}
	}
}