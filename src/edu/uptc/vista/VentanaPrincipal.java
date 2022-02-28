package edu.uptc.vista;

import java.awt.FlowLayout;


import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

	public PanelPrincipal panelPrincipal;
	
	public VentanaPrincipal() {
		setSize(750,550);
		setLocationRelativeTo(null);
		setTitle("BM biblioteca");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		inicializar();
		agregar();
	}

	private void inicializar() {
		
		panelPrincipal= new PanelPrincipal();

	}

	private void agregar() {
		add(panelPrincipal);
		
	}
	
	
}
