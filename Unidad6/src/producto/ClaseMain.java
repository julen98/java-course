package producto;
import java.util.*;

public class ClaseMain {
	public static void main(String[] args) {
		Producto boli = new Producto("Boligrafo",50);
		Producto libreta = new Producto("Libreta",15);
		Producto lapiz = new Producto("Lapiz",43);
		Producto goma = new Producto("Goma",43);
		Producto agenda = new Producto("Agenda",5);
		
		ArrayList<Producto> lista = new ArrayList<Producto>();
		
		lista.add(boli);
		lista.add(libreta);
		lista.add(lapiz);
		lista.add(goma);
		lista.add(agenda);
		
		Iterator<Producto> iter = lista.iterator();
			
		System.out.println("Valores del iterator:");
		
		while(iter.hasNext()) {
			System.out.println(iter.next().getNombre());
		}
		
		lista.remove(boli);
		lista.remove(libreta);		
		lista.add(2,new Producto("Boligrafo",50));
		
		Iterator<Producto> iter2 = lista.iterator();
		
		System.out.println("Valores del iterator:");
		
		while(iter2.hasNext()) {
			System.out.println(iter2.next().getNombre());
		}
		
		lista.clear();
		}
	
		
}
