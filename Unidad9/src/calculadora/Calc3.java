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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import numeroComplejo.Complejo;
import calculadora.Calc;
import calculadora.Calc2;

public class Calc3 extends JFrame implements ActionListener{
	
	private Container contentpane = getContentPane();
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel();
	private Border border = BorderFactory.createLineBorder(Color.WHITE, 2);
	private JTextField textfieldLeft = new JTextField();
	private JTextField textfieldRight = new JTextField();
	private JButton buttonMas = new JButton("+");
	private JButton buttonMenos = new JButton("-");
	private JButton buttonPor = new JButton("*");
	private JButton buttonEntre = new JButton("/");
	private JButton anadirReal = new JButton("Real");
	private JButton anadirImag = new JButton("Imaginario");
	private ButtonGroup bgroup = new ButtonGroup();
	private JMenu menu;
	private JMenuBar bar;
	private JMenuItem calc1, calc2, noche, dia;
	private double real1;
	private double real2;
	private double imag1;
	private double imag2;
	private Complejo real;
	private Complejo imag;
	private Complejo c1;
	
	public Calc3 () {
		
		try {
		/* Hacemos la ventana visible, definimos el tamano, la posicion, el icono y la 
		 * operacion por defecto de la ventana al cerrarla.
		 */
		setTitle("Mini Calculadora III");
		setSize(320, 280);
		setLocationRelativeTo(null);
		setIconImage (new ImageIcon("km mod.png").getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setContentPane(contentpane);
		
		// Definimos los TextField y el Label
		
		textfieldLeft.setBounds(25, 25, 120, 30);
		textfieldLeft.setVisible(true);
		textfieldLeft.setHorizontalAlignment(JTextField.CENTER);
		textfieldRight.setBounds(175, 25, 120, 30);
		textfieldRight.setVisible(true);
		textfieldRight.setHorizontalAlignment(JTextField.CENTER);
		textfieldLeft.setBackground(Color.DARK_GRAY);
		textfieldRight.setBackground(Color.DARK_GRAY);
		textfieldLeft.setForeground(Color.WHITE);
		textfieldRight.setForeground(Color.WHITE);
		label.setBounds(25, 180, 270, 30);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText("");
		label.setFont(new Font("Arial", Font.PLAIN, 16));
		label.setForeground(Color.WHITE);
		

		// Definimos el JMenu, JMenuBar y sus items
		
		bar = new JMenuBar();
		setJMenuBar(bar);
		
		menu = new JMenu("Preferencias");
		bar.add(menu);
		calc1 = new JMenuItem("Calculadora 1");
		menu.add(calc1);
		calc2 = new JMenuItem("Calculadora 2");
		menu.add(calc2);
		dia = new JMenuItem("Modo Dia");
		menu.add(dia);
		noche = new JMenuItem("Modo Noche");
		menu.add(noche);
		
		// Anadimos borde al label
		
		label.setBorder(border);
		label.setVisible(true);
		
		// Definimos los botones como visibles y los colocamos
		
		buttonMas.setVisible(true);
		buttonMas.setBounds(25, 125, 45, 30);
		buttonMenos.setVisible(true);
		buttonMenos.setBounds(100, 125, 45, 30);
		buttonPor.setVisible(true);
		buttonPor.setBounds(175, 125, 45, 30);
		buttonEntre.setVisible(true);
		buttonEntre.setBounds(250, 125, 45, 30);
		anadirReal.setVisible(true);
		anadirReal.setBounds(25, 75, 120, 30);
		anadirImag.setVisible(true);
		anadirImag.setBounds(175, 75, 120, 30);
					
		// Agrupamos los botones
					
		bgroup.add(buttonMas);
		bgroup.add(buttonMenos);
		bgroup.add(buttonPor);
		bgroup.add(buttonEntre);
		
		// Definimos el layout del panel y anadimos todos los componentes
		
		panel.setLayout(null);
		panel.setVisible(true);
		panel.setBackground(Color.DARK_GRAY);
		panel.add(buttonMas);
		panel.add(buttonMenos);
		panel.add(buttonPor);
		panel.add(buttonEntre);
		panel.add(anadirImag);
		panel.add(anadirReal);
		panel.add(textfieldLeft);
		panel.add(textfieldRight);
		panel.add(label);
		
		// Anadimos el panel al container
		
		contentpane.add(panel);
		contentpane.setVisible(true);
		
		// Definimos los Action Listener
		
		buttonMas.addActionListener(this);
		buttonMenos.addActionListener(this);
		buttonPor.addActionListener(this);
		buttonEntre.addActionListener(this);
		anadirReal.addActionListener(this);
		anadirImag.addActionListener(this);
		calc1.addActionListener(this);
		calc2.addActionListener(this);
		dia.addActionListener(this);
		noche.addActionListener(this);
		
		} catch (Exception e) {
			System.out.println(e);
		}
	} // constructor
	
	public void actionPerformed (ActionEvent e) {
		try {
		// Dependiendo del boton que se ha pulsado se ejecuta una operacion diferente
			
			if (e.getSource() == calc1) {
				SwingUtilities.invokeLater(new Runnable() {
					@Override
					public void run() {
						new Calc();
					}
				});
			}
			
			if (e.getSource() == calc2) {
				SwingUtilities.invokeLater(new Runnable() {
					@Override
					public void run() {
						new Calc2();
					}
				});
			}

			if (e.getSource() == dia) {
				textfieldLeft.setBackground(new Color(242, 242, 242));
				textfieldRight.setBackground(new Color(242, 242, 242));
				textfieldLeft.setForeground(new Color(60, 60, 60));
				textfieldRight.setForeground(new Color(60, 60, 60));
				label.setForeground(new Color(60, 60, 60));
				panel.setBackground(new Color(242, 242, 242));
				border = BorderFactory.createLineBorder(new Color(60, 60, 60), 2);
				label.setBorder(border);
			}
			
			if (e.getSource() == noche) {
				textfieldLeft.setBackground(new Color(60, 60, 60));
				textfieldRight.setBackground(new Color(60, 60, 60));
				textfieldLeft.setForeground(new Color(242, 242, 242));
				textfieldRight.setForeground(new Color(242, 242, 242));
				label.setForeground(new Color(242, 242, 242));
				panel.setBackground(new Color(60, 60, 60));
				border = BorderFactory.createLineBorder(new Color(242, 242, 242), 2);
				label.setBorder(border);
			}
			
			if (e.getSource() == anadirReal) {
				real1 = Double.parseDouble(textfieldLeft.getText());
		    	real2 = Double.parseDouble(textfieldRight.getText());
				real = new Complejo(real1, real2);
				label.setText("Real anadido: " + real);
			}
			
			if (e.getSource() == anadirImag) {
				imag1 = Double.parseDouble(textfieldLeft.getText());
		    	imag2 = Double.parseDouble(textfieldRight.getText());
				imag = new Complejo(imag1, imag2);
				label.setText("Imaginario anadido: " + imag);
			}
				
			if (e.getSource() == buttonMas) {
				c1 = real.sumar(imag);
				label.setText("" + c1);
			}
				
			if (e.getSource() == buttonMenos) {
				c1 = real.restar(imag);
				label.setText("" + c1);
			}
			
			if (e.getSource() == buttonPor) {
				c1 = real.multiplicar(imag);
				label.setText("" + c1);
			}
			
			if (e.getSource() == buttonEntre) {
				c1 = real.dividir(imag);
				label.setText("" + c1);
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
					new Calc3();
				}
			});
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	} // main
	
} // class
