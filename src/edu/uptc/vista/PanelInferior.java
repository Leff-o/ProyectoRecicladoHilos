package edu.uptc.vista;

import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelInferior extends JPanel{

	JLabel barraInferior;
	
	public PanelInferior() {

		setBackground(Color.WHITE);
		setLayout(new FlowLayout());
		setBounds(200, 475, 850,30);
		
		inicializar();
		agregar();
	}

	private void inicializar() {

		barraInferior=new JLabel("     BIBLIOTECA PUBLICA MUNICIPAL"+"\n"+" VILLA DE MONGUI");
		barraInferior.setFont(new Font("Colonna MT",Font.PLAIN,22));
		
	}
	
	private void agregar() {
		add(barraInferior);
		
	}
}
