package ud4;
import java.util.Scanner;
public class Ej19 {
	public static void ecuacionPitagoras(int x,int y,int z) {
		if(x*x+y*y==z*z) 
			System.out.println("Los números introducidos se ajustan a la ecuación de Pitágoras.");
		else
			System.out.println("Los números introducidos no se ajustan a la ecuación de Pitágoras.");
	}
	public static void main(String[] args) {
		
		//Declaración
		
		Scanner teclado = new Scanner(System.in);
		int x, y, z;
		
		//Inclusion de datos
		
		System.out.println("Introduce x: ");
		x=teclado.nextInt();
		System.out.println("Introduce y: ");
		y=teclado.nextInt();
		System.out.println("Introduce z: ");
		z=teclado.nextInt();
		
		ecuacionPitagoras(x,y,z);
		
		teclado.close();
	}
	
}
