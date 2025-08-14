package ar.edu.unlp.info.oo1.parcial_facturacion_energia;

import java.time.LocalDate;

public class ClienteIndustria extends Cliente{
	
	private String nombre;
	
	public ClienteIndustria(String direccion, String nombre) {
		super(direccion);
		this.nombre = nombre;
	}
	
	public double calcularDescuento(Medicion medicion) {
		Medicion mesPasado = this.buscarConsumo(medicion.getAnio(),medicion.getMes()-1);
		if (mesPasado != null && medicion.getConsumo() < mesPasado.getConsumo()) {
			return 0.02;
		}
		return 0;
	}

}
