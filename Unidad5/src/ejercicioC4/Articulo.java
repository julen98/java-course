package ejercicioC4;

public class Articulo {
	private String nombre;
	private double precio;
	private int iva;
	private int cuantosQuedan;
	
	public Articulo(String nombre, double precio, int iva, int cuantosQuedan){
		
	// Condicional para que el nombre solo tenga letras
		
		if(isAlpha(nombre) == true) {
			this.nombre = nombre;
		}else {
			this.nombre = "incorrecto";
			System.err.println("El nombre es incorrecto, solo puede contener letras.");
		}
		
		if(precio >= 0) {
			this.precio = precio;
		}else {
			this.precio = 0;
			System.err.println("El precio es inferior a 0.");
		}
		
		if(iva == 21) {
			this.iva = iva;
		}else {
			this.iva = 0;
			System.err.println("El IVA es incorrecto.");
		}
		
		if(cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}else {
			this.cuantosQuedan = 0;
			System.err.println("El numero de articulos que quedan es inferior a 0.");
		}
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public int getIVA() {
		return iva;
	}
	
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPrecio(double precio) {
		if(precio >= 0) {
			this.precio = precio;
		}else {
			this.precio = 0;
			System.err.println("El precio es inferior a 0.");
		}
	}
	
	public void setIVA(int iva) {
		if(iva == 21) {
			this.iva = iva;
		}else {
			this.iva = 0;
			System.err.println("El IVA es incorrecto.");
		}
	}
	
	public void setCuantosQuedan(int cuantosQuedan) {
		if(cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}else {
			this.cuantosQuedan = 0;
			System.err.println("El numero de articulos que quedan es inferior a 0.");
		}
	}
	
	public void setNombre(String nombre) {
		if(isAlpha(nombre) == true) {
			this.nombre = nombre;
		}else {
			this.nombre = "incorrecto";
			System.err.println("El nombre es incorrecto, solo puede contener letras.");
		}
	}
	
	public boolean isAlpha(String nombre) {
	    return nombre.matches("^[ A-Za-z]+$");
	}
}
