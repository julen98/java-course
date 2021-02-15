package producto;


public class Producto {
	private String nombre;
	private int cantidad;
	
	public Producto() {
		this.nombre = null;
		this.cantidad = 0;
	}
	
	public Producto(String nombre, int cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
