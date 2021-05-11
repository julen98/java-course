package ud4;
import java.util.Scanner;
public class Ej10 {
	public static boolean fechaCorrecta(int dia, int mes, int anyo) {
		boolean correcto=false;
		
		if(dia>0 && dia<31 && mes>0 && mes<13) 
			correcto=true;
		else 
			correcto=false;
		
		
		return correcto;
	}
	public static void main(String[] args) {
		
		//Declaración
		
		Scanner teclado = new Scanner(System.in);
		int dia;
		int mes;
		int anyo;
		
		//Inclusion de datos
		
		System.out.println("Escribe el dia de la fecha: ");
		dia = teclado.nextInt();
		System.out.println("Escribe el mes de la fecha: ");
		mes = teclado.nextInt();
		System.out.println("Escribe el año de la fecha: ");
		anyo = teclado.nextInt();
		
		if(fechaCorrecta(dia,mes,anyo)==false)
			System.out.println("La fecha "+dia+"/"+mes+"/"+anyo+" es incorrecta.");
		else
			System.out.println("La fecha "+dia+"/"+mes+"/"+anyo+" es correcta.");
					
		teclado.close();
	}
	
}
