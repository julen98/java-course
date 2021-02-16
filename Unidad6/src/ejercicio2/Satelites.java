package ejercicio2;

public class Satelites extends Astros {
	protected double distancia_al_planeta;
	protected double orbita_planetaria;
	protected Planetas planeta_al_que_pertenece;
	
	public Satelites() {
		super();
	}

	public Satelites(String nombre, double radioEcu, double rotacion, double masa, double temp, double gravedad, double distancia_al_planeta, double orbita_planetaria, Planetas planeta_al_que_pertenece) {
		super(nombre, radioEcu, rotacion, masa, temp, gravedad);
		this.distancia_al_planeta = distancia_al_planeta;
		this.orbita_planetaria = orbita_planetaria;
		this.planeta_al_que_pertenece = planeta_al_que_pertenece;
	}

	public double getDistancia_al_planeta() {
		return distancia_al_planeta;
	}

	public void setDistancia_al_planeta(double distancia_al_planeta) {
		this.distancia_al_planeta = distancia_al_planeta;
	}

	public double getOrbita_planetaria() {
		return orbita_planetaria;
	}

	public void setOrbita_planetaria(double orbita_planetaria) {
		this.orbita_planetaria = orbita_planetaria;
	}

	public Planetas getPlaneta_al_que_pertenece() {
		return planeta_al_que_pertenece;
	}

	public void setPlaneta_al_que_pertenece(Planetas planeta_al_que_pertenece) {
		this.planeta_al_que_pertenece = planeta_al_que_pertenece;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return "[distancia_al_planeta=" + distancia_al_planeta + ", orbita_planetaria=" + orbita_planetaria
				+ ", planeta_al_que_pertenece=" + planeta_al_que_pertenece + ", radio_ecuatorial=" + radio_ecuatorial
				+ ", rotacion_sobre_su_eje=" + rotacion_sobre_su_eje + ", masa=" + masa + ", temperatura_media="
				+ temperatura_media + ", gravedad=" + gravedad + "]";
	}

	
	
	
	
}
