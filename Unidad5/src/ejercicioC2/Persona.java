package ejercicioC2;

public class Persona {
	private String DNI;
	private String nombre;
	private String apellidos;
	private int edad;

	public Persona(int edad, String nombre, String apellidos, String DNI) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.DNI = DNI;
		}
	
	public int getEdad() {
		return edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public String getDNI() {
		return DNI;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
}
