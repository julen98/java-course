package u9;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class Window extends JFrame {
	
	public Window () {
		
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Dimension tamano = pantalla.getScreenSize();
		int alto = tamano.height;
		int ancho = tamano.width;
		setSize(ancho/3, alto/3);
		setTitle("Frame");
		setLocationRelativeTo(null);
		setResizable(false);
		setIconImage (new ImageIcon("km mod.png").getImage());
		
	}
	
	public static void main(String[] args) {
		 Window frame = new Window();
		 Dialog dialog = new Dialog();
		 
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 if(frame.isVisible()) {
		 dialog.setVisible(true);
		 dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		 dialog.toFront();
		 }
		 
	}
}
