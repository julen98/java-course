package mascotas;

public class Loro extends Aves {
    String color;
    boolean canta;

    public Loro(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela, String color, boolean canta) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.color = color;
        this.canta = canta;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isCanta() {
        return canta;
    }
    public void setCanta(boolean canta) {
        this.canta = canta;
    }

    @Override
    public String muestra() {
        String tostring;

        tostring = "\n--------------------------------------";
        tostring += "\nNombre: " + nombre;
        tostring += "\nEdad: " + edad;
        tostring += "\nEstado: " + estado;
        tostring += "\nFecha de nacimiento: " + fechaNacimiento;
        tostring += "\nColor: " + color;
        if (canta = true)
            tostring += "\nPuede cantar";
        else
            tostring += "\nNo puede cantar";
        tostring += "\n--------------------------------------";

        return tostring;
    }
    
    public void saluda() {
        System.out.println("Hola hola");
    }
    
    @Override
    public void habla() {
        System.out.println("Hola, me llamo " + nombre);
    }

    @Override
    public void volar() {
        System.out.println("Sap, sap... sap, sap");
    }
}