package edu.uptc.logica;


public class Persona {
	
	private String nombre;
	private String apellido;	
	private String telefono;
	private String usuario;
	private String contrase�a;
	
	public Persona(String nombre,String apellido, String telefono, String usuario, String contrase�a){
		this.nombre=nombre;
		this.apellido=apellido;
		this.telefono= telefono;
		this.usuario= usuario;
		this.contrase�a=contrase�a;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	
}
