package edu.uptc.vista;

import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import edu.uptc.logica.GestionUsuario;
import edu.uptc.logica.Usuario;
import edu.uptc.vista.Acciones;
import edu.uptc.control.Control;

public class PanelPrincipal extends JPanel implements Acciones{
 	private GestionUsuario gu;
	private JLabel fondo;
	private PanelEncabezado panelEncabezado;
	private PanelInicio panelInicio;
//	private PanelCrearLibro panelCrearLibro;
	private PanelMostrarLibro panelMostrarLibro;
	private PanelLoginAdmin panelLoginAdmin;
	private PanelLoginEmpleado panelLoginEmpleado;
//	private PanelLoginUsuario panelLoginUsuario;
	private PanelInferior panelInferior;
//	private PanelCrearEmpleado panelCrearEmpleado;
	private PanelMenu panelMenu;
	private PanelMostrarEmpleado panelMostrarEmpleado;

	public PanelPrincipal() {
	
		setBounds(1, 1, 750,550);
		fondo= new JLabel(new ImageIcon("src/edu/uptc/imagenes/parque2.jpg"));
		fondo.setBounds(1, 1, 750,550);
		
		inicializar();
		agregar();
	}

	private void inicializar() {
		gu = new GestionUsuario();
		panelEncabezado= new PanelEncabezado();
		panelInicio=new PanelInicio();
		panelLoginAdmin= new PanelLoginAdmin();
		panelLoginEmpleado=new PanelLoginEmpleado();
//		panelLoginUsuario= new PanelLoginUsuario();
//		panelCrearLibro=new PanelCrearLibro();
		panelInferior= new PanelInferior();
		panelMostrarEmpleado=new PanelMostrarEmpleado();
//		panelCrearEmpleado= new PanelCrearEmpleado();
		panelMostrarLibro= new PanelMostrarLibro();
		panelMenu=new PanelMenu();
	}

	private void agregar() {

		fondo.add(panelEncabezado);
		fondo.add(panelMenu);
		fondo.add(panelInferior);
		add(fondo);
	}
	
	public void iniciarPrograma(Control control) {
		panelMenu.asignarListener(control);
		panelLoginAdmin.asignarLister(control);
		panelInicio.asignarListener(control);
//		panelCrearLibro.asignarListener(control);
//		panelCrearEmpleado.asignarListener(control);
		panelMostrarLibro.getBtnEliminar().setActionCommand(Acciones.ELIMINAR);
		panelMostrarLibro.getBtnModificar().setActionCommand(Acciones.MODIFICAR);
		panelMostrarLibro.getBtnEliminar().addActionListener(control);
		panelMostrarLibro.getBtnModificar().addActionListener(control);
		panelMostrarEmpleado.getBtnEliminar().setActionCommand(Acciones.ELIMINAR_E);
		panelMostrarEmpleado.getBtnModificar().setActionCommand(Acciones.MODIFICAR_EMPLEADO);
		panelMostrarEmpleado.getBtnEliminar().addActionListener(control);
		panelMostrarEmpleado.getBtnModificar().addActionListener(control);
		setVisible(true);
	}
	public boolean encontrarUser(){
		boolean encontrado= false;

		for(int i=0; i< gu.getClientes().size();i++) {

			if (panelLoginAdmin.getTxtClave().getText().equals(gu.getClientes().get(i).getCedula())){

				encontrado = true;
				break;
			}else{
				encontrado = false;
			}
		}
		return encontrado;
	}

	public void activar(String seccion) {
		repaint();
		if (seccion.equals(Acciones.LOGIN)) {
			if(encontrarUser()){
				panelInicio.setVisible(true);
				fondo.add(panelInicio);
				repaint();
			}else{
				JOptionPane.showMessageDialog(null,"Cédula no registrada");
				System.out.println("uaisyfvgasuif");
				panelInicio.setVisible(false);
				panelInicio.remove(panelLoginAdmin);
				panelMenu.setVisible(true);
				fondo.add(panelMenu);
				repaint();
			}

		} else if (seccion.equals("Cerrar Seción")) {
			panelInicio.setVisible(false);
			panelInicio.remove(panelLoginAdmin);
			panelMenu.setVisible(true);
			fondo.add(panelMenu);
			repaint();
		} else if (seccion.equals("Empleado")) {
//			panelCrearEmpleado.setVisible(true);
//			fondo.add(panelCrearEmpleado);
//			repaint();
		} else if (seccion.equals("Libro")) {
//			panelCrearLibro.setVisible(true);
//			fondo.add(panelCrearLibro);
//			repaint();
		}else if (seccion.equals(Acciones.IN_ADMIN)) {
			panelMenu.setVisible(false);
			fondo.remove(panelMenu);
			panelLoginAdmin.setVisible(true);
			fondo.add(panelLoginAdmin);
			repaint();
		}else if (seccion.equals(Acciones.IN_EMPLEADO)) {
			panelMenu.setVisible(false);
			fondo.remove(panelMenu);
			panelLoginEmpleado.setVisible(true);
			fondo.add(panelLoginEmpleado);
			repaint();
		}else if (seccion.equals(Acciones.IN_USUARIO)) {
			panelMenu.setVisible(false);
			fondo.remove(panelMenu);
//			panelLoginUsuario.setVisible(true);
//			fondo.add(panelLoginUsuario);
			repaint();
		}else if (seccion.equals("Inventario")) {
			panelMostrarLibro.setVisible(true);
			fondo.add(panelMostrarLibro);
			repaint();
		}
		else if (seccion.equals("InventarioE")) {
			panelMostrarEmpleado.setVisible(true);
			fondo.add(panelMostrarEmpleado);
			repaint();
		}

	}

