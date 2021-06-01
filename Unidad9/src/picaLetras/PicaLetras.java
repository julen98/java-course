package picaLetras;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;
import javax.swing.text.StyledDocument;


public class PicaLetras extends JFrame implements ActionListener {
	
	// Containers
	Container contentpane = getContentPane();
	
	// Text component
	JTextPane textarea = new JTextPane();
	
	// Menu
	JMenuBar menubar = new JMenuBar();
	JMenu menuArchivo = new JMenu("Archivo");
    JMenu menuEditar = new JMenu("Editar");
    JMenu menuFormato = new JMenu("Formato");
    
    // Fonts
    private final JComboBox<String> tipoFuente;
    private final JComboBox<Integer> tamanoFuente;
    
	// Menu Items
	JMenuItem miNuevo = new JMenuItem("Nuevo");
	JMenuItem miAbrir = new JMenuItem("Abrir...");
	JMenuItem miGuardar = new JMenuItem("Guardar");
	JMenuItem miPrint = new JMenuItem("Imprimir");
	JMenuItem miCortar = new JMenuItem("Cortar");
	JMenuItem miCopiar = new JMenuItem("Copiar");
	JMenuItem miPegar = new JMenuItem("Pegar");
	JMenuItem miCerrar = new JMenuItem("Cerrar");
	JMenuItem miNegrita = new JMenuItem("Negrita");
	JMenuItem miCursiva = new JMenuItem("Cursiva");
	JMenuItem miSubrayado = new JMenuItem("Subrayado");
    
	// Popup Menu
	JPopupMenu popMenu = new JPopupMenu();
	
	// Elementos a anadir al popup
	JMenuItem popCopiar = new JMenuItem("Copiar");
	
