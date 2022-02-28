package edu.uptc.logica;

import java.util.ArrayList;

public class GestionUsuario{

	private ArrayList<Usuario> clientes;
	
	public GestionUsuario() {
		clientes = new ArrayList<Usuario>();
		cargarDatos();
	}
	
	private void cargarDatos() {
		Usuario cliente = new Usuario("Juan","56983",new Caja(5),2);
		clientes.add(cliente);
		Usuario cliente2 = new Usuario("Juan","123",new Caja(4),6);
		clientes.add(cliente2);
		Usuario cliente3 = new Usuario("Juan","999",new Caja(6),3);
		clientes.add(cliente3);
		Usuario cliente4 = new Usuario("Juan","777",new Caja(7),9);
		clientes.add(cliente4);

	}
	public String[][] mostrarClientes(){
		String[][] datos = new String[clientes.size()][8];
		for(int i=0; i<clientes.size();i++) {
			datos[i][0]= clientes.get(i).getNombre();
			datos[i][1]= clientes.get(i).getCedula();
		}
		return datos;
	}
	public int buscarPosicion(String apellido) {
		for(int i=0; i<clientes.size();i++) {
			if(clientes.get(i).getCedula().equals(apellido)) {
				return i;
			}
		}
		return -1;
	}
		public ArrayList<Usuario> getClientes() {
			return clientes;
		}
	
}

