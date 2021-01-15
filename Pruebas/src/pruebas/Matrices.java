package pruebas;
import java.util.Scanner;

public class Matrices {
	
	public static int[][] rellenarMatriz(int[][] matriz) {
		Scanner teclado=new Scanner(System.in);
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
			System.out.println("Introduce los números en la matriz: "+"["+i+"]"+"["+j+"]");
			matriz[i][j]=teclado.nextInt();
		}
		}
		return matriz;
	}
	public static void sumarFila(int[][] matriz) {
			
		// Declaración de variables
			
		Scanner teclado=new Scanner(System.in);
		int entrada=0;
		boolean numerovalido=false;
		int suma=0;
		
		while(numerovalido==false) {
			System.out.println("Elige una fila para sumar (del 1 al 4): ");
			entrada=teclado.nextInt();
			if(entrada>4 || entrada<1) {
				numerovalido=false;
			System.out.println("No es un número válido, vuelve a introducirlo.\n");
			}else {
				numerovalido=true;
			}
			}
				
			// Bucle para sumar la matriz
				
			for(int i=0;i<4;i++)
				suma=suma+matriz[entrada-1][i];
				
			// Mostrar por pantalla el resultado de la suma
			
			System.out.println("La suma de la fila "+entrada+" es: "+suma+"\n");
	}
	public static void sumarColumna(int[][] matriz) {
			
		// Declaración de variables
			
		Scanner teclado=new Scanner(System.in);
		int entrada=0;
		boolean numerovalido=false;
		int suma=0;
			
		while(numerovalido==false) {
			System.out.println("Elige una columna para sumar (del 1 al 4): ");
			entrada=teclado.nextInt();
			if(entrada>4 || entrada<1) {
				numerovalido=false;
			System.out.println("No es un número válido, vuelve a introducirlo.\n");
			}else {
				numerovalido=true;
			}
			}
				
			// Bucle para sumar la matriz
				
			for(int i=0;i<4;i++)
				suma=suma+matriz[i][entrada-1];
			
			// Mostrar por pantalla el resultado de la suma
				
			System.out.println("La suma de la columna "+entrada+" es: "+suma+"\n");
	}
	public static void sumarDiagonal(int[][] matriz) {
			
		// Declaración de variables
			
		int suma=0;
			
		// Bucle para sumar la matriz
							
		for(int i=0;i<4;i++)
			suma=suma+matriz[i][i]; 
					
		// Mostrar por pantalla el resultado de la suma
							
		System.out.println("La suma de la diagonal principal es: "+suma+"\n");
		}
	public static void sumarDiagonalInversa(int[][] matriz) {
			
		// Declaracion de variables
			
		int suma=0;
			
		// Bucle para sumar la matriz
			
		for(int i=3,j=0;j<4;i--,j++)
			suma=suma+matriz[j][i];
					
		// Mostrar por pantalla el resultado de la suma
									
		System.out.println("La suma de la diagonal inversa es: "+suma);
		}
	public static void mediaMatriz(int[][] matriz) {
		
		// Declaracion de variables
		
		int suma=0;
		
		// Bucle para sumar la matriz
										
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
			suma=suma+matriz[i][j];
		}
		}
						
		// Mostrar por pantalla el resultado de la suma
										
		System.out.println("La media de toda la matriz es: "+suma/16);
		
	}	
	public static void menu() {
		
		// Declaracion de variables
		
		Scanner teclado=new Scanner(System.in);
		int opcion=0;
		boolean numerovalido=false;
		int matriz[][]=new int[4][4];
		
		matriz=rellenarMatriz(matriz);
		
		for(int i=1;i>0;i++) {
		
		System.out.println("\n******************************************");
		System.out.println("***                                    ***");
		System.out.println("***              MENU                  ***");
		System.out.println("***                                    ***");
		System.out.println("******************************************");
		System.out.println("***                                    ***");
		System.out.println("*** 1. Rellenar matriz                 ***");
		System.out.println("*** 2. Sumar fila                      ***");
		System.out.println("*** 3. Sumar columna                   ***");
		System.out.println("*** 4. Sumar diagonal                  ***");
		System.out.println("*** 5. Sumar diagonal inversa          ***");
		System.out.println("*** 6. Hacer media de la matriz        ***");
		System.out.println("*** 7. Salir                           ***");
		System.out.println("***                                    ***");
		System.out.println("******************************************");
		System.out.println("***                                    ***");
		System.out.println("*** Elige una opcion:                  ***");
		System.out.println("***                                    ***");
		System.out.println("******************************************\n");
		opcion = teclado.nextInt();
		
		if(opcion==1) {
			matriz=rellenarMatriz(matriz);
		}
		
		if(opcion==2)
			sumarFila(matriz);
		if(opcion==3)
			sumarColumna(matriz);
		if(opcion==4)
			sumarDiagonal(matriz);
		if(opcion==5)
			sumarDiagonalInversa(matriz);
		if(opcion==6)
			mediaMatriz(matriz);
		if(opcion==7)
			System.exit(0);
	}
	}
	public static void main(String[]args) {
		
		// Declaracion de variables
		
		menu();
		
	}
}