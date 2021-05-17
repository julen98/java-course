package botones;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dialog.ModalityType;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Botones extends JFrame {
	
	
	private JLabel etiqueta = new JLabel();
	private Container contentpane = getContentPane();
	private JPanel panel1 = new JPanel();
	private JButton button1 = new JButton("Haz clic aqui.");
	private JRadioButton radio1 = new JRadioButton("Opcion 1.");
	private JRadioButton radio2 = new JRadioButton("Opcion 2.");
	private JRadioButton radio3 = new JRadioButton("Opcion 3.");
	private JRadioButton radio4 = new JRadioButton("Opcion 4.");
	private ButtonGroup bgroup = new ButtonGroup();
	
	public Botones () {
		try {
			
			/* Hacemos la ventana visible, definimos el tamano, la posicion, el icono y la 
			 * operacion por defecto de la ventana al cerrarla.
			 */
			
			setTitle("Actions");
			setSize(800, 400);
			setLocationRelativeTo(null);
			setIconImage (new ImageIcon("km mod.png").getImage());
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
			// Definimos los botones de radio como visibles y los colocamos
			
			radio1.setVisible(true);
			radio1.setBounds(50, 50, 85, 30);
			radio2.setVisible(true);
			radio2.setBounds(50, 80, 85, 30);
			radio3.setVisible(true);
			radio3.setBounds(50, 110, 85, 30);
			radio4.setVisible(true);
			radio4.setBounds(50, 140, 85, 30);
			
			// Agrupamos los botones de radio
			
			bgroup.add(radio1);
			bgroup.add(radio2);
			bgroup.add(radio3);
			bgroup.add(radio4);
			
			/* Definimos como visible el boton, lo posicionamos y hacemos que al hacer clic 
			 * se habra un dialog
			 */
			
			button1.setVisible(true);
			button1.setBounds(340, 300, 120, 30);
			button1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Dialog dialog = new Dialog();
				    dialog.setModalityType(ModalityType.APPLICATION_MODAL);
				    dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				    dialog.setVisible(true);
				}
			});
			
			/* Damos tamaño al label, lo alineamos al centro, le cambiamos la fuente y el color 
			 * de la fuente */
			
			etiqueta.setBounds(225, 0, 350, 50);
			etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
			etiqueta.setFont(new Font("Arial", 0, 15));
			etiqueta.setForeground(Color.BLACK);
			
			// Definimos el layout del panel y anadimos todos los componentes
			
			panel1.setLayout(null);
			panel1.add(etiqueta);
			panel1.add(button1);
			panel1.add(radio1);
			panel1.add(radio2);
			panel1.add(radio3);
			panel1.add(radio4);
			
			// Anadimos el panel al container
			
			contentpane.add(panel1);
			
			// Le damos color de fondo al panel
			
			panel1.setBackground(Color.ORANGE);
			
			// Definimos los Listeners del boton de radio
			
			radio1.addMouseListener(new MouseListener(){
				 public void mouseClicked(MouseEvent e){
				 }
				 public void mouseEntered(MouseEvent e){
				 etiqueta.setText(etiqueta.getText()+radio1.getText());
				 }
				 public void mouseExited(MouseEvent e){
				 etiqueta.setText("Estas sobre la");
				 }
				 public void mousePressed(MouseEvent e){
				 }
				 public void mouseReleased(MouseEvent e){
				 }
			});
			
			// Definimos los Listeners del boton de radio
			
			radio2.addMouseListener(new MouseListener(){
				 public void mouseClicked(MouseEvent e){
				 }
				 public void mouseEntered(MouseEvent e){
				 etiqueta.setText(etiqueta.getText()+radio2.getText());
				 }
				 public void mouseExited(MouseEvent e){
				 etiqueta.setText("Estas sobre la ");
				 }
				 public void mousePressed(MouseEvent e){
				 }
				 public void mouseReleased(MouseEvent e){
				 }
			});
			
			// Definimos los Listeners del boton de radio
			
			radio3.addMouseListener(new MouseListener(){
				 public void mouseClicked(MouseEvent e){
				 }
				 public void mouseEntered(MouseEvent e){
				 etiqueta.setText(etiqueta.getText()+radio3.getText());
				 }
				 public void mouseExited(MouseEvent e){
				 etiqueta.setText("Estas sobre la ");
				 }
				 public void mousePressed(MouseEvent e){
				 }
				 public void mouseReleased(MouseEvent e){
				 }
			});
			
			// Definimos los Listeners del boton de radio
			
			radio4.addMouseListener(new MouseListener(){
				 public void mouseClicked(MouseEvent e){
				 }
				 public void mouseEntered(MouseEvent e){
				 etiqueta.setText(etiqueta.getText()+radio4.getText());
				 }
				 public void mouseExited(MouseEvent e){
				 etiqueta.setText("Estas sobre la ");
				 }
				 public void mousePressed(MouseEvent e){
				 }
				 public void mouseReleased(MouseEvent e){
				 }
			});
			
			// Definimos los Listeners del boton
			
			button1.addMouseListener(new MouseListener(){
				 public void mouseClicked(MouseEvent e){
				 }
				 public void mouseEntered(MouseEvent e){
				 etiqueta.setText(etiqueta.getText()+"boton \""+button1.getText()+"\"");
				 }
				 public void mouseExited(MouseEvent e){
				 etiqueta.setText("Estas sobre el ");
				 }
				 public void mousePressed(MouseEvent e){
				 }
				 public void mouseReleased(MouseEvent e){
				 }
			});
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} // catch
	} // constructor
	
	// Programa principal
	
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
	} // main
} // class
