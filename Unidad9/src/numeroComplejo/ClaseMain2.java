package numeroComplejo;

public class ClaseMain2 {
	public static void main(String[] args) {
		Complejo vector[] = new Complejo[10];
        Complejo resultado = new Complejo();
		
		for(int i = 0; i < vector.length; i++) {
			vector[i] = new Complejo(random(),random());
			System.out.println("Complejo "+(i+1)+": ["+vector[i].getReal()+", "+vector[i].getImag()+"]");
		}
		
		for(int i = 0; i < vector.length; i++) {
			resultado.setReal(vector[i].getReal() + resultado.getReal());
			resultado.setImag(vector[i].getImag() + resultado.getImag());
		}
		System.out.println("Suma: "+resultado.getReal() +" + "+ resultado.getImag()+"i");
		
		for(int i = 0; i < vector.length; i++) {
			resultado.setReal(vector[i].getReal() * resultado.getReal() - vector[i].getImag() * resultado.getImag());
			resultado.setImag(vector[i].getReal() * resultado.getImag() + vector[i].getReal() * resultado.getReal());
		}
		System.out.println("Multiplicacion: "+resultado.getReal() +" + "+ resultado.getImag()+"i");
	}
	
	public static double random() {
		double min=1;
		double max=100;
		double random;
		
		random = Math.floor(Math.random() * (max - min) ) + min;
		
		return random;
		
	}
	
}
