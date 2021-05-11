package botones;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Dialog extends JDialog {
	JPanel contentPanel = new JPanel();
	
	/* public static void main(String[] args) {
        try {
        	Dialog dialog = new Dialog();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    } */
	
	public Dialog () {
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Dimension tamano = pantalla.getScreenSize();
		int alto = tamano.height;
		int ancho = tamano.width;
		setSize(ancho/4, alto/4);
		setTitle("Dialog");
		setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);
        {
            JScrollPane scrollPane = new JScrollPane();
            scrollPane.setBounds(9, 8, 475, 250);
            contentPanel.add(scrollPane);
            {
                JTextArea textarea = new JTextArea();
                textarea.setText("Lorem ipsum dolor sit amet consectetur adipiscing elit ut eget, pulvinar in conubia vel mollis platea convallis. In mauris bibendum habitasse natoque nulla rhoncus quisque, faucibus volutpat tempor ante vitae dignissim, diam dui iaculis nam elementum laoreet. A proin phasellus potenti pretium senectus tincidunt nostra quam suspendisse, sociis class est dui vivamus ac sodales pellentesque iaculis, sem mi ridiculus laoreet eget molestie mus tortor. Libero ultrices semper dictumst sodales pellentesque auctor mus elementum convallis sollicitudin lacinia, inceptos quisque praesent class eget tristique porttitor quam mollis phasellus, orci placerat fames dignissim etiam nisi penatibus primis aptent accumsan.");
                textarea.setLineWrap(true);
                textarea.setAutoscrolls(true);
                scrollPane.setViewportView(textarea);
            }
        }
	}
}
