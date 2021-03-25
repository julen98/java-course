package gatoCopia;

import java.util.ArrayList;
import java.util.Scanner;

public class MainGato {
	public static void main(String[] args) throws Exception {
		
		Scanner teclado = new Scanner(System.in);
		ArrayList < Gato > lista = new ArrayList < Gato > ();
		
		String nombre;
		int edad;
		String pattern = "^[A-Z][a-z]{2,}";
		
		while(lista.size() <= 4) {
			try {
				System.out.println("Introduce el nombre del gato: ");
				nombre = teclado.nextLine();
				System.out.println("Introduce la edad del gato: ");
				edad = teclado.nextInt();
				teclado.nextLine();
				if(nombre.matches(pattern) && edad >= 0) {
					lista.add(new Gato(nombre, edad));
				} else {
					throw new Exception("El nombre debe empezar por mayuscula, no contener numeros y tener un minimo de 3 letras, además la edad no puede ser negativa");
				}
			}
			
			catch (Exception exception) {
				System.out.println(exception.getMessage());
			}
		}
		
		for (Gato gatos : lista) {
			gatos.imprimir();
		}
	}
}
