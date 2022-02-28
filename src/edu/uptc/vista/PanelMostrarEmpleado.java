package edu.uptc.vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class PanelMostrarEmpleado extends JPanel{

	private JScrollPane jScrollPane;
	private DefaultTableModel defaultTableModel;
	private JTable jTableEmpleados;
	private JButton btnEliminar;
	private JButton btnModificar;
	
	public PanelMostrarEmpleado() {
		setBorder(new TitledBorder(""));
		setBounds(470, 110, 470, 350);
		setBackground(Color.WHITE);
		setLayout(null);
		
		inicializar();
		agregar();
	}

	private void inicializar() {
		String[] cabeceras = {"Nombre", "Apellido", "Teléfono","FechaNacimiento","Usuario"};
		defaultTableModel = new DefaultTableModel();
		defaultTableModel.setColumnIdentifiers(cabeceras);
		jTableEmpleados = new JTable(defaultTableModel);
		jTableEmpleados.setRowSelectionAllowed(false);
		jScrollPane = new JScrollPane(jTableEmpleados);
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

	public JTable getjTableEmpleados() {
		return jTableEmpleados;
	}

	public void setjTableEmpleados(JTable jTableEmpleados) {
		this.jTableEmpleados = jTableEmpleados;
	}
	
	public JButton getBtnEliminar() {
		return btnEliminar;
	}
	
	public JButton getBtnModificar() {
		return btnModificar;
	}
	

}
