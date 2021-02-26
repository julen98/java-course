package transporte;

public class Barcos extends Acuaticos {
	private boolean motor;

	public Barcos(String matricula, String modelo, double eslora, boolean motor) {
		super(matricula, modelo, eslora);
		this.motor = motor;
	}
	
	@Override
	public void imprimir() {
    	System.out.print("Matricula: " + matricula + ", modelo: " + modelo + ", eslora: " + eslora);
    	if(motor = true)
    		System.out.print(", tiene aire acondicionado.\n");
    	else
    		System.out.print(", no tiene aire acondicionado.\n");
    }
}
