package edu.uptc.vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import edu.uptc.control.Control;

public class PanelMenu extends JPanel{

	private JButton btnOpcionDos;
	private JButton btnOpcionTres;

	
	public PanelMenu() {
		setBorder(new TitledBorder("Menú"));
		setBounds(543, 170, 200,200);
		setBackground(Color.WHITE);
		setLayout(null);
		inicializar();
		agregar();
	}

	private void inicializar() {

		btnOpcionDos= new JButton("Empleado");
		btnOpcionDos.setFont(new Font("OCR A Extended",Font.PLAIN,14));
		btnOpcionDos.setBounds(47, 85, 100, 30);
		
		btnOpcionTres= new JButton("CLIENTE");
		btnOpcionTres.setFont(new Font("OCR A Extended",Font.PLAIN,14));
		btnOpcionTres.setBounds(27, 135, 138, 30);
	}

	private void agregar() {

		add(btnOpcionDos);
		add(btnOpcionTres);
	}
	
	public void asignarListener(Control control) {
		btnOpcionDos.setActionCommand(Acciones.IN_EMPLEADO);
		btnOpcionDos.addActionListener(control);
		btnOpcionTres.setActionCommand(Acciones.IN_ADMIN);
		btnOpcionTres.addActionListener(control);
	}

}
