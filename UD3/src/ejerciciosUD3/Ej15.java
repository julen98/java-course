package ejerciciosUD3;
import java.util.*;
public class Ej15 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner teclado = new Scanner(System.in);
	
	//Declaración
	
	int tama�o;
	int valor;
	
	//Inclusión de datos
	
	System.out.println("Dime el tama�o del vector: ");
	tama�o = teclado.nextInt();
	System.out.println("Dime el valor del vector: ");
	valor = teclado.nextInt();
	teclado.close();
	int vector[] = new int[tama�o];
	Arrays.fill(vector, valor);
	
	//Mostrar datos
	
	System.out.print("El contenido del vector es el siguiente: ");
	for(int i=0;i<vector.length;i++) {
		System.out.print(vector[i]+" ");
	}
	
	}
	}