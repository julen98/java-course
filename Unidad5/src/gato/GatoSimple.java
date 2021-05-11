package gato;

public class GatoSimple {
	String color;
	String raza;
	int edad;
	String sexo;
	double peso;
	String nombre;
	
	public GatoSimple() {
	}
	
	public GatoSimple(String sexo, String nombre) {
		if(sexo == "Macho" || sexo == "Hembra")
			this.sexo = sexo;
		else {
			this.sexo = "INCORRECTO";
			System.out.println("El sexo que has introducido no es correcto");
		}
		this.nombre = nombre;
	}

	public GatoSimple(String color, String raza, int edad, String sexo, double peso, String nombre) {
		this.color = color;
		this.raza = raza;
		this.edad = edad;
		if(sexo == "Macho" || sexo == "Hembra")
			this.sexo = sexo;
		else {
			this.sexo = "INCORRECTO";
			System.out.println("El sexo que has introducido no es correcto");
		}
		this.peso = peso;
		this.nombre = nombre;
	}
	
	
	
	public String getColor() {
		return color;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setRaza(String raza) {
		this.raza= raza;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setSexo(String sexo) {
		if(sexo == "Macho" || sexo == "Hembra")
			this.sexo = sexo;
		else {
			this.sexo = "INCORRECTO";
			System.out.println("El sexo que has introducido no es correcto");
		}
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setAll(String color, String raza, int edad, String sexo, double peso, String nombre) {
		this.color = color;
		this.raza = raza;
		this.edad = edad;
		if(sexo == "Macho" || sexo == "Hembra")
			this.sexo = sexo;
		else {
			this.sexo = "INCORRECTO";
			System.out.println("El sexo que has introducido no es correcto");
		}
		this.peso = peso;
		this.nombre = nombre;
	}
	
	public void come(String comida) {
		if(comida == "pescado")
			System.out.println("\n" + this.nombre + " esta comiendo " + comida + ".");
		else
			System.out.println("\n" + this.nombre + " no esta comiendo " + comida + " porque no le gusta, solo come pescado.");
	}
	
	public void pelea(GatoSimple rival) {
		if(this.sexo == "Macho" && rival.sexo == "Macho")
			System.out.println("\n" + this.nombre + " se esta peleando con " + rival.nombre + " para disputarse a la hembra.");
		else
			System.out.println("\n" + this.nombre + " y " + rival.nombre + " no se pelean porque no son machos los dos");
	}
	
	public void maulla() {
		System.out.println("\n" + this.nombre + ": Miaaaaaaauuu");
	}
	
	public void ronronea() {
		System.out.println("\n" + this.nombre + ": Purr, purrr");
		
	}
	
	public String toString() {
		String cadena = "--------------------------------------";
		cadena += "\nNombre:\t " + this.nombre;
		cadena += "\nSexo:\t " + this.sexo;
		cadena += "\nRaza:\t " + this.raza;
		cadena += "\nPeso:\t " + this.peso + "kg";
		cadena += "\nEdad:\t " + this.edad + " año/s";
		cadena += "\nColor:\t " + this.color;
		cadena += "\n--------------------------------------";
		return cadena;
	}
	
}
