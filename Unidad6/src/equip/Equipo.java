package equip;

import java.util.ArrayList;

public class Equipo {
	private String nombreEquipo;
	private String estadio;
	private Entrenador entrenador;
	ArrayList<Jugador> jugador = new ArrayList<>();
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	
	public String getEstadio() {
		return estadio;
	}
	
	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}
	
	public Entrenador getEntrenador() {
		return entrenador;
	}
	
	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}
	
	public ArrayList<Jugador> getJugador() {
		return jugador;
	}
	
	public void setJugador(ArrayList<Jugador> jugador) {
		this.jugador = jugador;
	}

	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", estadio=" + estadio + "]";
	}
	
	public void mostrarJugadores() {
		for (Jugador jugador2 : jugador) {
			System.out.println(jugador2.getNombreJugador());
			System.out.println(jugador2.getNacionalidad());
			System.out.println(jugador2.getPosicionJuego());
		}
	}
	
	public void mostrarEntrenador() {
		System.out.println("Entrenador: " + entrenador.getNombreEntrenador());
	}
}
