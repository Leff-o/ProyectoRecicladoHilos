package edu.uptc.logica;

import java.util.ArrayList;

public class GestionUsuario{

	private ArrayList<Usuario> clientes;
	
	public GestionUsuario() {
		clientes = new ArrayList<Usuario>();
		cargarDatos();
	}
	
	private void cargarDatos() {
		Usuario cliente = new Usuario("Juan","Gonzalez","122313","juan01","olakhace","calle1","yopal,","casanare");
		clientes.add(cliente);
		cliente = new Usuario("José","Caro","231345","jose04","kokakola","calle22","Tauramena,","casanare");
		clientes.add(cliente);
		 cliente = new Usuario("Juan","Gonzalez","122313","juan01","olakhace","calle1","yopal,","casanare");
		clientes.add(cliente);
	}

	public String crearCliente(String[] datos) {
		if(!datos[0].equals("")&& !datos[1].equals("")&&!datos[2].equals("")&&!datos[3].equals("")&&!datos[4].equals("")&&!datos[5].equals("")&&!datos[6].equals("")&& !datos[7].equals("")) {
			Usuario cliente = new Usuario(datos[0],datos[1],datos[2],datos[3],datos[4],datos[5],datos[6],datos[7]);
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
			datos[i][1]= clientes.get(i).getApellido();
			datos[i][2]= clientes.get(i).getTelefono();
			datos[i][3]= clientes.get(i).getCiudad();
			datos[i][4]= clientes.get(i).getDepartamento();
			datos[i][5]= clientes.get(i).getDireccion();
			datos[i][6]= clientes.get(i).getUsuario();
			datos[i][7]= clientes.get(i).getContraseña();
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
			clientes.get(posicion).setApellido(entradas[1]);
			clientes.get(posicion).setTelefono(entradas[2]);
			clientes.get(posicion).setUsuario(entradas[3]);
			clientes.get(posicion).setContraseña(entradas[4]);
			clientes.get(posicion).setDireccion(entradas[5]);
			clientes.get(posicion).setCiudad(entradas[6]);
			clientes.get(posicion).setDepartamento(entradas[7]);
			
			return "cliente modificado corretamente";
		}else {
			return "Error al modificar";
		}
	}
	public int buscarPosicion(String apellido) {
		for(int i=0; i<clientes.size();i++) {
			if(clientes.get(i).getApellido().equals(apellido)) {
				return i;
			}
		}
		return -1;
	}
		public ArrayList<Usuario> getClientes(){
			return clientes;
		}
	
}

