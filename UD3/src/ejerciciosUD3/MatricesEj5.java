package ejerciciosUD3;
import java.util.Scanner;
public class MatricesEj5 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		//Declaracion
		
		int numpersonas;
		int sueldomujeres=0;
		int sueldohombres=0;
		float mediahombres=0;
		float mediamujeres=0;

		
		// HOMBRE == 0, MUJER == 1
		
		//Inclusion de Datos
		
		System.out.println("¿Cuantos empleados/as vas a introducir en el programa?");
		numpersonas = teclado.nextInt();
		int matriz[][]=new int[numpersonas][2];
		
		//Bucle
		
		for(int i=0;i<numpersonas;i++) {
			System.out.println("Ingresa el género del empleado (HOMBRE == 0, MUJER == 1): "+i+0);
            matriz[i][0]=teclado.nextInt();
            System.out.println("Ingresa el sueldo:"+i+1);
                matriz[i][1]=teclado.nextInt();
            }
		for(int i=0;i<numpersonas;i++) {
		if(matriz[i][0]==1) {
			sueldomujeres++;
			mediamujeres=matriz[i][1]+mediamujeres;
		}
		if(matriz[i][0]==0) {
			sueldohombres++;
			mediahombres=matriz[i][1]+mediahombres;
		}
		}
		System.out.println("La media de sueldo de mujeres es: "+(mediamujeres/sueldomujeres)+"€");
		System.out.println("La media de sueldo de hombres es: "+(mediahombres/sueldohombres)+"€");
		teclado.close();
	}
}