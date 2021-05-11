package empresaempleados;

public class Empleados {
    final String nombre;
    final String dni;
    private double sueldoBrutoMensual;
    private int edad;
    private String telefono;
    private String direccion;

    public Empleados(String nombre, String dni, double sueldoBrutoMensual) {
        super();
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBrutoMensual = sueldoBrutoMensual;
    }

    public Empleados(String nombre, String dni, double sueldoBrutoMensual, int edad, String telefono,
        String direccion) {
        super();
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBrutoMensual = sueldoBrutoMensual;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return dni;
    }

    public double getSueldoBrutoMensual() {
        return sueldoBrutoMensual;
    }

    public void setSueldoBrutoMensual(double sueldoBrutoMensual) {
        this.sueldoBrutoMensual = sueldoBrutoMensual;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String toString() {
        String datos = "\n-----------------------------------";
        datos += "\nNombre: " + nombre;
        datos += "\nDNI: " + dni;
        datos += "\nSueldo bruto (mensual): " + sueldoBrutoMensual;
        datos += "\nEdad: " + edad;
        datos += "\nTelefono: " + telefono;
        datos += "\nDireccion: " + direccion;
        datos += "\n-----------------------------------";
        return datos;
    }

    public double sueldoNeto(double bruto) {
        double neto = bruto;

        if ((bruto * 12) <= 12450)
            neto = bruto - (bruto * 0.19);

        if ((bruto * 12) > 12450 && (bruto * 12) <= 20200)
            neto = bruto - (bruto * 0.24);
        
        if ((bruto * 12) > 20200 && (bruto * 12) <= 35200)
            neto = bruto - (bruto * 0.30);
        
        if ((bruto * 12) > 35200 && (bruto * 12) <= 60000)
            neto = bruto - (bruto * 0.37);

        if ((bruto * 12) > 60000 && (bruto * 12) <= 300000)
            neto = bruto - (bruto * 0.45);

        if ((bruto * 12) > 300000)
            neto = bruto - (bruto * 0.47);
        return neto;
    }

}