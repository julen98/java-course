package examen;

public class Data {
	private String dia;
	private String mes;
	private String anyo;
	
	public Data(String dia, String mes, String anyo) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}
	
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getAnyo() {
		return anyo;
	}
	public void setAnyo(String anyo) {
		this.anyo = anyo;
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + anyo;
	}
	
	
	
}
