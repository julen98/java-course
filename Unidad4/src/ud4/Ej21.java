package ud4;
import java.util.Scanner;
public class Ej21 {
	
	// Pide que se introduzca el radio y lo devuelve
	
	public static double pideRadio() { 
		
		//Declaracion
		
		double r;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		//Inclusion de datos
		
		System.out.println("****************************");
		System.out.println("***                      ***");
		System.out.println("*** Introduce el radio:  ***");
		System.out.println("***                      ***");
		System.out.println("****************************");
		r=teclado.nextDouble();	
		return r;
		}
	
	// Calcula la circunferencia y la devuelve
	
	public static double circunferencia(double r) { 
		
		//Declaracion
		
		double calcularCircunferencia=Math.PI*(r*2);
		
		//Inclusion de datos
		
		System.out.println("****************************");
		System.out.println("***                      ***");
		System.out.println("La circunferencia es: "+calcularCircunferencia);
		System.out.println("***                      ***");
		System.out.println("****************************");
		return calcularCircunferencia;
		}
	
	// Calcula el área y la devuelve
	
	public static double area(double r) { 
		
		//Declaracion
		
		double calcularArea=Math.PI*(r*r);
		
		//Inclusion de datos
		
		System.out.println("****************************");
		System.out.println("***                      ***");
		System.out.println("El area es: "+calcularArea);
		System.out.println("***                      ***");
		System.out.println("****************************");
		return calcularArea;
		}
	
	// Calcula el volumen y lo devuelve
	
	public static double volumen(double r) { 
		
		//Declaracion
		
		double calcularVolumen=4*Math.PI*(r*r*r)/4;
		
		//Inclusion de datos

		System.out.println("****************************");
		System.out.println("***                      ***");
		System.out.println("El volumen es: "+calcularVolumen);
		System.out.println("***                      ***");
		System.out.println("****************************");
		return calcularVolumen;
		}
	
	// Hace todos los calculos y los devuelve
	
	public static void todas(double r) { 
		circunferencia(r);
		area(r);
		volumen(r);
		}
	
	// Termina el programa
	
	public static void salir() {
		System.exit(0);
	}
	
	// Muestra el menú y devuelve el número elegido
	
	public static void menu() { 
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		//Declaracion
		
		int opcion=0;
		
		//Bucle para que el programa se repita
		
		while(opcion!=5) {
		System.out.println("\n\n****************************");
		System.out.println("*********** MENÚ ***********");
		System.out.println("***                      ***");
		System.out.println("*** 1. Circunferencia    ***");
		System.out.println("*** 2. Área              ***");
		System.out.println("*** 3. Volumen           ***");
		System.out.println("*** 4. Todas             ***");
		System.out.println("*** 5. Salir             ***");
		System.out.println("***                      ***");
		System.out.println("****************************");
		System.out.println("***                      ***");
		System.out.println("*** Elige una opción:    ***");
		System.out.println("***                      ***");
		System.out.println("****************************");
		opcion=teclado.nextInt();
		
		//Condicionales Menu
		
		if(opcion==1) {
			circunferencia(pideRadio());
		}
		if(opcion==2) {
			area(pideRadio());
		}
		if(opcion==3) {
			volumen(pideRadio());
		}
		if(opcion==4)
			todas(pideRadio());
		if(opcion==5)
			salir();
		}
			
	}
	
	public static void main(String[] args) {
		menu(); //Ejecutar el menu
	}
}