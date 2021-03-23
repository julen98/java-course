package deparbank2;

public class AvisaHisendaException extends Exception {
	private String string;
	
	AvisaHisendaException(String string){
		this.string = string;
	}
	
	public String toString() {
		return "Excepcion de aviso a Hacienda: " + this.string;
	}
}
