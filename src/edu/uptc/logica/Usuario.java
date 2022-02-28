package edu.uptc.logica;

public class Usuario {

	private String nombre;
	private String cedula;

	private Caja cajaDeUsuario;     // Caja en la que será atendido el cliente
	private int numeroCajaUsuario;  // Numero de la caja en la que el cliente está siendo atendido
	boolean cajaOcupada = false;    // Booleano auxiliar
	double dineroGastado = 0;       // Dinero que ha gastado el cliente
	double tiempoMedio = 0;         // Tiempo del cliente que usaremos para calcular el tiempo medio
	private int numeroCliente = 0;

	public Usuario(String nombre, String cedula, Caja cajaDeUsuario, int numeroCajaUsuario) {
		this.nombre = nombre;
		this.cedula = cedula;
		this.cajaDeUsuario = cajaDeUsuario;
		this.numeroCajaUsuario = numeroCajaUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Caja getCajaDeUsuario() {
		return cajaDeUsuario;
	}

	public void setCajaDeUsuario(Caja cajaDeUsuario) {
		this.cajaDeUsuario = cajaDeUsuario;
	}

	public void setNumeroCajaUsuario(int numeroCajaUsuario) {
		this.numeroCajaUsuario = numeroCajaUsuario;
	}

	public boolean isCajaOcupada() {
		return cajaOcupada;
	}

	public void setCajaOcupada(boolean cajaOcupada) {
		this.cajaOcupada = cajaOcupada;
	}

	public double getDineroGastado() {
		return dineroGastado;
	}

	public void setDineroGastado(double dineroGastado) {
		this.dineroGastado = dineroGastado;
	}

	public double getTiempoMedio() {
		return tiempoMedio;
	}

	public void setTiempoMedio(double tiempoMedio) {
		this.tiempoMedio = tiempoMedio;
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public int getNumeroCajaUsuario() {
		return numeroCajaUsuario;
	}
}
