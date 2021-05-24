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


public class Calc extends JFrame {
	
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
	double left;
	double right;
	double resultado;
	
	public Calc () {
		
		try {
		/* Hacemos la ventana visible, definimos el tamano, la posicion, el icono y la 
		 * operacion por defecto de la ventana al cerrarla.
		 */
		
		setTitle("Mini Calculadora");
		setSize(320, 220);
		setLocationRelativeTo(null);
		setIconImage (new ImageIcon("km mod.png").getImage());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
		// Definimos el ActionListener de cada uno de los botones de operaciones
		
		buttonMas.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
            	
            	// Metemos el contenido de los textField en las variables
            	
            	left = Double.parseDouble(textfieldLeft.getText());
        		right = Double.parseDouble(textfieldRight.getText());
        		
            	// Sumamos las variables y mostramos el resultado en la label
        		
        		resultado = left + right;
            	label.setText("Resultado: " + resultado);
            }
        });
		
		buttonMenos.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
            	
            	// Metemos el contenido de los textField en las variables
            	
            	left = Double.parseDouble(textfieldLeft.getText());
        		right = Double.parseDouble(textfieldRight.getText());
        		
            	// Sumamos las variables y mostramos el resultado en la label
        		
        		resultado = left - right;
            	label.setText("Resultado: " + resultado);
            }
        });
		
		buttonPor.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
            	
            	// Metemos el contenido de los textField en las variables
            	
            	left = Double.parseDouble(textfieldLeft.getText());
        		right = Double.parseDouble(textfieldRight.getText());
        		
            	// Sumamos las variables y mostramos el resultado en la label
        		
        		resultado = left * right;
            	label.setText("Resultado: " + resultado);
            }
        });
		
		buttonEntre.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
            	
            	// Metemos el contenido de los textField en las variables
            	
            	left = Double.parseDouble(textfieldLeft.getText());
        		right = Double.parseDouble(textfieldRight.getText());
        		
            	// Sumamos las variables y mostramos el resultado en la label
        		
        		resultado = left / right;
            	label.setText("Resultado: " + resultado);
            }
        });
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
	} // constructor
	
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
