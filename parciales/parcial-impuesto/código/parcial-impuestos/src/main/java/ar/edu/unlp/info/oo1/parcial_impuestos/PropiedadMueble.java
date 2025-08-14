package ar.edu.unlp.info.oo1.parcial_impuestos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class PropiedadMueble implements Bien{
	
	private String patente;
	private LocalDate fechaFabricacion;
	protected double valor;
	
	public PropiedadMueble(String patente, LocalDate fechaFabricacion, double valor) {
		this.patente = patente;
		this.fechaFabricacion = fechaFabricacion;
		this.valor = valor;
	}
	
	protected boolean supera10Años() {
		return  ChronoUnit.YEARS.between(this.fechaFabricacion, LocalDate.now()) > 10; 
	}

	public void setFechaFabricacion(LocalDate fecha) {
		this.fechaFabricacion = fecha;
	}
	
	public void setValor (double valor) {
		this.valor = valor;
	}
	
	
}
