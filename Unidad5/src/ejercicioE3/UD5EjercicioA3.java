package ejercicioE3;

public class UD5EjercicioA3 {
	public static void main (String[] args) {
		
		// Declaracion de objetos
		
		Rectangulo rect1 = new Rectangulo(-5,-1,101,150);
		Rectangulo rect2 = new Rectangulo(2,3,7,9);
		Rectangulo rect3 = new Rectangulo(5,1,7,2);
		
		rect1.imprimir();
		rect2.imprimir();
		System.out.println("Perimetro del Rectangulo 1: "+rect1.getPerimetro());
		System.out.println("Perimetro del Rectangulo 2: "+rect2.getPerimetro());
		System.out.println("Area del Rectangulo 1: "+rect1.getArea());
		System.out.println("Area del Rectangulo 2: "+rect2.getArea());
		System.out.println("");
		
		// Modificar las variables
		
		rect1.setX1Y1(rect1.getX1()*3, rect1.getY1()/3);
		rect1.setX2Y2(rect1.getX2()*3, rect1.getY2()/3);
		
		rect2.setAll(rect2.getX1()+15, rect2.getY1()-15, rect2.getX2()*5, rect2.getY2()/5);
		
		rect1.imprimir();
		rect2.imprimir();
		System.out.println("Perimetro del Rectangulo 1: "+rect1.getPerimetro());
		System.out.println("Perimetro del Rectangulo 2: "+rect2.getPerimetro());
		System.out.println("Area del Rectangulo 1: "+rect1.getArea());
		System.out.println("Area del Rectangulo 2: "+rect2.getArea());
		
		rect3.creaRectAleatorio();
		rect3.imprimir();
		
	}
}
