package figuras;

public class Circulo implements IFigura2D {

    double radio;

    public Circulo(double radio) {
        super();
        this.radio = radio;
    }

    @Override
    public double perimetro() {
        double perimetro = 0;

        perimetro = 2 * Math.PI * radio;

        return perimetro;
    }

    @Override
    public double area() {
        double area = 0;

        area = Math.PI * Math.pow(radio, 2);

        return area;
    }

    @Override
    public void escalar(double escala) {
        if (escala > 0) {
            radio = radio * escala;
        } else {
            System.out.println("La escala tiene que ser mayor a 0.");
        }
    }

    @Override
    public void imprimir() {
        System.out.println("\n----------------------------");
        System.out.println(Circulo.class.getSimpleName() + ": ");
        System.out.println("----------------------------");
        System.out.println("Radio: " + radio);
        System.out.println("Perimetro: " + perimetro());
        System.out.println("Area: " + area());
    }

}