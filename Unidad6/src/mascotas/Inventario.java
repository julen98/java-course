package mascotas;

import java.util.ArrayList;

public class Inventario {
	
	public static ArrayList<Mascotas> inventario = new ArrayList<Mascotas>(); 
	
	public static void main(String[] args) {
		
		Mascotas Milo = new Perro("Milo",1,"Vivo","01/04/2020","Pointer Ingles",false);
		Mascotas Mia = new Perro("Mia",6,"Vivo","01/04/2017","Yorkshire",false);
		Mascotas Leo = new Gato("Leo",3,"Vivo","01/05/2018","Siames",false);
		Mascotas Bobby = new Gato("Bobby",4,"Vivo","01/07/2017","Persa",false);
		Mascotas Mike = new Loro("Mike",2,"Vivo","01/04/2020","Largo",false,"Blanco",true);
		Mascotas Marian = new Loro("Marian",3,"Vivo","01/04/2020","Mediano",true,"Gris",true);
		Mascotas Pepi = new Canario("Pepi",3,"Vivo","01/04/2020","Corto",false,"America",true);
		Mascotas Lalo = new Canario("Lalo",4,"Vivo","01/04/2020","Mediano",true,"Asia",false);
		
		inventario.add(Milo);
		inventario.add(Mia);
		inventario.add(Leo);
		inventario.add(Bobby);
		inventario.add(Mike);
		inventario.add(Marian);
		inventario.add(Pepi);
		inventario.add(Lalo);
		
		mostrarAnimales();
		System.out.println("---------------------------------------");
		Milo.toString();
		System.out.println("---------------------------------------");
		mostrarTodosAnimales();
	}

	public static void mostrarAnimales() {
		for (Mascotas mascotas : inventario) {
			System.out.println("Tipo de animal: " + mascotas.getClass().getSimpleName() + ". Nombre: " + mascotas.getNombre());
		}
	}
	
	public static void mostrarTodosAnimales() {
		for
	}
}
