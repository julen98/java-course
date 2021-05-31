package ejercicios;
// Cambio para commit
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClaseMain {
	 private static final String INTRODUCE_UN_MES = "Introduce un mes: ";

	public static void main(String[] args) throws IOException {
	        int dia, mes, anyo;
	        String introduceDia = "Introduce un dia: ";
			System.out.println (introduceDia);
	        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	        dia = Integer.parseInt(entrada.readLine());
	        System.out.println ("Introduce un mes: "); 
	        mes = Integer.parseInt(entrada.readLine());
	        System.out.println ("Introduce un anio: "); 
	        anyo = Integer.parseInt(entrada.readLine());
	        Fecha f1 = new Fecha(dia,mes,anyo);
	        toString(dia, mes, anyo, f1);
	    }

	private static void toString(int dia, int mes, int anyo, Fecha f1) {
		if (f1.valida(31)) 
		    System.out.println("La fecha: "+dia+"/"+mes+"/"+anyo+" es v�lida");
		else 
		System.out.println("La fecha: "+dia+"/"+mes+"/"+anyo+" NO es v�lida");
	}
}
