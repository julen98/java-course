package seleccion;

public class Entrenador extends SeleccionFutbol {
    private int idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void planificarEntrenamiento() {
        System.out.println(nombre + " -> Planificar un Entrenamiento");
    }

    @Override
    public void entrenar() {
        System.out.println(nombre + " -> Dirige un entrenamiento (Clase Entrenador)");
    }

    @Override
    public void jugarPartido() {
        System.out.println(nombre + " -> Dirige un partido (Clase Entrenador)");
    }

}