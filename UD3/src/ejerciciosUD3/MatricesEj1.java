package ejerciciosUD3;

public class MatricesEj1 {
	public static void main(String[] args) {
		
		//Declaracion
		
		int matriz[][] = new int[5][5];
		int relleno=1;
	
		//Inclusion de Datos
		
	for (int i=0;i<matriz.length;i++) {	
		for (int j=0;j<matriz.length;j++) {	
			matriz[i][j]=relleno;
			relleno++;
			System.out.print(matriz[i][j]+" ");
			}
	}
	}
}