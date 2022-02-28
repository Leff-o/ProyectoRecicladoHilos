package edu.uptc.logica;

import java.util.ArrayList;

public class GestionUsuario{

	private ArrayList<Usuario> clientes;
	
	public GestionUsuario() {
		clientes = new ArrayList<Usuario>();
		cargarDatos();
	}
	
	private void cargarDatos() {
		Usuario cliente = new Usuario("Juan","56983");
		clientes.add(cliente);
		cliente = new Usuario("José","12345");
		clientes.add(cliente);
		 cliente = new Usuario("Juan","78945");
		clientes.add(cliente);
	}
	public String crearCliente(String[] datos) {
		if(!datos[0].equals("")&& !datos[1].equals("")) {
			Usuario cliente = new Usuario(datos[0],datos[1]);
			clientes.add(cliente);
			return "cliente guardado correctamente";
		}else {
			return "Existen campos vacíos";
		}
	}
	public String[][] mostrarClientes(){
		String[][] datos = new String[clientes.size()][8];
		for(int i=0; i<clientes.size();i++) {
			datos[i][0]= clientes.get(i).getNombre();
			datos[i][1]= clientes.get(i).getCedula();
		}
		return datos;
	}
	public String eliminarCliente(String posicion) {
		if(Integer.parseInt(posicion)>= clientes.size()) {
			return "cliente no encontrado";
		}else {
			clientes.remove(Integer.parseInt(posicion));
			return"cliente eliminado correctamente";
		}
	}
	public String modificarCliente(String [] entradas) {
		int posicion = buscarPosicion(entradas[1]);
		if(posicion !=-1) {
			clientes.get(posicion).setNombre(entradas[0]);
			clientes.get(posicion).setCedula(entradas[1]);
			return "cliente modificado corretamente";
		}else {
			return "Error al modificar";
		}
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

