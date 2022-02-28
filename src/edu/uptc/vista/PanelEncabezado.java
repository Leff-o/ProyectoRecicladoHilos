package edu.uptc.vista;

import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelEncabezado extends JPanel{

	JLabel imagenBandera;
	JLabel encabezadoNombre;
	ImageIcon bandera;
	
	public PanelEncabezado() {

		setBackground(Color.WHITE);
		setLayout(new FlowLayout());
		setBounds(200, 0, 850, 85);
		
		inicializar();
		agregar();
	}

	private void inicializar() {
		
		imagenBandera= new JLabel(new ImageIcon("src/edu/uptc/imagenes/imagenBandera.png"));
		encabezadoNombre=new JLabel("     BIBLIOTECA PUBLICA MUNICIPAL"+"\n"+" VILLA DE MONGUI");
		encabezadoNombre.setFont(new Font("Colonna MT",Font.PLAIN,22));
		
	}
	
	private void agregar() {
		add(imagenBandera);
		add(encabezadoNombre);
		
	}


}
