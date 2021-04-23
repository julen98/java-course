package casPracticMiniTerminalMiniFileManager;

import java.io.IOException;
import java.util.Scanner;

public class MiniTerminal {
	public static void main(String[] args) {
		
		MiniFileManager manager = new MiniFileManager();
		Scanner teclado = new Scanner(System.in);
		
		try {
			manager.pwd();
			manager.ls();
			manager.mkdir("test");
		} catch (IOException e) {
			System.out.println(e);
		}
		
	teclado.close();}
}
