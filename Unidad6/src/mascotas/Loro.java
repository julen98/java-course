package mascotas;

public class Loro extends Aves{
	String color;
	boolean canta;
	
	public Loro(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela, String color, boolean canta) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		this.color = color;
		this.canta = canta;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isCanta() {
		return canta;
	}
	public void setCanta(boolean canta) {
		this.canta = canta;
	}
	
	@Override
	public String muestra() {
		String tostring;
		
		tostring = "--------------------------------------";
		tostring += "Nombre: " + nombre;
		tostring += "Edad: " + edad;
		tostring += "Estado" + estado;
		tostring += "Fecha de nacimiento" + fechaNacimiento;
		tostring += "Color: " + color;
		if(canta=true)
			tostring += "Puede cantar";
		else
			tostring += "No puede cantar";
		tostring += "--------------------------------------";
		
		return tostring;
	}
	
	public void habla() {
		System.out.println("Hola me llamo"+nombre);
	}
	
	@Override
	public void volar() {
		System.out.println("Sap, sap... sap, sap");
	}
}
