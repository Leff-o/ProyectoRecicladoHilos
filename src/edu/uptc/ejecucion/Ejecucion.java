package edu.uptc.ejecucion;

import edu.uptc.control.Control;

import edu.uptc.vista.VentanaPrincipal;

public class Ejecucion {



	public static void main(String[] args) {
		VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
		Control control = new Control(ventanaPrincipal.panelPrincipal);
		ventanaPrincipal.panelPrincipal.iniciarPrograma(control);
		ventanaPrincipal.setVisible(true);


	}
}
