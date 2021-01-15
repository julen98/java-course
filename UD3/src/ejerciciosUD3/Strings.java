package ejerciciosUD3;

public class Strings {
	public static void main(String[] args) {
		
		//Declaración
		
		String url= new String("https://www.google.es");
		String barra=new String("/search?=java");
		String salida;
		int exit;
		boolean comparar;
		int comparacion=0;
		String google = new String("GOOGLE");
		String googleminus;
		String googlemayus;
		String googleEspacios = new String("  Google, el buscador mas usado  ");
		String googleSinEspacios;
		String googleReplace;

		// int length(): Devuelve la cantidad de caracteres del String.
		
		System.out.println("String: "+url);
		System.out.println("*** Cantidad de caracteres del String url ***\n");
		System.out.println(url.length());

		// Char charAt(int i): Devuelve el carácter en el índice i.

		System.out.println("\nString: "+url);
		System.out.println("*** Devuelve el carácter en el índice i ***\n");
		System.out.println(url.charAt(6));

		// String substring (int i): Devuelve la subcadena del i-ésimo carácter de índice al final.

		System.out.println("\nString: "+url);
		System.out.println("*** Devuelve la subcadena del i-ésimo carácter de índice al final ***\n");
		System.out.println(url.substring(8));

		// String substring (int i, int j): Devuelve la subcadena del índice i a j-1.

		System.out.println("\nString: "+url);
		System.out.println("*** Devuelve la subcadena del índice i a j-1 ***\n");
		System.out.println(url.substring(12,18));

		// String concat( String str): Concatena la cadena especificada al final de esta cadena.

		System.out.println("\nString: "+url);
		System.out.println("*** Concatena la cadena especificada al final de esta cadena ***\n");
		System.out.println(salida=url.concat(barra));

		// int indexOf (String s): Devuelve el índice dentro de la cadena de la primera aparición de la cadena especificada.

		System.out.println("\nString: "+url);
		System.out.println("*** Devuelve el índice dentro de la cadena de la primera aparición de la cadena especificada ***\n");
		System.out.println(exit=url.indexOf('s'));

		// int indexOf (String s, int i): Devuelve el índice dentro de la cadena de la primera aparición de la cadena especificada, comenzando en el índice especificado.
		
		System.out.println("\nString: "+url);
		System.out.println("*** Devuelve el índice dentro de la cadena de la primera aparición de la cadena especificada, comenzando en el índice especificado. ***\n");
		System.out.println(exit=url.indexOf('s',10));

		// boolean equals (Objeto otroObjeto): Compara este String con el objeto especificado.
		
		System.out.println("\n*** Compara este String con el objeto especificado ***\n");
		System.out.println("Objeto 1: https://www.google.es");
		System.out.println("Objeto 2: https://www.Google.es");
		System.out.println("String: "+url);
		System.out.println("Objeto 1 comparacion: "+(comparar=url.equals("https://www.google.es")));
		System.out.println("Objeto 2 comparacion: "+(comparar=url.equals("https://www.Google.es")));

		// boolean equalsIgnoreCase (String otroString): Compara un String con un objeto ignorando las mayúsculas.
		
		System.out.println("\n*** Compara un String con otro ignorando las mayúsculas ***\n");
		System.out.println("Objeto 1: https://www.google.es");
		System.out.println("Objeto 2: https://www.Google.es");
		System.out.println("String: "+url);
		System.out.println("Objeto 1 comparacion: "+(comparar=url.equalsIgnoreCase("https://www.google.es")));
		System.out.println("Objeto 2 comparacion: "+(comparar=url.equalsIgnoreCase("https://www.Google.es")));

		// int compareTo (String otroString): Compara dos cadenas lexicográficamente.
		
		System.out.println("\n*** Compara dos cadenas lexicográficamente ***\n");
		System.out.println("String 1: "+url);
		System.out.println("String 2: "+barra);
		System.out.println("Comparación: "+(comparacion=url.compareTo(barra)));

		// int compareToIgnoreCase (String otroString): Compara dos cadenas lexicográficamente, ignorando las consideraciones case.
		
		System.out.println("\n*** Compara dos cadenas lexicográficamente, ignorando las consideraciones case ***\n");
		System.out.println("String 1: "+url);
		System.out.println("String 2: "+barra); 
		System.out.println("Comparación: "+(comparacion=url.compareToIgnoreCase(barra)));

		// String toLowerCase(): Convierte todos los caracteres de String a minúsculas.
		
		System.out.println("\n*** Convierte todos los caracteres de String a minúsculas ***\n");
		System.out.println(googleminus=google.toLowerCase());

		// String toUpperCase(): Convierte todos los caracteres de String a mayúsculas.
		
		System.out.println("\n*** Convierte todos los caracteres de String a mayúsculas ***\n");
		System.out.println(googlemayus=google.toUpperCase());

		// String trim(): Devuelve la copia de la cadena, eliminando espacios en blanco en ambos extremos. No afecta los espacios en blanco en el medio.
		
		System.out.println("\n*** Devuelve la copia de la cadena, eliminando espacios en blanco en ambos extremos. No afecta los espacios en blanco en el medio ***\n");
		System.out.println("Original: "+googleEspacios+".");
		System.out.println("Sin espacios: "+(googleSinEspacios=googleEspacios.trim())+".");

		// String replace (char oldChar, char newChar): Devuelve una nueva cadena al reemplazar todas las ocurrencias de oldChar con newChar..
		
		System.out.println("\n*** Devuelve una nueva cadena al reemplazar todas las ocurrencias de oldChar con newChar ***\n");
		System.out.println(googleReplace=google.replace('O', 'A'));
		
	}
}