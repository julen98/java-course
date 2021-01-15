package ud4;
import java.util.Scanner;
public class Ej8 {
	public static int suma1aN(int numero) {
		int suma=0;
		
		for(int i=1;i<=numero;i++)
			suma=suma+i;
		
		return suma;
	}
	public static int producto1aN(int numero) {
		int producto=1;
		
		for(int i=1;i<=numero;i++)
			producto=producto*i;
		
		return producto;
	}
	public static double intermedio1aN(int numero) {
		double intermedio=0;
		
		for(int i=1;i<=numero;i++)
			intermedio=intermedio+i;
		
		intermedio=intermedio/numero;
		
		return intermedio;
	}
	public static void main(String[] args) {
		
		//Declaración
		
		Scanner teclado = new Scanner(System.in);
		int numero;

		//Inclusion de datos
		
		System.out.println("Escribe un número: ");
		numero = teclado.nextInt();
		
		System.out.println("El sumatorio de 1 a tu número es: "+suma1aN(numero));
		System.out.println("El productorio de 1 a tu número es: "+producto1aN(numero));
		System.out.println("El intermedio de 1 a tu número es: "+intermedio1aN(numero));
		
		teclado.close();
	}
	
}
