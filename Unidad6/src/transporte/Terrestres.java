package transporte;

public class Terrestres extends Vehiculos{
	final int ruedas;

	public Terrestres(String matricula, String modelo, int ruedas) {
		super(matricula, modelo);
		this.ruedas = ruedas;
	}
}
