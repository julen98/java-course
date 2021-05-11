package botones;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dialog.ModalityType;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Botones extends JFrame {
	
	public Botones () {
		try {
			setTitle("Mi primera ventana con botones...");
			setSize(800, 400);
			setLocationRelativeTo(null);
			setIconImage (new ImageIcon("km mod.png").getImage());
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
			JLabel etiqueta = new JLabel();
			Container contentpane = getContentPane();
			JPanel panel = new JPanel();
			JButton button = new JButton("Haz clic aqui");
			
			button.setVisible(true);
			button.setBounds(340, 50, 120, 30);
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Dialog dialog = new Dialog();
				    dialog.setModalityType(ModalityType.APPLICATION_MODAL);
				    dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				    dialog.setVisible(true);
				}
			});
			etiqueta.setText("Bienvenido a mi primera interfaz grafica");
			etiqueta.setBounds(225, 0, 350, 50);
			etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
			etiqueta.setForeground(Color.WHITE);
			etiqueta.setFont(new Font("Arial", 0, 15));
			etiqueta.setForeground(Color.BLACK);
			
			contentpane.add(panel);
			
			panel.setLayout(null);
			panel.add(etiqueta);
			panel.add(button);
			panel.setBackground(Color.ORANGE);
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					new Botones();
				}
			});
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
