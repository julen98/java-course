package librosyrevistas;

public class Revistas extends Publicacion {
	int numero;
	
	public Revistas(String codigo, String titulo, String anoPublicacion, int numero) {
		super(codigo, titulo, anoPublicacion);
		this.numero = numero;
	}
	
	@Override
	public String getCodigo() {
		return this.codigo;
	}
	
	@Override
	public String getAnoPublicacion() {
		return this.anoPublicacion;
	}
	
	@Override
	public String toString() {
		String tostring = "\nCodigo: " + codigo;
		tostring += "\nTitulo: " + titulo;
		tostring += "\nAño Publicacion: " + anoPublicacion;
		tostring += "\nNumero: " + numero;
		tostring += "\n----------------------------------";
		return tostring;
	}
	
}
