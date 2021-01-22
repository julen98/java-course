package ejercicioE2;
import java.util.regex.Pattern;

public class Persona {
	final private String DNI;
	private String nombre;
	private String apellidos;
	private int edad;
	final static int mayoriaEdad = 10;
	
	public Persona(int edad, String nombre, String apellidos, String DNI) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		if (validarDNI(DNI)==true) {
			this.DNI = DNI;
			}else {
				this.DNI = "";
				System.err.println("El DNI no tiene un formato valido.");
			}
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
	
	public void imprime() {
		System.out.print(nombre+" "+apellidos+" con DNI "+DNI);
		}
	
	public boolean esMayorEdad() {
		
		boolean mayoria = false;
		
		if(edad >= mayoriaEdad)
			mayoria = true;
		else
			mayoria = false;
			
		return mayoria;
	}
	
	public boolean esJubilado() {
		
		boolean jubilacion = false;
		
		if(edad >= 65)
			jubilacion = true;
		else
			jubilacion = false;
			
		return jubilacion;
	}
	
	public int diferenciaEdad(Persona p) {
		
		int diferencia;
		
		diferencia = this.edad - p.edad;
		
		return Math.abs(diferencia);
	}
	
	static boolean validarDNI(String DNI) {
		String dniRegexp = "\\d{8}[A-HJ-NP-TV-Z]";
		return Pattern.matches(dniRegexp, DNI);
		}
	
}
