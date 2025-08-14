package ar.edu.unlp.info.oo1.parcial_facturacion_energia;

import java.time.LocalDate;

public class ClienteResidencial extends Cliente{
	
	private String nombre;
	private String apellido;
	
	public ClienteResidencial(String direccion, String nombre, String apellido) {
		super(direccion);
		this.apellido = apellido;
		this.nombre = nombre;
	}
	
	public double calcularDescuento(Medicion medicion) {
		Medicion anioPasado = this.buscarConsumo(medicion.getAnio()-1,medicion.getMes());
		if (anioPasado == null || medicion.getConsumo() < anioPasado.getConsumo()) {
			return 0.1;
		}
		return 0;
	}

}