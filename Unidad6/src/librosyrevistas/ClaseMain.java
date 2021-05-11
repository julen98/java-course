package librosyrevistas;

import java.util.ArrayList;

public class ClaseMain {
	public static void main(String[] args) {
		Libros l1 = new Libros("1001", "Don Quijote de la Mancha", "1605");
		Libros l2 = new Libros("1002", "Los pilares de la Tierra", "1989");
		Revistas r1 = new Revistas("1003", "Vogue", "1892", 45);
		Revistas r2 = new Revistas("1004", "Men's Health", "1987", 23);
		
		ArrayList < Publicacion > lista = new ArrayList();
		
		lista.add(l1);
		lista.add(l2);
		lista.add(r1);
		lista.add(r2);
		
		for (Publicacion publicacion : lista) {
			System.out.println(publicacion.toString());
		}
		
		// Prestando libros
		
		l1.prestar();
		l2.prestar();
		
		for (Publicacion publicacion : lista) {
			System.out.println(publicacion.toString());
		}
		
		// Retornando libros
		
		l1.retornar();
		
		for (Publicacion publicacion : lista) {
			System.out.println(publicacion.toString());
		}
		
		l2.prestat();
	}
}
