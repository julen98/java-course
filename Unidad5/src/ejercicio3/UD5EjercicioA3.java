package ejercicio3;

public class UD5EjercicioA3 {
	public static void main (String[] args) {
		
		// Declaracion de objetos
		
		Rectangulo rect1 = new Rectangulo();
		Rectangulo rect2 = new Rectangulo();
		
		rect1.x1 = 0;
		rect1.y1 = 0;
		rect1.x2 = 5;
		rect1.y2 = 5;
		
		rect2.x1 = 7;
		rect2.y1 = 9;
		rect2.x2 = 2;
		rect2.y2 = 3;
		
		System.out.println("X1: "+rect1.x1+" Y1: "+rect1.y1+" X2: "+rect1.x2+" Y2: "+rect1.y2);
		System.out.println("X1: "+rect2.x1+" Y1: "+rect2.y1+" X2: "+rect2.x2+" Y2: "+rect2.y2);
		System.out.println("Perimetro del Rectangulo 1: "+perimetro(rect1));
		System.out.println("Perimetro del Rectangulo 2: "+perimetro(rect2));
		System.out.println("Area del Rectangulo 1: "+area(rect1));
		System.out.println("Area del Rectangulo 2: "+area(rect2));
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		// Modificar las variables
		
		rect1.x1 = 0+5;
		rect1.y1 = 0-5;
		rect1.x2 = 5*3;
		rect1.y2 = 5*2;
		
		rect2.x1 = 7+1;
		rect2.y1 = 9/3;
		rect2.x2 = 2*23;
		rect2.y2 = 3-13;
		
		System.out.println("X1: "+rect1.x1+" Y1: "+rect1.y1+" X2: "+rect1.x2+" Y2: "+rect1.y2);
		System.out.println("X1: "+rect2.x1+" Y1: "+rect2.y1+" X2: "+rect2.x2+" Y2: "+rect2.y2);
		System.out.println("Perimetro del Rectangulo 1: "+perimetro(rect1));
		System.out.println("Perimetro del Rectangulo 2: "+perimetro(rect2));
		System.out.println("Area del Rectangulo 1: "+area(rect1));
		System.out.println("Area del Rectangulo 2: "+area(rect2));
	}
	public static double perimetro(Rectangulo rect) {
        int lado1 = Math.abs(rect.x1 - rect.x2);
        int lado2 = Math.abs(rect.y1 - rect.y2);

        return (lado1 + lado2) * 2;
    }

    public static double area(Rectangulo rect) {
        int lado1 = Math.abs(rect.x1 - rect.x2);
        int lado2 = Math.abs(rect.y1 - rect.y2);

        return lado1 * lado2;
    }
}
