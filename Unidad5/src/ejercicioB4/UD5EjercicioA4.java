package ejercicioB4;

public class UD5EjercicioA4 {
	public static void main (String[] args) {
		
		// Declaracion de objetos
		
		Articulo art1 = new Articulo("Boligrafo Pilot Azul",0.83,21,67);
		Articulo art2 = new Articulo("B0ligrafo Pil0t Azul",-99,12,-1);
		
		System.out.println(art1.nombre+" - Precio: "+art1.precio+"€ - "+"IVA: "+art1.iva+"% - "+"PVP: "+(art1.precio+(art1.precio*art1.iva/100))+"€ - Quedan: "+art1.cuantosQuedan);
		System.out.println(art2.nombre+" - Precio: "+art2.precio+"€ - "+"IVA: "+art2.iva+"% - "+"PVP: "+(art2.precio+(art2.precio*art2.iva/100))+"€ - Quedan: "+art2.cuantosQuedan);
		
		art1.precio = 0.87;
		
		System.out.println(art1.nombre+" - Precio: "+art1.precio+"€ - "+"IVA: "+art1.iva+"% - "+"PVP: "+(art1.precio+(art1.precio*art1.iva/100))+"€ - Quedan: "+art1.cuantosQuedan);	
	}
}
