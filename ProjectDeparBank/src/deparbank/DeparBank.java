package deparbank;
import java.util.Scanner;

public class DeparBank {
	public static void main(String[] args) {
		CompteBancari c1 = new CompteBancari("ES0000000000000000000000","Julen Martinez",5);
		menuBanco(c1);
	}
	
	public static void menuBanco(CompteBancari c1) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		
		while(opcion<9) {
		
		System.out.println("\n#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$");
		System.out.println("1. Mostrar datos.");
		System.out.println("2. Mostrar IBAN.");
		System.out.println("3. Mostrar nombre.");
		System.out.println("4. Mostrar saldo.");
		System.out.println("5. Realizar ingreso.");
		System.out.println("6. Realizar retirada.");
		System.out.println("7. Mostrar historial de movimientos.");
		System.out.println("8. Salir.");
		System.out.println("#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$\n");
		System.out.println("Elige una opcion: ");
		System.out.println("\n#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$\n");
		opcion = teclado.nextInt();
		System.out.println("\n#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$\n");
		
		if(opcion == 1)
		c1.imprimirDatos();
		
		if(opcion == 2)
		c1.imprimirIBAN();
		
		if(opcion == 3)
		c1.imprimirNombre();
		
		if(opcion == 4)
		c1.imprimirSaldo();
		
		if(opcion == 5) {
		System.out.println("¿Cuanto deseas ingresar?\n");
		double ingreso = teclado.nextDouble();
		c1.depositar(ingreso);
		}
		
		if(opcion == 6) {
		System.out.println("¿Cuanto deseas retirar?\n");
		double retirada = teclado.nextDouble();
		c1.retirar(retirada);
		}
		
		if(opcion == 7)
		
		
		if(opcion == 8) {
		System.exit(0);
		}
		
		}
	}
}
