package burgerQueen;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import burgerQueen.BurgerQueen;


public class ExtraBebidas extends JFrame {
	
	// Colores personalizados
	private Color azul = new Color(20, 144, 236);
	private Color blanco = new Color(240, 240, 240);
	
	// Container
	private Container contentpane = getContentPane();
	
	// Panel
	private JPanel mainPanel = new JPanel();
	
	// Buttons
	private JRadioButton btnColaLight = new JRadioButton("Cola Light");
	private JRadioButton btnColaZero = new JRadioButton("Cola Zero");
	private JRadioButton btnColaZeroZero = new JRadioButton("Cola Zero Zero");
	private JRadioButton btnNaranjaZero = new JRadioButton("Naranja Zero");
	private JRadioButton btnLimonZero = new JRadioButton("Limon Zero");
	private JRadioButton btnNestea = new JRadioButton("Nestea");
	private JRadioButton btnNesteaSinAzucar = new JRadioButton("Nestea sin azucar");
	private JRadioButton btnAquariusZero = new JRadioButton("Aquarius Zero");
	private JRadioButton btnTrina = new JRadioButton("Trina");
	private JRadioButton btnCervezaSinAlcohol = new JRadioButton("Naranja Zero");
	private JRadioButton btnMonster = new JRadioButton("Limon Zero");
	
	public ExtraBebidas() {
		setTitle("Mas bebidas...");
		setVisible(false);
		setSize(370, 160);
		setLocationRelativeTo(null);
		setIconImage (new ImageIcon("bqueen.png").getImage());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setContentPane(contentpane);
		setResizable(false);
		
		// Definir panel
		mainPanel.add(btnAquariusZero);
		mainPanel.add(btnCervezaSinAlcohol);
		mainPanel.add(btnColaLight);
		mainPanel.add(btnColaZero);
		mainPanel.add(btnColaZeroZero);
		mainPanel.add(btnLimonZero);
		mainPanel.add(btnMonster);
		mainPanel.add(btnNaranjaZero);
		mainPanel.add(btnNestea);
		mainPanel.add(btnNesteaSinAzucar);
		mainPanel.add(btnTrina);
		mainPanel.setLayout(new FlowLayout());
		
		// Definir colores de fondo
		mainPanel.setBackground(azul);
		
		btnAquariusZero.setOpaque(false);
		btnCervezaSinAlcohol.setOpaque(false);
		btnColaLight.setOpaque(false);
		btnColaZero.setOpaque(false);
		btnColaZeroZero.setOpaque(false);
		btnLimonZero.setOpaque(false);
		btnMonster.setOpaque(false);
		btnNaranjaZero.setOpaque(false);
		btnNestea.setOpaque(false);
		btnNesteaSinAzucar.setOpaque(false);
		btnTrina.setOpaque(false);
		
		//Cambiar color de la fuente
		btnAquariusZero.setForeground(blanco);
		btnCervezaSinAlcohol.setForeground(blanco);
		btnColaLight.setForeground(blanco);
		btnColaZero.setForeground(blanco);
		btnColaZeroZero.setForeground(blanco);
		btnLimonZero.setForeground(blanco);
		btnMonster.setForeground(blanco);
		btnNaranjaZero.setForeground(blanco);
		btnNestea.setForeground(blanco);
		btnNesteaSinAzucar.setForeground(blanco);
		btnTrina.setForeground(blanco);
		
		// Anadir botones a ButtoGroup
		BurgerQueen.bgpBebida.add(btnAquariusZero);
		BurgerQueen.bgpBebida.add(btnCervezaSinAlcohol);
		BurgerQueen.bgpBebida.add(btnColaLight);
		BurgerQueen.bgpBebida.add(btnColaZero);
		BurgerQueen.bgpBebida.add(btnColaZeroZero);
		BurgerQueen.bgpBebida.add(btnLimonZero);
		BurgerQueen.bgpBebida.add(btnMonster);
		BurgerQueen.bgpBebida.add(btnNaranjaZero);
		BurgerQueen.bgpBebida.add(btnNestea);
		BurgerQueen.bgpBebida.add(btnNesteaSinAzucar);
		BurgerQueen.bgpBebida.add(btnTrina);

		// Anadir panel a contentpane
		contentpane.add(mainPanel);
	}
	
	public static void main(String[] args) {
		try {
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					new ExtraBebidas();
				}
			});
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	} // main
}
