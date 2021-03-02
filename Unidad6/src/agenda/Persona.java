package agenda;

public class Persona extends Contacto {
    private String cumpleanos;

    public Persona(String nombre, String telefono, String cumpleanos) {
        super(nombre, telefono);
        this.cumpleanos = cumpleanos;
    }

    public String getCumpleanos() {
        return cumpleanos;
    }

    public void setCumpleanos(String cumpleanos) {
        this.cumpleanos = cumpleanos;
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("Cumpleaños: " + this.cumpleanos);
        System.out.println("-------------------------------\n");
    }

}