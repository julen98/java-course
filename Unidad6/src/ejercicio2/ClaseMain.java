package ejercicio2;

import java.util.*;

public class ClaseMain {
	public static void main(String[] args) {
		ArrayList<Object> lista = new ArrayList <Object>();
		
		Planetas p1 = new Planetas("p1", 0, 3, 0, 3, 0, 3, 0, true);
		Planetas p2 = new Planetas("p2", 1, 2, 1, 2, 1, 2, 1, false);
		Planetas p3 = new Planetas("p3", 2, 1, 2, 1, 2, 1, 2, true);
		Planetas p4 = new Planetas("p4", 3, 0, 3, 0, 3, 0, 3, false);
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		
		Satelites s1 = new Satelites("s1", 0, 0, 0, 0, 0, 0, 0, p1);
		Satelites s2 = new Satelites("s2", 0, 0, 0, 0, 0, 0, 0, p1);
		Satelites s3 = new Satelites("s3", 0, 0, 0, 0, 0, 0, 0, p3);
		Satelites s4 = new Satelites("s4", 0, 0, 0, 0, 0, 0, 0, p3);
		
		lista.add(s1);
		lista.add(s2);
		lista.add(s3);
		lista.add(s4);
		
		imprimir(lista);
		
	}
	
	public static void imprimir(ArrayList<Object> lista) {
		
		Scanner teclado = new Scanner(System.in);
		String queEs;
		Object astro;
		
		System.out.println("Planeta o satelite: ");
		queEs = teclado.nextLine();
		
		if (queEs == "planeta")
			
		
		if (queEs == "satelite")
			
		
		System.out.println("Introduce el astro a mostrar: ");
		astro = teclado.nextLine();
		
		for (Object object : lista) {		
			
		}
		}
	
}
