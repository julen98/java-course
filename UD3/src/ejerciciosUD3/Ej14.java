package ejerciciosUD3;
import java.util.*;
public class Ej14 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	
	//Declaración

	int vector[] = new int[10];
	int num=1;
	
	//Doble bucle para mostrar X num X veces
	
	for(int i=0;i<vector.length;i++) {
		vector[i]=num++;
		for(int cont=0;cont<vector[i];cont++) {
				System.out.print(vector[i]+" ");
			}
		}
	}
	}