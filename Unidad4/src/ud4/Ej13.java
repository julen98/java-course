package ud4;
import java.util.Scanner;
public class Ej13 {
	public static double calcularDescuento(double precioSinDescuento,double precioConDescuento) {
		double descuento;
		
		descuento=(precioSinDescuento-precioConDescuento)*100/precioSinDescuento;
		
		return descuento;
	}
	public static void main(String[] args) {
		
		//Declaración
		
		Scanner teclado = new Scanner(System.in);
		double precioSinDescuento;
		double precioConDescuento;

		//Inclusion de datos
		
		System.out.println("Escribe precio del artículo sin Descuento: ");
		precioSinDescuento = teclado.nextDouble();
		System.out.println("Escribe precio del artículo con Descuento: ");
		precioConDescuento = teclado.nextDouble();
				
		//Mostrar en pantalla
				
		System.out.println("Tu descuento es de un "+calcularDescuento(precioSinDescuento,precioConDescuento)+"%.");
		
		teclado.close();
	}
	
}
