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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;


public class Calc2 extends JFrame implements ActionListener {
	
	private Container contentpane = getContentPane();
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel();
	private JTextField textfieldUp = new JTextField();
	private JTextField textfieldDown = new JTextField();
	private JRadioButton rSum = new JRadioButton("Sumatorio");
	private JRadioButton rPro = new JRadioButton("Productorio");
	private JRadioButton rExp = new JRadioButton("Exponencial");
	private JButton btnCalcula = new JButton("Calcula");
	private ButtonGroup bgroup = new ButtonGroup();
	double up = 0;
	double down = 0;
	double resultado = 0;
	double sumatorio;
	double productorio;
	
	public Calc2 () {
		
		try {
		/* Hacemos la ventana visible, definimos el tamano, la posicion, el icono y la 
		 * operacion por defecto de la ventana al cerrarla.
		 */
		
		setTitle("Mini Calculadora II");
		setSize(400, 220);
		setLocationRelativeTo(null);
		setIconImage (new ImageIcon("km mod.png").getImage());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		setContentPane(contentpane);
		setResizable(false);
		
		// Definimos los TextField y el Label
		
		textfieldUp.setBounds(25, 30, 100, 30);
		textfieldUp.setVisible(true);
		textfieldUp.setHorizontalAlignment(JTextField.CENTER);
		textfieldDown.setBounds(25, 120, 100, 30);
		textfieldDown.setVisible(true);
		textfieldDown.setHorizontalAlignment(JTextField.CENTER);
		label.setBounds(280, 105, 100, 40);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText("");
		label.setFont(new Font("Arial", Font.PLAIN, 16));
		
		// Anadimos borde al label
		
		Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
		label.setBorder(border);
		label.setVisible(true);
		
		// Definimos los botones como visibles y los colocamos
		
		rSum.setVisible(true);
		rSum.setBounds(150, 25, 100, 30);
		rPro.setVisible(true);
		rPro.setBounds(150, 75, 100, 30);
		rExp.setVisible(true);
		rExp.setBounds(150, 125, 100, 30);
		btnCalcula.setVisible(true);
		btnCalcula.setBounds(280, 30, 100, 30);
					
		// Agrupamos los botones
					
		bgroup.add(rSum);
		bgroup.add(rPro);
		bgroup.add(rExp);
		
		// Definimos el layout del panel y anadimos todos los componentes
		
		panel.setLayout(null);
		panel.setVisible(true);
		panel.add(rSum);
		panel.add(rPro);
		panel.add(rExp);
		panel.add(btnCalcula);
		panel.add(textfieldUp);
		panel.add(textfieldDown);
		panel.add(label);
		
		// Anadimos el panel al container
		
		contentpane.add(panel);
		contentpane.setVisible(true);
		
		// Definimos los Action Listener de cada boton
		
		rSum.addActionListener(this);
		rPro.addActionListener(this);
		rExp.addActionListener(this);
		btnCalcula.addActionListener(this);
		
		} catch (Exception e) {
			System.out.println(e);
		}
	} // constructor
	
	public void actionPerformed (ActionEvent e) {
		
		// Metemos el contenido de los textField en las variables
    	
		try {
        	up = Double.parseDouble(textfieldUp.getText());
    		down = Double.parseDouble(textfieldDown.getText());
        	
		// Dependiendo del boton que se ha pulsado se ejecuta una operacion diferente
		
			if (rSum.isSelected()) {
				if (e.getSource() == btnCalcula) {
					sumatorio = 0;
					while(up != down + 1) {
						sumatorio = sumatorio + down;
						down--;
					}
					resultado = sumatorio;
					resultado = Math.round(resultado * 100.0) / 100.0;
					label.setText("" + resultado);
				}
			}
			if (rPro.isSelected()) {
				if (e.getSource() == btnCalcula) {
					productorio = 1;
					for (double i = up; i <= down; i++) {
						productorio = productorio * i;
					}
					resultado = productorio;
					resultado = Math.round(resultado * 100.0) / 100.0;
					label.setText("" + resultado);
				}
			}
			if (rExp.isSelected()) {
				if (e.getSource() == btnCalcula) {
					resultado = Math.pow(up, down);
					resultado = Math.round(resultado * 100.0) / 100.0;
					label.setText("" + resultado);
				}
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
					new Calc2();
				}
			});
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	} // main
	
} // class
