package ejercicioC3;

public class UD5EjercicioA3 {
	public static void main (String[] args) {
		
		// Declaracion de objetos
		
		Rectangulo rect1 = new Rectangulo(5,1,7,2);
		Rectangulo rect2 = new Rectangulo(2,3,7,9);
		
		System.out.println("X1: "+rect1.getX1()+" Y1: "+rect1.getY1()+" X2: "+rect1.getX2()+" Y2: "+rect1.getY2());
		System.out.println("X1: "+rect2.getX1()+" Y1: "+rect2.getY1()+" X2: "+rect2.getX2()+" Y2: "+rect2.getY2());
		System.out.println("Perimetro del Rectangulo 1: "+perimetro(rect1));
		System.out.println("Perimetro del Rectangulo 2: "+perimetro(rect2));
		System.out.println("Area del Rectangulo 1: "+area(rect1));
		System.out.println("Area del Rectangulo 2: "+area(rect2));
		System.out.println("");
		
		// Modificar las variables
		
		rect1.setX1(rect1.getX1()+5);
		rect1.setY1(rect1.getY1()*3);
		rect1.setX2(rect1.getX2()/3);
		rect1.setY2(rect1.getY2()-4);
		
		rect2.setX1(rect2.getX1()+15);
		rect1.setY1(rect1.getY1()-7);
		rect1.setX2(rect1.getX2()*5);
		rect1.setY2(rect1.getY2()/5);
		
		System.out.println("\nX1: "+rect1.getX1()+" Y1: "+rect1.getY1()+" X2: "+rect1.getX2()+" Y2: "+rect1.getY2());
		System.out.println("X1: "+rect2.getX1()+" Y1: "+rect2.getY1()+" X2: "+rect2.getX2()+" Y2: "+rect2.getY2());
		System.out.println("Perimetro del Rectangulo 1: "+perimetro(rect1));
		System.out.println("Perimetro del Rectangulo 2: "+perimetro(rect2));
		System.out.println("Area del Rectangulo 1: "+area(rect1));
		System.out.println("Area del Rectangulo 2: "+area(rect2));
	}
	public static double perimetro(Rectangulo rect) {
        int lado1 = Math.abs(rect.getX1() - rect.getX2());
        int lado2 = Math.abs(rect.getY1() - rect.getY2());

        return (lado1 + lado2) * 2;
    }

    public static double area(Rectangulo rect) {
        int lado1 = Math.abs(rect.getX1() - rect.getX2());
        int lado2 = Math.abs(rect.getY1() - rect.getY2());

        return lado1 * lado2;
    }
}
