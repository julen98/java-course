package ejerciciosUD3;
import java.util.Scanner;
import java.util.Arrays;


public class EjemploArrays {

	static public void main(String[] args) {
		
	int vector[] =new int[10];
	int vectorCopia[]=new int[10];
	int vectorCopia2[]=new int[10];
	int vectorInvers[]=new int[10];
	
	
	int vectorElement[]=new int[10];
	int vectorElement2[]=new int[10];
	
	System.out.println(" \n\n\n ******************************* ");
	System.out.println(" *** CREACIÓ VECTOR ALEATÒRI *** ");
	System.out.println(" *******************************\n\n\n ");
	
	for(int i=0;i<vector.length;i++)
	{
		vector[i]= (int) (Math.random()*11+0);
		System.out.println(" vector["+i+"] = "+ vector[i] + " ");		
	}
	
	System.out.println("\n\n\n ******************************* ");
	System.out.println(" ****** CÔPIA D'UN VECTOR ****** ");
	System.out.println(" *******************************\n\n\n ");
	
	//Còpia de vector dins d'un altre vector "MANUAL"
	
	for (int i=0;i<vector.length;i++)
	{
		vectorCopia[i]=vector[i];
		System.out.println(" vector["+i+"] = "+ vector[i] + " -- vectorCopia["+i+"] = "+ vectorCopia[i]);
		
	}
	
	//Còpia de vector dins d'un altre vector amb ARRAYCOPY"
	// System.arracopy(vector_origen, posició_inici_vector_origen, vector_desti, posició_inici_vector_desti, length (número d'elements a copiar );

	
	System.arraycopy(vector,0,vectorCopia2,0,vector.length);
	
	// Mostrem per pantalla vector i vectorCopia2
	System.out.println("\nMostrem per pantalla vector i vectorCopia2\n");
	
	for (int i=0;i<vector.length;i++)
	{
		System.out.println(" vector["+i+"] = "+ vector[i] + " -- vectorCopia2["+i+"] = "+ vectorCopia2[i]);
		
	}
	
	
	System.out.println("\n\n\n ********************* ");
	System.out.println(" *** CÒPIA INVERSA *** ");
	System.out.println(" *********************\n\n\n ");
	
	//Còpia d'un vector dins d'un altre, però a l'inversa
	
	int comptadorInvers = vector.length-1;

	for (int i=0;i<vector.length;i++)
	{
		
		vectorInvers[comptadorInvers]=vector[i];
		comptadorInvers--;
		
	}	
	
	// mostrem els dos vectors l'ú baix l'altre
	
	for (int i=0;i<vector.length;i++)
		System.out.print(" vector["+i+"] = "+ vector[i] );
	
	System.out.println();
	
	for(int i=0;i<vectorInvers.length;i++)
		System.out.print(" Invers["+i+"] = "+ vectorInvers[i]);
	
	
	
	System.out.println("\n\n\n ************************************************ ");
	System.out.println(" *** COMPROVAR SI DOS VECTORS SÓN IGUALS O NO *** ");
	System.out.println(" ************************************************\n\n\n ");
	
	if(Arrays.equals(vector, vectorCopia)==true)
		System.out.println(" vector i vectorCopia són IGUALS");
		else System.out.println(" vector i vectorCopia són DISTINTS");
	
	
	if(Arrays.equals(vector, vectorInvers)==true)
		System.out.println(" vector i vectorInvers són IGUALS");
		else System.out.println(" vector i vectorInvers són DISTINTS");
	
	
	System.out.println("\n\n\n ****************************************************** ");
	System.out.println(" *** Omplir un vector amb un mateix valor (FILL) ****** ");
	System.out.println(" ******************************************************\n\n\n ");
	
	
		// Amb un for
	
	for(int i=0;i<vectorElement.length;i++)
		vectorElement[i]=22;
	
		// Amb la funció fill
	
	Arrays.fill(vectorElement2, 22);
	
	// Llistem els dos vectors
	
	
	for (int i=0;i<vectorElement.length;i++)
	{
		System.out.println(" vectorElement["+i+"] = "+ vectorElement[i] + " -- vectorElement2["+i+"] = "+ vectorElement2[i]);
		
	}
	
	System.out.println("\n\n");
	
	
	// Arrays.fill també permet des de quina posició inicial a quina posició final volem emplenar el vector
	//Arrays.fill(vector,posició_inicial,posició_final,valor a copiar, en este cas de la posició 4 a la 7 (8-1)
	
	Arrays.fill(vectorElement2,4,8,33333333);
	
	for (int i=0;i<vectorElement.length;i++)
	{
		System.out.println(" vectorElement["+i+"] = "+ vectorElement[i] + " -- vectorElement2["+i+"] = "+ vectorElement2[i]);
		
	}
	
	System.out.println("\n\n\n ********************************** ");
	System.out.println(" *** Ordenar un vector amb SORT *** ");
	System.out.println(" **********************************\n\n\n ");
	
	Arrays.sort(vector); //ordena tot el vector
	Arrays.sort(vectorCopia,4,8); //ordena el vector des de la posició 4 a la 7
	
	for (int i=0;i<vector.length;i++)
	{
		System.out.println(" vector["+i+"] = "+ vector[i] + " -- vectorCopia["+i+"] = "+ vectorCopia[i]);
		
	}
	
	System.out.println("\n\n\n ********************************************** ");
	System.out.println(" *** Cercar un element en un vector ordenat *** ");
	System.out.println(" **********************************************\n\n\n ");
	
	
	int valor=0;
	
	Arrays.fill(vector,4,5,6); // m'assegure de que el vector tindrà un 6
	Arrays.sort(vector); //ordena tot el vector
	
	
	valor=Arrays.binarySearch(vector,6); // busque dins del vector un 6
	
	for (int i=0;i<vector.length;i++)
		System.out.println(" vector["+i+"] = "+ vector[i]);
	System.out.println("el element a buscar està a la possició: "+ valor+ " i el seu contingut és vector["+valor+"] = "+vector[valor]);
	
	}
}