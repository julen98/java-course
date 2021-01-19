package ejercicioD1;

public class Punto {
	
	private int X;
	private int Y;
	
	public Punto(int x, int y) {
		this.X = x;
		this.Y = y;
	}
	
	public int getX () {
		return X;
	}
	
	public int getY () {
		return Y;
	}
	
	public void setXY(int X, int Y) {
		this.X = X;
		this.Y = Y;
	}
	
	public void imprime() {
		System.out.println("("+X+","+Y+")");
	}
	
	public void desplaza(int dx, int dy) {
		X = X + dx;
		Y = Y + dy;
	}
	
	public int distancia(Punto p) {
		
		int distancia = (this.X + this.Y) - (p.X + p.Y);
		
		return Math.abs(distancia);
	}
}
