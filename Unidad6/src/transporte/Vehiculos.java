package transporte;

public abstract class Vehiculos {
    final String matricula;
    final String modelo;

    public Vehiculos(String matricula, String modelo) {
        super();
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }


}