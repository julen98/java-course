package deparbank2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.regex.Pattern;

public class CompteBancari {

    private String iban;
    private String titular;
    private double saldo;
    private ArrayList < Double > historial = new ArrayList(); // ArrayList para el historial de los movimientos
    private int i = 0; // Contador del historial

    public CompteBancari(String iban, String titular, double saldo) throws CompteException {
    	try {
        if (validarIBAN(iban) == true) {
            this.iban = iban;
        } else {
            throw new CompteException("El IBAN es incorrecto.");
        }

        if (validarTitular(titular) == true)
            this.titular = titular;
        else
        	throw new CompteException("El nombre es incorrecto, tiene que tener un nombre y un apellido comenzando cada uno por mayuscula.");

        if (saldo > -50)
            this.saldo = saldo;
        else
        	throw new CompteException("El saldo es inferior al permitido (-50€).");

        if (saldo < 0)
        	throw new CompteException("AVISO: Saldo negativo.");
    	}
    	
    	catch (CompteException exception) {
			System.out.println(exception.getMessage());
		}
    	
    	catch (InputMismatchException exception){
			System.out.println("Valor introducido incorrecto: " + exception);
		}
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
        for (int i = 0; i < historial.size(); i++) {
        	if(historial.get(i) < 0)
        		System.out.println((i + 1) + " - Retirada de: " + historial.get(i) + "€");
        	else
        		System.out.println((i + 1) + " - Ingreso de: " + historial.get(i) + "€");
        }

    }

    public void movimientos(double saldo) { // Escribe en el vector de movimientos
    	try {
        historial.add(saldo);
    	}
    	
    	catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("El tamaño del vector es " + historial.size() + ", te has pasado!! " + exception);
		}
    }

    void retirar(double cantidad) throws CompteException, AvisaHisendaException { // Pide una cantidad a retirar y lo aplica a la variable saldo, ademas de incluir el movimiento en el historial

        if (cantidad > 0) {
        	try {
            if (saldo - cantidad > -50) {
                saldo = saldo - cantidad;
                movimientos(-cantidad);
            } else {
            	throw new CompteException("El saldo es inferior al permitido (-50€).");
            }
            if (cantidad > 3000)
            	throw new AvisaHisendaException("AVISO: NOTIFICACION A HACIENDA");
            if (saldo < 0)
            	throw new CompteException("AVISO: Saldo negativo.");
        	}
        	
        	catch (CompteException exception) {
    			System.out.println(exception.getMessage());
    		}
        	
        	catch (AvisaHisendaException exception) {
        		System.out.println(exception.getMessage());
        	}
        	
        	catch (InputMismatchException exception){
    			System.out.println("Valor introducido incorrecto: " + exception);
    		}
        }
    }

    void depositar(double cantidad) throws CompteException, AvisaHisendaException{ // Pide una cantidad a ingresar y lo aplica a la variable saldo, ademas de incluir el movimiento en el historial

        if (cantidad > 0) {
        	try {
            saldo = saldo + cantidad;
            movimientos(cantidad);
            if (cantidad > 3000)
            	throw new AvisaHisendaException("AVISO: NOTIFICACION A HACIENDA");
            if (saldo < 0)
            	throw new CompteException("AVISO: Saldo negativo.");
        	}
        	
        	catch (CompteException exception) {
    			System.out.println(exception.getMessage());
    		}
        	
        	catch (AvisaHisendaException exception) {
        		System.out.println(exception.getMessage());
        	}
        	
        	catch (InputMismatchException exception){
    			System.out.println("Valor introducido incorrecto: " + exception);
    		}
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