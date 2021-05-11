package ejerciciosUD3;
import java.util.*;
public class Ej8 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	//Declaracion
	
	Scanner teclado = new Scanner(System.in);
	double vector[] = new double[100];
	double numR;
	int menor=0;
	int mayor=0;

	//Bucle para mostrar el valor de num3
	for(int i=0;i<vector.length;i++) {
		vector[i]=(Math.random()*(0-1)+1);
	}
	//Inclusion de datos
		System.out.println("Introduce un numero: ");
		numR = teclado.nextDouble();
		teclado.close(); //Cerrar el scanner teclado
		
		//Bucle para mostrar los números mayores y menores
		for (int i=0;i<vector.length;i++){
			if (numR < vector[i]) {
				mayor++;
			}
		}
		for (int i=0;i<vector.length;i++){
			if (numR > vector[i]) {
				menor++;
			}
		}
		System.out.println("Hay "+mayor+" números mayores que "+numR+".");
		System.out.println("Hay "+menor+" números menores que "+numR+".");
}
}