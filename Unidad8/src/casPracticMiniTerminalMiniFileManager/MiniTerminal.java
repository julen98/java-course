package casPracticMiniTerminalMiniFileManager;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MiniTerminal {
	public static void main(String[] args) {

		MiniFileManager m = new MiniFileManager();
		Scanner teclado = new Scanner(System.in);
		String direccion = "";
		String direccion2 = "";
		File eliminar = new File(direccion);
		File f1 = new File (direccion);
		File f2 = new File (direccion2);
		int opcion = 0;


		try {
			while (opcion < 9) {
				System.out.println("---------------------------------");
				System.out.println("------------- MENU --------------");
				System.out.println("--- 1- pwd					  ---");
				System.out.println("--- 2- cd					  ---");
				System.out.println("--- 3- ls					  ---");
				System.out.println("--- 4- ll					  ---");
				System.out.println("--- 5- mkdir				  ---");
				System.out.println("--- 6- rm					  ---");
				System.out.println("--- 7- mv					  ---");
				System.out.println("--- 8- help					  ---");
				System.out.println("--- 9- exit					  ---");
				System.out.println("---------------------------------");
				System.out.println("--- Introduce un numero:      ---");
				opcion = teclado.nextInt();
				System.out.println("---------------------------------");
				

				if (teclado.hasNextInt())
					opcion = teclado.nextInt();

			}

			switch (opcion) {
				case 1:
					m.pwd();
					break;
				case 2:
					teclado.nextLine();
					System.out.println("Introduce la direccion: ");
					direccion = teclado.nextLine();
					m.cd(direccion);
					break;
				case 3:
					m.ls();
					break;
				case 4:
					m.ll();
					break;
				case 5:
					teclado.nextLine();
					System.out.println("Introduce la direccion: ");
					direccion = teclado.nextLine();
					m.mkdir(direccion);
					break;
				case 6:
					teclado.nextLine();
					System.out.println("Introduce la direccion: ");
					direccion = teclado.nextLine();
					eliminar = new File (direccion);
					m.rm(eliminar);
					break;
				case 7:
					teclado.nextLine();
					System.out.println("Introduce la direccion del primer archivo: ");
					direccion = teclado.nextLine();
					System.out.println("Introduce la direccion del segundo archivo: ");
					direccion2 = teclado.nextLine();
					
					f1 = new File(direccion);
					f2 = new File(direccion2);
					
					m.mv(f1, f2);
					break;
				case 8:
					m.help();
					break;
				case 9:
					m.exit();
					break;
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}

		teclado.close();
	}
}