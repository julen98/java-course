package ejercicioC2;

public class UD5EjercicioA2 {
	public static void main (String[] args) {
	
	// Declaracion de objetos
	
	Persona persona1 = new Persona(43, "Pepe", "Martinez Viyuela", "222333111Q");
	Persona persona2 = new Persona(31, "Maria", "Perez Gonzalez", "333444555W");
	
	// Condicionales para saber si es mayor de edad
	
	if(persona1.getEdad() >= 18) {
		System.out.println(persona1.getNombre()+" "+persona1.getApellidos()+" con DNI "+persona1.getDNI()+" es mayor de edad.");	
	}else {
		System.out.println(persona1.getNombre()+" "+persona1.getApellidos()+" con DNI "+persona1.getDNI()+" no es mayor de edad.");	
	}
	
	if(persona2.getEdad() >= 18) {
		System.out.println(persona2.getNombre()+" "+persona2.getApellidos()+" con DNI "+persona2.getDNI()+" es mayor de edad.");	
	}else {
		System.out.println(persona2.getNombre()+" "+persona2.getApellidos()+" con DNI "+persona2.getDNI()+" no es mayor de edad.");	
	}
	
	// Modificar valores atributos
	
	persona1.setEdad(13);
	persona1.setDNI("20030040Y");
	persona1.setNombre("Pedro");
	persona1.setApellidos("Viyuela Perez");
	persona2.setEdad(85);
	persona1.setDNI("22285077P");
	persona1.setNombre("Lucia");
	persona1.setApellidos("Velez Alvarez");
	
	// Condicionales para saber si es mayor de edad
	
	if(persona1.getEdad() >= 18) {
		System.out.println(persona1.getNombre()+" "+persona1.getApellidos()+" con DNI "+persona1.getDNI()+" es mayor de edad.");	
	}else {
		System.out.println(persona1.getNombre()+" "+persona1.getApellidos()+" con DNI "+persona1.getDNI()+" no es mayor de edad.");	
	}
	
	if(persona2.getEdad() >= 18) {
		System.out.println(persona2.getNombre()+" "+persona2.getApellidos()+" con DNI "+persona2.getDNI()+" es mayor de edad.");	
	}else {
		System.out.println(persona2.getNombre()+" "+persona2.getApellidos()+" con DNI "+persona2.getDNI()+" no es mayor de edad.");	
	}
	
	}
}
