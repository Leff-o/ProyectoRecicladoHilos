package edu.uptc.vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class PanelMostrarLibro extends JPanel{

	private JScrollPane jScrollPane;
	private DefaultTableModel defaultTableModel;
	private JTable jTableLibros;
	private JButton btnEliminar;
	private JButton btnModificar;
	
	public PanelMostrarLibro() {
		setBorder(new TitledBorder("Libros"));
		setBounds(460, 110, 470, 350);
		setBackground(Color.WHITE);
		setLayout(null);
		
		inicializar();
		agregar();
	}

	private void inicializar() {
		String[] cabeceras = {"ISBN", "Nombre", "Autor", "Genero","Copias","Publicación"};
		defaultTableModel = new DefaultTableModel();
		defaultTableModel.setColumnIdentifiers(cabeceras);
		jTableLibros = new JTable(defaultTableModel);
		jTableLibros.setFont(new Font("Courier New",Font.PLAIN,14));
		jTableLibros.setRowSelectionAllowed(false);
		jScrollPane = new JScrollPane(jTableLibros);
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setFont(new Font("Courier New",Font.PLAIN,14));
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setFont(new Font("Courier New",Font.PLAIN,14));
	}

	private void agregar() {
		jScrollPane.setBounds(10, 25, 450, 290);
		add(jScrollPane);
		btnModificar.setBounds(10, 318, 120, 25);
		add(btnModificar);
		btnEliminar.setBounds(140, 318, 120, 25);
		add(btnEliminar);
	}
	
	public DefaultTableModel getDefaultTableModel() {
		return defaultTableModel;
	}
	public JScrollPane getjScrollPane() {
		return jScrollPane;
	}

	public void setjScrollPane(JScrollPane jScrollPane) {
		this.jScrollPane = jScrollPane;
	}

	public void setDefaultTableModel(DefaultTableModel defaultTableModel) {
		this.defaultTableModel = defaultTableModel;
	}

	public JTable getjTableLibros() {
		return jTableLibros;
	}

	public void setjTableHistorial(JTable jTableLibros) {
		this.jTableLibros = jTableLibros;
	}
	
	public JButton getBtnEliminar() {
		return btnEliminar;
	}
	
	public JButton getBtnModificar() {
		return btnModificar;
	}
	


}
