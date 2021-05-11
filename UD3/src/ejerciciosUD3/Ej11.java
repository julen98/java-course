package ejerciciosUD3;
import java.util.*;
public class Ej11 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	
	//Declaración
	
	int vector[] = new int[100];
	int copia[] = new int[100];
	int k=1;
	
	//Inclusión de datos
	
	 for (int i=0;i<vector.length;i++) {
		 vector[i]=k;
		 k++;
		 }
	 int j=vector.length-1;
	 for (int i=0;i<=100;i++) {
		 copia[i]=vector[j];
		 j--;
		 System.out.print(copia[i]+" ");
	 }
}
}