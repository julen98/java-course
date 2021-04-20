package exercici4;

import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;

public class Exercici4 {
	
	public static void main(String args[]) {
		
		
		// Creem Instancies de la classe FILE amb les RUTES RELATIVES de les carpetes que volem crear
		
		File lesMeuesCoses = new File ("Documentos/Les Meues Coses");
		File alfabet = new File("Documentos/Alfabet");
		
		// Creem les carptetes i ho comporvem. (NOTA: les variables resultat1 i resultat2 són BOOLEANES
		
		boolean resultat1 = lesMeuesCoses.mkdir();
		boolean resultat2 = alfabet.mkdir();
		
		/* Crea carpeta "Les Meues Coses" */
		System.out.println("S'ha creat la carpeta 'Documents/Les Meues Coses'?? " + resultat1);
		
		/* Crea carpeta "Alfabet" */
		System.out.println("S'ha creat la carpeta 'Documents/Alfabet'?? " + resultat2);
		
		// Anem a moure les carpetes. Primer creem instacies d'Objectes de la classe FILE amb les rutes origen i destí
		
		File fotoOrigen = new File("Documentos/Fotografias");
		File fotoDesti = new File("Documentos/Les Meues Coses/Fotografias");
		
		/* Crea les instancies Origen i Destí per a Libros */
		
		File libroOrigen = new File("Documentos/Libros");
		File libroDesti = new File("Documentos/Les Meues Coses/Libros");
		
		// Movem la carpeta 'Fotografias' dins de 'Les Meues Coses', i comprovem que s'ha mogut correctament 
		
		resultat1 = fotoOrigen.renameTo(fotoDesti);
		System.out.println("S'ha mogut la carpeta 'Documentos/Fotografias' a 'Documentos/Les Meues Coses/Fotografias'? " + resultat1);
		
		/* Mou la carpeta libros */
		
		resultat1 = libroOrigen.renameTo(libroDesti);
		System.out.println("S'ha mogut la carpeta 'Documentos/Libros' a 'Documentos/Les Meues Coses/Libros'? " + resultat1);

		/*Crea dins de la carpeta 'Alfabet', una carpeta per cada una de les lletres de l'alfabet en majuscules. AJUDA: consulta la taula de codi ASCII, utilitza un for i in CASTING de enter a char. */
		
		char[] alph = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		for (int i = 0; i <= 25; i++) {
			File nueva = new File(alfabet.getParent() + "/" + alfabet.getName() + "/" + alph[i]);
			nueva.mkdir();
		}
		File [] lista = alfabet.listFiles();
		Arrays.parallelSort(lista);
		
		/* mostra per pantalla el contingut de la carpeta Alfabet*/
		
		System.out.println("El contingut de la carpeta 'Alfabet' és:");
		for (File f : lista) {
			System.out.print(f.getName()+" ");
		}
		
	} // Del Main()
	
} // De la Classe		