package ejerciciosUD3;
import java.util.Scanner;
public class MatricesEj4 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		//Declaracion
		
		int matriz[][] = new int[4][5];
		int max=0;
		int min=10;
		double media=0;
		
		//Inclusion de Datos
		
		for (int i=0;i<4;i++) {	
			for (int j=0;j<5;j++) {	
				System.out.println("Introduce la nota del Alumno "+(i+1)+" en la asignatura " + (j+1)+":");
			    matriz[i][j] = teclado.nextInt();
			}
	}
		for (int i=0;i<5;i++) {	
			if (max < matriz[0][i])
				max = matriz[0][i];
			if (min > matriz[0][i])
				min = matriz[0][i];
			media=media+matriz[0][i];
	}
		System.out.println("\nLa nota máxima del Alumno 1 es: "+max);
		System.out.println("La nota mínima del Alumno 1 es: "+min);
		System.out.println("La nota media del Alumno 1 es: "+media/5+"\n");
		media=0;		
		min=10;
		
		for (int i=0;i<5;i++) {	
			if (max < matriz[1][i])
				max = matriz[1][i];
			if (min > matriz[1][i])
				min = matriz[1][i];
			media=media+matriz[1][i];
	}
		System.out.println("La nota máxima del Alumno 2 es: "+max);
		System.out.println("La nota mínima del Alumno 2 es: "+min);
		System.out.println("La nota media del Alumno 2 es: "+media/5+"\n");
		media=0;
		min=10;
		
		for (int i=0;i<5;i++) {	
			if (max < matriz[2][i])
				max = matriz[2][i];
			if (min > matriz[2][i])
				min = matriz[2][i];
			media=media+matriz[2][i];
	}
		System.out.println("La nota máxima del Alumno 3 es: "+max);
		System.out.println("La nota mínima del Alumno 3 es: "+min);
		System.out.println("La nota media del Alumno 3 es: "+media/5+"\n");
		media=0;
		min=10;
		
		for (int i=0;i<5;i++) {	
			if (max < matriz[3][i])
				max = matriz[3][i];
			if (min > matriz[3][i])
				min = matriz[3][i];
			media=media+matriz[3][i];
	}
		System.out.println("La nota máxima del Alumno 4 es: "+max);
		System.out.println("La nota mínima del Alumno 4 es: "+min);
		System.out.println("La nota media del Alumno 4 es: "+media/5);
		
		teclado.close();
	}
}