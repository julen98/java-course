package figuras;

import java.util.ArrayList;

public class ProgramaFiguras {
    public static void main(String[] args) {

        // Crear ArrayList
        ArrayList < IFigura2D > figuras = new ArrayList();

        // Declarar objetos
        IFigura2D c1 = new Circulo(2.5);
        IFigura2D c2 = new Circulo(5.5);
        IFigura2D cu1 = new Cuadrado(1.5);
        IFigura2D cu2 = new Cuadrado(7.5);
        IFigura2D r1 = new Rectangulo(2.5, 3);
        IFigura2D r2 = new Rectangulo(2, 4);
        IFigura2D t1 = new Triangulo(3.5, 6);
        IFigura2D t2 = new Triangulo(2, 8);

        // Insertar objetos en el ArrayList
        figuras.add(c1);
        figuras.add(c2);
        figuras.add(cu1);
        figuras.add(cu2);
        figuras.add(r1);
        figuras.add(r2);
        figuras.add(t1);
        figuras.add(t2);

        // Iterar todas las figuras
        for (IFigura2D figura: figuras) {
            figura.imprimir();
        }

        System.out.println("\n----------------------------");
        System.out.println("\nEscala 2");

        // Escalar figuras
        for (IFigura2D figura: figuras) {
            figura.escalar(2);
        }

        // Iterar todas las figuras
        for (IFigura2D figura: figuras) {
            figura.imprimir();
        }
        System.out.println("\n----------------------------");
        System.out.println("\nEscala 0.1");

        // Escalar figuras
        for (IFigura2D figura: figuras) {
            figura.escalar(0.1);
        }

        // Iterar todas las figuras
        for (IFigura2D figura: figuras) {
            figura.imprimir();
        }
    }
}