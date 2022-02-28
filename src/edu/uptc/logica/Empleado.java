package edu.uptc.logica;

import java.util.Date;

public class Empleado extends Persona {
	
	private Date fechaNacimiento;


	public Empleado(String nombre, String apellido, String telefono, Date fechaNacimiento,String usuario, String contraseña) {
		super(nombre, apellido, telefono, usuario, contraseña);
		this.fechaNacimiento= fechaNacimiento;
	}


	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String toString() {
	
		return "nombre"+getNombre()+"Apellido"+getApellido()+"telefono"+getTelefono()
		+"Fecha"+getFechaNacimiento()+"usuario"+getUsuario();
	}


	
}
