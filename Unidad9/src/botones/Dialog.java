package botones;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Dialog extends JDialog {
	JPanel panel = new JPanel();
	private Container contentpane = getContentPane();
	
	 public static void main(String[] args) {
        try {
        	Dialog dialog = new Dialog();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
	
	public Dialog () {
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Dimension tamano = pantalla.getScreenSize();
		JLabel lbl = new JLabel();
		
		lbl.setBounds(23, 0, 600, 50);
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setFont(new Font("Arial", 0, 15));
		lbl.setVisible(true);
		lbl.setText("Lorem ipsum dolor sit amet consectetur adipiscing elit ut eget, pulvinar in conubia vel.");
		
		panel.add(lbl);
		
		contentpane.add(panel);
		
		int alto = tamano.height;
		int ancho = tamano.width;
		
		setSize(650, 450);
		setTitle("Dialog");
		setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panel, BorderLayout.CENTER);
        
        panel.setLayout(null);
        {
            JScrollPane scrollPane = new JScrollPane();
            scrollPane.setBounds(23, 50, 600, 350);
            panel.add(scrollPane);
            {
                JTextArea textarea = new JTextArea();
                textarea.setText("Lorem ipsum dolor sit amet consectetur adipiscing elit ut eget, pulvinar in conubia vel mollis platea convallis. In mauris bibendum habitasse natoque nulla rhoncus quisque, faucibus volutpat tempor ante vitae dignissim, diam dui iaculis nam elementum laoreet. A proin phasellus potenti pretium senectus tincidunt nostra quam suspendisse, sociis class est dui vivamus ac sodales pellentesque iaculis, sem mi ridiculus laoreet eget molestie mus tortor. Libero ultrices semper dictumst sodales pellentesque auctor mus elementum convallis sollicitudin lacinia, inceptos quisque praesent class eget tristique porttitor quam mollis phasellus, orci placerat fames dignissim etiam nisi penatibus primis aptent accumsan. Lorem ipsum dolor sit amet consectetur adipiscing elit ut eget, pulvinar in conubia vel mollis platea convallis. In mauris bibendum habitasse natoque nulla rhoncus quisque, faucibus volutpat tempor ante vitae dignissim, diam dui iaculis nam elementum laoreet. A proin phasellus potenti pretium senectus tincidunt nostra quam suspendisse, sociis class est dui vivamus ac sodales pellentesque iaculis, sem mi ridiculus laoreet eget molestie mus tortor. Libero ultrices semper dictumst sodales pellentesque auctor mus elementum convallis sollicitudin lacinia, inceptos quisque praesent class eget tristique porttitor quam mollis phasellus, orci placerat fames dignissim etiam nisi penatibus primis aptent accumsan.");
                textarea.setLineWrap(true);
                textarea.setAutoscrolls(true);
                scrollPane.setViewportView(textarea);
            }
        }
	}
}
