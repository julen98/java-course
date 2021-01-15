package ejerciciosUD3;

public class MatricesEjemplo {
	public static void main(String[] args) {
		
		//Declaracion
		
		int matriz[][] = new int[4][3];
	
		//Inclusion de Datos
		
	for (int i=0;i<4;i++) {	
		for (int j=0;j<3;j++) {	
			matriz[i][j]=0;
			System.out.print("vector["+i+"]["+j+"]="+matriz[i][j]+" ");
	}
	}
	}
}