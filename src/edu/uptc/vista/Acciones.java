package edu.uptc.vista;

public interface Acciones {
	
	public static String ADMIN = "Cerrar Seción";
	public static String EMPLE = "Empleado";
	public static String LIBRO = "Libro";
	public static String LOGIN = "Iniciar Seción";
	public static String INVENT = "Inventario";
	public static String GUARDAR = "guardarL";
	public static String MODIFICAR = "modificar";
	public static String ELIMINAR = "eliminar";
	public static String MODIFICAR_PRODUCTO = "modificarProducto";
	public static String IN_USUARIO="ingresarU";
	public static String IN_EMPLEADO= "ingresarE";
	public static String IN_ADMIN="ingresarA";
	public static String MENU="ingresarA";
	public static String GUARDAR_EMPLEADO = "guardarE";
	public static String INVENT_E = "InventarioE";
	public static String MODIFICAR_EMPLEADO = "ModificarE";
	public static String ELIMINAR_E = "eliminarE";
	public static String MODIFICAR_PE = "modificarEmpleado";
	
	public void activar(String seccion);
	public void desactivar(String seccion);
	public String[] capturar(String seccion);
	public void mostrar(String[][] salidas, String seccion);
	public void mensaje(String mensaje);
}
