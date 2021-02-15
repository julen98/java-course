package ejercicio2;

public class Astros {
	protected String nombre;
	protected double radio_ecuatorial;
	protected double rotacion_sobre_su_eje;
	protected double masa;
	protected double temperatura_media;
	protected double gravedad;
	
	public Astros() {
		
	}
	
	public Astros(String nombre, double radioEcu, double rotacion, double masa, double temp, double gravedad) {
		this.nombre = nombre;
		this.radio_ecuatorial = radioEcu;
		this.rotacion_sobre_su_eje = rotacion;
		this.masa = masa;
		this.temperatura_media = temp;
		this.gravedad = gravedad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getRadio_ecuatorial() {
		return radio_ecuatorial;
	}

	public void setRadio_ecuatorial(double radio_ecuatorial) {
		this.radio_ecuatorial = radio_ecuatorial;
	}

	public double getRotacion_sobre_su_eje() {
		return rotacion_sobre_su_eje;
	}

	public void setRotacion_sobre_su_eje(double rotacion_sobre_su_eje) {
		this.rotacion_sobre_su_eje = rotacion_sobre_su_eje;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public double getTemperatura_media() {
		return temperatura_media;
	}

	public void setTemperatura_media(double temperatura_media) {
		this.temperatura_media = temperatura_media;
	}

	public double getGravedad() {
		return gravedad;
	}

	public void setGravedad(double gravedad) {
		this.gravedad = gravedad;
	}

	@Override
	public String toString() {
		return "Astros [radio_ecuatorial=" + radio_ecuatorial + ", rotacion_sobre_su_eje=" + rotacion_sobre_su_eje
				+ ", masa=" + masa + ", temperatura_media=" + temperatura_media + ", gravedad=" + gravedad + "]";
	}
}
