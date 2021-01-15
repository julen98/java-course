package pruebas;
import java.awt.*;
import java.util.Scanner;

public class Prueba1 extends Frame{
	
	//Defino tres botones
	
	private Button b1,b2,b3;
	
	public Prueba1() {
		//Constructor padre, titulo Ventana
		
		super("Esta es la ventana 1");
		
		//Layout que va a tener la ventana
		
		setLayout(new FlowLayout());
		
		//Instanciar botones y agregarlos
		
		b1=new Button("Boton 1");
		add(b1);
		b2=new Button("Boton 2");
		add(b2);
		b3=new Button("Boton 3");
		add(b3);
		
		//Definir tamaño ventana y hacerlo visible
		
		setSize (600,300);
		setVisible(true);
	}
	
	public static void main(String[]args) {
		Prueba1 v1=new Prueba1();
	}
}
