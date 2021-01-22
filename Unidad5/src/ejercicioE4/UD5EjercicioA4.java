package ejercicioE4;

public class UD5EjercicioA4 {
	public static void main (String[] args) {
		
		// Declaracion de objetos
		
		Articulo art1 = new Articulo("Boligrafo Pilot Azul",0.83,67,"Comun");
		Articulo art2 = new Articulo("B0ligrafo Pil0t Azul",-99,-1,"Comun");
		Articulo art3 = new Articulo("Carne Roja",3,15,"Necesidad Basica");
		
		art1.imprimir();
		art2.imprimir();
		art3.imprimir();
		
		art1.setPrecio(0.87);
		art2.setPrecio(1.55);
		art2.setCuantosQuedan(12);
		art2.setNombre("Boligrafo Purpura Pilot Borrable");
		art1.vender(15);
		art2.almacenar(23);
		
		art1.imprimir();
		art2.imprimir();
		
		System.out.println("\nPVP con descuento del 20% del articulo \""+art1.getNombre()+"\": "+art1.getPVPDescuento(20)+"€\n");
		System.out.println("PVP con descuento del 60% del articulo \""+art2.getNombre()+"\": "+art2.getPVPDescuento(60)+"€");
		}
	}