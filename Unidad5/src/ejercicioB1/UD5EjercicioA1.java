package ejercicioB1;

public class UD5EjercicioA1 {
	public static void main(String[] args) {
		
		// Declaracion de objetos
		
		Punto coord1 = new Punto(5,0);
		Punto coord2 = new Punto(10,10);
		Punto coord3 = new Punto(-3,7);
		
		// Mostrar valores
		
		System.out.println("X: "+coord1.X+"\tY: "+coord1.Y);
		System.out.println("X: "+coord2.X+"\tY: "+coord2.Y);
		System.out.println("X: "+coord3.X+"\tY: "+coord3.Y);
		
		// Modificar los puntos
		
		coord1.X*=coord2.X;
		coord1.Y+=coord2.Y;
		coord2.X-=coord3.X;
		coord2.Y*=coord1.Y;
		coord3.X%=coord1.X;
		coord3.Y/=coord2.Y;
		
		System.out.println("------------------");
		System.out.println("X: "+coord1.X+"\tY: "+coord1.Y);
		System.out.println("X: "+coord2.X+"\tY: "+coord2.Y);
		System.out.println("X: "+coord3.X+"\tY: "+coord3.Y);
	}
}
