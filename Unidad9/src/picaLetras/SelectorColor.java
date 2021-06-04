package picaLetras;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class SelectorColor extends JFrame {
	private static final long serialVersionUID = -5600521602399148184L;
	
	// Selector de color
    static JColorChooser colores = new JColorChooser();
	
	SelectorColor() {
		setTitle("Selecciona el color...");
        setVisible(false);
		setSize(650, 360);
		setLocationRelativeTo(null);
		setIconImage(new ImageIcon("writer.png").getImage());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
        add(colores, BorderLayout.PAGE_END);

	}
}
