package edu.uptc.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import edu.uptc.control.Control;
import edu.uptc.logica.Clasificacion;
import edu.uptc.logica.Genero;

public class PanelCrearLibro extends JPanel {

	private JLabel jblISBN;
	private JTextField txtISBN;
	private JLabel jblNombre;
	private JTextField txtNombre;
	private JLabel jblAutor;
	private JTextField txtAutor;
	private JLabel jblCopias;
	private JTextField txtCopias;
	private JButton btnGuardar;
	private JButton btnModificar;
	private JButton btnInventario;
	private JLabel jblClasificacion;
	private JComboBox<String> cmbClasificacion;
	private JLabel jblGenero;
	private JComboBox<String> cmbGenero;
		
	public PanelCrearLibro() {
		setBorder(new TitledBorder("Libros"));
		setLayout(new GridLayout(8, 2, 10, 10));
		setBackground(Color.WHITE);
		setBounds(500, 150, 370, 250);
		
		inicializar();
		agregar();
	}

	private void inicializar() {
		jblISBN = new JLabel("  ISBN:");
		jblISBN.setFont(new Font("Courier New",Font.PLAIN,14));
		txtISBN = new JTextField();
		jblNombre = new JLabel("  Nombre:");
		jblNombre.setFont(new Font("Courier New",Font.PLAIN,14));
		txtNombre = new JTextField();
		jblAutor = new JLabel("  Autor:");
		jblAutor.setFont(new Font("Courier New",Font.PLAIN,14));
		txtAutor = new JTextField();
		jblCopias = new JLabel("  Copias:");
		jblCopias.setFont(new Font("Courier New",Font.PLAIN,14));
		txtCopias = new JTextField();
		jblGenero = new JLabel("  Genero:");
		jblGenero.setFont(new Font("Courier New",Font.PLAIN,14));
		cmbGenero = new JComboBox<String>();
		cmbGenero.setModel(new DefaultComboBoxModel(Genero.values()));
		cmbGenero.setFont(new Font("Courier New",Font.PLAIN,14));
		jblClasificacion = new JLabel("  Clasificación:");
		jblClasificacion.setFont(new Font("Courier New",Font.PLAIN,14));
		cmbClasificacion = new JComboBox<String>();
		cmbClasificacion.setModel(new DefaultComboBoxModel(Clasificacion.values()));
		cmbClasificacion.setFont(new Font("Courier New",Font.PLAIN,14));
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Courier New",Font.PLAIN,14));
		btnInventario = new JButton("Inventario");
		btnInventario.setFont(new Font("Courier New",Font.PLAIN,14));
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Courier New",Font.PLAIN,14));
		btnModificar.setEnabled(false);
	}
	
	public void asignarListener(Control control) {
		btnGuardar.setActionCommand(Acciones.GUARDAR);
		btnModificar.setActionCommand(Acciones.MODIFICAR_PRODUCTO);
		btnInventario.setActionCommand(Acciones.INVENT);
		btnGuardar.addActionListener(control);
		btnModificar.addActionListener(control);
		btnInventario.addActionListener(control);
	}

	private void agregar() {
		this.add(jblISBN);
		this.add(txtISBN);
		this.add(jblNombre);
		this.add(txtNombre);
		this.add(jblAutor);
		this.add(txtAutor);
		this.add(jblCopias);
		this.add(txtCopias);
		this.add(jblGenero);
		this.add(cmbGenero);
		this.add(jblClasificacion);
		this.add(cmbClasificacion);
		this.add(btnGuardar);
		this.add(btnInventario);
		this.add(btnModificar);
	}
	
	public JTextField getTxtISBN() {
		return txtISBN;
	}
	
	public JTextField getTxtNombre() {
		return txtNombre;
	}
	
	public JTextField getTxtAutor() {
		return txtAutor;
	}
	
	public JTextField getTxtCopias() {
		return txtCopias;
	}
	
	public JButton getBtnGuardar() {
		return btnGuardar;
	}
	
	public JButton getBtnModificar() {
		return btnModificar;
	}
	
	public JComboBox<String> getCmbClasificacion() {
		return cmbClasificacion;
	}
	public JComboBox<String> getCmbGenero() {
		return cmbGenero;
	}

}
