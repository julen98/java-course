package ejercicioC4;

public class UD5EjercicioA4 {
	public static void main (String[] args) {
		
		// Declaracion de objetos
		
		Articulo art1 = new Articulo("Boligrafo Pilot Azul",0.83,21,67);
		Articulo art2 = new Articulo("B0ligrafo Pil0t Azul",-99,12,-1);
		
		System.out.println(art1.getNombre()+" - Precio: "+art1.getPrecio()+"€ - "+"IVA: "+art1.getIVA()+"% - "+"PVP: "+PVP(art1)+"€ - Quedan: "+art1.getCuantosQuedan());
		System.out.println(art2.getNombre()+" - Precio: "+art2.getPrecio()+"€ - "+"IVA: "+art2.getIVA()+"% - "+"PVP: "+PVP(art2)+"€ - Quedan: "+art2.getCuantosQuedan());
		
		art1.setPrecio(0.87);
		art2.setPrecio(1.55);
		art2.setIVA(21);
		art2.setCuantosQuedan(12);
		art2.setNombre("Boligrafo Purpura Pilot Borrable");
		
		System.out.println(art1.getNombre()+" - Precio: "+art1.getPrecio()+"€ - "+"IVA: "+art1.getIVA()+"% - "+"PVP: "+PVP(art1)+"€ - Quedan: "+art1.getCuantosQuedan());
		System.out.println(art2.getNombre()+" - Precio: "+art2.getPrecio()+"€ - "+"IVA: "+art2.getIVA()+"% - "+"PVP: "+PVP(art2)+"€ - Quedan: "+art2.getCuantosQuedan());	
		}

	public static double PVP (Articulo art1) {
		double PVP = 0;
		
		PVP = art1.getPrecio()+(art1.getPrecio()*art1.getIVA())/100;
		
		return PVP;
	}
}