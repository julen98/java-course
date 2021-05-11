package librosyrevistas;

public class Libros extends Publicacion implements Prestable {

	boolean prestable = false;
	
	public Libros(String codigo, String titulo, String anoPublicacion) {
		super(codigo, titulo, anoPublicacion);
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
		if(prestable == true)
			tostring +="\nEs prestable.";
		else
			tostring +="\nNo es prestable.";
		tostring += "\n----------------------------------";
		return tostring;
	}

	@Override
	public void prestar() {
		prestable = false;
	}

	@Override
	public void retornar() {
		prestable = true;
	}

	@Override
	public void prestat() {
		
		if(prestable = false)
			System.out.println("El libro con el codigo: \"" + codigo + "\" y el titulo: \"" + titulo + "\" no esta prestado.");
		else
			System.out.println("El libro con el codigo: \"" + codigo + "\" y el titulo: \"" + titulo + "\" esta prestado.");
	}
}
