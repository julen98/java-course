package ejerciciosUD3;
import java.util.*;
public class Ej15 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner teclado = new Scanner(System.in);
	
	//DeclaraciÃ³n
	
	int tamaño;
	int valor;
	
	//InclusiÃ³n de datos
	
	System.out.println("Dime el tamaño del vector: ");
	tamaño = teclado.nextInt();
	System.out.println("Dime el valor del vector: ");
	valor = teclado.nextInt();
	teclado.close();
	int vector[] = new int[tamaño];
	Arrays.fill(vector, valor);
	
	//Mostrar datos
	
	System.out.print("El contenido del vector es el siguiente: ");
	for(int i=0;i<vector.length;i++) {
		System.out.print(vector[i]+" ");
	}
	
	}
	}