package cuentabancaria;

public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(String iban, String titular, double saldo) {
        super(iban, titular, saldo);
    }

    @Override
    public void calcularIntereses() {
        double fakesaldo = getSaldo();

        añadir(fakesaldo = fakesaldo - (fakesaldo * interesAnualBasico / 100));
        System.out.println("Saldo tras calcular los intereses: " + fakesaldo + " euros");
    }
}