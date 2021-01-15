package ejerciciosUD3;
import java.util.Scanner;
public class StringsEj4 {
public static void main(String[] args) {
	
	//Declaracion
	
	Scanner teclado = new Scanner(System.in);
	String entrada;
	int contadorA=0;
	int contadorE=0;
	int contadorI=0;
	int contadorO=0;
	int contadorU=0;	
	
	//Inclusion de datos
	
	System.out.println("Introduce una frase: ");
	entrada = teclado.nextLine();
	teclado.close(); //Cerrar el scanner teclado
	
	//Mostrar datos en pantalla
	
	String entradaMinus=entrada.toLowerCase();
	for(int i=0;i<entradaMinus.length();i++) {
		if(entradaMinus.charAt(i)=='a') {
			contadorA++;
		}
		if(entradaMinus.charAt(i)=='e') {
			contadorE++;
		}
		if(entradaMinus.charAt(i)=='i') {
			contadorI++;
		}
		if(entradaMinus.charAt(i)=='o') {
			contadorO++;
		}
		if(entradaMinus.charAt(i)=='u') {
			contadorU++;
		}
	}
	
	System.out.println("Nº de A's: "+contadorA);
	System.out.println("Nº de E's: "+contadorE);
	System.out.println("Nº de I's: "+contadorI);
	System.out.println("Nº de O's: "+contadorO);
	System.out.println("Nº de U's: "+contadorU);
}
}