import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

	private ImageIcon imagenLogoCocaCola;
	private JLabel etiquetaLogoCocaCola, etiquetaSistemaControlVacaciones, etiquetaCapturaNombre, etiquetaMarcaRegistrada, etiquetaContraseña;
	private JTextField campoTextoCapturaNombre, campoContraseña;
	private JButton botonIngresar;
	public static String nombreCapturado = "";

	public Login() {

		setLayout(null);

		getContentPane().setBackground(Color.RED);
		setTitle("Login COCA-COLA App");
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

		imagenLogoCocaCola = new ImageIcon("images/logo-coca.png");
		etiquetaLogoCocaCola = new JLabel();
		etiquetaLogoCocaCola.setBounds(20,20,260,130);
		etiquetaLogoCocaCola.setIcon(imagenLogoCocaCola);
		etiquetaLogoCocaCola.setBackground(Color.RED);
		etiquetaLogoCocaCola.setOpaque(false);
		add(etiquetaLogoCocaCola);

		etiquetaSistemaControlVacaciones = new JLabel("Sistema Control Empleados");
		etiquetaSistemaControlVacaciones.setFont(new Font("JetBrains Mono",3,16));
		etiquetaSistemaControlVacaciones.setBounds(30,150,260,25);
		etiquetaSistemaControlVacaciones.setForeground(Color.WHITE);
		etiquetaSistemaControlVacaciones.setBackground(Color.RED);
		etiquetaSistemaControlVacaciones.setOpaque(true);
		add(etiquetaSistemaControlVacaciones);

		etiquetaCapturaNombre = new JLabel("Ingrese su nombre :");
		etiquetaCapturaNombre.setFont(new Font("Hack",1,14));
		etiquetaCapturaNombre.setBounds(50,190,200,25);
		etiquetaCapturaNombre.setOpaque(true);
		etiquetaCapturaNombre.setBackground(Color.RED);
		etiquetaCapturaNombre.setForeground(Color.WHITE);
		add(etiquetaCapturaNombre);

		campoTextoCapturaNombre = new JTextField();
		campoTextoCapturaNombre.setBounds(50,220,230,25);
		campoTextoCapturaNombre.setFont(new Font("Hack",1,14));
		campoTextoCapturaNombre.setForeground(Color.RED);
		add(campoTextoCapturaNombre);

		etiquetaContraseña = new JLabel("Ingresa tu contraseña :");
		etiquetaContraseña.setFont(new Font("Hack",1,14));
		etiquetaContraseña.setBounds(50,250,200,25);
		etiquetaContraseña.setBackground(Color.RED);
		etiquetaContraseña.setForeground(Color.WHITE);
		etiquetaContraseña.setOpaque(true);
		add(etiquetaContraseña);

		campoContraseña = new JTextField();
		campoContraseña.setBounds(50,280,230,25);
		campoContraseña.setFont(new Font("Hack",1,14));
		campoContraseña.setForeground(Color.RED);
		add(campoContraseña);

		botonIngresar = new JButton("Ingresar");
		botonIngresar.setForeground(Color.RED);
		botonIngresar.setBackground(Color.WHITE);
		botonIngresar.setBounds(100,325,120,30);
		botonIngresar.addActionListener(this);
		add(botonIngresar);

		etiquetaMarcaRegistrada = new JLabel("©2021 The Coca-Cola Company by Gaby");
		etiquetaMarcaRegistrada.setFont(new Font("Hack",1,12));
		etiquetaMarcaRegistrada.setBounds(20,385,320,25);
		etiquetaMarcaRegistrada.setForeground(Color.WHITE);
		etiquetaMarcaRegistrada.setBackground(Color.RED);
		add(etiquetaMarcaRegistrada);

	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == botonIngresar) {
			nombreCapturado = campoTextoCapturaNombre.getText().trim();
			if (campoTextoCapturaNombre.getText().length() == 0 ) {
				JOptionPane.showMessageDialog(null,"INTRODUCE tu NOMBRE","NOMBRE VACÍO",JOptionPane.WARNING_MESSAGE);
			}
			else if(campoContraseña.getText().length() == 0) {
				JOptionPane.showMessageDialog(null,"INTRODUCE tu CONTRASEÑA","CONTRASEÑA VACÍA",JOptionPane.WARNING_MESSAGE);
			}
			else if(campoTextoCapturaNombre.getText().equals(campoContraseña.getText())) {
				this.setVisible(false);
				JOptionPane.showMessageDialog(null,"ACCESO OTORGADO");
				Licencia licencia = new Licencia();
				licencia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				licencia.setBounds(0,0,500,470);
				licencia.setLocationRelativeTo(null);
				licencia.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null,"Tu NOMBRE Y CONTRASEÑA SON INCORRECTOS, VUELVE a INGRESAR tus DATOS CORRECTAMENTE","LOGIN INCORRECTO",JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public static void main(String[] args) {

		Login objLogin = new Login();
		objLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		objLogin.setBounds(0,0,340,450);
		objLogin.setResizable(true);
		objLogin.setLocationRelativeTo(null);
		objLogin.setVisible(true);

	}
}
