package ejercicio7;

public class RellenarVector {
public static void rellenaVector(int vector[], int tamany) {
		
		for(int i=0;i<vector.length;i++) {
		
		vector[i]= (int)(-100 + Math.random()*(100-(-100)+1));	
		
		}
	
	}
}
