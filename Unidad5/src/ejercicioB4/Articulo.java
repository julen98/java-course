package ejercicioB4;

public class Articulo {
	String nombre;
	double precio;
	int iva;
	int cuantosQuedan;
	
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
	
	public boolean isAlpha(String nombre) {
	    return nombre.matches("^[ A-Za-z]+$");
	}
}
