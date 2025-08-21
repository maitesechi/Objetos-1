package ar.edu.unlp.info.oo1.parcial_impuesto;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Mueble implements Bien {
	
	private String patente;
	private String marca;
	private LocalDate fechaFabricacion;
	private double valor;
	
	public Mueble (String patente, String marca, LocalDate fechaFabricacion, double valor) {
		this.patente = patente;
		this.marca = marca;
		this.fechaFabricacion = fechaFabricacion;
		this.valor = valor;
	}
	
	public double getMontoImpuesto() {
		return ChronoUnit.YEARS.between(fechaFabricacion, LocalDate.now()) < 10 ? (this.valor * 0.05) : 0;
	}

}