	PicaLetras() {
		/* Hago la ventana visible, defino el tamano, la posicion, el icono y la 
		 * operacion por defecto de la ventana al cerrarla.
		 */
        setTitle("Sin Titulo 1 - PicaLetras");
        setVisible(true);
		setSize(720, 720);
		setLocationRelativeTo(null);
		setIconImage(new ImageIcon("writer.png").getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentpane);
		setResizable(true);
		setJMenuBar(menubar);
		add(textarea);
        setMinimumSize(new Dimension(400, 300));
		
        // Fuentes
        tipoFuente = new JComboBox<String>();

        String[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (int i = 0; i < fuentes.length; i++) {
            tipoFuente.addItem(fuentes[i]);
        }
        tipoFuente.setMaximumSize(new Dimension(170, 30));
        tipoFuente.setToolTipText("Font Type");
        menubar.add(tipoFuente);

        tipoFuente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                String p = tipoFuente.getSelectedItem().toString();
                int s = textarea.getFont().getSize();
                textarea.setFont(new Font(p, Font.PLAIN, s));
            }
        });
        
        // Tamano fuentes
        tamanoFuente = new JComboBox<Integer>();

        for (int i = 5; i <= 72; i++) {
            tamanoFuente.addItem(i);
        }
        tamanoFuente.setMaximumSize(new Dimension(70, 30));
        tamanoFuente.setToolTipText("Font Size");
        menubar.add(tamanoFuente);

        tamanoFuente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                String valorTamano = tamanoFuente.getSelectedItem().toString();
                int tamanoDeFuente = Integer.parseInt(valorTamano);
                String familiaFuente = textarea.getFont().getFamily();

                Font fuente1 = new Font(familiaFuente, Font.PLAIN, tamanoDeFuente);
                textarea.setFont(fuente1);
            }
        });
        
		// Anadir menu items
		menuArchivo.add(miAbrir);
		menuArchivo.add(miGuardar);
		menuArchivo.add(miNuevo);
		menuArchivo.add(miPrint);
		menuArchivo.add(miCerrar);
		
		menuEditar.add(miCortar);
		menuEditar.add(miPegar);
		menuEditar.add(miCopiar);
		menuFormato.add(miCursiva);
		menuFormato.add(miNegrita);
		menuFormato.add(miSubrayado);
		
		// Anadir Action Listeners y Mouse Listeners
	    miAbrir.addActionListener(this);
	    miGuardar.addActionListener(this);
	    miNuevo.addActionListener(this);
	    miPrint.addActionListener(this);
	    miCerrar.addActionListener(this);
	    miCortar.addActionListener(this);
	    miPegar.addActionListener(this);
	    miCopiar.addActionListener(this);
	    miCursiva.addActionListener(this);
	    miNegrita.addActionListener(this);
	    miSubrayado.addActionListener(this);
	    
	    // Anadir al menubar
	    menubar.add(menuArchivo);
	    menubar.add(menuEditar);
	    menubar.add(menuFormato);
	    
	} // constructor
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String accion = e.getActionCommand();
        if (accion.equals("Cortar")) {
            textarea.cut();
        } 
        if (accion.equals("Copiar")) {
            textarea.copy();
        } 
        if (accion.equals("Pegar")) {
            textarea.paste();
        }
        if (accion.equals("Negrita")) {
        	if (textarea.getFont().getStyle() == Font.BOLD) {
        		textarea.setFont(textarea.getFont().deriveFont(Font.PLAIN));
        	} else {
        		textarea.setFont(textarea.getFont().deriveFont(Font.BOLD));
        	}
        }
        if (accion.equals("Cursiva")) {
            if (textarea.getFont().getStyle() == Font.ITALIC) {
            	textarea.setFont(textarea.getFont().deriveFont(Font.PLAIN));
            } else {
            	textarea.setFont(textarea.getFont().deriveFont(Font.ITALIC));
            }
        }
        if (accion.equals("Subrayado")) {
        	Map<TextAttribute, Integer> fontAttributes = new HashMap<TextAttribute, Integer>();
        	fontAttributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        	Font underline = new Font("Noto Sans", Font.PLAIN, 12).deriveFont(fontAttributes);
        	textarea.setFont(underline);
        } 
        if (accion.equals("Fuente")) {
        	textarea.setFont(new Font("Noto Sans", Font.BOLD, 12));
        } 
        if (accion.equals("Guardar")) {
            JFileChooser chooser = new JFileChooser("f:");
            chooser.setSelectedFile(new File("Sin Titulo 1"));
            int r = chooser.showSaveDialog(null);
 
            if (r == JFileChooser.APPROVE_OPTION) {
                File fi = new File(chooser.getSelectedFile().getAbsolutePath());
                setTitle(fi.getName() + " - PicaLetras");
                try {
                    FileWriter wr = new FileWriter(fi, false);
                    BufferedWriter w = new BufferedWriter(wr);
 
                    w.write(textarea.getText());
 
                    w.flush();
                    w.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } 
        if (accion.equals("Imprimir")) {
            try {
                // Imprime el archivo
                textarea.print();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } 
        if (accion.equals("Abrir...")) {
            JFileChooser chooser = new JFileChooser("f:");
            int r = chooser.showOpenDialog(null);
 
            // Si el usuario selecciona el archivo
            if (r == JFileChooser.APPROVE_OPTION) {
                // Establezco la etiqueta a la ruta del directorio seleccionado
                File fi = new File(chooser.getSelectedFile().getAbsolutePath());
                setTitle(fi.getName() + " - PicaLetras");
                try {
                    String s1 = "", sl = "";
                    FileReader fr = new FileReader(fi);
                    BufferedReader br = new BufferedReader(fr);
                    sl = br.readLine();
 
                    // Coge la entrada desde el archivo
                    while ((s1 = br.readLine()) != null) {
                        sl = sl + "\n" + s1;
                    }
                    textarea.setText(sl);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } 
        if (accion.equals("Nuevo")) {
            textarea.setText("");
            setTitle("Sin Titulo 1 - PicaLetras");
        } 
        if (accion.equals("Cerrar")) {
            System.exit(0);
        }
    } // actionperformed
} // class
