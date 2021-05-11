package numeroComplejo;

public class ClaseMain2 {
	public static void main(String[] args) {
		Complejo vector[] = new Complejo[10];
        Complejo resultado = new Complejo();
		
		for(int i = 0; i < vector.length; i++) {
			vector[i] = new Complejo(random(),random());
			System.out.println("Complejo "+(i+1)+": ["+vector[i].getReal()+", "+vector[i].getIm()+"]");
		}
		
		for(int i = 0; i < vector.length; i++) {
			resultado.setReal(vector[i].getReal() + resultado.getReal());
			resultado.setIm(vector[i].getIm() + resultado.getIm());
		}
		System.out.println("Suma: "+resultado.getReal() +" + "+ resultado.getIm()+"i");
		
		for(int i = 0; i < vector.length; i++) {
			resultado.setReal(vector[i].getReal() * resultado.getReal() - vector[i].getIm() * resultado.getIm());
			resultado.setIm(vector[i].getReal() * resultado.getIm() + vector[i].getReal() * resultado.getReal());
		}
		System.out.println("Multiplicacion: "+resultado.getReal() +" + "+ resultado.getIm()+"i");
	}
	
	public static double random() {
		double min=1;
		double max=100;
		double random;
		
		random = Math.floor(Math.random() * (max - min) ) + min;
		
		return random;
		
	}
	
}
