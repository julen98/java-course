package ejercicioE3;

import ejercicioE1.Punto;

public class Rectangulo {
	
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int min=0;
	private int max=100;
	
	public Rectangulo(int x1, int y1, int x2, int y2) {
		
		if((x1 < x2) && (y1 < y2)) {
			if((x1 > min) && (x1 < max)) 
				this.x1 = x1;
			else
				System.err.println("ERROR al instanciar Rectangulo...");
			if(x2 > min && x2 < max) 
				this.x2 = x2;
			else
				System.err.println("ERROR al instanciar Rectangulo...");
			if(y1 > min && y1 < max) 
				this.y1 = y1;
			else
				System.err.println("ERROR al instanciar Rectangulo...");
			if(y2 > min && y2 < max) 
				this.y2 = y2;
			else
				System.err.println("ERROR al instanciar Rectangulo...");
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
	
	public void setX1Y1(int X1, int Y1) {
		if(x1 < x2) {
			if((x1 > min) && (x1 < max)) 
				this.x1 = X1;
			else
				System.err.println("ERROR al instanciar Rectangulo...");
		}
		if(y1 < y2) {
			if((y1 > min) && (y1 < max)) 
				this.y1 = Y1;
			else
				System.err.println("ERROR al instanciar Rectangulo...");
		}
	}
	
	public void setX2Y2(int X2, int Y2) {
		if(x1 < x2) {
			if((x2 > min) && (x2 < max)) 
				this.x2 = X2;
			else
				System.err.println("ERROR al instanciar Rectangulo...");
		}
		if(y1 < y2) {
			if((y2 > min) && (y2 < max)) 
				this.y2 = Y2;
			else
				System.err.println("ERROR al instanciar Rectangulo...");
		}
	}
	
	public void setAll(int X1, int Y1, int X2, int Y2) {
		
		if((x1 < x2) && (y1 < y2)) {
			if((x1 > min) && (x1 < max)) 
				this.x1 = X1;
			else
				System.err.println("ERROR al instanciar Rectangulo...");
			if(x2 > min && x2 < max) 
				this.x2 = X2;
			else
				System.err.println("ERROR al instanciar Rectangulo...");
			if(y1 > min && y1 < max) 
				this.y1 = Y1;
			else
				System.err.println("ERROR al instanciar Rectangulo...");
			if(y2 > min && y2 < max) 
				this.y2 = Y2;
			else
				System.err.println("ERROR al instanciar Rectangulo...");
		}else {
			System.err.println("ERROR al instanciar Rectangulo...");
		}
	}
	
	public void imprimir() {
		System.out.println("X1: "+x1+" Y1: "+y1+" X2: "+x2+" Y2: "+y2);
	}
	
	public double getPerimetro() {
        int lado1 = Math.abs(x1 - x2);
        int lado2 = Math.abs(y1 - y2);

        return (lado1 + lado2) * 2;
    }

    public double getArea() {
        int lado1 = Math.abs(x1 - y2);
        int lado2 = Math.abs(x1 - y2);

        return lado1 * lado2;
    }
    
    public Rectangulo creaRectAleatorio() {
    	
    	x1 = (int)Math.floor(Math.random() * (max - min)) + min;
		y1 = (int)Math.floor(Math.random() * (max - min)) + min;
		x2 = (int)Math.floor(Math.random() * (max - min)) + min;
		y2 = (int)Math.floor(Math.random() * (max - min)) + min;
		
		Rectangulo aleatorio = new Rectangulo(x1, y1, x2, y2);
		
		return aleatorio;
	}
}
