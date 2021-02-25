package transporte;

public class Aereos extends Vehiculos {
	final int asientos;
	
	public Aereos(String matricula, String modelo, int asientos) {
		super(matricula, modelo);
		this.asientos = asientos;
	}
}
