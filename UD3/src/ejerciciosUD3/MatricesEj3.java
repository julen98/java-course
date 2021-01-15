package ejerciciosUD3;
import java.util.Scanner;
public class MatricesEj3 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		//Declaracion
		
		int col;
		int fila;
		int mayor0=0;
		int menor0=0;
		int igual0=0;
		
		//Inclusion de Datos
		
		System.out.println("Introduce el tamaño de las columnas de la matriz: ");
		col= teclado.nextInt();
		System.out.println("Introduce el tamaño de las filas de la matriz: ");
		fila= teclado.nextInt();
		
		int matriz[][] = new int[col][fila];
		
		for (int i=0;i<col;i++) {	
			for (int j=0;j<fila;j++) {	
				System.out.println("Introduce el numero de la matriz [" + i + "," + j + "]");
			    matriz[i][j] = teclado.nextInt();
			}
	}
		System.out.println("Hay "+mayor0+" números mayores que 0.");
		System.out.println("Hay "+menor0+" números menores que 0.");
		System.out.println("Hay "+igual0+" números iguales que 0.");
		teclado.close();
	}
}