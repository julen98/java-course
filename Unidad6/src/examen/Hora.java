package examen;

public class Hora {
	private String hora;
	private String minuto;
	
	public Hora(String hora, String minuto) {
		super();
		this.hora = hora;
		this.minuto = minuto;
	}

	public String getHora() {
		return hora;
	}
	
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public String getMinuto() {
		return minuto;
	}
	
	public void setMinuto(String minuto) {
		this.minuto = minuto;
	}
	
	@Override
	public String toString() {
		return hora + ":" + minuto;
	}
	
	
}
