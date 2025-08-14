package ar.edu.unlp.info.oo1.parcial_impuestos;

import java.time.LocalDate;

public class Embarcacion extends PropiedadMueble implements Bien{
	
	private String nombre;
	
	public Embarcacion (String patente, LocalDate fechaFabricacion, double valor, String nombre) {
		super(patente, fechaFabricacion, valor);
		this.nombre = nombre;
	}
	
	public double calcularImpuesto() {
		if (!this.supera10Años()) {
			return this.valor > 10000 ? (this.valor * 0.15) : (this.valor * 0.10);
		}
		return 0;
	}

}
