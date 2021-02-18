package ejercicio2;

import java.util.*;

public class ClaseMain {
	public static void main(String[] args) {
		
		ArrayList<Astros> lista = new ArrayList <Astros>();
		
		Planetas p1 = new Planetas("Tierra", 0, 3, 0, 3, 0, 3, 0, true);
		Planetas p2 = new Planetas("Marte", 1, 2, 1, 2, 1, 2, 1, false);
		Planetas p3 = new Planetas("Jupiter", 2, 1, 2, 1, 2, 1, 2, true);
		Satelites s1 = new Satelites("Europa", 0, 0, 0, 0, 0, 0, 0, p1);
		Satelites s2 = new Satelites("Luna", 0, 0, 0, 0, 0, 0, 0, p1);
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(s1);
		lista.add(s2);
		
		menu(lista);
		
	}
	
	public static void menu(ArrayList<Astros> lista) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;

		while(opcion < 6) {
		System.out.println("\n=== LISTA DE ASTROS ===");
		System.out.println("Astro 1: "+lista.get(0).getNombre());
		System.out.println("Astro 2: "+lista.get(1).getNombre());
		System.out.println("Astro 3: "+lista.get(2).getNombre());
		System.out.println("Astro 4: "+lista.get(3).getNombre());
		System.out.println("Astro 5: "+lista.get(4).getNombre());
		System.out.println("Elige un astro (-1 para salir): ");
		opcion = teclado.nextInt();
		
		switch(opcion) {
		case -1:
			System.exit(0);
		case 1:
			System.out.println(lista.get(0));
			pressAnyKeyToContinue();
			break;
		case 2:
			System.out.println(lista.get(1));
			pressAnyKeyToContinue();
			break;
		case 3:
			System.out.println(lista.get(2));
			pressAnyKeyToContinue();
			break;
		case 4:
			System.out.println(lista.get(3));
			pressAnyKeyToContinue();
			break;
		case 5:
			System.out.println(lista.get(4));
			pressAnyKeyToContinue();
			break;
		}
		}
	}
	
	private static void pressAnyKeyToContinue() { 
	        System.out.println("Presiona Enter para continuar ...");
	        try{
	            System.in.read();
	        }  
	        catch(Exception e){}  
	 }
}
