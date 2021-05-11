package casPracticMiniTerminalMiniFileManager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MiniTerminal {
	public static void main(String[] args) throws IOException {

		MiniFileManager m = new MiniFileManager();
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String direccion = "", direccion2 = "", opcion = "";
		File eliminar = new File(direccion);
		File f1 = new File(direccion);
		File f2 = new File(direccion2);

		do {
			try {
				System.out.print("~$ ");
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
						eliminar = new File(direccion);
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
					case "fibonacci":
						Fibonacci.printFibonacci();
						break;
					case "maxmin":
						maxmin();
						break;
					case "notas":
						notas();
						break;
				}
			}
			catch (IOException e) {
				System.out.println(e);
			}
			catch (InputMismatchException e) {
				System.out.println(e + ": Valor introducido incorrecto.");
				teclado.next();
			}
			catch (IllegalStateException e) {
				System.out.println(e);
				teclado.next();
			}
		} while (opcion != "letmeout");
	}

	public static void maxmin() throws IOException {
		FileReader fr = new FileReader("Documentos/numeros.txt");
		BufferedReader entrada = new BufferedReader(fr);
		int max = 0, numeros = 0, min = 0;

		while (entrada.readLine() != null) {
			numeros = Integer.parseInt(entrada.readLine());
			if (max < numeros)
				max = numeros;
			if (min > numeros)
				min = numeros;
		}
		System.out.println("Max: " + max + "\nMin: " + min);
		entrada.close();
	}
	
	public static void notas() throws IOException {
		FileReader file = new FileReader("Documentos/alumnos_notas.txt");
	    BufferedReader entrada = new BufferedReader(file);
		String linea = "";
		String[] tokens;
		int notas;
		String nombre;

		while((linea = entrada.readLine()) != null) {
		    int i = 3;
			tokens = linea.split(" ");
		    notas = Integer.parseInt(tokens[i]);
		    notas = notas + notas;
		    nombre = tokens[0] + " " + tokens[1];
		    
		    System.out.println("Nombre: " + nombre + ". Notas: " + notas);
		    i++;
		}
	}
}