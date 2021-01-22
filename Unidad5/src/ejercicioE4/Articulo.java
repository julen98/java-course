package ejercicioE4;

public class Articulo {
	private String nombre;
	private double precio;
	private int iva;
	private int cuantosQuedan;
	private int ivaGeneral=21;
	private int ivaReducido=10;
	private int ivaSuperReducido=4;
	private String tipoArticulo;
	
	public Articulo(String nombre, double precio, int cuantosQuedan, String tipoArticulo){
		
	// Condicional para que el nombre solo tenga letras
		
		if(isAlpha(nombre) == true) {
			this.nombre = nombre;
		}else {
			this.nombre = "incorrecto";
			System.err.println("El nombre es incorrecto, solo puede contener letras.");
		}
		
		if(isAlpha(tipoArticulo) == true) {
			this.tipoArticulo = tipoArticulo;
		}else {
			this.tipoArticulo = "incorrecto";
			System.err.println("El nombre del articulo es incorrecto, solo puede contener letras.");
		}
		
		if(precio >= 0) {
			this.precio = precio;
		}else {
			this.precio = 0;
			System.err.println("El precio es inferior a 0.");
		}
		
			this.iva = IVANecesario();
		
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
	
	public String getTipoArticulo() {
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
	
	public void setTipoArticulo(String tipoArticulo) {
		
		if(isAlpha(tipoArticulo) == true) {
			this.tipoArticulo = tipoArticulo;
		}else {
			this.tipoArticulo = "incorrecto";
			System.err.println("El nombre del articulo es incorrecto, solo puede contener letras.");
		}
	}
	
	public boolean isAlpha(String nombre) {
	    
		return nombre.matches("^[ A-Za-z]+$");
	}
	
	public void imprimir() {
		System.out.println(this.nombre+" - Precio: "+this.precio+"€ - "+"IVA: "+this.iva+"% - "+"PVP: "+getPVP()+"€ - Quedan: "+this.cuantosQuedan);
	}
	
	public double getPVP () {
		
		double PVP = 0;
		
		PVP = this.precio + (this.precio * this.iva) / 100;
		
		return PVP;
	}
	
	public double getPVPDescuento(double descuento) {
		
		double precio = getPVP();
		
		precio = precio - ((precio * descuento) / 100);
		
		return precio;
	}
	
	public boolean vender(int cuantosQuedan) {
		
		boolean actualizar = false;
		
		if(cuantosQuedan < this.cuantosQuedan) {
			this.cuantosQuedan = this.cuantosQuedan - cuantosQuedan;
			actualizar = true;
		}else {
			actualizar = false;
		}
		return actualizar;
	}
	
	public boolean almacenar(int cuantosQuedan) {
		
		boolean actualizar = false;
		
		if((cuantosQuedan + this.cuantosQuedan) > 0) {
			this.cuantosQuedan = this.cuantosQuedan + cuantosQuedan;
			actualizar = true;
		}else {
			actualizar = false;
		}
		return actualizar;
	}
	
	public int IVANecesario() {
		
		int necesario=0;
		
		if(tipoArticulo=="Necesidad Basica")
			necesario=ivaSuperReducido;
		if(tipoArticulo=="Ocio y Vivienda")
			necesario=ivaReducido;
		if(tipoArticulo=="Comun")
			necesario=ivaGeneral;
		
		return necesario;
	}
	
}
