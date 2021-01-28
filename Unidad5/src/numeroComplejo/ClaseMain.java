package numeroComplejo;
import java.util.*;

public class ClaseMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		Complejo c1, c2, oper;
		double real, imag;
		
		// Rellenar objetos
		
		System.out.print("Escribe el primer real: ");
        real = teclado.nextDouble();
        System.out.print("Escribe el primer imaginario: ");
        imag = teclado.nextDouble();                    
        c1 = new Complejo (real, imag);    
        System.out.print("Escribe el segundo real: ");
        real = teclado.nextDouble();
        System.out.print("Escribe el segundo imaginario: ");
        imag = teclado.nextDouble();                    
        c2 = new Complejo (real, imag);
        
        oper = c1.sumar(c2);
        
        menu(c1,c2,oper);
        }
	
	public static void menu(Complejo c1, Complejo c2, Complejo oper) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		
		// Bucle para mostrar el menu una vez se selecciona una opcion
		
		while(opcion<6) {
		
		System.out.println("#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$");
		System.out.println("#$#$ 1. Sumar.            #$#$");
		System.out.println("#$#$ 2. Restar.           #$#$");
		System.out.println("#$#$ 3. Multiplicar.      #$#$");
		System.out.println("#$#$ 4. Dividir.          #$#$");
		System.out.println("#$#$ 5. Salir.            #$#$");
		System.out.println("#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$");
		System.out.println("#$#$ Elige una opcion:    #$#$");
		System.out.println("#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$");
		opcion = teclado.nextInt();
		
		if(opcion == 1) {
		oper = c1.sumar(c2);
        System.out.println("El resultado es: "+oper.getReal()+" + "+ oper.getImaginario()+"i");
		}
		
		if(opcion == 2) {
		oper = c1.restar(c2);
        System.out.println("El resultado es: "+oper.getReal()+" + "+ oper.getImaginario()+"i");
		}
		
		if(opcion == 3) {
		oper = c1.multiplicar(c2);
	    System.out.println("El resultado es: "+oper.getReal()+" + "+ oper.getImaginario()+"i");
		}
		if(opcion == 4) {
		oper = c1.dividir(c2);
	    System.out.println("El resultado es: "+oper.getReal()+" + "+ oper.getImaginario()+"i");
		}
		if(opcion == 5)
		System.exit(0);
		}
		}
	
}
