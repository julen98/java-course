package ejerciciosUD3;
import java.util.*;
public class Ej16 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	
	//Declaración

	int vector[] = new int[10];
	Arrays.fill(vector, 0,1,1); //Rellenar un indice del vector con un numero
	Arrays.fill(vector, 1,2,2);
	Arrays.fill(vector, 2,3,3);
	Arrays.fill(vector, 3,4,4);
	Arrays.fill(vector, 4,5,5);
	Arrays.fill(vector, 5,6,6);
	Arrays.fill(vector, 6,7,7);
	Arrays.fill(vector, 7,8,8);
	Arrays.fill(vector, 8,9,9);
	Arrays.fill(vector, 9,10,10);

	//Mostrar en pantalla
	
	for(int i=0;i<vector.length;i++) {
		for(int cont=0;cont<vector[i];cont++) {
				System.out.print(vector[i]+" ");
			}
		}
	}
	}