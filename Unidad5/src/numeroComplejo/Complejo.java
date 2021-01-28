package numeroComplejo;

public class Complejo {
	private double real;
	private double im;
	
	public Complejo() {
		
	}
	
	public Complejo(double real, double im) {
		this.real = real;
		this.im = im;
	}
	
	public double getReal() {
		return real;
	}
	
	public double getImaginario() {
		return im;
	}
	
	public Complejo sumar(Complejo c){
        Complejo oper = new Complejo();
        oper.real = real + c.real;
        oper.im = im + c.im;
        return oper;
    }

	public Complejo restar(Complejo c){
        Complejo oper = new Complejo();
        oper.real = real - c.real;
        oper.im = im - c.im;
        return oper;
	}
    
    public Complejo multiplicar(Complejo c){
        Complejo oper = new Complejo();
        oper.real = (real * c.real - im * c.im);
        oper.im = (real * c.im + real * c.real);
        return oper;
    }
    
    public Complejo dividir(Complejo c){
        Complejo oper = new Complejo();
        oper.real = (real * c.real + im * c.im) / (c.real * c.real + c.im * c.im);
        oper.im = (im * c.real - real * c.im) / (c.real * c.real + c.im * c.im);                           
        return oper;
    }
}
