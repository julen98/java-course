package transporte;

public class Aereos extends Vehiculos {
    final String matricula;
	final int asientos;
	
	public Aereos(String matricula, String modelo, int asientos) {
		super(matricula, modelo);
		if(matricula.matches("^[A-Z]{4}[0-9]{6}$"))
			this.matricula = matricula;
        else
        	this.matricula = "Matricula Incorrecta";
		this.asientos = asientos;
	}
	
	@Override
	public void imprimir() {
    	System.out.println("Matricula: " + matricula + ", modelo: " + modelo + ", asientos: " + asientos);
    }
}
