package ud4;
import java.util.Scanner;
public class Ej7 {
	public static double perimetroRectangulo(double ancho, double alto) {
		double perimetro;
		
		perimetro=ancho*2+alto*2;
		
		return perimetro;
	}
	public static double areaRectangulo(double ancho, double alto) {
		double area;
		
		area=ancho*alto;
		
		return area;
	}
	public static void main(String[] args) {
		
		//Declaración
		
		Scanner teclado = new Scanner(System.in);
		double ancho;
		double alto;

		//Inclusion de datos
		
		System.out.println("Escribe la altura del rectángulo: ");
		alto = teclado.nextDouble();
		System.out.println("Escribe el ancho del rectángulo: ");
		ancho = teclado.nextDouble();
		
		System.out.println("El área de tu rectángulo es: "+areaRectangulo(ancho,alto));
		System.out.println("El perimetro de tu rectángulo es: "+perimetroRectangulo(ancho,alto));
		
		teclado.close();
	}
	
}
