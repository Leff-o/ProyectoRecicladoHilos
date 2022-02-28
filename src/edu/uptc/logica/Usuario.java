package edu.uptc.logica;

public class Usuario extends Persona {
	
	private String direccion;
	private String ciudad;
	private String departamento;
	
	public Usuario(String nombre, String apellido, String telefono, String usuario, String contraseña,String direccion,String ciudad,String departamento) {
		super(nombre, apellido, telefono, usuario, contraseña);
		
		this.direccion=direccion;
		this.ciudad=ciudad;
		this.departamento=departamento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
}
