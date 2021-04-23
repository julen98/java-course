package ejs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class EjercicioA1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String path = "c:/";
		do {
			try {

				System.out.println("Introduce la ruta: ");
				path = teclado.nextLine();
				File docs = new File(path);
				if (!docs.exists())
					throw new FileNotFoundException("La ruta no existe.");
				muestraInfoRuta(docs);
			} catch (FileNotFoundException e) {
				System.out.println(e);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while (!path.equals(""));
	}

	public static void muestraInfoRuta(File ruta) throws IOException {
		File[] filesList = ruta.listFiles();
		Arrays.parallelSort(filesList);
		ArrayList <File> dir = new ArrayList<File>();
		ArrayList <File> fil = new ArrayList<File>();
		// returns the time file was last modified
        int i = 0;
		
		// /home/julcue/Documentos
		for (File file: filesList) {
			try {
				boolean exists = file.exists();
				boolean isDirectory = file.isDirectory();
				boolean isFile = file.isFile();
				
				if (exists) {
					if (isDirectory) {
						dir.add(file);
					}
					if (isFile) {
						fil.add(file);
					}
				} else {
					throw new FileNotFoundException("No existe el archivo");
				}
			} catch (FileNotFoundException e) {
				System.out.println(e);
			}
		}
		for(i = 0; i < dir.size(); i++) {
			long millisec = dir.get(i).lastModified();
	        Date dt = new Date(millisec);
	        
			System.out.println("[*]" + dir.get(i).getName() + "\n Ultima modificación: " + dt + "\n Peso: " + dir.get(i).length());
		}
		for(i = 0; i < fil.size(); i++) {
			long millisec = fil.get(i).lastModified();
	        Date dt = new Date(millisec);
	        
			System.out.println("[A]" + fil.get(i).getName() + "\n Ultima modificación: " + dt + "\n Peso: " + fil.get(i).length());
		}
	}
}