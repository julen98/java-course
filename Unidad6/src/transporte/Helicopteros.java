package transporte;

public class Helicopteros extends Aereos {
	private int helices;

	public Helicopteros(String matricula, String modelo, int asientos, int helices) {
		super(matricula, modelo, asientos);
		this.helices = helices;
	}
	
	@Override
	public void imprimir() {
    	System.out.println("Matricula: " + matricula + ", modelo: " + modelo + ", asientos: " + asientos + ", helices: " + helices);
    }
	
}
