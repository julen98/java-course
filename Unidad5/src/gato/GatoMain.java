package gato;

public class GatoMain {
	public static void main(String[] args) {
		GatoSimple tom = new GatoSimple("Macho","Tom");
		GatoSimple puffy = new GatoSimple("Macho","Puffy");
		
		tom.pelea(puffy);
		System.out.println("-----------------------------------");
		puffy.come("pescado");
		System.out.println("-----------------------------------");
		puffy.ronronea();
		System.out.println("-----------------------------------");
		tom.maulla();
		
		GatoSimple milo = new GatoSimple();
		
		milo.setColor("Gris");
		milo.setEdad(1);
		milo.setNombre("Milo");
		milo.setPeso(3.5);
		milo.setRaza("Highland Fold");
		milo.setSexo("Macho");
		
		System.out.println(milo.toString());
		System.out.println(puffy.toString());
		System.out.println(tom.toString());
		
		/* ARRAY GATOS */
		
		System.out.println("\n\nARRAY GATOS\n\n");
		
		GatoSimple gatos[] = new GatoSimple[5];
		for(int i = 0; i < gatos.length; i++) {
			gatos[i] = new GatoSimple();
		}
		gatos[0].setAll("Gris","Highland Fold",3,"Hembra",3.5,"Rufi");
		gatos[1].setAll("Marron","Highland Fold",4,"Hembra",3.8,"Lufi");
		gatos[2].setAll("Negro","Highland Fold",7,"Hembra",3.3,"Muffin");
		gatos[3].setAll("Blanco","Highland Fold",11,"Hembra",2.5,"Tufi");
		gatos[4].setAll("Blanco y negro","Highland Fold",1,"Hembra",2.7,"Guffy");
		
		
		for(GatoSimple i: gatos) {
			System.out.println(i.toString());
		}
	}
}
