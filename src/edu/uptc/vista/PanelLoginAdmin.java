package edu.uptc.vista;

import java.awt.Color;



import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import edu.uptc.control.Control;
import edu.uptc.vista.Acciones;


public class PanelLoginAdmin extends JPanel{

	JLabel logo;
	JTextField txtUsuario;
	JPasswordField txtClave;
	JLabel usuario;
	JLabel clave;
	ImageIcon imgEscudo;
	JButton btniniciarSecion;
	Control Control;
	
	public PanelLoginAdmin() {
		setBorder(new TitledBorder("CLIENTE"));
		setBounds(570, 150, 160, 250);
		setBackground(Color.WHITE);
		setLayout(new FlowLayout());
		
		inicializar();
		agregar();
	}

	private void inicializar() {
		
		imgEscudo=new ImageIcon("src/edu/uptc/imagenes/Escudo.png");
		logo= new JLabel();
		logo.setBounds(50, 10, 85, 80);
		logo.setIcon(new ImageIcon(imgEscudo.getImage().getScaledInstance(logo.getWidth(),logo.getHeight() ,Image.SCALE_SMOOTH)));

		usuario=new JLabel("NOMBRE :"+"\n");
		usuario.setFont(new Font("OCR A Extended",Font.PLAIN,14));
		txtUsuario=new JTextField(7);
		
		clave=new JLabel("C?DULA :"+"\n");
		clave.setFont(new Font("OCR A Extended",Font.PLAIN,14));
		txtClave=new JPasswordField(7);

		btniniciarSecion= new JButton("INGRESAR");
		
		
	}
	
	private void agregar() {
	
		add(logo);
		add(usuario);
		add(txtUsuario);
		add(clave);
		add(txtClave);
		add(btniniciarSecion);
	}

	public void asignarLister(Control control) {
		btniniciarSecion.setActionCommand(Acciones.LOGIN);
		btniniciarSecion.addActionListener(control);
	}

	public JTextField getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(JTextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}

	public JPasswordField getTxtClave() {
		return txtClave;
	}

	public void setTxtClave(JPasswordField txtClave) {
		this.txtClave = txtClave;
	}
}
