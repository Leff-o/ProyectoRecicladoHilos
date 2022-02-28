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
		setBounds(290, 145, 150, 260);
		setBackground(Color.WHITE);
		setLayout(null);
		
		inicializar();
		agregar();
	}

	private void inicializar() {
		
		btnCerrar = new JButton("VOLVER");
		btnCerrar.setFont(new Font("Courier New",Font.PLAIN,14));
		btnCerrar.setBounds(15, 30, 120, 25);
		
		btnEmpleado = new JButton("VER ESTADO");
		btnEmpleado.setFont(new Font("Courier New",Font.PLAIN,14));
		btnEmpleado.setBounds(15, 110, 120, 25);
		
		btnLibro = new JButton("TOMAR TURNO");
		btnLibro.setFont(new Font("Courier New",Font.PLAIN,14));
		btnLibro.setBounds(15, 190, 125, 25);
		
		
		
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
