package burgerQueen;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class BurgerQueen extends JFrame implements ActionListener {
	
	// Colores personalizados
	private Color azul = new Color(0, 128, 255);
	private Color naranja = new Color(255, 137, 0);
	
	// Containers
	private Container contentpane = getContentPane();
	
	// Panels
	private JPanel mainPanel = new JPanel();
	private JPanel panel = new JPanel();
	
	// Labels
	private JLabel lblTitulo = new JLabel("Menu Basico (8 €):");
	private JLabel lblKetchup = new JLabel("Ketchup");
	private JLabel lblMostaza = new JLabel("Mostaza");
	private JLabel lblBBQ = new JLabel("Barbacoa");
	private JLabel lblThai = new JLabel("Thai");
	private JLabel lblPrecio = new JLabel ("Precio:");
	private JLabel lblIVA = new JLabel ("IVA (21%):");
	private JLabel lvlPVP = new JLabel ("P.V.P:");
	
	// Borders
	private Border bdrAzul = BorderFactory.createLineBorder(azul, 2);
	private Border bdrTitulo = BorderFactory.createLineBorder(azul, 2);
	private Border bdrHamburguesa = BorderFactory.createTitledBorder(bdrAzul, "Hamburguesas");
	private Border bdrPan = BorderFactory.createLineBorder(azul, 2);
	private Border bdrPatatas = BorderFactory.createLineBorder(azul, 2);
	private Border bdrBebida = BorderFactory.createLineBorder(azul, 2);
	private Border bdrExtra = BorderFactory.createLineBorder(azul, 2);
	private Border bdrSalsas = BorderFactory.createLineBorder(azul, 2);
	private JPanel radioPanel = new JPanel();
	
	// TextFields
	private JTextField txtPrecio = new JTextField();
	private JTextField txtIVA = new JTextField();
	private JTextField txtPVP = new JTextField();
	
	// Botones
	private JRadioButton btnPollo = new JRadioButton("Pollo");
	private JRadioButton btnCerdo = new JRadioButton("Cerdo");
	private JRadioButton btnTernera = new JRadioButton("Ternera (+1€)");
	private JRadioButton btnVegana = new JRadioButton("Vegana (+1€)");
	private ButtonGroup bgpHamburguesa = new ButtonGroup();
	private JRadioButton btnNormal = new JRadioButton("Normal");
	private JRadioButton btnIntegral = new JRadioButton("Integral");
	private JRadioButton btnCenteno = new JRadioButton("Centeno");
	private ButtonGroup bgpPan = new ButtonGroup();
	private JRadioButton btnFritas = new JRadioButton("Fritas");
	private JRadioButton btnGajo = new JRadioButton("Gajo");
	private JRadioButton btnCaseras = new JRadioButton("Caseras (+1€)");
	private ButtonGroup bgpPatatas = new ButtonGroup();
	private JRadioButton btnCola = new JRadioButton("Cola");
	private JRadioButton btnNaranja = new JRadioButton("Naranja");
	private JRadioButton btnLimon = new JRadioButton("Limon");
	private JRadioButton btnAgua = new JRadioButton("Agua");
	private JRadioButton btnCerveza = new JRadioButton("Cerveza");
	private ButtonGroup bgpBebidas = new ButtonGroup();
	private JRadioButton btnLlevar = new JRadioButton("Reparto a domicilio");
	private JRadioButton btnRecoger = new JRadioButton("Recodiga en local (-20% dto.)");
	private JButton btnCalcular = new JButton("CALCULAR");
	
	// Menu
	private JMenu menu;
	private JMenuBar bar;
	private JMenuItem noche, dia;
	
	// CheckBoxes
	private JCheckBox chkdoble = new JCheckBox ("Hamburguesa doble (+2€)");
	private JCheckBox chkQueso = new JCheckBox ("Extra de queso (+0,50€)");
	private JCheckBox chkPatatas = new JCheckBox ("Extra de patatas (+1€)");
	
	// Spinners
	private JSpinner spnKetchup = new JSpinner();
	private JSpinner spnMostaza = new JSpinner();
	private JSpinner spnBBQ = new JSpinner();
	private JSpinner spnThai = new JSpinner();
	
	public BurgerQueen() {
		
		/* Hago la ventana visible, defino el tamano, la posicion, el icono y la 
		 * operacion por defecto de la ventana al cerrarla.
		 */
		setTitle("Burger Queen APP");
		setVisible(true);
		setSize(500, 700);
		setLocationRelativeTo(null);
		setIconImage (new ImageIcon("bqueen.png").getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentpane);
		
		// Llamo al metodo panel
		panel();
		
		// Defino los botones
		
		btnPollo.setBounds(50, 50, 120, 30);
		btnCerdo.setBounds(50, 75, 120, 30);
		btnTernera.setBounds(50, 100, 120, 30);
		btnVegana.setBounds(50, 125, 120, 30);
		bgpHamburguesa.add(btnPollo);
		bgpHamburguesa.add(btnCerdo);
		bgpHamburguesa.add(btnTernera);
		bgpHamburguesa.add(btnVegana);
		mainPanel.setLayout(null);
		radioPanel.setBounds(50, 50, 150, 150);
		radioPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		radioPanel.add(btnPollo);
		radioPanel.add(btnCerdo);
		radioPanel.add(btnTernera);
		radioPanel.add(btnVegana);
		radioPanel.setBorder(bdrHamburguesa);
		
		// Anado el panel al container
		mainPanel.add(radioPanel);
		contentpane.add(mainPanel);
		contentpane.setVisible(true);
		
	} // constructor

	private void panel() {
		// Definimos el layout del panel y anadimos todos los componentes
		panel.setLayout(null);
		panel.setVisible(true);
		
		// Anadir botones
		panel.add(btnNormal);
		panel.add(btnIntegral);
		panel.add(btnCenteno);
		panel.add(btnFritas);
		panel.add(btnGajo);
		panel.add(btnCaseras);
		panel.add(btnCola);
		panel.add(btnNaranja);
		panel.add(btnLimon);
		panel.add(btnAgua);
		panel.add(btnCerveza);
		panel.add(btnLlevar);
		panel.add(btnRecoger);
		panel.add(btnCalcular);
		
		// Anadir labels
		panel.add(lblTitulo);
		panel.add(lblKetchup);
		panel.add(lblMostaza);
		panel.add(lblBBQ);
		panel.add(lblThai);
		panel.add(lblPrecio);
		panel.add(lblIVA);
		panel.add(lvlPVP);
		
		// Anadir textfields
		panel.add(txtPrecio);
		panel.add(txtIVA);
		panel.add(txtPVP);
		
		// Anadir checkboxes
		panel.add(chkdoble);
		panel.add(chkQueso);
		panel.add(chkPatatas);
		
		// Anadir spinners
		panel.add(spnKetchup);
		panel.add(spnMostaza);
		panel.add(spnBBQ);
		panel.add(spnThai);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	} // actionlistener
	
	public static void main(String[] args) {
		try {
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					new BurgerQueen();
				}
			});
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	} // main
} // class