	public void desactivar(String seccion) {
		if (seccion.equals("Cerrar Seción")) {
			panelLoginAdmin.setVisible(false);
			fondo.remove(panelLoginAdmin);
			repaint();
		} else if (seccion.equals("Empleado")) {
//			panelCrearEmpleado.setVisible(false);
//			fondo.remove(panelCrearEmpleado);
			repaint();
		}else if (seccion.equals("Libro")) {
//			panelCrearLibro.setVisible(false);
//			fondo.remove(panelCrearLibro);
			repaint();
		}else if (seccion.equals("Inventario")) {
			panelMostrarLibro.setVisible(false);
			fondo.remove(panelMostrarLibro);
			repaint();
		}else if (seccion.equals(Acciones.IN_ADMIN)) {
			panelLoginAdmin.setVisible(false);
			fondo.remove(panelLoginAdmin);
			repaint();
		}else if (seccion.equals(Acciones.IN_EMPLEADO)) {
			panelLoginEmpleado.setVisible(false);
			fondo.remove(panelLoginEmpleado);
			repaint();
		}else if (seccion.equals(Acciones.IN_USUARIO)) {
//			panelLoginUsuario.setVisible(false);
//			fondo.remove(panelLoginUsuario);
			repaint();
		}else if (seccion.equals(Acciones.INVENT_E)) {
			panelMostrarEmpleado.setVisible(false);
			fondo.remove(panelMostrarEmpleado);
			repaint();
			}
	}

	@Override
	public String[] capturar(String seccion) {
		return new String[0];
	}

