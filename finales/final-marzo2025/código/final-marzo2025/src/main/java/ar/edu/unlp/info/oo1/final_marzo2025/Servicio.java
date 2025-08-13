package ar.edu.unlp.info.oo1.final_marzo2025;

import java.time.LocalDate;

public abstract class Servicio {
	
	protected LocalDate fecha;
	
	public Servicio() {
		this.fecha = LocalDate.now();
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public abstract double calcularCosto();
	
	public abstract boolean esClase();
}
