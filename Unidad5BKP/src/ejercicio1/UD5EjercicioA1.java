package ejercicio1;

public class UD5EjercicioA1 {
	public static void main(String[] args) {
		
		// Declaracion de objetos
		
		Punto coord1 = new Punto();
		Punto coord2 = new Punto();
		Punto coord3 = new Punto();
		
		// Asignar valores a los puntos
		
		coord1.X = 5;
		coord1.Y = 0;
		coord2.X = 10;
		coord2.Y = 10;
		coord3.X = -3;
		coord3.Y = 7;
		
		System.out.println(coord1.X+" "+coord1.Y);
		System.out.println(coord2.X+" "+coord2.Y);
		System.out.println(coord3.X+" "+coord3.Y);
		
		// Modificar los puntos
		
		coord1.X*=coord2.X;
		coord1.Y+=coord2.Y;
		coord2.X*=coord3.X;
		coord2.Y%=coord1.X;
		coord3.X*=coord1.X;
		coord3.Y*=coord2.X;
		
		System.out.println(coord1.X+" "+coord1.Y);
		System.out.println(coord2.X+" "+coord2.Y);
		System.out.println(coord3.X+" "+coord3.Y);
	}
}