	@Override
	public void mostrar(String[][] salidas, String seccion) {

	}


//	public String[] capturar(String seccion) {
//		if(seccion.equals(Acciones.GUARDAR_EMPLEADO)) {
//			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//			String entradasE[]= {
//					panelCrearEmpleado.getTxtNombre().getText(),
//					panelCrearEmpleado.getTxtApellido().getText(),
//					panelCrearEmpleado.getTxtTelefono().getText(),
////					" "+ dateFormat.format(panelCrearEmpleado.getDateChooser().getDate()),
//					panelCrearEmpleado.getTxtUser().getText(),
//					panelCrearEmpleado.getTxtContraseña().getText()
//			};
//			return entradasE;}
//				else if (seccion.equals(Acciones.ELIMINAR_E)) {
//					String[] capturaE = new String[1];
//					capturaE[0] = "" + panelMostrarEmpleado.getjTableEmpleados().getSelectedRow();
//					return capturaE;
//				} else if (seccion.equals(Acciones.MODIFICAR_EMPLEADO)) {
//					String[] capturaE = new String[1];
//					capturaE[0] = "" + panelMostrarEmpleado.getjTableEmpleados().getSelectedRow();
//					return capturaE;
//				} else if (seccion.equals(Acciones.MODIFICAR_PE)) {
//					String[] entradasE = {
//
//							panelCrearEmpleado.getTxtNombre().getText(),
//							panelCrearEmpleado.getTxtApellido().getText(),
//							panelCrearEmpleado.getTxtContraseña().getText(),
//							panelCrearEmpleado.getTxtTelefono().getText(),
//							panelCrearEmpleado.getTxtUser().getText()
//						};
//					limpiarEspaciosEmple();
//					repaint();
//					return entradasE;
//				} else if (seccion.equals(Acciones.GUARDAR)) {
//			String[] entradas = {
//					panelCrearLibro.getTxtISBN().getText(),
//					panelCrearLibro.getTxtNombre().getText(),
//					panelCrearLibro.getTxtAutor().getText(),
//					panelCrearLibro.getTxtCopias().getText(),
//				"" + panelCrearLibro.getCmbGenero().getSelectedItem(),
//				"" + panelCrearLibro.getCmbClasificacion().getSelectedItem()
//			};
//			return entradas;
//		} else if (seccion.equals(Acciones.ELIMINAR)) {
//			String[] captura = new String[1];
//			captura[0] = "" + panelMostrarLibro.getjTableLibros().getSelectedRow();
//			return captura;
//		} else if (seccion.equals(Acciones.MODIFICAR)) {
//			String[] captura = new String[1];
//			captura[0] = "" + panelMostrarLibro.getjTableLibros().getSelectedRow();
//			return captura;
//		} else if (seccion.equals(Acciones.MODIFICAR_PRODUCTO)) {
//			String[] entradas = {
//
//					panelCrearLibro.getTxtNombre().getText(),
//					panelCrearLibro.getTxtAutor().getText(),
//					panelCrearLibro.getTxtCopias().getText()
//				};
//			limpiarEspaciosLibro();
//			repaint();
//			return entradas;
//		}
//		return null;
//	}

//	public void mostrar(String[][] salidas, String seccion) {
//		limpiarTabla();
//		limpiarTabla_E();
//		if (seccion.equals(Acciones.INVENT)) {
//			for (int i = 0; i < salidas.length; i++) {
//				panelMostrarLibro.getDefaultTableModel().addRow(salidas[i]);
//			}
//		} 		else if(seccion.equals(Acciones.INVENT_E)) {
//			for (int i = 0; i < salidas.length; i++) {
//				panelMostrarEmpleado.getDefaultTableModel().addRow(salidas[i]);
//			}
//		}
//			else if (seccion.equals(Acciones.MODIFICAR)) {
//			panelCrearLibro.getTxtNombre().setText(salidas[0][0]);
//			panelCrearLibro.getTxtAutor().setText(salidas[0][1]);
//			panelCrearLibro.getTxtCopias().setText(salidas[0][2]);
//			panelCrearLibro.getTxtISBN().setEditable(false);
//			panelCrearLibro.getBtnGuardar().setEnabled(false);
//			panelCrearLibro.getBtnModificar().setEnabled(true);
//
//		}else if(seccion.equals(Acciones.MODIFICAR_EMPLEADO)) {
//			panelCrearEmpleado.getTxtNombre().setText(salidas[0][0]);
//			panelCrearEmpleado.getTxtApellido().setText(salidas[0][1]);
//			panelCrearEmpleado.getTxtTelefono().setText(salidas[0][2]);
//			panelCrearEmpleado.getTxtContraseña().setText(salidas[0][4]);
//			panelCrearEmpleado.getTxtUser().setEditable(false);
//			panelCrearEmpleado.getBtnGuardar().setEnabled(false);
//			panelCrearEmpleado.getBtnModificar().setEnabled(true);
//		}
//			repaint();
//	}
	
	private void limpiarTabla() {
		for (int i = 0; i < panelMostrarLibro.getDefaultTableModel().getRowCount(); i++) {
			panelMostrarLibro.getDefaultTableModel().removeRow(i);
			i--;
		}
	}
	private void limpiarTabla_E() {
		for (int i = 0; i < panelMostrarEmpleado.getDefaultTableModel().getRowCount(); i++) {
			panelMostrarEmpleado.getDefaultTableModel().removeRow(i);
			i--;
		}
	}
	public void mensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
//	public void limpiarEspaciosLibro() {
//		panelCrearLibro.getTxtNombre().setText("");
//		panelCrearLibro.getTxtAutor().setText("");
//		panelCrearLibro.getTxtCopias().setText("");
//		panelCrearLibro.getTxtISBN().setEditable(true);
//		panelCrearLibro.getBtnModificar().setEnabled(false);
//		panelCrearLibro.getBtnGuardar().setEnabled(true);
//	}
//	public void limpiarEspaciosEmple() {
//		panelCrearEmpleado.getTxtNombre().setText("");
//		panelCrearEmpleado.getTxtApellido().setText("");
//		panelCrearEmpleado.getTxtTelefono().setText("");
//		panelCrearEmpleado.getTxtUser().setText("");
//		panelCrearEmpleado.getTxtContraseña().setText("");
//		panelCrearEmpleado.getTxtUser().setEditable(true);
//		panelCrearEmpleado.getBtnModificar().setEnabled(false);
//		panelCrearEmpleado.getBtnGuardar().setEnabled(true);
//	}
}
