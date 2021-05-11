package ejerciciosUD3;
public class NumPares {
	public static void main(String[] args) {
		
		//Declaracion
		int num[];
		int par;
		int auxiliar=1;
		
		//Constructor
		num = new int[100];
		
		//Ejecucion
		 for (int i=0;i<num.length;i++) {
				 par=auxiliar*2;
				 num[i]=par;
				 System.out.print(num[i]+" ");
				 auxiliar++;
				 }
		 }
}