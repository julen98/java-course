package calculadora;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import numeroComplejo.Complejo;


public class Calc extends JFrame implements ActionListener{
	
	private Container contentpane = getContentPane();
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel();
	private JTextField textfieldLeft = new JTextField();
	private JTextField textfieldRight = new JTextField();
	private JButton buttonMas = new JButton("+");
	private JButton buttonMenos = new JButton("-");
	private JButton buttonPor = new JButton("*");
	private JButton buttonEntre = new JButton("/");
	private ButtonGroup bgroup = new ButtonGroup();
	private double n1c1;
	private double n2c1;
	private double n1c2;
	private double n2c2;
	private Complejo c1 = new Complejo(n1c1, n2c1);
	private Complejo c2 = new Complejo(n1c2, n2c2);
	private Complejo c3;
	
	public Calc () {
		
		try {
		/* Hacemos la ventana visible, definimos el tamano, la posicion, el icono y la 
		 * operacion por defecto de la ventana al cerrarla.
		 */
		
		setTitle("Mini Calculadora");
		setSize(320, 220);
		setLocationRelativeTo(null);
		setIconImage (new ImageIcon("km mod.png").getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setContentPane(contentpane);
		
		// Definimos los TextField y el Label
		
		textfieldLeft.setBounds(25, 10, 100, 30);
		textfieldLeft.setVisible(true);
		textfieldLeft.setHorizontalAlignment(JTextField.CENTER);
		textfieldRight.setBounds(195, 10, 100, 30);
		textfieldRight.setVisible(true);
		textfieldRight.setHorizontalAlignment(JTextField.CENTER);
		label.setBounds(25, 140, 270, 30);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText("");
		label.setFont(new Font("Arial", Font.PLAIN, 16));
		
		// Anadimos borde al label
		
		Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
		label.setBorder(border);
		label.setVisible(true);
		
		// Definimos los botones como visibles y los colocamos
		
		buttonMas.setVisible(true);
		buttonMas.setBounds(25, 75, 45, 30);
		buttonMenos.setVisible(true);
		buttonMenos.setBounds(100, 75, 45, 30);
		buttonPor.setVisible(true);
		buttonPor.setBounds(175, 75, 45, 30);
		buttonEntre.setVisible(true);
		buttonEntre.setBounds(250, 75, 45, 30);
					
		// Agrupamos los botones
					
		bgroup.add(buttonMas);
		bgroup.add(buttonMenos);
		bgroup.add(buttonPor);
		bgroup.add(buttonEntre);
		
		// Definimos el layout del panel y anadimos todos los componentes
		
		panel.setLayout(null);
		panel.setVisible(true);
		panel.add(buttonMas);
		panel.add(buttonMenos);
		panel.add(buttonPor);
		panel.add(buttonEntre);
		panel.add(textfieldLeft);
		panel.add(textfieldRight);
		panel.add(label);
		
		// Anadimos el panel al container
		
		contentpane.add(panel);
		contentpane.setVisible(true);
		
		// Definimos los Action Listener de cada boton
		
		buttonMas.addActionListener(this);
		buttonMenos.addActionListener(this);
		buttonPor.addActionListener(this);
		buttonEntre.addActionListener(this);

		} catch (Exception e) {
			System.out.println(e);
		}
	} // constructor
	
	public void actionPerformed (ActionEvent e) {
		
		// Metemos el contenido de los textField en las variables
    	
		try {
        	n1c1 = Double.parseDouble(textfieldLeft.getText());
    		n1c2 = Double.parseDouble(textfieldRight.getText());
        	
		// Dependiendo del boton que se ha pulsado se ejecuta una operacion diferente
		
				if (e.getSource() == buttonMas) {
				}
				if (e.getSource() == buttonMenos) {
				}
				if (e.getSource() == buttonPor) {
				}
				if (e.getSource() == buttonEntre) {
				}
		} catch (Exception ex) {
    		ex.printStackTrace();
    	}
	} // actionPerformed
	
	public static void main(String[] args) {
		try {
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					new Calc();
				}
			});
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	} // main
	
} // class
