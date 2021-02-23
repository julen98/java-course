package cuentabancaria;

public abstract class CuentaBancaria {
    private String iban;
    private String titular;
    private double saldo;
    public double interesAnualBasico = 3;

    public CuentaBancaria(String iban, String titular, double saldo) {
        super();
        this.iban = iban;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void añadir(double cantidad) {
        this.saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) { // Pide una cantidad a retirar y lo aplica a la variable saldo, ademas de incluir el movimiento en el historial

        if (cantidad > 0) {
            añadir(-cantidad);
        }
    }

    public void ingresar(double cantidad) { // Pide una cantidad a ingresar y lo aplica a la variable saldo, ademas de incluir el movimiento en el historial

        if (cantidad > 0) {
            añadir(cantidad);
        }
    }

    public void traspaso(double cantidad, CuentaBancaria c) {
        this.saldo = saldo - cantidad;
        c.añadir(cantidad);
    }

    public void calcularIntereses() {

    }

    public void imprimirDatos() { // Imprime los datos
        System.out.println("\nIBAN: " + iban);
        System.out.println("Nombre del titular: " + titular);
        System.out.println("Saldo: " + saldo + " €");
    }

    public void imprimirIBAN() { // Imprime el IBAN
        System.out.println("\nIBAN: " + iban);
    }

    public void imprimirNombre() { // Imprime el nombre
        System.out.println("\nNombre del titular: " + titular);
    }

    public void imprimirSaldo() { // Imprime el saldo
        System.out.println("\nSaldo: " + saldo + "€");
    }
}