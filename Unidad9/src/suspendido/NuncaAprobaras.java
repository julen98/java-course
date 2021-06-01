package suspendido;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class NuncaAprobaras extends JFrame {
	
	// Font
	private Font font = new Font("Roboto", Font.BOLD, 20);
	
	// Panel
	private JPanel mainPanel = new JPanel();
	
	// ContentPane
	private Container contentpane = getContentPane();
	
	// Label
	private JLabel label = new JLabel();
	
	// Buttons
	private JButton btnSi = new JButton("Si");
	private JButton btnNo = new JButton("No");
	
	public NuncaAprobaras (){
		setTitle("Programacion");
		setVisible(true);
		setSize(350, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentpane);
		setResizable(false);
		
		// Defino el label
		label.setText("Vas a aprobar programacion?");
		label.setFont(font);
		label.setForeground(new Color(255, 0, 0));
		label.setBounds(25, 50, 300, 70);
		
		// Defino los botones
		btnSi.setBounds(100, 150, 55, 30);
		btnNo.setBounds(155, 150, 55, 30);
		
		// Anado los Mouse Listener
		btnSi.addMouseListener(new MouseAdapter() {
	        public void mouseEntered(MouseEvent e) {
	        	btnSi.setBounds(210, 150, 55, 30);
	        }
	    });
		btnNo.addMouseListener(new MouseAdapter() {
	        public void mouseClicked(MouseEvent e) {
	        	JOptionPane.showMessageDialog(null, "Haber estudiado!");
	        }
	    });
		mainPanel.addMouseListener(new MouseAdapter() {
	        public void mouseEntered(MouseEvent e) {
	    		btnSi.setBounds(100, 150, 55, 30);
	        }
	    });
		
		// Anado contenido al panel
		mainPanel.setLayout(null);
		mainPanel.add(label);
		mainPanel.add(btnSi);
		mainPanel.add(btnNo);
		
		// Anado el panel principal al container
		contentpane.add(mainPanel);
		
	} // class
	
	public static void main(String[] args) {
		try {
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					new NuncaAprobaras();
				}
			});
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	} // main

	

	
}
