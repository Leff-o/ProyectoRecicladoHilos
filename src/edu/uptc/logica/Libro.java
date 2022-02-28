package edu.uptc.logica;


public class Libro {

	private String ISBN;
	private String nombre;
	private String autor;
	private String numeroCopias;
	private Clasificacion clasificacionEdad;
	private Genero genero;

	public Libro(String iSBN, String nombre, String autor, String numeroCopias, Clasificacion clasificacionEdad, Genero genero) {
		
		this.ISBN = iSBN;
		this.nombre = nombre;
		this.autor = autor;
		this.numeroCopias = numeroCopias;
		this.clasificacionEdad = clasificacionEdad;
		this.genero = genero;
	}

	public String toString() {
		return "Libro [ISBN=" + ISBN + ", nombre=" + nombre + ", autor=" + autor + ", numeroCopias=" + numeroCopias
				+ ", clasificacionEdad=" + clasificacionEdad + ", genero=" + genero + "]";
	}

	public String getISBN() {
		return ISBN;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor=autor;
	}

	public String getNumeroCopias() {
		return numeroCopias;
	}

	public void setNumeroCopias(String numeroCopias) {
		this.numeroCopias = numeroCopias;
	}

	public Genero getGenero() {
		return genero;
	}
	
	public Clasificacion getClasificacionEdad() {
		return clasificacionEdad;
	}
}
