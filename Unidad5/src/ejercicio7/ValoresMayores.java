package ejercicio7;

public class ValoresMayores {
	public static int mayores(int vector[], int x) {
		
		int cuenta=0;
			for(int i=0;i<vector.length;i++) {
				if(vector[i]>=x)
					cuenta++;
		    }
		return cuenta;
	}
}
