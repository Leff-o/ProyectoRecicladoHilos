package edu.uptc.logica;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class GestionEmpleado {
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date fechaNacimiento;
	ArrayList<Empleado> empleados;
	
	public GestionEmpleado() {
		empleados = new ArrayList<Empleado>();
		cargarDatos();
		
	}
	private void cargarDatos() {
		
		Empleado empleado = new Empleado("Alexander","Romero","123123",new Date(13/07/1999),"Alex21","2107");
		empleados.add(empleado);

	}
	
	public String crearEmpleado(String[] datos) {
		if(!datos[0].equals("")&& !datos[1].equals("")&&!datos[2].equals("")&&!datos[3].equals("")&&!datos[4].equals("")) {
			
			try {
				fechaNacimiento = simpleDateFormat.parse(datos[3]);
				Empleado empleado = new Empleado(datos[0],datos[1],datos[2],fechaNacimiento,datos[4],datos[5]);
				empleados.add(empleado);
			} catch (ParseException e) {
				e.printStackTrace();
			}

			return "EMPLEADO REGISTRADO";
		}else {
			return "DATOS VACIOS";
		}
	}

	public String[][] mostrarEmpleado(){
		
		String[][] datos = new String[empleados.size()][5];
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		for(int i=0; i<empleados.size();i++) {
			datos[i][0]= empleados.get(i).getNombre();
			datos[i][1]= empleados.get(i).getApellido();
			datos[i][2]= empleados.get(i).getTelefono();
			datos[i][3]= dateFormat.format(empleados.get(i).getFechaNacimiento());
			datos[i][4]= empleados.get(i).getUsuario();

		}
		return datos;
	}

	public String eliminarEmpleado(String posicion) {
		if (Integer.parseInt(posicion) >= empleados.size()) {
			return "EMPLEADO NO EXISTENTE";
		} else {
			empleados.remove(Integer.parseInt(posicion));
			return "EMPLEADO ELIMINADO";
		}
	}

	public String modificarEmpleado(String [] entradasE) {
		int posicion = buscarPosicion(entradasE[0]);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		if(posicion !=-1) {
		
			try {
				empleados.get(posicion).setNombre(entradasE[0]);
				empleados.get(posicion).setApellido(entradasE[1]);
				empleados.get(posicion).setTelefono(entradasE[2]);
				empleados.get(posicion).setFechaNacimiento(dateFormat.parse(entradasE[3]));
				empleados.get(posicion).setUsuario(entradasE[4]);
				empleados.get(posicion).setContraseña(entradasE[5]);
		
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "EMPLEADO MODIFICADO";
		}else {
			return "ERROR AL MODIFICAR";
		}
	}

	public int buscarPosicion(String usuario) {
		for(int i=0; i<empleados.size();i++) {
			if(empleados.get(i).getUsuario().equals(usuario)) {
				return i;
			}
		}
		return -1;
	}

	public ArrayList<Empleado> getEmpleados(){
		return empleados;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
}
