package cuentabancaria;

import java.util.ArrayList;

public class ClaseMain {

    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaCorriente("0000000000000000001", "Pepe Martinez", 1000);
        CuentaBancaria c2 = new CuentaCorriente("0000000000000000002", "Laura Perez", 1000);
        CuentaBancaria c3 = new CuentaAhorro("0000000000000000003", "Pepe Martinez", 1000);
        CuentaBancaria c4 = new CuentaAhorro("0000000000000000004", "Pepe Martinez", 1000);

        ArrayList < CuentaBancaria > lista = new ArrayList();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);

        System.out.println("---------------------");
        System.out.println("\nDatos c1");
        c1.imprimirDatos();
        System.out.println("---------------------");
        System.out.println("\nSaldo c3");
        c3.imprimirSaldo();

        c3.traspaso(200, c1);

        System.out.println("---------------------");
        System.out.println("\nSaldo c1");
        c1.imprimirSaldo();
        System.out.println("---------------------");
        System.out.println("\nSaldo c3");
        c3.imprimirSaldo();
        System.out.println("---------------------");
        
        System.out.println("\nCalcular intereses: ");
        for (CuentaBancaria cuentaBancaria: lista) {
            cuentaBancaria.calcularIntereses();
        }
    }

}