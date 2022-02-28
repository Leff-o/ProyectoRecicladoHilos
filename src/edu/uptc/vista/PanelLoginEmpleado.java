package edu.uptc.vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import edu.uptc.control.Control;

public class PanelLoginEmpleado extends JPanel{

	JLabel logo;
	JTextField txtUsuario;
	JPasswordField txtClave;
	JLabel usuario;
	JLabel clave;
	ImageIcon imgEscudo;
	JButton btniniciarSecion;
	Control Control;
	
	public PanelLoginEmpleado() {
		setBorder(new TitledBorder("Empleado"));
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

		usuario=new JLabel("Usuario:");
		usuario.setFont(new Font("OCR A Extended",Font.PLAIN,14));
		txtUsuario=new JTextField(7);
		
		clave=new JLabel("Contraseña :"+"\n");
		clave.setFont(new Font("OCR A Extended",Font.PLAIN,14));
		txtClave=new JPasswordField(7);

		btniniciarSecion= new JButton("Iniciar Seción");
		
		
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
}
