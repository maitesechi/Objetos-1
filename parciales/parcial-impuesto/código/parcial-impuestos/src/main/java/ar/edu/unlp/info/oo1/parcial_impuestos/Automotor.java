package ar.edu.unlp.info.oo1.parcial_impuestos;

import java.time.LocalDate;

public class Automotor extends PropiedadMueble implements Bien{
	
	private String marca;
	private String modelo;
	
	public Automotor (String patente, LocalDate fechaFabricacion, double valor, String marca, String modelo) {
		super(patente, fechaFabricacion, valor);
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public double calcularImpuesto() {
		return this.supera10Años() ? 0: (this.valor * 0.05);
	}

}
