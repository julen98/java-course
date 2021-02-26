package transporte;

public class Acuaticos extends Vehiculos {
    final String matricula;
	final double eslora;
	
	public Acuaticos(String matricula, String modelo, double eslora) {
		super(matricula, modelo);
		if(matricula.matches("^[A-Z]{3,10}$"))
			this.matricula = matricula;
        else
        	this.matricula = "Matricula Incorrecta";
		this.eslora = eslora;
	}
	
	@Override
	public void imprimir() {
    	System.out.println("Matricula: " + matricula + ", modelo: " + modelo + ", eslora: " + eslora);
    }
}
