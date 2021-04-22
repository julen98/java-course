package casPracticMiniTerminalMiniFileManager;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MiniFileManager {
	
	File file = new File("");
	
	public MiniFileManager(File file) {
		super();
		this.file = file;
	}
	
	public String pwd () throws IOException {
		
		String pwd;
		
		pwd = file.getCanonicalPath().toString();
		
		return pwd;
	}

	public boolean cd (String dir, String args) throws IOException {
		
		boolean cambiado = false;
		File destino = new File ("");
		File destinoPadre = new File (dir);
		
		if (args != "..") {
			destino = new File(dir);
		} else {
			destino = new File(destino.getParent());
		}
		
		if (destino.exists()) {
			cambiado = true;
		}
		
		return cambiado;
	}
	
	public void ls (boolean info) throws IOException {
		
		info = false;
		
		File file = new File (pwd());
		File [] fileList = file.listFiles();
		
		for (File f : fileList) {
			System.out.println(f.getName());
		}
	}
}
