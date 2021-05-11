package ejerciciosUD3;

public class Fibonacci {
	public static void main(String[] args) {
		
		double matriz[][] = new double[99][2];
		double suma=0;
		double x=0;
		double y=1;
		matriz[0][0]=0;
		matriz[0][1]=1;
		
		for(int i=1;i<99;i++) {
			for(int j=0;j<2;j++) {
				suma = x + y; 
		        x = y;
		        y = suma;
		        matriz[i][j]=suma;
			}
		}
		for(int i=0;i<99;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(matriz[i][j]);
			}
		}
	}

}
