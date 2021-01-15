package ejerciciosUD3;

public class MatricesEj2 {
	public static void main(String[] args) {
		
		//Declaracion
		
		int matriz[][] = new int[10][10];
		
		//Inclusion de Datos
		
		for (int i=0;i<matriz.length;i++) {	
			for (int j=0;j<matriz.length;j++) {	
				matriz[i][j]=(i+1)*(j+1);
				System.out.print(matriz[i][j]+" ");
			}
	}
	}
}