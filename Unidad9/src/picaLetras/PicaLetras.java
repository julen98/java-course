package picaLetras;

import java.awt.BorderLayout;
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
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;


public class PicaLetras extends JFrame implements ActionListener {
	
	// Containers
	Container contentpane = getContentPane();
	
	// Text component
	JTextArea textArea;
	
	// Menu
	JMenuBar menubar = new JMenuBar();
	JMenu menuArchivo = new JMenu("Archivo");
    JMenu menuEditar = new JMenu("Editar");
    JMenu menuFormato = new JMenu("Formato");
    
    // Selector de color
    JColorChooser colores = new JColorChooser();
    
    // Toolbar
    private final JToolBar mainToolbar = new JToolBar();
    
    // Iconos
    private final ImageIcon iconNegrita = new ImageIcon("icons/bold.png");
    private final ImageIcon iconCursiva = new ImageIcon("icons/italic.png");
    private final ImageIcon iconSubrayado = new ImageIcon("icons/underline.png");

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
	JButton btnNegrita = new JButton(iconNegrita);
	JButton btnCursiva = new JButton(iconCursiva);
	JButton btnSubrayado = new JButton(iconSubrayado);
    
	// Popup Menu
	JPopupMenu popMenu = new JPopupMenu();
	
	// Elementos a anadir al popup
	JMenuItem popCopiar = new JMenuItem("Copiar");
	
	PicaLetras() {
		// Fuente por defecto para TextArea
        textArea = new JTextArea("", 0, 0);
        textArea.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        textArea.setTabSize(2);
        textArea.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        textArea.setTabSize(2);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
		
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
		add(textArea);
        setMinimumSize(new Dimension(400, 300));
        add(colores, BorderLayout.PAGE_END);

        // Tipo de fuentes
        tipoFuente = new JComboBox<String>();
        
        // Meto dentro de un vector todas las fuentes del sistema
        String[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        
        // Recorro el vector y lo anado a la ComboBox
        for (int i = 0; i < fuentes.length; i++) {
            tipoFuente.addItem(fuentes[i]);
        }
        tipoFuente.setMaximumSize(new Dimension(170, 30));
        tipoFuente.setToolTipText("Font Type");
        menubar.add(tipoFuente);
        
        // Action Listener
        tipoFuente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                String fuente = tipoFuente.getSelectedItem().toString();
                int tamanoTextArea = textArea.getFont().getSize();
                
                // Cambiar fuente textArea
                textArea.setFont(new Font(fuente, Font.PLAIN, tamanoTextArea));
            }
        });
        
        // Tamano fuentes
        tamanoFuente = new JComboBox<Integer>();
        
        // Relleno el vector del tamano de la fuente con valores del 5 al 72
        for (int i = 5; i <= 72; i++) {
            tamanoFuente.addItem(i);
        }
        tamanoFuente.setMaximumSize(new Dimension(70, 30));
        tamanoFuente.setToolTipText("Font Size");
        menubar.add(tamanoFuente);
        
        // Action Listener
        tamanoFuente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                String valorTamano = tamanoFuente.getSelectedItem().toString();
                int tamanoDeFuente = Integer.parseInt(valorTamano);
                String familiaFuente = textArea.getFont().getFamily();

                Font fuente1 = new Font(familiaFuente, Font.PLAIN, tamanoDeFuente);
                textArea.setFont(fuente1);
            }
        });
        
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        getContentPane().setLayout(new BorderLayout());
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(scrollPane);
        getContentPane().add(panel);
        
		// Anadir menu items
		menuArchivo.add(miAbrir);
		menuArchivo.add(miGuardar);
		menuArchivo.add(miNuevo);
		menuArchivo.add(miPrint);
		menuArchivo.add(miCerrar);
		
		menuEditar.add(miCortar);
		menuEditar.add(miPegar);
		menuEditar.add(miCopiar);
		
		// Anadir Action Listeners y Mouse Listeners
	    miAbrir.addActionListener(this);
	    miGuardar.addActionListener(this);
	    miNuevo.addActionListener(this);
	    miPrint.addActionListener(this);
	    miCerrar.addActionListener(this);
	    miCortar.addActionListener(this);
	    miPegar.addActionListener(this);
	    miCopiar.addActionListener(this);
	    
	    // Anadir al menubar
	    menubar.add(menuArchivo);
	    menubar.add(menuEditar);
	    
	    // Anado el toolbar
	    add(mainToolbar, BorderLayout.NORTH);
	    
	    // Cursiva
	    mainToolbar.add(btnCursiva);
	    mainToolbar.addSeparator();
	    btnCursiva.setToolTipText("Cursiva");
	    btnCursiva.addActionListener(this);
        
	    // Negrita
		mainToolbar.add(btnNegrita);
		mainToolbar.addSeparator();
		btnNegrita.setToolTipText("Negrita");
		btnNegrita.addActionListener(this);
		
		// Subrayado
		mainToolbar.add(btnSubrayado);
		mainToolbar.addSeparator();
		btnSubrayado.setToolTipText("Subrayado");
		btnSubrayado.addActionListener(this);
		
		// Tamano Fuente
		mainToolbar.add(tamanoFuente);
		mainToolbar.addSeparator();
		tamanoFuente.setToolTipText("Tamano de la fuente");
		
		// Tipo Fuente
		mainToolbar.add(tipoFuente);
		mainToolbar.addSeparator();
		tipoFuente.setToolTipText("Tipo de fuente");
		
	} // constructor
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String accion = e.getActionCommand();
        if (accion.equals("Cortar")) {
            textArea.cut();
        } 
        if (accion.equals("Copiar")) {
            textArea.copy();
        } 
        if (accion.equals("Pegar")) {
            textArea.paste();
        }
        if (e.getSource() == btnNegrita) {
        	if (textArea.getFont().getStyle() == Font.BOLD) {
                textArea.setFont(textArea.getFont().deriveFont(Font.PLAIN));
            } else {
                textArea.setFont(textArea.getFont().deriveFont(Font.BOLD));
            }
        }
        else if (e.getSource() == btnCursiva) {
        	if (textArea.getFont().getStyle() == Font.ITALIC) {
                textArea.setFont(textArea.getFont().deriveFont(Font.PLAIN));
            } else {
                textArea.setFont(textArea.getFont().deriveFont(Font.ITALIC));
            }
        }
        else if (e.getSource() == btnSubrayado) {
        	Map<TextAttribute, Integer> subrayado = new HashMap<TextAttribute, Integer>();
        	subrayado.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        	Map<TextAttribute, Integer> noSubrayado = new HashMap<TextAttribute, Integer>();
        	noSubrayado.put(TextAttribute.UNDERLINE, -1);
        	Font underline;
        	if (textArea.getFont() == subrayado) {
        		underline = textArea.getFont().deriveFont(noSubrayado);
            	textArea.setFont(underline);
        	} else {
        		underline = textArea.getFont().deriveFont(subrayado);
        		textArea.setFont(underline);
        	}
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
 
                    w.write(textArea.getText());
 
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
                textArea.print();
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
                    textArea.setText(sl);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } 
        if (accion.equals("Nuevo")) {
            textArea.setText("");
            setTitle("Sin Titulo 1 - PicaLetras");
        } 
        if (accion.equals("Cerrar")) {
            System.exit(0);
        }
    } // actionperformed
} // class
