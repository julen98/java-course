package empresaempleados;

import java.util.ArrayList;

public class Empresas {
    String nombre;
    String cif;
    String telefono;
    String direccion;
    ArrayList < Empleados > lista = new ArrayList();


    public Empresas(String nombre, String cif, String telefono, String direccion, ArrayList < Empleados > emp) {
        super();
        this.nombre = nombre;
        this.cif = cif;
        this.telefono = telefono;
        this.direccion = direccion;
        this.lista = emp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCIF() {
        return cif;
    }

    public void setCIF(String cif) {
        this.cif = cif;
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

    public ArrayList < Empleados > getEmp() {
        return lista;
    }

    public void setEmp(ArrayList < Empleados > emp) {
        this.lista = emp;
    }

    public void anadirEmpleados(Empleados emp) {
        lista.add(emp);
    }

    public void eliminarEmpleados(Empleados emp) {
        lista.remove(emp);
    }

    public void mostrarEmpleados() {
        for (Empleados empleados: lista) {
            System.out.println(empleados.toString());
        }
    }

    public void mostrarDNISueldos() {
        for (Empleados empleados: lista) {
            System.out.println("\n-----------------------------------");
            System.out.println("DNI: " + empleados.getDNI());
            System.out.println("Sueldo bruto mensual: " + empleados.getSueldoBrutoMensual());
            System.out.println("Sueldo neto mensual: " + empleados.sueldoNeto(empleados.getSueldoBrutoMensual()));
            System.out.println("-----------------------------------");
        }
    }

    public double sumaSueldosBrutos() {
        double suma = 0;
        for (Empleados empleados: lista) {
            suma = suma + empleados.getSueldoBrutoMensual();
        }
        return suma;
    }

    public double sumaSueldosNetos() {
        double suma = 0;
        for (Empleados empleados: lista) {
            suma = suma + empleados.sueldoNeto(empleados.getSueldoBrutoMensual());
        }
        return suma;
    }

}