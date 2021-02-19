package mascotas;

public class Gato extends Mascotas{
	String raza;
	boolean peloLargo;
	
	public Gato(String nombre, int edad, String estado, String fechaNacimiento, String raza, boolean peloLargo) {
		super(nombre, edad, estado, fechaNacimiento);
		this.raza = raza;
		this.peloLargo = peloLargo;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public boolean isPeloLarga() {
		return peloLargo;
	}

	public void setPeloLargo(boolean peloLargo) {
		this.peloLargo = peloLargo;
	}
	
	@Override
	public String muestra() {
		String tostring;
		
		tostring = "--------------------------------------";
		tostring += "Nombre: " + nombre;
		tostring += "Edad: " + edad;
		tostring += "Estado" + estado;
		tostring += "Fecha de nacimiento" + fechaNacimiento;
		tostring += "Raza: " + raza;
		if(peloLargo=true)
			tostring += "Tiene peloLargo";
		else
			tostring += "No tiene peloLargo";
		tostring += "--------------------------------------";
		
		return tostring;
	}
	
	@Override
	public void habla() {
		System.out.println("Miauuuuuu!");
	}
	
}
