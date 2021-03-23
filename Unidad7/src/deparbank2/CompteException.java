package deparbank2;

public class CompteException extends Exception {
	
	private String string;
	
	CompteException(String string){
		this.string = string;
	}
	
	public String toString() {
		return "Excepcion de cuenta bancaria: " + this.string;
	}
}
