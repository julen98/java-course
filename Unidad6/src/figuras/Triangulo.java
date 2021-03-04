package figuras;

public class Triangulo implements IFigura2D {

    double ancho;
    double alto;

    public Triangulo(double ancho, double alto) {
        super();
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double perimetro() {
        double hipotenusa = (double) Math.sqrt((ancho * ancho) + (alto * alto));

        return ancho + alto + hipotenusa;
    }

    @Override
    public double area() {
        double area = 0;

        area = (ancho * alto) / 2;

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
        System.out.println(Triangulo.class.getSimpleName() + ": ");
        System.out.println("----------------------------");
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        System.out.println("Perimetro: " + perimetro());
        System.out.println("Area: " + area());
    }

}