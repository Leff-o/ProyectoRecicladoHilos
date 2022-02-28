package edu.uptc.vista;

import java.awt.Color;


import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import com.toedter.calendar.JDateChooser;

import edu.uptc.control.Control;


public class PanelCrearEmpleado extends JPanel{
	
	private JLabel jblNombre;
	private JTextField txtNombre;
	private JLabel jblApellido;
	private JTextField txtApellido;
	private JLabel jblTelefono;
	private JTextField txtTelefono;
	private JLabel jblUser;
	private JTextField txtUser;
	private JLabel jblContraseña;
	private JTextField txtContraseña;
	private JLabel jblFechaNacimiento;
	private JDateChooser dateChooser;
	private JButton btnGuardar;
	private JButton btnInventario;
	private JButton btnModificar;
	
	
	public PanelCrearEmpleado() {
		setBorder(new TitledBorder("Empleados"));
		setLayout(new GridLayout(8, 2, 10, 10));
		setBackground(Color.WHITE);
		setBounds(500, 150, 370, 250);
		
		inicializar();
		agregar();
	}

	private void inicializar() {
		jblNombre = new JLabel("  Nombre:");
		jblNombre.setFont(new Font("Courier New",Font.PLAIN,14));
		txtNombre = new JTextField();
		jblApellido = new JLabel("  Apellido:");
		jblApellido.setFont(new Font("Courier New",Font.PLAIN,14));
		txtApellido = new JTextField();
		jblTelefono = new JLabel("  Teléfono:");
		jblTelefono.setFont(new Font("Courier New",Font.PLAIN,14));
		txtTelefono = new JTextField();
		jblUser = new JLabel("  Usuario:");
		jblUser.setFont(new Font("Courier New",Font.PLAIN,14));
		txtUser = new JTextField();
		jblContraseña = new JLabel("  Contraseña:");
		jblContraseña.setFont(new Font("Courier New",Font.PLAIN,14));
		txtContraseña = new JTextField();
		dateChooser	 = new JDateChooser();
		dateChooser.setFont(new Font("Courier New",Font.PLAIN,14));
		jblFechaNacimiento = new JLabel("  Fecha Nacimiento:");
		jblFechaNacimiento.setFont(new Font("Courier New",Font.PLAIN,14));
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Courier New",Font.PLAIN,14));
		btnInventario = new JButton("Inventario");
		btnInventario.setFont(new Font("Courier New",Font.PLAIN,14));
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Courier New",Font.PLAIN,14));
		btnModificar.setEnabled(false);
		
	}

	private void agregar() {
	
		add(jblNombre);
		add(txtNombre);
		add(jblApellido);
		add(txtApellido);
		add(jblTelefono);
		add(txtTelefono);
		add(jblFechaNacimiento);
		add(dateChooser);
		add(jblUser);	
		add(txtUser);
		add(jblContraseña);
		add(txtContraseña);	
		add(btnGuardar);	
		add(btnInventario);
		add(btnModificar);
	}
	
	public JDateChooser getDateChooser() {
		return dateChooser;
	}

	public void setDateChooser(JDateChooser dateChooser) {
		this.dateChooser = dateChooser;
	}

	public void asignarListener(Control control) {
		btnGuardar.setActionCommand(Acciones.GUARDAR_EMPLEADO);
		btnModificar.setActionCommand(Acciones.MODIFICAR_PE);
		btnInventario.setActionCommand(Acciones.INVENT_E);
		btnGuardar.addActionListener(control);
		btnModificar.addActionListener(control);
		btnInventario.addActionListener(control);
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}

	public JTextField getTxtTelefono() {
		return txtTelefono;
	}

	public void setTxtTelefono(JTextField txtTelefono) {
		this.txtTelefono = txtTelefono;
	}

	public JTextField getTxtUser() {
		return txtUser;
	}

	public void setTxtUser(JTextField txtUser) {
		this.txtUser = txtUser;
	}

	public JTextField getTxtContraseña() {
		return txtContraseña;
	}

	public void setTxtContraseña(JTextField txtContraseña) {
		this.txtContraseña = txtContraseña;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public JButton getBtnInventario() {
		return btnInventario;
	}

	public void setBtnInventario(JButton btnInventario) {
		this.btnInventario = btnInventario;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}


}
