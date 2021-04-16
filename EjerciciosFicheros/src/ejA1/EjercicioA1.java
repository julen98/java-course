package ejA1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioA1  {
	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);
		String path = "c:/";
		File docs = new File (path);
		do {
			try {
			System.out.println("Introduce la ruta: ");
			path = teclado.nextLine();
			muestraInfoRuta(docs);
			} catch (InputMismatchException e) {
			System.out.println("Valor introducido incorrecto: " + e);
		}
		} while (!path.equals(""));
	}
	
	public static void muestraInfoRuta (File ruta) throws IOException {
		boolean exists = ruta.exists();
		boolean isDirectory = ruta.isDirectory();
		boolean isFile = ruta.isFile();
			while (exists) {
				try {
					if(exists) {
					if(isFile)
						System.out.println("[A]" + ruta.getName());
					if(isDirectory) {
						String[] listDoc = ruta.list();
						for (String list : listDoc) {
							System.out.println("[*]" + list);
						}
					}
					} else {
						throw new FileNotFoundException("No existe el archivo");
					}
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
			}
			}
	}
