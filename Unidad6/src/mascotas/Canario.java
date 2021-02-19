package mascotas;

public class Canario extends Aves{
	String origen;
	boolean habla;
	
	public Canario(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela, String origen, boolean habla) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		this.origen = origen;
		this.habla = habla;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public boolean isHabla() {
		return habla;
	}
	public void setHabla(boolean habla) {
		this.habla = habla;
	}
	
	@Override
	public String muestra() {
		String tostring;
		
		tostring = "--------------------------------------";
		tostring += "Nombre: " + nombre;
		tostring += "Edad: " + edad;
		tostring += "Estado" + estado;
		tostring += "Fecha de nacimiento" + fechaNacimiento;
		tostring += "Origen: " + origen;
		if(habla=true)
			tostring += "Puede hablar";
		else
			tostring += "No puede hablar";
		tostring += "--------------------------------------";
		
		return tostring;
	}
	
	public void saluda() {
		System.out.println("Hola me llamo"+nombre);
	}
	
	@Override
	public void volar() {
		System.out.println("Sap, sap... sap, sap");
	}
}
