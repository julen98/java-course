package ejerciciosUD3;
import java.util.*;
public class Ej13 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	
	//Declaración
	
	Scanner teclado = new Scanner(System.in);
	int inicial;
	int crear;
	int incremento;
	
	//Inclusión de datos
	
	System.out.println("Introduce el valor inicial: ");
	inicial = teclado.nextInt();
	System.out.println("Introduce el valor de incremento: ");
	incremento = teclado.nextInt();
	System.out.println("Introduce el valor de numeros a crear: ");
	crear = teclado.nextInt();
	teclado.close(); //Cerrar el Scanner teclado
	
	//Declaración
	
	int vector[] = new int[crear+1];
	vector[0]=inicial;
	
	//Bucle para realizar el incremento y mostrarlo en pantalla
	
	System.out.print("Tu secuencia aritmética es: ");
	for(int i=0;i<crear;i++) {
		vector[i+1]=vector[i]+incremento;
		System.out.print(vector[i]+" ");
	}
}
}