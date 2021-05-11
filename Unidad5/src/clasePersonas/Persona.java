package clasePersonas;

public class Persona {
	
		// Atributos o caracteristicas
		
		String nombre;
		String apellidos;
		int edad;
		float altura;
		char genero;
		float peso;
	
	public void caminar(){
		System.out.println("Estoy caminando");
	}
	
	public void comer(){
		System.out.println("Estoy comiendo");
	}
	
	public void dormir(){
		System.out.println("Estoy durmiendo");
	}
	
	public void correr(){
		System.out.println("Estoy corriendo");
	}
	
	public void listar(){
		System.out.println("Me llamo "+nombre+" "+apellidos+".");
		System.out.println("Tengo "+edad+" años.");
		System.out.println("Mido "+altura+" cm.");
		System.out.println("Mi genero es "+genero+".");
		System.out.println("Peso "+peso+" kg.");
	}
}
