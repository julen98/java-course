package ejerciciosUD3;
import java.util.*;
public class Ej19 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner teclado = new Scanner(System.in);
	
	//Declaración

	int vector[] = new int[8];
	int i;
	
	//Bucle para dar el valor random al vector
	
	for(i=0;i<vector.length;i++) {
	vector[i]=(int)(Math.random()*(1000-2801)+2801);
	}
	
	Arrays.sort(vector); //Ordenar el vector
	
	//Mostrar en pantalla
	
	for(i=vector.length-1;i>=0;i--) {
		System.out.print(vector[i]+" ");
	}
		teclado.close(); //Cerrar el scanner
	}
	}