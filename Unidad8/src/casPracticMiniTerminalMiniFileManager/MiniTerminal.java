package casPracticMiniTerminalMiniFileManager;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MiniTerminal {
	public static void main(String[] args) {

		MiniFileManager m = new MiniFileManager();
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		
		String direccion = "";
		String direccion2 = "";
		File eliminar = new File(direccion);
		File f1 = new File (direccion);
		File f2 = new File (direccion2);
		String opcion = "";
		
		
		
		do {
			try {
				if (opcion == "")
					System.out.println("~$ Escribe help para obtener ayuda...");
				else
					System.out.println("~$ ");
				opcion = teclado.nextLine();
				switch (opcion) {
					case "pwd":
						System.out.println(m.pwd());
						break;
					case "cd":
						System.out.println("Introduce la direccion: ");
						direccion = teclado.nextLine();
						m.cd(direccion);
						break;
					case "ls":
						m.ls();
						break;
					case "ll":
						m.ll();
						break;
					case "mkdir":
						System.out.println("Introduce el nombre del directorio: ");
						direccion = teclado.nextLine();
						m.mkdir(direccion);
						break;
					case "rm":
						System.out.println("Introduce la direccion: ");
						direccion = teclado.nextLine();
						eliminar = new File (direccion);
						m.rm(eliminar);
						break;
					case "mv":
						System.out.println("Introduce la direccion del primer archivo: ");
						direccion = teclado.nextLine();
						System.out.println("Introduce la direccion del segundo archivo: ");
						direccion2 = teclado.nextLine();
						
						f1 = new File(direccion);
						f2 = new File(direccion2);
						
						m.mv(f1, f2);
						break;
					case "help":
						System.out.println(m.help());
						break;
					case "exit":
						m.exit();
						break;
				}
			} catch (IOException e) {
				System.out.println(e);
			} catch (InputMismatchException e) {
				System.out.println(e + ": Valor introducido incorrecto.");
				teclado.next();
			} catch (IllegalStateException e) {
				System.out.println(e);
				teclado.next();
			}
	} while (opcion != "exitFromHere");
}
}