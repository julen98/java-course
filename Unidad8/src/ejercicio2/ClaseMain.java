package ejercicio2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ClaseMain {
	public static void main(String[] args) throws IOException {
		
		ArrayList<Astros> lista = new ArrayList <Astros>();
		
		FileWriter fw = new FileWriter("prueba.txt");
        PrintWriter pw = null;
        
		Planetas p1 = new Planetas("Tierra", 0, 3, 0, 3, 0, 3, 0, true);
		Planetas p2 = new Planetas("Marte", 1, 2, 1, 2, 1, 2, 1, false);
		Planetas p3 = new Planetas("Jupiter", 2, 1, 2, 1, 2, 1, 2, true);
		Satelites s1 = new Satelites("Europa", 0, 0, 0, 0, 0, 0, 0, p1);
		Satelites s2 = new Satelites("Luna", 0, 0, 0, 0, 0, 0, 0, p1);
		try {
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(s1);
		lista.add(s2);
		
		menu(lista);
		}
		
		catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	
	public static void menu(ArrayList<Astros> lista) throws IOException {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		FileWriter fw = new FileWriter("src/ejercicio2/prueba.txt");
        PrintWriter pw = null;
		int opcion = 0;
		
		pw = new PrintWriter(fw);
		try {
		while(opcion < 6) {
		pw.print("\n=== LISTA DE ASTROS ===");
		System.out.println("Astro 1: "+lista.get(0).getNombre());
		System.out.println("Astro 2: "+lista.get(1).getNombre());
		System.out.println("Astro 3: "+lista.get(2).getNombre());
		System.out.println("Astro 4: "+lista.get(3).getNombre());
		System.out.println("Astro 5: "+lista.get(4).getNombre());
		System.out.println("Elige un astro (-1 para salir): ");
		opcion = teclado.nextInt();
		
		switch(opcion) {
		case -1:
			System.exit(0);
		case 1:
			pw.print(lista.get(0));
			aprietaEnter();
			break;
		case 2:
			pw.print(lista.get(1));
			aprietaEnter();
			break;
		case 3:
			pw.print(lista.get(2));
			aprietaEnter();
			break;
		case 4:
			pw.print(lista.get(3));
			aprietaEnter();
			break;
		case 5:
			pw.print(lista.get(4));
			aprietaEnter();
			break;
		}
		}
		}
		finally {
	           try {
	           if (null != fw)
	              fw.close();
	           }
	           
	           catch (Exception ex2) {
	              ex2.printStackTrace();
	           }
	        }
	}
	
	private static void aprietaEnter() { 
	        System.out.println("Presiona Enter para continuar ...");
	        try{
	            System.in.read();
	        }  
	        catch(Exception e){}  
	 }
}
