package ejercicioC1;

public class UD5EjercicioA1 {
	public static void main(String[] args) {
		
		// Declaracion de objetos
		
		Punto coord1 = new Punto(5,0);
		Punto coord2 = new Punto(10,10);
		Punto coord3 = new Punto(-3,7);
		
		// Mostrar valores
		
		System.out.println("X: "+coord1.getX()+"\tY: "+coord1.getY());
		System.out.println("X: "+coord2.getX()+"\tY: "+coord2.getY());
		System.out.println("X: "+coord3.getX()+"\tY: "+coord3.getY());
		
		// Modificar los puntos
		
		coord1.setX(coord1.getX()*3);
		coord1.setY(coord1.getY()-6);
		coord2.setX(coord2.getX()+53);
		coord2.setY(coord2.getY()-33);
		coord3.setX(coord3.getX()/3);
		coord3.setY(coord3.getY()*7);
		
		System.out.println("------------------");
		System.out.println("X: "+coord1.getX()+"\tY: "+coord1.getY());
		System.out.println("X: "+coord2.getX()+"\tY: "+coord2.getY());
		System.out.println("X: "+coord3.getX()+"\tY: "+coord3.getY());
	}
}
