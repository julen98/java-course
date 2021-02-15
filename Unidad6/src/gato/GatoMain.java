package gato;

import java.util.ArrayList;

public class GatoMain {
	public static void main(String[] args) {
		
		// Creacion ArrayList
		
		ArrayList<GatoSimple> listaGatos = new ArrayList<GatoSimple>();
		
		GatoSimple garfield = new GatoSimple("Garfield","siames","Macho","gris",2,11);
	    GatoSimple tom = new GatoSimple("Tom","siames","Macho","negro",12,9);
	    GatoSimple lisa = new GatoSimple("Lisa","siames","Hembra","marron",6,14);
	    
	    listaGatos.add(garfield);
	    listaGatos.add(tom);
	    listaGatos.add(1,lisa);
	    listaGatos.add(new GatoSimple("Any","siames","Macho","negro",5,12));
	    listaGatos.add(2,new GatoSimple("Samy","siames","Macho","marron",4,11));
	    
	    // int size(); devuelve el número de elementos de la lista.
	    
		System.out.println("\nlistaGatos.size()");
		System.out.println(listaGatos.size());
		
		// E get(int index); devuelve una referencia al elemento en la posición index.
		
		System.out.println("\nlistaGatos.get(0)");
		System.out.println(listaGatos.get(0));
		
		// void clear(); elimina todos los elementos de la lista. Establece el tamaño a cero. 
		
		System.out.println("\nlistaGatos.clear()");
		System.out.println("\nAntes de vaciar el arrayList\n");
		
		for(GatoSimple i: listaGatos) {
	    	System.out.println(i.toString());
	    }
		
		listaGatos.clear();
		
		System.out.println("\nTras vaciar el arrayList\n");
		
		for(GatoSimple i: listaGatos) {
	    	System.out.println(i.toString());
	    }
		
		// boolean isEmpty(); retorna true si la lista no contiene elementos.
		
		System.out.println("\nlistaGatos.isEmpty();");
		System.out.println(listaGatos.isEmpty());
		
		// boolean add(E element); inserta element al final de la lista y devuelve true.
		
		System.out.println("\nlistaGatos.add(new GatoSimple(\"Tom\",\"siames\",\"Macho\",\"rojo\",3,12))");
		System.out.println(listaGatos.add(new GatoSimple("Tom","siames","Macho","rojo",3,12)));
		
		/* void add(int index, E element); inserta element en la posición index de la lista. Desplaza una
		posición todos los demás elementos de la lista (no sustituye ni borra otros elementos). */

		listaGatos.add(3,new GatoSimple("Tom","siames","Macho","rojo",3,12));
		System.out.println();
		for(GatoSimple i: listaGatos) {
	    	System.out.println(i.toString());
	    }
		
		// void set(int index, E element); sustituye el elemento en la posición index por element.
		
		System.out.println("\nlistaGatos.set(3,new GatoSimple(\"Mate\",\"siames\",\"Macho\",\"rojo\",3,12))");
		System.out.println(listaGatos.set(3,new GatoSimple("Mate","siames","Macho","rojo",3,12)));		
		System.out.println();
		for(GatoSimple i: listaGatos) {
	    	System.out.println(i.toString());
	    }
		
		/* boolean contains(Object o); busca el objeto o en la lista y devuelve true si existe. Utiliza el
		método equals() para comparar objectos.*/
		
		System.out.println("\nlistaGatos.contains(tom)");
		System.out.println(listaGatos.contains(tom));
		
		/* int indexOf(Object o); busca el objeto o en la lista, empezando por el principio, y devuelve el
		índice dónde se encuentre. Devuelve -1 si no existe. Utiliza equals() para comparar objetos. */
		
		System.out.println("\nlistaGatos.indexOf(tom)");
		System.out.println(listaGatos.indexOf(tom));
		
		// int lastIndexOf(Object o); como indexOf() pero busca desde el final de la lista.
		
		System.out.println("\nlistaGatos.lastIndexOf(tom)");
		System.out.println(listaGatos.lastIndexOf(tom));
		
		// E remove(int index); elimina el elemento en la posición index y lo devuelve.
		
		System.out.println("\nlistaGatos.remove(0)");
		System.out.println(listaGatos.remove(0));
		
		/* boolean remove(Object obj); elimina la primera ocurrencia de obj en la lista. Devuelve true
		si lo ha encontrado y eliminado, false en otro caso. Utiliza equals() para comparar objetos. */
		
		System.out.println("\nlistaGatos.remove(tom)");
		System.out.println(listaGatos.remove(tom));
		
		/* void remove(int index); Elimina el objeto de la lista que se encuentra en la posición index. Es
		más rápido que el método anterior ya que no necesita recorrer toda la lista. */
		
		System.out.println("\nlistaGatos.remove(5)");
		
		listaGatos.add(5,garfield);
		
		System.out.println("Antes de eliminar a Garfield.");
		
		for(GatoSimple i: listaGatos) {
	    	System.out.println(i.toString());
	    }

		listaGatos.remove(5);
		
		System.out.println("Despues de eliminar a Garfield.");

		for(GatoSimple i: listaGatos) {
	    	System.out.println(i.toString());
	    }
		
	}
}
