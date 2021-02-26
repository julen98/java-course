package transporte;

public class Motos extends Terrestres{
	private String color;

	public Motos(String matricula, String modelo, int ruedas, String color) {
		super(matricula, modelo, ruedas);
		this.color = color;
	}
	
	@Override
	public void imprimir() {
    	System.out.println("Matricula: " + matricula + ", modelo: " + modelo + ", ruedas: " + ruedas + ", color: " + color);
    }
	
}
