package examen;

public class Examen {
	private String nombreAsignatura;
	private String aula;
	private String hora;
	private String data;
	
	
	public Examen(String nombreAsignatura, String aula) {
		super();
		this.nombreAsignatura = nombreAsignatura;
		this.aula = aula;
	}

	public String getHora() {
		return hora;
	}
	
	public void setHora(Hora hora) {
		this.hora = hora.toString();
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(Data data) {
		this.data = data.toString();
	}
	
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}
	
	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}
	
	public String getAula() {
		return aula;
	}
	
	public void setAula(String aula) {
		this.aula = aula;
	}

	@Override
	public String toString() {
		String string;
		string = "\n---------------------------";
		string += "\nNombre Asignatura: " + nombreAsignatura;
		string += "\nAula: " + aula;
		string += "\nFecha: " + data;
		string += "\nHora: " + hora;
		string += "\n---------------------------";
		return string;
	}
}
