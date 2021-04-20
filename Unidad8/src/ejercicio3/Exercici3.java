package ejercicio3;

import java.io.File;
import java.util.Arrays;

public class Exercici3 {
	public static void main (String args[]) {
		
		File docOrigen = new File("Documentos");
		File docDesti = new File("DOCS");

		if(!docOrigen.exists())
			System.out.println("COMPROVA QUE LA CARPETA DOCUMENTS ESTA CREADA I LA RUTA ES CORRECTA");
		docOrigen.renameTo(docDesti);
				
		File fotoOrigen = new File("DOCS/Fotografias");
		File fotoDesti = new File("DOCS/FOTOS");
		fotoOrigen.renameTo(fotoDesti);
		
		File llibreOrigen = new File("DOCS/Libros");
		File llibreDesti = new File("DOCS/LECTURES");
		llibreOrigen.renameTo(llibreDesti);

		/* ***********************************************************
         *  Llevem les extensions en FOTOS (REANOMENTANT ELS ARXIUS) *
         *************************************************************/
        
// ABANS d'eliminar les extensions, imprimim la llista d'arxius ordenada cridant a la funció imprimirLlistaArxius()
		
		System.out.println("Llistat d'arxius de DOCS\\LECTURES abans de llevar les extensions: ");
		imprimirListaArchivos(fotoDesti);
		System.out.println("\n");
		
// Reanomenem els arxius, llenvant les Extensions cridant a la funció llevarExtensionsArxius()
		
		quitarExtensionesArchivos(fotoDesti);
		
// DESPRES d'eliminar les extensions, imprimim de nou la llista d'arxius ordenadacridant a la funció imprimirLlistaArxius()
		
		System.out.println("Llistat d'arxius de DOCS\\LECTURES després de llevar les extensions:");
		imprimirListaArchivos(fotoDesti);
		
} // del main()

/*
 * IMPRIMIR LLISTA ARXIUS
 * 
 */

	public static void imprimirListaArchivos(File file) {
	
		File filesList[] = file.listFiles();
		Arrays.parallelSort(filesList);
		for (File f : filesList) {
			if(f.isFile())
				System.out.println("Nombre: " + f.getName());
		}
}

/*
 * 
 * LLEVAR EXTENSIONS ARXIUS
 * 	
 */

	public static void quitarExtensionesArchivos(File file) {
		
		for (File f : file.listFiles()) {
			String [] archivo = f.getName().split("\\.");
			File noExt = new File(f.getParent() + "/" + archivo[0]);
			f.renameTo(noExt);
		}
}


} // de la classe
