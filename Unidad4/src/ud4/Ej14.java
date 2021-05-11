package ud4;
import java.util.Scanner;
public class Ej14 {
	public static void mostrarPiramide(char caracter,int lineas) {
		
		for(int i=1;i<=lineas*2;i=i+2) {
			for(int doble=(lineas-1)*2;doble>=i;doble=doble-2) {
				System.out.print(" ");
			}
			for(int cont=1;cont<=i;cont++) {
				System.out.print(caracter);
			}
					System.out.print("\n");
		}
		
	}
	public static void main(String[] args) {
		
		//Declaración
		
		Scanner teclado = new Scanner(System.in);
		char caracter;
		int lineas;

		//Inclusion de datos
		
		System.out.println("Escribe el caracter con el que hacer la piramide: ");
		caracter = teclado.next().charAt(0);
		System.out.println("Escribe el número de líneas de la piramide: ");
		lineas = teclado.nextInt();
				
		//Mostrar en pantalla
				
		mostrarPiramide(caracter,lineas);
		
		teclado.close();
	}
	
}
