package transporte;

public class Submarinos extends Acuaticos {
	private double profundidadMax;

	public Submarinos(String matricula, String modelo, double eslora, double profundidadMax) {
		super(matricula, modelo, eslora);
		this.profundidadMax = profundidadMax;
	}
	
	public void imprimir() {
    	System.out.println("Matricula: " + matricula + ", modelo: " + modelo + ", eslora: " + eslora + ", profundidad maxima: " + profundidadMax);
    }
}
