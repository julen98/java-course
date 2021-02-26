package transporte;

public class Aviones extends Aereos {
	private double tiempoVuelo;

	public Aviones(String matricula, String modelo, int asientos, double tiempoVuelo) {
		super(matricula, modelo, asientos);
		this.tiempoVuelo = tiempoVuelo;
	}
	
	@Override
	public void imprimir() {
    	System.out.println("Matricula: " + matricula + ", modelo: " + modelo + ", asientos: " + asientos + ", tiempo maximo de vuelo: " + tiempoVuelo);
    }
	
}
