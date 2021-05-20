package numeroComplejo;
import java.util.*;

public class ClaseMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		Complejo c1, c2, oper;
		double real, im;
		
		// Rellenar objetos
		
		System.out.print("Escribe el primer real:\t");
        real = teclado.nextDouble();
        System.out.print("Escribe el primer imaginario:\t");
        im = teclado.nextDouble();                    
        c1 = new Complejo (real, im); 
        
        System.out.print("Escribe el primer real:\t");
        real = teclado.nextDouble();
        System.out.print("Escribe el primer imaginario:\t");
        im = teclado.nextDouble();                  
        c2 = new Complejo (real,im);
        
        oper = sumar(c1,c2);
        
        menu(c1,c2,oper);
        }
	
	public static Complejo sumar(Complejo c, Complejo c1){
        Complejo oper = new Complejo();
        oper.setReal(c1.getReal() + c.getReal());
        oper.setIm(c1.getIm() + c.getIm());
        return oper;
    }

	public static Complejo restar(Complejo c, Complejo c1){
        Complejo oper = new Complejo();
        
        oper.setReal(c1.getReal() - c.getReal());
        oper.setIm(c1.getIm() - c.getIm());
        return oper;
	}
    
    public static Complejo multiplicar(Complejo c, Complejo c1){
        Complejo oper = new Complejo();
        oper.setReal((c1.getReal() * c.getReal() - c1.getIm() * c.getIm()));
        oper.setIm((c1.getReal() * c.getIm() + c1.getReal() * c.getReal()));
        return oper;
    }
    
    public static Complejo dividir(Complejo c, Complejo c1){
        Complejo oper = new Complejo();
        oper.setReal((c1.getReal() * c.getReal() + c1.getIm() * c.getIm()) / (c.getReal() * c.getReal() + c.getIm() * c.getIm()));
        oper.setIm((c1.getIm() * c.getReal() - c1.getReal() * c.getIm()) / (c.getReal() * c.getReal() + c.getIm() * c.getIm()));                           
        return oper;
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
		oper = sumar(c1,c2);
        System.out.println("El resultado es: "+oper.getReal()+" + "+ oper.getIm()+"i");
		}
		
		if(opcion == 2) {
		oper = restar(c1,c2);
        System.out.println("El resultado es: "+oper.getReal()+" + "+ oper.getIm()+"i");
		}
		
		if(opcion == 3) {
		oper = multiplicar(c1,c2);
	    System.out.println("El resultado es: "+oper.getReal()+" + "+ oper.getIm()+"i");
		}
		
		if(opcion == 4) {
		oper = dividir(c1,c2);
	    System.out.println("El resultado es: "+oper.getReal()+" + "+ oper.getIm()+"i");
		}
		
		if(opcion == 5)
		System.exit(0);
		}
		
		}
}
