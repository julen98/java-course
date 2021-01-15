package ejercicio7;

import java.util.Scanner;

public class Principal {
	public static void imprimeVector(int vector[]) {
		for (int i = 0; i < vector.length; i++)
            System.out.print(vector[i] + " ");
        System.out.println();
		
	}
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
      
        int x,tamany;
        int opcion;
        boolean continuar=true;
        
        System.out.println("introduce la dimensión del vector: ");
        tamany=entrada.nextInt();
        System.out.println("introduce un número: ");
	        x=entrada.nextInt();
       
        int v[] = new int[tamany];
        
        
       

        while (continuar) {
        	
            System.out.println();
            System.out.println(" ********* MENU PRINCIPAL *********");
            System.out.println("1.- Rellenar el vector");
            System.out.println("2.- Calcular Media");
            System.out.println("3.- Comprobar si existe");
            System.out.println("4.- Mayores o iguales: ");
            System.out.println("5.- Salir: ");
            opcion = entrada.nextInt();
            
            switch (opcion) {
                
                case 1:
                	RellenarVector.rellenaVector(v, tamany);
                	// System.out.println(v[]=rellenaVector(v, tamany));
                    imprimeVector(v);
                    break;
                    
                case 2:
                    double valor=0;
                    valor=HacerMedia.media(v);
                    System.out.println("La media es: " + valor);
                    break;
                    
                case 3:
                    boolean exist=VectorExiste.existe(v, x);
                    System.out.println("el numero: " + x + " es " + exist);
                    
                    break;
                    
                case 4:   
                	int numMayores=ValoresMayores.mayores(v,x);
                	System.out.println("Hay "+numMayores+" numeros mayores que: " + x);
                	break;   
                	
                case 5:   
                	continuar=false;
                	break;
               
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
  }
}
