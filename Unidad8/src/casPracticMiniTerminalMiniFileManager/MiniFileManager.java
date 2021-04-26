package casPracticMiniTerminalMiniFileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class MiniFileManager {

	File file = new File(System.getProperty("user.dir"));

	public MiniFileManager(File file) {
		super();
		this.file = file;
	}

	public MiniFileManager() {

	}

	public String pwd() throws IOException {

		return file.getCanonicalPath().toString();
	}

	public boolean cd(String dir) throws IOException {

		boolean cambiado = false;

		if (dir != "..") {
			file = new File(dir);
		} else {
			file = new File(file.getParent());
		}

		if (file.exists()) {
			cambiado = true;
		}

		return cambiado;
	}
	
	public void ls() throws IOException {

		File[] filesList = file.listFiles();
		Arrays.parallelSort(filesList);
		ArrayList < File > dir = new ArrayList < File > ();
		ArrayList < File > fil = new ArrayList < File > ();
		int i = 0;
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
					throw new FileNotFoundException("No existe el archivo.");
				}
			} catch (FileNotFoundException e) {
				System.out.println(e);
			}
		}
		for (i = 0; i < dir.size(); i++) {
			System.out.println("[*]" + dir.get(i).getName());
		}
		for (i = 0; i < fil.size(); i++) {
			System.out.println("[A]" + fil.get(i).getName());
		}
	}
	
	public void ll() throws IOException {

		File[] filesList = file.listFiles();
		Arrays.parallelSort(filesList);
		ArrayList < File > dir = new ArrayList < File > ();
		ArrayList < File > fil = new ArrayList < File > ();
		int i = 0;
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
					throw new FileNotFoundException("No existe el archivo.");
				}
			} catch (FileNotFoundException e) {
				System.out.println(e);
			}
		}
		for (i = 0; i < dir.size(); i++) {
			long millisec = dir.get(i).lastModified();
			Date dt = new Date(millisec);

			System.out.println("[*]" + dir.get(i).getName() + "\n Ultima modificación: " + dt + "\n Peso: " + dir.get(i).length() + " B");
		}
		for (i = 0; i < fil.size(); i++) {
			long millisec = fil.get(i).lastModified();
			Date dt = new Date(millisec);

			System.out.println("[A]" + fil.get(i).getName() + "\n Ultima modificación: " + dt + "\n Peso: " + fil.get(i).length() + " B");
		}
	}

	public void mkdir(String dir) throws IOException {

		File fichero = new File("");

		try {
			fichero = new File(file + "/" + dir);
			if (fichero.exists())
				System.out.println("El archivo que quieres crear ya existe.");
			fichero.mkdir();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void rm(File f) throws IOException {

		File[] filesList = f.listFiles();
		ArrayList < File > fil = new ArrayList < File > ();
		int i = 0;
		for (File file: filesList) {
			try {
				boolean exists = file.exists();
				boolean isDirectory = file.isDirectory();
				boolean isFile = file.isFile();

				if (exists) {
					if (isDirectory) {
						System.err.println("Cuidado, has intentado borrar la subcarpeta: " + file.getName());
					}
					if (isFile) {
						fil.add(file);
					}
				} else {
					throw new FileNotFoundException("No existe el archivo.");
				}
			} catch (FileNotFoundException e) {
				System.out.println(e);
			}
		}
		for (i = 0; i < fil.size(); i++) {
			fil.get(i).delete();
			System.out.println(fil.get(i).getName() + " ha sido eliminado.");
		}
	}
	
	public void mv (File f1, File f2) {
		
		try {
			if (f1.exists()) {
				f1.renameTo(f2);
			} else {
				throw new FileNotFoundException("No existe el archivo.");
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
	
	public String help () {
		
		String  toString = 	"---- Menu de ayuda ----";
				toString += "pwd: Muestra la carpeta actual del proyecto.";
				toString += "cd (dir): Cambia la carpeta del proyecto a otra, con '..' vas hacia la carpeta superior.";
				toString += "ls: Lista los directorios y archivos de la carpeta actual.";
				toString += "ll: Lo mismo que ls ademas de la fecha de modificacion y el peso del archivo.";
				toString += "mkdir (dir): Crea el directorio introducido en la carpeta actual.";
				toString += "rm (file): Elimina el directorio introducido, con todos los archivos de dentro, excepto las subcarpetas.";
				toString += "mv (file1, file2): Mueve o cambia de nombre 'file1' a 'file2'.";
				toString += "help: Muestra una breve ayuda de todos los comandos (lo que estas leyendo ahora mismo).";
				toString += "exit: Termina el programa.";

		return toString;
	}
	
	public void exit () {
		System.exit(0);
	}
}