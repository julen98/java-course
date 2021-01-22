package deparbank;

import java.util.regex.Pattern;

public class CompteBancari {
	
	private String iban;
	private String titular;
	private double saldo;
	
	public CompteBancari(String iban, String titular, int saldo) {
		if(validarIBAN(iban)==true && validarTitular(titular)==true && saldo>-50) {
		if(validarIBAN(iban)==true) {
		this.iban = iban;
		}else {
			System.err.println("El IBAN es incorrecto.");
		}
		
		if(validarTitular(titular)==true) {
		this.titular = titular;
		}else {
			System.err.println("El nombre es incorrecto, tiene que tener un nombre y un apellido comenzando cada uno por mayúscula.");
		}
		if(saldo>-50)
			this.saldo = saldo;
		if(saldo<0)
        	System.out.println("AVISO: Saldo negativo.");
		}
	}
	
	static boolean validarIBAN(String iban) {
		String ibanRegexp = "[ES]{2}[0..9]{22}";
		return Pattern.matches(ibanRegexp, iban);
	}
	
	static boolean validarTitular(String titular) {
		String titularRegexp = "[A-Z][a-zA-Z]{4,}(?: [A-Z][a-zA-Z]*){0,2}";
		return Pattern.matches(titularRegexp, titular);
	}
	
	public void movimientos() {
		
	}
 
	public void retirar(double cantidad) {
		if(saldo-cantidad>-50)
		saldo = saldo - cantidad;
		if(cantidad>3000)
        	System.out.println("AVISO: NOTIFICACIÓN A HACIENDA");
	}
	
	public void depositar(double cantidad) {
        saldo = saldo + cantidad;
        if(cantidad>3000)
        	System.out.println("AVISO: NOTIFICACIÓN A HACIENDA");
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
}
