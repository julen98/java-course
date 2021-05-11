package empresaempleados;

import java.util.ArrayList;

public class Programa {


    public static void main(String[] args) {

        ArrayList < Empleados > lista = new ArrayList();
        Empresas e1 = new Empresas("Mercadona", "11111111Q", "900600400", "Avenida Casalduch, 3", lista);
        Empleados t1 = new Empleados("Jose", "23333445Q", 3300, 40, "600600600",
            "Calle Hierro, 2");
        Empleados t2 = new Empleados("Pepe", "26036056I", 2650, 55, "650650650",
            "Avenida Almazora, 13");
        Empleados t3 = new Empleados("Marta", "25966653A", 1800, 23, "633633633",
            "Avenida Valencia, 6");
        Empleados t4 = new Empleados("Alba", "20913107U", 1950, 26, "612612612",
            "Calle Andalucia, 25");

        e1.anadirEmpleados(t1);
        e1.anadirEmpleados(t2);
        e1.anadirEmpleados(t3);
        e1.anadirEmpleados(t4);

        e1.mostrarEmpleados();
        e1.mostrarDNISueldos();

        e1.eliminarEmpleados(t4);
        e1.mostrarEmpleados();

        System.out.println("Suma de todos los sueldos brutos: " + e1.sumaSueldosBrutos());
        System.out.println("Suma de todos los sueldos netos: " + e1.sumaSueldosNetos());
    }
}