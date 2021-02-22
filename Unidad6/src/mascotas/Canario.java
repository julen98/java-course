package mascotas;

public class Canario extends Aves {
    String origen;
    boolean habla;

    public Canario(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela, String origen, boolean habla) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public boolean isHabla() {
        return habla;
    }
    public void setHabla(boolean habla) {
        this.habla = habla;
    }

    @Override
    public String muestra() {
        String tostring;

        tostring = "\n--------------------------------------";
        tostring += "\nNombre: " + nombre;
        tostring += "\nEdad: " + edad;
        tostring += "\nEstado: " + estado;
        tostring += "\nFecha de nacimiento: " + fechaNacimiento;
        tostring += "\nOrigen: " + origen;
        if (habla = true)
            tostring += "\nPuede hablar";
        else
            tostring += "\nNo puede hablar";
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