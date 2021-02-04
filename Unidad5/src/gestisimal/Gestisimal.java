package gestisimal;

public class Gestisimal {
	private String codigo = "LIBRE";
	private String descripcion;
	private double precioCompra;
	private double precioVenta;
	private int stock;
	
	public Gestisimal(){
		
	}
	
	/*public Gestisimal(String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}*/
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public double getPrecioCompra() {
		return precioCompra;
	}
	
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	
	public double getPrecioVenta() {
		return precioVenta;
	}
	
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	public String toString() {
		String cadena = "--------------------------------------";
		cadena += "\nCodigo: " + this.codigo;
		cadena += "\nCodigo: " + this.descripcion;
		cadena += "\nCodigo: " + this.precioCompra;
		cadena += "\nCodigo: " + this.precioVenta;
		cadena += "\nCodigo: " + this.stock + " unidades";
		cadena += "\n--------------------------------------";
		return cadena;
	}
	
}
