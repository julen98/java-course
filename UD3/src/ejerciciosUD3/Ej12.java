package ejerciciosUD3;
import java.util.*;
public class Ej12 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	
	//Declaración
	
	Scanner teclado = new Scanner(System.in);
	int vector[] = new int[] {0,10,2,30,4,50,6,70,8,90};
	char entrada='x';
	boolean bucle=false;

	//Inicio Menú
	
	while(bucle==false) {
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("************ MENÚ ************");
	System.out.println("a. Mostrar valores.");
	System.out.println("b. Introducir valor.");
	System.out.println("c. Salir.");
	
	System.out.println("Elige una opción del menú: ");
	entrada = teclado.next().charAt(0);
	
	// ** PRIMERA OPCIÓN **
	if(entrada=='a') {
		System.out.println(" ");
		System.out.print("Los números son: ");
		for(int i=0;i<10;i++) {
			System.out.print(vector[i]+" ");
		}
	}
	
	// ** SEGUNDA OPCIÓN **
	if(entrada=='b') {
		
		//Declaración
		
		int numV;
		int posP;
		
		//Inclusión de datos
		
		System.out.println(" ");
		System.out.println("Introduce un número: ");
		numV = teclado.nextInt();
		System.out.println("Introduce una posición del vector: ");
		posP = teclado.nextInt();
		
		vector[posP] = numV;		
	}
	
	// ** TERCERA OPCIÓN **

	if(entrada=='c') {
		bucle=true;
	}
	}
	teclado.close(); //Cerrar el scanner teclado
}
}