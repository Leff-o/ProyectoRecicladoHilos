package edu.uptc.vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import edu.uptc.control.Control;

public class PanelInicio extends JPanel {

	JButton btnCerrar;
	JButton btnEmpleado;
	JButton btnLibro;
	
	public PanelInicio() {
		setBorder(new TitledBorder("Menú"));
		setBounds(290, 145, 160, 260);
		setBackground(Color.WHITE);
		setLayout(null);
		
		inicializar();
		agregar();
	}

	private void inicializar() {
		
		btnCerrar = new JButton("Cerrar Seción");
		btnCerrar.setFont(new Font("Courier New",Font.PLAIN,14));
		btnCerrar.setBounds(7, 30, 145, 25);
		
		btnEmpleado = new JButton("Empleado");
		btnEmpleado.setFont(new Font("Courier New",Font.PLAIN,14));
		btnEmpleado.setBounds(20, 110, 110, 25);
		
		btnLibro = new JButton("Libro");
		btnLibro.setFont(new Font("Courier New",Font.PLAIN,14));
		btnLibro.setBounds(20, 190, 110, 25);
		
		
		
	}

	private void agregar() {
	
		add(btnCerrar);
		add(btnEmpleado);
		add(btnLibro);
	}

	public void asignarListener(Control control) {
		btnCerrar.setActionCommand(Acciones.ADMIN);
		btnCerrar.addActionListener(control);
		
		btnEmpleado.setActionCommand(Acciones.EMPLE);
		btnEmpleado.addActionListener(control);
		
		btnLibro.setActionCommand(Acciones.LIBRO);
		btnLibro.addActionListener(control);
	}
}
