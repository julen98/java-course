package ejercicioE1;

public class UD5EjercicioA1 {
	public static void main(String[] args) {
		
		// Declaracion de objetos
		
		Punto coord1 = new Punto(5,0);
		Punto coord2 = new Punto(10,10);
		Punto coord3 = new Punto(-3,7);
		
		// Mostrar valores
		
		coord1.imprime();
		coord2.imprime();
		coord3.imprime();
		
		// Modificar los puntos
		
		coord1.desplaza(17, 13);
		coord2.desplaza(5, 8);
		coord3.desplaza(7, 18);
	
		 // Mostrar valores
		
		System.out.println("\n------------------\n");
		coord1.imprime();
		coord2.imprime();
		coord3.imprime();
		System.out.println("\n------------------\n");
		System.out.println("Distancia entre coord1 y coord2: "+coord1.distancia(coord2));
		System.out.println("Distancia entre coord2 y coord3: "+coord2.distancia(coord3));
		System.out.println("Distancia entre coord3 y coord1: "+coord3.distancia(coord1));
		
		// Punto aleatorio
		
		System.out.println("\n------------------\n");
		Punto.creaPuntoAleatorio().imprime();
	}
}
