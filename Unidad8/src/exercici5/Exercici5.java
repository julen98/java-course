package exercici5;

import java.io.File;
import java.io.FileNotFoundException;

public class Exercici5 {
	public static void main(String[] args) {

        // Instaciem a la classe FILE amb les rutes relatives a les carpetes que volem esborrar
        File fotografies = new File("Documentos/Fotografias");
        File llibres = new File("Documentos/Libros");
        File documents = new File("Documentos");
        
        boolean resultat = false;

        try {
        	if(documents.exists() && llibres.exists() && fotografies.exists()) {
            // Esborrem la carpeta 'Fotografias' i tot el seu contingut
        	resultat = esborrarTot(fotografies);
            if (resultat) {
                System.out.println("La carpeta 'Fotografias' ha segut esborrada");
            }

            // Esborrem la carpeta 'Libros' i tot el seu contingut
            resultat = esborrarTot(llibres);
            if (resultat) {
                System.out.println("La carpeta 'Libros' ha segut esborrada");
            }

            // Esborrem la carpeta 'Documentos' i tot el seu contingut
            resultat = esborrarTot(documents);
            if (resultat) {
                System.out.println("La carpeta 'Documentos' ha segut esborrada");
            }
        	} else {
        		throw new FileNotFoundException("La ruta introduïda no existeix");
        	}
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    } // Del main()
	

   /* Crea una funció anemomenada esborrarTot() que elimine tots els arxius i carpetes d'una ruta,
    * 
    * Si no existeix la ruta mostra una excepció.
    * Si és un arxiu l'esborrem
    * Si és una carpeta, primer eliminem tots els seus arxius, i després, esborre la carpeta
    * 
    */
  
	public static boolean esborrarTot(File f) {
		
		boolean borrado = false;
		
		try {
			if(f.exists()) {
				if(f.isFile()) {
					f.delete();
					borrado = true;
				}
				if(f.isDirectory()) {
					String [] lista = f.list();
					for (String s : lista) {
						File file = new File(f.getPath(),s);
						file.delete();
					}
					f.delete();
					borrado = true;
				}
			} else {
        		throw new FileNotFoundException("La ruta introduïda no existeix");
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		return borrado;
	}

} // de la classe
