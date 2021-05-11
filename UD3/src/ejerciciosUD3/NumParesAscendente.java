package ejerciciosUD3;
public class NumParesAscendente {
	public static void main(String[] args) {
		
		//Declaracion
		int num[];
		int copia[];
		int par;
		int auxiliar=1;
		
		//Constructor
		num = new int[100];
		copia = new int[100];
		
		//Ejecucion
		 for (int i=0;i<num.length;i++) {
				 par=auxiliar*2;
				 num[i]=par;
				 auxiliar++;
				 }
		 int j=num.length-1;
		 for (int i=0;i<100;i++) {
			 copia[i]=num[j];
			 j--;
			 System.out.print(copia[i]+" ");
		 }
		 }
}