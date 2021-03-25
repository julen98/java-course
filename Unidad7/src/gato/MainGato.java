package gato;

import java.util.ArrayList;

public class MainGato {
	public static void main(String[] args) throws Exception {
		Gato g1 = new Gato("Milo", 15);
		Gato g2 = new Gato("Lalo", 10);
		Gato g3 = new Gato("Stitch", 5);
		
		ArrayList < Gato > lista = new ArrayList < Gato > ();
		
		lista.add(g1);
		lista.add(g2);
		lista.add(g3);
		
		g3.setNombre("r2d2");
		g2.setEdad(-13);
		g1.setNombre("Lilo");
		
		for (Gato gatos : lista) {
			gatos.imprimir();
		}
	}
}
