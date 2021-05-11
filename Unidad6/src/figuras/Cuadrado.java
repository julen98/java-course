package figuras;

public class Cuadrado implements IFigura2D {

    double lado;

    public Cuadrado(double lado) {
        super();
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        double perimetro = 0;

        perimetro = lado + lado + lado + lado;

        return perimetro;
    }

    @Override
    public double area() {
        double area = 0;

        area = Math.pow(lado, 2);

        return area;
    }

    @Override
    public void escalar(double escala) {
        if (escala > 0) {
            lado = lado * escala;
        } else {
            System.out.println("La escala tiene que ser mayor a 0.");
        }
    }

    @Override
    public void imprimir() {
        System.out.println("\n----------------------------");
        System.out.println(Cuadrado.class.getSimpleName() + ": ");
        System.out.println("----------------------------");
        System.out.println("Lado: " + lado);
        System.out.println("Perimetro: " + perimetro());
        System.out.println("Area: " + area());
    }

}