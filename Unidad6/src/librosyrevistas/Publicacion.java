package librosyrevistas;

public abstract class Publicacion {
	String codigo;
	String titulo;
	String anoPublicacion;
	
	public Publicacion(String codigo, String titulo, String anoPublicacion) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.anoPublicacion = anoPublicacion;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public String getAnoPublicacion() {
		return this.anoPublicacion;
	}

	@Override
	public String toString() {
		String tostring = "\nCodigo: " + codigo;
		tostring += "\nTitulo: " + titulo;
		tostring += "\nAño Publicacion: " + anoPublicacion;
		tostring += "\n----------------------------------";
		return tostring;
	}
	
}
