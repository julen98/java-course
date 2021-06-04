package picaLetras;

import java.awt.BorderLayout;
import java.awt.Color;
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
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class PicaLetras extends JFrame implements ActionListener, ChangeListener {
	private static final long serialVersionUID = 3159868647123505767L;

	// Selector color
	private final SelectorColor color = new SelectorColor();
	
	// Containers
	private final Container contentpane = getContentPane();
	
	// Text component
	private final JTextArea textArea;
	
	// Menu
	private final JMenuBar menubar = new JMenuBar();
	private final JMenu menuArchivo = new JMenu("Archivo");
	private final JMenu menuEditar = new JMenu("Editar");
	private final JMenu menuAyuda = new JMenu("Ayuda");
    
    // Toolbar
    private final JToolBar mainToolbar = new JToolBar();
    
    // Iconos
    private final ImageIcon iconNegrita = new ImageIcon("icons/bold.png");
    private final ImageIcon iconCursiva = new ImageIcon("icons/italic.png");
    private final ImageIcon iconSubrayado = new ImageIcon("icons/underline.png");
    private final ImageIcon iconColor = new ImageIcon("icons/color.png");

    // Fonts
    private final JComboBox<String> tipoFuente;
    private final JComboBox<Integer> tamanoFuente;
    
	// Menu Items
    private final JMenuItem miNuevo = new JMenuItem("Nuevo");
    private final JMenuItem miAbrir = new JMenuItem("Abrir...");
    private final JMenuItem miGuardar = new JMenuItem("Guardar");
	private final JMenuItem miCortar = new JMenuItem("Cortar");
	private final JMenuItem miCopiar = new JMenuItem("Copiar");
	private final JMenuItem miPegar = new JMenuItem("Pegar");
	private final JMenuItem miCerrar = new JMenuItem("Cerrar");
	private final JMenuItem miSobreMi = new JMenuItem("Autor");
	private final JMenuItem miSobrePrograma = new JMenuItem("Acerca de PicaLetras");
	
	// Botones
	private final JButton btnNegrita = new JButton(iconNegrita);
	private final JButton btnCursiva = new JButton(iconCursiva);
	private final JButton btnSubrayado = new JButton(iconSubrayado);
	private final  JButton btnColores = new JButton(iconColor);
	
	// Popup Menu
	//private final JPopupMenu popMenu = new JPopupMenu();
	
	// Elementos a anadir al popup
	//private final JMenuItem popCopiar = new JMenuItem("Copiar");
	
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
        setVisible(false);
		setSize(720, 720);
		setLocationRelativeTo(null);
		setIconImage(new ImageIcon("writer.png").getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentpane);
		setResizable(true);
		setJMenuBar(menubar);
		add(textArea);
        setMinimumSize(new Dimension(400, 300));

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
		menuArchivo.add(miCerrar);
		
		menuEditar.add(miCortar);
		menuEditar.add(miPegar);
		menuEditar.add(miCopiar);
		
		menuAyuda.add(miSobreMi);
		menuAyuda.add(miSobrePrograma);
		
		// Anadir Action Listeners
	    miAbrir.addActionListener(this);
	    miGuardar.addActionListener(this);
	    miNuevo.addActionListener(this);
	    miCerrar.addActionListener(this);
	    miCortar.addActionListener(this);
	    miPegar.addActionListener(this);
	    miCopiar.addActionListener(this);
	    miSobreMi.addActionListener(this);
	    miSobrePrograma.addActionListener(this);
	    
	    // Anadir al menubar
	    menubar.add(menuArchivo);
	    menubar.add(menuEditar);
	    menubar.add(menuAyuda);
	    
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
		
		// Colores
	    mainToolbar.add(btnColores);
	    mainToolbar.addSeparator();
	    btnColores.setToolTipText("Selector Colores");
	    btnColores.addActionListener(this);
	    SelectorColor.colores.getSelectionModel().addChangeListener(this);
	    
	} // constructor
	
	public void stateChanged(ChangeEvent e) {
	    Color newColor = SelectorColor.colores.getColor();
	    textArea.setForeground(newColor);
	}
	
	@SuppressWarnings("unchecked")
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
			@SuppressWarnings("rawtypes")
			Map under = getFont().getAttributes();
        	under.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        	
        	@SuppressWarnings("rawtypes")
			Map nounder = getFont().getAttributes();
        	nounder.put(TextAttribute.UNDERLINE, -1);
        	
        	Font font = textArea.getFont().deriveFont(under);
        	Font font_no = textArea.getFont().deriveFont(nounder);
        	
        	if (textArea.getFont() == font) {
            	textArea.setFont(font_no);
        	} else {
        		textArea.setFont(font);
        	}
        }
        else if (e.getSource() == btnColores) {
        	if (!color.isVisible()) {
        	color.setSize(650, 360);
        	color.setVisible(true);
    		color.setLocationRelativeTo(null);
        	}
        }
        if (accion.equals("Autor")) {
        	JOptionPane.showMessageDialog(null, "Nombre: Julen Ramon Martinez Cuervo"
        			+ "\nGithub: julen98"
        			+ "\nCorreo electronico: julenramon792@gmail.com");
        }
        if (accion.equals("Acerca de PicaLetras")) {
        	JOptionPane.showMessageDialog(null, "Version: 1.0"
        			+ "\nCopyright © 2021");
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
                    @SuppressWarnings("resource")
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
