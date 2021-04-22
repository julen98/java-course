package pruebas;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File {
	public static void main(String[] args) {
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		File f = new File ();
		System.out.println("Current relative path is: " + s);	}
}
