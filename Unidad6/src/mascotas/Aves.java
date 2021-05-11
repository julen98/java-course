package mascotas;

public abstract class Aves extends Mascotas {
    String pico;
    boolean vuela;

    public Aves(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

    public abstract void volar();

    public abstract String muestra();

}