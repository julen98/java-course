package figuras;

public class Rectangulo implements IFigura2D {

    double ancho;
    double alto;

    public Rectangulo(double ancho, double alto) {
        super();
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double perimetro() {
        double perimetro = 0;

        perimetro = alto + ancho + ancho + alto;

        return perimetro;
    }

    @Override
    public double area() {
        double area = 0;

        area = ancho * alto;

        return area;
    }

    @Override
    public void escalar(double escala) {
        if (escala > 0) {
            ancho = ancho * escala;
            alto = alto * escala;
        } else {
            System.out.println("La escala tiene que ser mayor a 0.");
        }
    }

    @Override
    public void imprimir() {
        System.out.println("\n----------------------------");
        System.out.println(Rectangulo.class.getSimpleName() + ": ");
        System.out.println("----------------------------");
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        System.out.println("Perimetro: " + perimetro());
        System.out.println("Area: " + area());
    }

}