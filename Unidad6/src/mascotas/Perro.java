package mascotas;

public class Perro extends Mascotas{
	String color;
	boolean pulgas;
	
	public Perro(String nombre, int edad, String estado, String fechaNacimiento, String color, boolean pulgas) {
		super(nombre, edad, estado, fechaNacimiento);
		this.color = color;
		this.pulgas = pulgas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPulgas() {
		return pulgas;
	}

	public void setPulgas(boolean pulgas) {
		this.pulgas = pulgas;
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
		if(pulgas=true)
			tostring += "Tiene pulgas";
		else
			tostring += "No tiene pulgas";
		tostring += "--------------------------------------";
		
		return tostring;
	}
	
	@Override
	public void habla() {
		System.out.println("Guau!");
	}
	
}
