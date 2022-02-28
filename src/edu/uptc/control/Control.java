package edu.uptc.control;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;


import edu.uptc.vista.Acciones;

public class Control  implements ActionListener{
	
	private Acciones acciones;


	
	public Control(Acciones acciones) {
		this.acciones= acciones;
	}

	public void actionPerformed(ActionEvent evento) {
		switch (evento.getActionCommand()) {
		
		case Acciones.LOGIN:
			acciones.desactivar(Acciones.ADMIN);
			acciones.activar(Acciones.LOGIN);
			break;
			
		case Acciones.ADMIN:
			acciones.desactivar(Acciones.EMPLE);
			acciones.activar(Acciones.ADMIN);
			break;
			
		case Acciones.LIBRO:
			acciones.desactivar(Acciones.EMPLE);
			acciones.desactivar(Acciones.INVENT);
			acciones.activar(Acciones.LIBRO);
			break;
			
//		case Acciones.INVENT:
//			acciones.desactivar(Acciones.LIBRO);
//			acciones.activar(Acciones.INVENT);
//			acciones.mostrar(biblioteca.mostrarDatos(), Acciones.INVENT);
//			break;

//		case Acciones.EMPLE:
//			acciones.desactivar(Acciones.LIBRO);
//			acciones.desactivar(Acciones.INVENT_E);
//			acciones.activar(Acciones.EMPLE);
//			acciones.mostrar(biblioteca.mostrarDatos(), Acciones.INVENT);
//			break;
			
		case Acciones.IN_ADMIN:
			acciones.desactivar(Acciones.MENU);
			acciones.desactivar(Acciones.IN_EMPLEADO);
			acciones.desactivar(Acciones.IN_USUARIO);
			acciones.activar(Acciones.IN_ADMIN);
			break;
			
		case Acciones.IN_EMPLEADO:
			acciones.desactivar(Acciones.MENU);
			acciones.desactivar(Acciones.IN_ADMIN);
			acciones.desactivar(Acciones.IN_USUARIO);
			acciones.activar(Acciones.IN_EMPLEADO);
			break;
			
		case Acciones.IN_USUARIO:
			acciones.desactivar(Acciones.MENU);
			acciones.desactivar(Acciones.IN_ADMIN);
			acciones.desactivar(Acciones.IN_EMPLEADO);
			acciones.activar(Acciones.IN_USUARIO);
			break;

//		case Acciones.GUARDAR:
//			String [] entradas = acciones.capturar(Acciones.GUARDAR);
//			acciones.mensaje(biblioteca.crearProducto(entradas));
//			break;

//		case Acciones.ELIMINAR:
//			acciones.mensaje(biblioteca.eliminarProducto(acciones.capturar(Acciones.ELIMINAR)[0]));
//			acciones.desactivar(Acciones.INVENT);
//			acciones.activar(Acciones.INVENT);
//			acciones.mostrar(biblioteca.mostrarDatos(), Acciones.INVENT);
//			break;
//
//		case Acciones.MODIFICAR:
//			int posicion = Integer.parseInt(acciones.capturar(Acciones.MODIFICAR)[0]);
//			String[][] captura = new String[1][3];
//			captura[0][0] = biblioteca.getLibros().get(posicion).getISBN();
//			captura[0][1] = biblioteca.getLibros().get(posicion).getNombre();
//			captura[0][2] = "" + biblioteca.getLibros().get(posicion).getNumeroCopias();
//			acciones.desactivar(Acciones.INVENT);
//			acciones.activar(Acciones.LIBRO);
//			acciones.mostrar(captura, Acciones.MODIFICAR);
//			break;
//
//		case Acciones.MODIFICAR_PRODUCTO:
//			entradas = acciones.capturar(Acciones.MODIFICAR_PRODUCTO);
//			acciones.mensaje(biblioteca.modificarProducto(entradas));
//			break;

		default:
			break;
		}
	}
}
