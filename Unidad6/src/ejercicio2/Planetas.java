package ejercicio2;

public class Planetas extends Astros {
	protected double distancia_al_sol;
	protected double orbita_al_sol;
	protected boolean tiene_satelites;
	
	public Planetas() {
		super();
	}
	
	public Planetas(String nombre, double radioEcu, double rotacion, double masa, double temp, double gravedad, double distancia_al_sol, double orbita_al_sol, boolean tiene_satelites) {
		super(nombre, radioEcu, rotacion, masa, temp, gravedad);
		this.distancia_al_sol = distancia_al_sol;
		this.orbita_al_sol = orbita_al_sol;
		this.tiene_satelites = tiene_satelites;
	}

	public double getDistancia_al_sol() {
		return distancia_al_sol;
	}

	public void setDistancia_al_sol(double distancia_al_sol) {
		this.distancia_al_sol = distancia_al_sol;
	}

	public double getOrbita_al_sol() {
		return orbita_al_sol;
	}

	public void setOrbita_al_sol(double orbita_al_sol) {
		this.orbita_al_sol = orbita_al_sol;
	}

	public boolean isTiene_satelites() {
		return tiene_satelites;
	}

	public void setTiene_satelites(boolean tiene_satelites) {
		this.tiene_satelites = tiene_satelites;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return "[distancia_al_sol=" + distancia_al_sol + ", orbita_al_sol=" + orbita_al_sol
				+ ", tiene_satelites=" + tiene_satelites + ", radio_ecuatorial=" + radio_ecuatorial
				+ ", rotacion_sobre_su_eje=" + rotacion_sobre_su_eje + ", masa=" + masa + ", temperatura_media="
				+ temperatura_media + ", gravedad=" + gravedad + "]";
	}
}
