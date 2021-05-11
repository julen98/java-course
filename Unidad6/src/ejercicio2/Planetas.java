package ejercicio2;

import java.util.ArrayList;

public class Planetas extends Astros {
	protected double distancia_al_sol;
	protected double orbita_al_sol;
	protected boolean tiene_satelites;
	ArrayList<Satelites> ListaSatelites = new ArrayList<Satelites>();
	
	public void anadirSatelite(Satelites e) {
		for (Satelites sats : ListaSatelites) {
			this.ListaSatelites.add(sats);
		}
	}
	
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

	public boolean tiene_satelites() {
		return tiene_satelites;
	}

	public void setTiene_satelites(boolean tiene_satelites) {
		this.tiene_satelites = tiene_satelites;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public ArrayList<Satelites> getListaSatelites() {
		return ListaSatelites;
	}

	public void setListaSatelites(ArrayList<Satelites> listaSatelites) {
		ListaSatelites = listaSatelites;
	}

	public String satelites() {
		String lista="";
		for(int i = 0; i < ListaSatelites.size(); i++) {
		if(ListaSatelites.get(i).planeta_al_que_pertenece.equals(getNombre())) {
		for (Satelites sats : ListaSatelites) {
			System.out.println(sats.getNombre());
		}
		}
		}
		
		return lista;
	}
	
	@Override
	public String toString() {
		
		String string = "*** Planeta "+nombre+" ***";
		string+= "\nDistancia al sol: "+distancia_al_sol;
		string+= "\nOrbita al sol: "+orbita_al_sol;
		string+= "\nRadio ecuatorial: "+radio_ecuatorial;
		string+= "\nRotacion sobre su eje: "+rotacion_sobre_su_eje;
		string+= "\nMasa: "+masa;
		string+= "\nTemperatura media: "+temperatura_media;
		string+= "\nGravedad: "+gravedad;
		string+= satelites();
		
		return string;
	}
}
