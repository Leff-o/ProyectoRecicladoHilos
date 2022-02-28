package edu.uptc.logica;


import java.util.ArrayList;
import edu.uptc.logica.Clasificacion;
import edu.uptc.logica.Genero;
import edu.uptc.logica.Libro;

public class GestionLibro {
	
	private ArrayList<Libro> libros;


	public GestionLibro(){
		libros= new ArrayList<Libro>();
		cargarDatos();
	}
	
	private void cargarDatos() {
		
		Libro libro = new Libro("843277", "100 años de soledad","Gabriel Garcia","2", Clasificacion.todo_publico,Genero.ciencia_Ficción);
		libros.add(libro);

	}
	public String crearProducto(String[] datos) {
		if (!datos[0].equals("") && !datos[1].equals("") && !datos[2].equals("") && !datos[3].equals("")) {
			Libro libro = new Libro(datos[0],datos[1],datos[2],datos[3], Clasificacion.valueOf(datos[5]),Genero.valueOf(datos[4]));
			libros.add(libro);
			return "GUARDADO";
		} else {
			return "DATOS VACIOS";
		}
	}
	
	public String[][] mostrarDatos() {
		String[][] datos = new String[libros.size()][6];
		for (int i = 0; i < libros.size(); i++) {
			datos[i][0] = libros.get(i).getISBN();
			datos[i][1] = libros.get(i).getNombre();
			datos[i][2] = libros.get(i).getAutor();
			datos[i][3] = libros.get(i).getNumeroCopias();
			datos[i][4] = "" + libros.get(i).getClasificacionEdad();
			datos[i][5] = "" + libros.get(i).getGenero();
		}
		
		return datos;
	}
	
	public String eliminarProducto(String posicion) {
		if (Integer.parseInt(posicion) >= libros.size()) {
			return "LIBRO NO EXISTENTE";
		} else {
			libros.remove(Integer.parseInt(posicion));
			return "LIBRO ELIMINADO";
		}
	}
	
	public String modificarProducto(String[] entradas) {
		int posicion = buscarPosicion(entradas[0]);
		if (posicion != -1) {
			libros.get(posicion).setNombre(entradas[0]);
			libros.get(posicion).setAutor(entradas[1]);
			libros.get(posicion).setNumeroCopias(entradas[2]);
			return "LIBRO MODIFICADO";
		} else {
			return "ERROR AL MODIFICAR LIBRO";
		}
	}
	
	public int buscarPosicion(String nombre) {
		for (int i = 0; i < libros.size(); i++) {
			if (libros.get(i).getISBN().equals(nombre)) {
				return i;
			}
		}
		return -1;
	}
	
	public ArrayList<Libro> getLibros() {
		return libros;
	}
}
