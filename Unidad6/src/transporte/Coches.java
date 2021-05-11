package transporte;

public class Coches extends Terrestres {
	private boolean aireAcondicionado;
	public Coches(String matricula, String modelo, int ruedas, boolean aireAcondicionado) {
		super(matricula, modelo, ruedas);
		this.aireAcondicionado = aireAcondicionado;
		
	}
	
	@Override
	public void imprimir() {
    	System.out.print("Matricula: " + matricula + ", modelo: " + modelo + ", ruedas: " + ruedas);
    	if(aireAcondicionado = true)
    		System.out.print(", tiene aire acondicionado.\n");
    	else
    		System.out.print(", no tiene aire acondicionado.\n");
    }
	
}
