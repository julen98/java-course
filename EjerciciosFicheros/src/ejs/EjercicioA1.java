package ejs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
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
		File filesList[] = ruta.listFiles();
		Arrays.parallelSort(filesList);
		for (File file: filesList) {
			try {
				boolean exists = file.exists();
				boolean isDirectory = file.isDirectory();
				boolean isFile = file.isFile();
				if (exists) {
					if (isDirectory)
						System.out.println("[*]" + file.getName());
					if (isFile)
						System.out.println("[A]" + file.getName());
				} else {
					throw new FileNotFoundException("No existe el archivo");
				}
			} catch (FileNotFoundException e) {
				System.out.println(e);
			}
		}
	}
}