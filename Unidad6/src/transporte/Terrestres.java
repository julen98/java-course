package transporte;

public class Terrestres extends Vehiculos{
    final String matricula;
	final int ruedas;

	public Terrestres(String matricula, String modelo, int ruedas) {
		super(matricula, modelo);
		if(matricula.matches("^[0-9]{4}[A-Z]{3}$"))
			this.matricula = matricula;
        else
        	this.matricula = "Matricula Incorrecta";
		this.ruedas = ruedas;
	}
	
	@Override
	public void imprimir() {
    	System.out.println("Matricula: " + matricula + ", modelo: " + modelo + ", ruedas: " + ruedas);
    }
	
}
