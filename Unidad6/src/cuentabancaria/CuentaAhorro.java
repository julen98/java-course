package cuentabancaria;

public class CuentaAhorro extends CuentaBancaria {
    double saldoMinimo = 1500;

    public CuentaAhorro(String iban, String titular, double saldo) {
        super(iban, titular, saldo);
    }

    @Override
    public void calcularIntereses() {
        double fakesaldo = getSaldo();
        
        if (getSaldo() <= saldoMinimo) {
            añadir(fakesaldo = fakesaldo - (fakesaldo * (interesAnualBasico / 2) / 100));
        }

        if (getSaldo() > saldoMinimo) {
            añadir(fakesaldo = fakesaldo - (fakesaldo * (interesAnualBasico / 2) / 100));
        }
        
        System.out.println("Saldo tras calcular los intereses: " + fakesaldo + " euros");
    }
}