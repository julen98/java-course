package ejercicio7;
import java.util.*;

public class VectorExiste {
	public static boolean existe(int vector[], int x) {
		
		boolean exist=false;
			for(int i=0;i<vector.length;i++) {
				if(vector[i]==x)
					exist=true;
		    }
		return exist;
	}
	
}
