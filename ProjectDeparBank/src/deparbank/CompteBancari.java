package deparbank;

import java.util.regex.Pattern;

public class CompteBancari {

    private String iban;
    private String titular;
    private double saldo;
    private double historial[] = new double[99]; // Vector para el historial de los movimientos
    private int i = 0; // Contador del vector

    public CompteBancari(String iban, String titular, double saldo) {

        if (validarIBAN(iban) == true) {
            this.iban = iban;
        } else {
            System.err.println("El IBAN es incorrecto.");
        }

        if (validarTitular(titular) == true)
            this.titular = titular;
        else
            System.err.println("El nombre es incorrecto, tiene que tener un nombre y un apellido comenzando cada uno por mayuscula.");

        if (saldo > -50)
            this.saldo = saldo;
        else
            System.err.println("El saldo es inferior al permitido (-50€).");

        if (saldo < 0)
            System.out.println("AVISO: Saldo negativo.");
    }

    boolean validarIBAN(String iban) { // Metodo para comprobar que el IBAN es valido
        String ibanRegexp = "[ES]{2}[0..9]{22}";
        return Pattern.matches(ibanRegexp, iban);
    }

    boolean validarTitular(String titular) { // Metodo para comprobar que el nombre del titular es valido
        String titularRegexp = "[A-Z][a-zA-Z]{4,}(?: [A-Z][a-zA-Z]*){0,2}";
        return Pattern.matches(titularRegexp, titular);
    }

    public void imprimirMovimientos() { // Imprimir movimientos

        System.out.println("Imprimiendo la lista de movimientos...");
        for (int i = 0; i < historial.length; i++) {
            System.out.println("[" + i + "]" + historial[i]);
        }

    }

    public double[] movimientos(double saldo) { // Escribe en el vector de movimientos

        historial[i] = saldo;
        i++;

        return historial;
    }

    void retirar(double cantidad) { // Pide una cantidad a retirar y lo aplica a la variable saldo, ademas de incluir el movimiento en el historial

        if (cantidad > 0) {
            if (saldo - cantidad > -50) {
                saldo = saldo - cantidad;
                movimientos(-cantidad);
            } else {
                System.err.println("El saldo es inferior al permitido (-50€).");
            }
            if (cantidad > 3000)
                System.out.println("AVISO: NOTIFICACION A HACIENDA");
            if (saldo < 0)
                System.out.println("AVISO: Saldo negativo.");

        }
    }

    void depositar(double cantidad) { // Pide una cantidad a ingresar y lo aplica a la variable saldo, ademas de incluir el movimiento en el historial

        if (cantidad > 0) {
            saldo = saldo + cantidad;
            movimientos(cantidad);
            if (cantidad > 3000)
                System.out.println("AVISO: NOTIFICACION A HACIENDA");
            if (saldo < 0)
                System.out.println("AVISO: Saldo negativo.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getIBAN() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public void imprimirDatos() { // Imprime los datos
        System.out.println("IBAN: " + getIBAN());
        System.out.println("Nombre del titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo() + "€");
    }

    public void imprimirIBAN() { // Imprime el IBAN
        System.out.println("IBAN: " + getIBAN());
    }

    public void imprimirNombre() { // Imprime el nombre
        System.out.println("Nombre del titular: " + getTitular());
    }

    public void imprimirSaldo() { // Imprime el saldo
        System.out.println("Saldo: " + getSaldo() + "€");
    }
}