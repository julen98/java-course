package claseFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class classFile {
	public static void main(String[] args) throws IOException {
		try {
		File fichero1 = new File ("src/claseFile/fichero1.txt");
		File directorio = new File ("src/claseFile/Ejemplo/");
		File fichero2 = new File ("src/claseFile/", "fichero2.txt");
		File fichero3 = new File (directorio, "fichero3.txt");
		fichero1.createNewFile();
		fichero2.createNewFile();
		fichero3.createNewFile();
		long secs;
		
		System.out.println("- Conseguir el nombre o la ruta: ");
		System.out.println("getName: " + fichero1.getName());
		System.out.println("getPath: " + fichero2.getPath());
		System.out.println("getAbsolutePath: " + fichero3.getAbsolutePath());
		System.out.println("-----------------------------------\n");
		
		System.out.println("- Acceder al directorio padre o subdirectorios: ");
		System.out.println("list: Devuelve un array de Strings con todos los elementos del FILE.");
		String[] paths = directorio.list();
		for (String path : paths) {
			System.out.println(path);
		}
		System.out.println("listFiles: Devuelve un array de FILES con todos los elementos del FILE.");
		File[] files = directorio.listFiles();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i].getName());
		}
		System.out.println("getParent: Devuelve el directorio padre.");
		System.out.println(fichero3.getParent());
		System.out.println("getParentFile: Devuelve el directorio padre como un FILE. Si no existe devuelve NULL.");
		System.out.println(fichero1.getParentFile());
		System.out.println("-----------------------------------\n");
		
		System.out.println("- Comprobar existencia y caracteristicas: ");
		System.out.println("exists: Devuelve -true- si existe.");
		System.out.println(fichero2.exists());
		System.out.println("isDirectory: Devuelve -true- si es un directorio.");
		System.out.println(directorio.isDirectory());
		System.out.println("isFile: Devuelve -true- si es un archivo.");
		System.out.println(fichero3.isFile());
		System.out.println("isHidden: Devuelve -true- si es un archivo oculto.");
		System.out.println(fichero1.isHidden());
		System.out.println("length: Devuelve el tamaño en bytes del archivo.");
		System.out.println(fichero2.length() + " B");
		System.out.println("lastModified: Devuelve la fecha de modificacion.");
		secs = fichero3.lastModified();
		Date date = new Date(secs);
		System.out.println(date);
		System.out.println("-----------------------------------\n");
		
		System.out.println("- Creacion y eliminacion: ");
		System.out.println("delete: borra el archivo o directorio.");
		System.out.println(fichero3.delete());
		System.out.println("mkdir: Crea un directorio.");
		System.out.println(directorio.mkdir());
		System.out.println("renameTo(FILE): Cambia el nombre.");
		System.out.println(fichero1.renameTo(fichero3));
		}
		
		catch (Exception e) {
			System.out.println("Ha ocurrido un error.");
			e.printStackTrace();
		}
	}
}
