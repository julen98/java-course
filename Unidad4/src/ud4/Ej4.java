package ud4;
import java.util.Scanner;
public class Ej4 {
	public static int dimeSigno(int n1) {
		int negIgualPos=0;
		
		if(n1==0)
			negIgualPos=0;
		if(n1>0)
			negIgualPos=1;
		if(n1<0)
			negIgualPos=-1;
		
		return negIgualPos;
	}
	public static void main(String[] args) {
		
		//Declaración
		
		Scanner teclado = new Scanner(System.in);
		int n1;

		//Inclusion de datos
		
		System.out.println("Dime un número: ");
		n1 = teclado.nextInt();
				
		//Mostrar en pantalla
				
		System.out.println(dimeSigno(n1));
		
		teclado.close();
	}
	
}
