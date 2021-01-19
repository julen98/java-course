package ejercicioD3;

public class Rectangulo {
	
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	public Rectangulo(int x1, int y1, int x2, int y2) {
		
		if((x1 < x2) && (y1 < y2)) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		}else {
			System.err.println("ERROR al instanciar Rectangulo...");
		}
	}
	
	public int getX1 () {
		return x1;
	}
	
	public int getY1 () {
		return y1;
	}
	
	public int getX2 () {
		return x2;
	}
	
	public int getY2 () {
		return y2;
	}
	
	public void setX1(int X1) {
		if(x1 < x2) {
			this.x1 = X1;
		}else {
			System.err.println("ERROR al instanciar Rectangulo...");
		}
	}
	
	public void setY1(int Y1) {
		if(y1 < y2) {
			this.y1 = Y1;
		}else {
			System.err.println("ERROR al instanciar Rectangulo...");
		}
	}
	
	public void setX2(int X2) {
		if(x1 < x2) {
			this.x2 = X2;
		}else {
			System.err.println("ERROR al instanciar Rectangulo...");
		}
	}
	
	public void setY2(int Y2) {
		if(y1 < y2) {
			this.y2 = Y2;
		}else {
			System.err.println("ERROR al instanciar Rectangulo...");
		}
	}
	
	public void imprimir() {
		System.out.println("X1: "+x1+" Y1: "+y1+" X2: "+x2+" Y2: "+y2);
	}
	
	public double perimetro() {
        int lado1 = Math.abs(x1 - x2);
        int lado2 = Math.abs(y1 - y2);

        return (lado1 + lado2) * 2;
    }

    public double area() {
        int lado1 = Math.abs(x1 - y2);
        int lado2 = Math.abs(x1 - y2);

        return lado1 * lado2;
    }
}
