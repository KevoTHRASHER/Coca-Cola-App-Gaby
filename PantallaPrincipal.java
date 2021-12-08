import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;

public class PantallaPrincipal extends JFrame implements ActionListener {

	private JMenuBar barraMenu;
	private JMenu menuOpciones, menuColorFondo, menuCRUD, menuAcerca;
	private JMenuItem menuItemRojo, menuItemMorado, menuItemNegro, menuItemSalir, menuItemCrear, menuItemLeer, menuItemActualizar, menuItemBorrar, menuItemAutor;
	private ImageIcon imagenCocaColaBlanco,imagenAutor;
	private JLabel etiquetaImagenCocaColaBlanco, etiquetaMarcaAutor;
	private JButton botonCrear, botonLeer, botonActualizar, botonBorrar;
	private JComboBox comboDepartamento, comboAntiguedad;
	private JTextArea areaTextoCalculo;
	String nombreCapturadoJFrameBienvenido = "";

	public PantallaPrincipal() {

		setLayout(null);
		setTitle("COCA-COLA Vacaciones APP");
		getContentPane().setBackground(Color.RED);
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		Login objLogin = new Login();

		barraMenu = new JMenuBar();
		barraMenu.setBackground(Color.RED);
		setJMenuBar(barraMenu);

		menuOpciones = new JMenu("Opciones");
		menuOpciones.setFont(new Font("Hack",1,14));
		menuOpciones.setForeground(Color.WHITE);
		barraMenu.add(menuOpciones);

		menuColorFondo = new JMenu("Color Fondo");
		menuColorFondo.setForeground(Color.RED);
		menuOpciones.add(menuColorFondo);

		menuItemRojo = new JMenuItem("Rojo");
		menuItemRojo.setForeground(Color.RED);
		menuItemRojo.addActionListener(this);
		menuColorFondo.add(menuItemRojo);

		menuItemMorado = new JMenuItem("Morado");
		menuItemMorado.setForeground(Color.RED);
		menuItemMorado.addActionListener(this);
		menuColorFondo.add(menuItemMorado);

		menuItemNegro = new JMenuItem("Negro");
		menuItemNegro.setForeground(Color.RED);
		menuItemNegro.addActionListener(this);
		menuColorFondo.add(menuItemNegro);

		menuItemSalir = new JMenuItem("Salir");
		menuItemSalir.setForeground(Color.RED);
		menuItemSalir.addActionListener(this);
		menuOpciones.add(menuItemSalir);

		menuCRUD = new JMenu("CRUD");
		menuCRUD.setFont(new Font("Hack",1,14));
		menuCRUD.setForeground(Color.WHITE);
		barraMenu.add(menuCRUD);

		menuItemCrear = new JMenuItem("Crear");
		menuItemCrear.setForeground(Color.RED);
		menuItemCrear.addActionListener(this);
		menuCRUD.add(menuItemCrear);

		menuItemLeer = new JMenuItem("Leer");
		menuItemLeer.setForeground(Color.RED);
		menuItemLeer.addActionListener(this);
		menuCRUD.add(menuItemLeer);

		menuItemActualizar = new JMenuItem("Actualizar");
		menuItemActualizar.setForeground(Color.RED);
		menuItemActualizar.addActionListener(this);
		menuCRUD.add(menuItemActualizar);

		menuItemBorrar = new JMenuItem("Borrar");
		menuItemBorrar.setForeground(Color.RED);
		menuItemBorrar.addActionListener(this);
		menuCRUD.add(menuItemBorrar);

		menuAcerca = new JMenu("Acerca de");
		menuAcerca.setFont(new Font("Hack",1,14));
		menuAcerca.setForeground(Color.WHITE);
		barraMenu.add(menuAcerca);

		menuItemAutor = new JMenuItem("Autor");
		menuItemAutor.setForeground(Color.RED);
		menuItemAutor.addActionListener(this);
		menuAcerca.add(menuItemAutor);
		imagenAutor = new ImageIcon("images/autor.png");

		imagenCocaColaBlanco = new ImageIcon("images/logo-coca.png");
		etiquetaImagenCocaColaBlanco = new JLabel(imagenCocaColaBlanco);
		etiquetaImagenCocaColaBlanco.setBounds(70,10,250,125);
		etiquetaImagenCocaColaBlanco.setBackground(Color.RED);
		add(etiquetaImagenCocaColaBlanco);

		botonCrear = new JButton("CREAR");
		botonCrear.setBounds(30,180,150,25);
		botonCrear.setFont(new Font("Hack",1,16));
		botonCrear.setForeground(Color.WHITE);
		botonCrear.setBackground(Color.RED);
		botonCrear.setOpaque(true);
		add(botonCrear);

		botonLeer = new JButton("LEER");
		botonLeer.setBounds(30,240,150,25);
		botonLeer.setFont(new Font("Hack",1,16));
		botonLeer.setForeground(Color.WHITE);
		botonLeer.setBackground(Color.RED);
		botonLeer.setOpaque(true);
		add(botonLeer);

		botonActualizar = new JButton("ACTUALIZAR");
		botonActualizar.setBounds(220,180,150,25);
		botonActualizar.setFont(new Font("Hack", Font.BOLD, 16));
		botonActualizar.setForeground(Color.WHITE);
		botonActualizar.setBackground(Color.RED);
		botonActualizar.setOpaque(true);
		add(botonActualizar);

		botonBorrar = new JButton("BORRAR");
		botonBorrar.setBounds(220,240,150,25);
		botonBorrar.setFont(new Font("Hack", Font.BOLD, 16));
		botonBorrar.setForeground(Color.WHITE);
		botonBorrar.setBackground(Color.RED);
		botonBorrar.setOpaque(true);
		add(botonBorrar);

		etiquetaMarcaAutor = new JLabel("©2021 The COCA-COLA Company by Gaby");
		etiquetaMarcaAutor.setBounds(70,350,550,20);
		etiquetaMarcaAutor.setFont(new Font("Hack",1,11));
		etiquetaMarcaAutor.setForeground(Color.WHITE);
		etiquetaMarcaAutor.setBackground(Color.RED);
		etiquetaMarcaAutor.setOpaque(true);
		add(etiquetaMarcaAutor);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0,0,400,400);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}

	public void actionPerformed(ActionEvent ae) {

		if(ae.getSource() == menuItemRojo) {
			getContentPane().setBackground(Color.RED);
			barraMenu.setBackground(Color.RED);
			botonCrear.setBackground(Color.RED);
			botonLeer.setBackground(Color.RED);
			etiquetaMarcaAutor.setBackground(Color.RED);
			botonActualizar.setBackground(Color.RED);
		}
		if(ae.getSource() == menuItemMorado) {
			getContentPane().setBackground(new Color(102,0,153));
			barraMenu.setBackground(new Color(102,0,153));
			menuColorFondo.setForeground(new Color(102,0,153));
			menuItemRojo.setForeground(new Color(102,0,153));
			menuItemMorado.setForeground(new Color(102,0,153));
			menuItemNegro.setForeground(new Color(102,0,153));
			menuItemSalir.setForeground(new Color(102,0,153));
			menuItemCrear.setForeground(new Color(102,0,153));
			menuItemLeer.setForeground(new Color(102,0,153));
			menuItemActualizar.setForeground(new Color(102,0,153));
			menuItemBorrar.setForeground(new Color(102,0,153));
			menuItemAutor.setForeground(new Color(102,0,153));
			botonCrear.setBackground(new Color(102,0,153));
			botonLeer.setBackground(new Color(102,0,153));
			etiquetaMarcaAutor.setBackground(new Color(102,0,153));
			botonActualizar.setBackground(new Color(102,0,153));
		}
		if(ae.getSource() == menuItemNegro) {
			getContentPane().setBackground(Color.BLACK);
			barraMenu.setBackground(Color.BLACK);
			menuItemRojo.setForeground(Color.BLACK);
			menuItemMorado.setForeground(Color.BLACK);
			menuItemNegro.setForeground(Color.BLACK);
			menuColorFondo.setForeground(Color.BLACK);
			menuItemSalir.setForeground(Color.BLACK);
			menuItemCrear.setForeground(Color.BLACK);
			menuItemLeer.setForeground(Color.BLACK);
			menuItemActualizar.setForeground(Color.BLACK);
			menuItemBorrar.setForeground(Color.BLACK);
			menuItemAutor.setForeground(Color.BLACK);
			botonCrear.setBackground(Color.BLACK);
			botonLeer.setBackground(Color.BLACK);
			etiquetaMarcaAutor.setBackground(Color.BLACK);
			botonActualizar.setBackground(Color.BLACK);
		}
		if(ae.getSource() == menuItemSalir) {
			if(JOptionPane.showConfirmDialog(null,"Desea SALIR del PROGRAMA","CERRAR PROGRAMA",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
				System.exit(0);
			}
		}
		if(ae.getSource() == menuItemAutor) {
		JOptionPane.showMessageDialog(null,"Desarrollado por Kevo.THRASHER\nhttps://github.com/KevoTHRASHER","Autor",JOptionPane.INFORMATION_MESSAGE,imagenAutor);
		}
	}

//	public static void main(String[] args) {
//
//		PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
//		pantallaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		pantallaPrincipal.setBounds(0,0,580,560);
//		pantallaPrincipal.setResizable(true);
//		pantallaPrincipal.setLocationRelativeTo(null);
//		pantallaPrincipal.setVisible(true);
//
//	}
}
