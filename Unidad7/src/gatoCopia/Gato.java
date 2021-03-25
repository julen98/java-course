package gatoCopia;

public class Gato {
	private String nombre;
	private int edad;
	
	public Gato(String nombre, int edad) throws Exception {
		String pattern = "^[A-Z][a-z]{2,}";
		try {
			if(nombre.matches(pattern)) {
				this.nombre = nombre;
			} else {
				throw new Exception("El nombre debe empezar por mayuscula, no contener numeros y tener un minimo de 3 letras");
			}
			if(edad >= 0) {
				this.edad = edad;
			} else {
				throw new Exception("La edad no puede ser negativa");
			}
		}
		
		catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		String pattern = "[a-zA-Z]{3,}";
		try {
			if(nombre.matches(pattern)) {
				this.nombre = nombre;
			} else {
				throw new Exception("El nombre debe empezar por mayuscula, no contener numeros y tener un minimo de 3 letras");
			}
		}
		
		catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		try {
			if(edad >= 0) {
				this.edad = edad;
			} else {
				throw new Exception("La edad no puede ser negativa");
			}
		}
		
		catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
	
	public void imprimir() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}
}
