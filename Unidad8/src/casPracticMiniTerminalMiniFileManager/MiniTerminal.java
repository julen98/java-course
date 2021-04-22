package casPracticMiniTerminalMiniFileManager;

import java.io.*;
import java.util.*;

public class MiniTerminal {
	public static void main(String[] args) {
		
		File file = new File("");

		MiniFileManager m = new MiniFileManager(file);
		
		Scanner teclado = new Scanner(System.in);
		
		
		
		try {
			System.out.println(m.pwd());
			m.ls(false);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
