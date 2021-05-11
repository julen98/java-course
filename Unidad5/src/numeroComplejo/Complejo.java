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
	
	public double getIm() {
		return im;
	}
	
	public void setReal(double real) {
		this.real = real;
	}
	
	public void setIm(double im) {
		this.im = im;
	}
	
}
