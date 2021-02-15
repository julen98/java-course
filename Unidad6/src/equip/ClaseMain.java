package equip;

import java.util.ArrayList;

public class ClaseMain {
	public static void main(String[] args) {
		Entrenador entrenador = new Entrenador();
		
		entrenador.setNacionalidad("Italia");
		entrenador.setNombreEntrenador("Antonio Conte");
		
		Jugador jugador1= new Jugador();
		Jugador jugador2 = new Jugador();
		
		jugador1.setNacionalidad("Belgica");
		jugador1.setNombreJugador("Eden Hazard");
		jugador1.setPosicionJuego("Centrocampista");
		
		jugador2.setNacionalidad("España");
		jugador2.setNombreJugador("Diego Costa");
		jugador2.setPosicionJuego("Delantero");
		
		ArrayList<Jugador> jugadores = new ArrayList<>();
		jugadores.add(jugador1);
		jugadores.add(jugador2);
		
		Equipo equipo = new Equipo();
		
		equipo.setEntrenador(entrenador);
		equipo.setEstadio("Stamford Bridge");
		equipo.setJugador(jugadores);
		equipo.setNombreEquipo("Chelsea FC");
		
		System.out.println(equipo.toString());
		equipo.mostrarJugadores();
		equipo.mostrarEntrenador();
		
	}
}
