package ejerciciosUD3;
import java.util.*;
public class Ej18 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner teclado = new Scanner(System.in);
	
	//Declaración

	int vector[] = new int[30];
	int i;
	
	//Bucle para dar el valor random al vector
	
	for(i=0;i<vector.length;i++) {
	vector[i]=(int)(Math.random()*(0-10)+10);
	}
	
	Arrays.sort(vector); //Ordenar el vector
	
	//Mostrar en pantalla
	
	for(i=0;i<vector.length;i++) {
		System.out.print(vector[i]+" ");
	}
	teclado.close();
	}
	}