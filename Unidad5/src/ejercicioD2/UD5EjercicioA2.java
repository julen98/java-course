package ejercicioD2;

public class UD5EjercicioA2 {
	public static void main (String[] args) {
	
	// Declaracion de objetos
	
	Persona persona1 = new Persona(43, "Pepe", "Martinez Viyuela", "222333111Q");
	Persona persona2 = new Persona(31, "Maria", "Perez Gonzalez", "333444555W");
	
	// Mostrar por pantalla
	
	if(persona1.esMayorEdad() == true) {
		persona1.imprime();
		System.out.print(" es mayor de edad.\n");	
	}else {
		persona1.imprime();
		System.out.print(" no es mayor de edad.\n");	
	}
	
	if(persona2.esMayorEdad() == true) {
		persona2.imprime();
		System.out.println(" es mayor de edad.\n");	
	}else {
		persona2.imprime();
		System.out.println(" no es mayor de edad.\n");	
	}
	
	System.out.println("La diferencia de edad entre "+persona1.getNombre()+" y "+persona2.getNombre()+" es: "+persona1.diferenciaEdad(persona2));
	System.out.println("\n-----------------------------------------------------------------------\n");

	// Modificar valores atributos
	
	persona1.setEdad(13);
	persona1.setDNI("20030040Y");
	persona1.setNombre("Pedro");
	persona1.setApellidos("Viyuela Perez");
	persona2.setEdad(85);
	persona1.setDNI("22285077P");
	persona1.setNombre("Lucia");
	persona1.setApellidos("Velez Alvarez");
	
	// Mostrar por pantalla
	
	if(persona1.esJubilado() == true) {
		persona1.imprime();
		System.out.print(" está jubilado/a.\n");	
	}else {
		
	if(persona1.esMayorEdad() == true) {
		persona1.imprime();
		System.out.print(" es mayor de edad.\n");	
	}else {
		persona1.imprime();
		System.out.print(" no es mayor de edad.\n");	
	}
	}
	if(persona2.esJubilado() == true) {
		persona2.imprime();
		System.out.print(" está jubilado/a.\n");	
	}else {
		
	if(persona2.esMayorEdad() == true) {
		persona2.imprime();
		System.out.println(" es mayor de edad.\n");	
	}else {
		persona2.imprime();
		System.out.println(" no es mayor de edad.\n");	
	}
	}
	System.out.println("La diferencia de edad entre "+persona1.getNombre()+" y "+persona2.getNombre()+" es: "+persona1.diferenciaEdad(persona2));
	}
	
}