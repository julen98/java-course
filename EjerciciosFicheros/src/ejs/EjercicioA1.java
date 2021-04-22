package ejs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
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
		for (File file: filesList) {
			try {
				boolean exists = file.exists();
				boolean isDirectory = file.isDirectory();
				boolean isFile = file.isFile();
				boolean done = true;
				ArrayList <File> dir = new ArrayList<File>();
				ArrayList <File> fil = new ArrayList<File>();
				if (exists) {
					if (isDirectory) {
						dir.add(file);
						for (int i = 0; i < dir.size(); i++) {
							System.out.println("[*]" + file.getName());
						}
					}
					if (isFile) {
						fil.add(file);
						for (int i = 0; i < fil.size(); i++) {
							System.out.println("[A]" + file.getName());
						}
					}
				} else {
					throw new FileNotFoundException("No existe el archivo");
				}
			} catch (FileNotFoundException e) {
				System.out.println(e);
			}
		}
	}
}