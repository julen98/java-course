package transporte;

public class Acuaticos extends Vehiculos {
	final double eslora;
	
	public Acuaticos(String matricula, String modelo, int eslora) {
		super(matricula, modelo);
		this.eslora = eslora;
	}
}
