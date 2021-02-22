package mascotas;

public class Perro extends Mascotas {
    String color;
    boolean pulgas;

    public Perro(String nombre, int edad, String estado, String fechaNacimiento, String color, boolean pulgas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.pulgas = pulgas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
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
        if (pulgas = true)
            tostring += "\nTiene pulgas";
        else
            tostring += "\nNo tiene pulgas";
        tostring += "\n--------------------------------------";

        return tostring;
    }

    @Override
    public void habla() {
        System.out.println("Guau!");
    }

}