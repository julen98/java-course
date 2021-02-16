package ejercicio2;

import java.util.*;

public class ClaseMain {
	public static void main(String[] args) {
		
		ArrayList<Planetas> plan = new ArrayList <Planetas>();
		
		Planetas p1 = new Planetas("Tierra", 0, 3, 0, 3, 0, 3, 0, true);
		Planetas p2 = new Planetas("Marte", 1, 2, 1, 2, 1, 2, 1, false);
		Planetas p3 = new Planetas("Jupiter", 2, 1, 2, 1, 2, 1, 2, true);
		Planetas p4 = new Planetas("Saturno", 3, 0, 3, 0, 3, 0, 3, false);
		
		plan.add(p1);
		plan.add(p2);
		plan.add(p3);
		plan.add(p4);
		
		ArrayList<Satelites> sat = new ArrayList<Satelites>();
		
		Satelites s1 = new Satelites("Europa", 0, 0, 0, 0, 0, 0, 0, p1);
		Satelites s2 = new Satelites("Luna", 0, 0, 0, 0, 0, 0, 0, p1);
		Satelites s3 = new Satelites("Ganimedes", 0, 0, 0, 0, 0, 0, 0, p3);
		Satelites s4 = new Satelites("Calisto", 0, 0, 0, 0, 0, 0, 0, p3);
		
		sat.add(s1);
		sat.add(s2);
		sat.add(s3);
		sat.add(s4);
		
		for (Satelites satelite : sat) {
		if(satelite.getPlaneta_al_que_pertenece().equals(p1)) {
			System.out.println(satelite.getNombre());
		}
		}
		
		imprimir(plan,sat);
		
	}
	
	public static void imprimir(ArrayList<Planetas> plan, ArrayList<Satelites> sat) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el astro a mostrar: ");
		String astro = teclado.nextLine();
		
		for(Planetas planeta : plan) {
			if(planeta.getNombre() == astro) {
				System.out.println(planeta.toString());
			}
		}
		
		}
	
}
