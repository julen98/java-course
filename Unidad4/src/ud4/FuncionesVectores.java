package ud4;
import java.util.*;

public class FuncionesVectores {
	public static void instrucciones() {
		System.out.println("La funcion \"numerosAleatorios\" pide dos numeros por pantalla.");
		System.out.println("La funcion \"vectorAleatorio\" crea un vector con numeros aleatorios entre 5 y 25 (no funciona bien Math.random).");
		System.out.println("La funcion \"vectorSumaAleatorio\" crea un vector donde cada valor es la suma de todos los numeros y lo muestra por pantalla.");
		System.out.println("La funcion \"vectorMultiplicaAleatorio\" crea un vector donde cada valor es la multiplicacion de todos los numeros y lo muestra por pantalla.");
		System.out.println("La funcion \"vectorCombinat\" concatena los tres vectores anteriores en un vector y lo muestra por pantalla.");
		System.out.println("La funcion \"ordenaVector\" ordena de manera ascendente el vector combinado y lo muestra por pantalla.");
		System.out.println("La funcion \"buscaMaximo\" busca el valor maximo en el vector combinado y lo muestra por pantalla.");
		System.out.println("La funcion \"buscaMinimo\" busca el valor minimo en el vector combinado y lo muestra por pantalla.");
		System.out.println("La funcion \"esPrimo\" calcula si el numero del vector combinado es primo.");
		System.out.println("La funcion \"buscaPrimos\" muestra el numero de primos del vector combinado.\n");
	}
	public static int numerosAleatorios() {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num;		
		
		System.out.println("Introduce un numero: ");
		num=teclado.nextInt();
		
		return num;
	}
	public static int[] vectorAleatorio(int num1,int num2) {
		int vector[] = new int[20];
		
		for(int i=0;i<vector.length;i++) {
			vector[i]=(int)(Math.random()*num2)+num1;
			System.out.print(vector[i]+" ");
		}
		return vector;
	}
	public static int[] vectorSumaAleatorio(int num1,int num2) {
		int suma=0;
		int vector[] = new int[20];
		
		for(int i=0;i<vector.length;i++) {
			num1=(int)(Math.random()*num2)+num1;
			num2=(int)(Math.random()*num2)+num1;
			suma=num1+num2;
			vector[i]=suma;
			System.out.print(vector[i]+" ");
		}
		return vector;
	}
	public static int[] vectorMultiplicaAleatorio(int num1,int num2) {
		int prod=0;
		int vector[] = new int[20];
		
		for(int i=0;i<vector.length;i++) {
			num1=(int)(Math.random()*num2)+num1;
			num2=(int)(Math.random()*num2)+num1;
			prod=num1*num2;
			vector[i]=prod;
			System.out.print(vector[i]+" ");
		}
		return vector;
	}
	public static int[] vectorCombinat(int num1,int num2) {
		int vector[] = new int[60];
		int vector1[]=vectorAleatorio(num1,num2);
		int vector2[]=vectorSumaAleatorio(num1,num2);
		int vector3[]=vectorMultiplicaAleatorio(num1,num2);
		int i;
		int j=0;
		
			for(i=0;i<20;i++)
				vector[i]=vector1[i];
			for(i=20;i<40;i++) {
				vector[i]=vector2[j];
				j++;
			}
			j=0;
			for(i=40;i<60;i++) {
				vector[i]=vector3[j];
				j++;
			}
		return vector;
	}
	public static void ordenaVector(int vector[]) {
		Arrays.sort(vector);
		for(int i=0;i<60;i++)
		System.out.print(vector[i]+" ");
    }
	public static void buscaMaximo(int vector[]) {
		int max=0;
		
		for(int i=0;i<60;i++) {
		if(vector[i]>max)
			max=vector[i];
		}
		System.out.print(max);
	}
	public static void buscaMinimo(int vector[]) {
		int min=26;
		
		for(int i=0;i<60;i++) {
		if(vector[i]<min)
			min=vector[i];
		}
		System.out.print(min);
	}
	public static boolean esPrimo(int num) {
		if(num==2) 
			return true;
		if (num%2==0) 
			return false;
		for(int i=3;i*i<=num;i+=2) {
			if(num%i==0) { 
				return false; 
				}
		}
		return true;
	}
	public static void buscaPrimos(int numPrimo[]) {
		int primo=0;
		for (int i=0;i<numPrimo.length;i++) {
            if (esPrimo(numPrimo[i])) {
                primo++;
            }
        }
		System.out.print(primo);
    }
	public static void main(String[] args) {
		int num1,num2;
		
		num1=numerosAleatorios();
		num2=numerosAleatorios();
		int vector[]=new int[60];
		
		instrucciones();
		
		System.out.print("Vector aleatorio: ");
		vectorAleatorio(num1,num2);
		System.out.print("\nSuma: ");
		vectorSumaAleatorio(num1,num2);
		System.out.print("\nMultiplicacion: ");
		vectorMultiplicaAleatorio(num1,num2);
		System.out.print("\nVector combinado: ");
		vector=vectorCombinat(num1,num2);
		System.out.print("\nVector ordenado: ");
		ordenaVector(vector);
		System.out.print("\nNumero maximo del vector: ");
		buscaMaximo(vector);
		System.out.print("\nNumero minimo del vector: ");
		buscaMinimo(vector);
		System.out.print("\nNumeros primos del vector: ");
		buscaPrimos(vector);
	}
}