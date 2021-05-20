package numeroComplejo;
import java.util.*;

public class ClaseMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		Complejo c1, c2, oper;
		double real = 0, im = 0;
		
		// Rellenar objetos
		
        c1 = new Complejo (real, im); 
        c2 = new Complejo (real,im);
        
        oper = sumar(c1,c2);
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
	
}
