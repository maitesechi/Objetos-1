package ar.edu.unlp.info.oo1.final_marzo2025;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PrestamoInstrumento extends Servicio{
	
	private String instrumento;
	private LocalDate fechaFin;
	private Estudiante estudiante;
	
	public PrestamoInstrumento (LocalDate fechaFin, String instrumento, Estudiante estudiante) {
		super();
		this.fechaFin = fechaFin;
		this.instrumento = instrumento;
		this.estudiante = estudiante;
	}
	
	public boolean esClase() {
		return false;
	}
	
	private int calcularCantDias() {
	    return (int) ChronoUnit.DAYS.between(this.fecha, this.fechaFin);
	}
	
	private double calcularDescuento() {
		return this.estudiante.calcularCantidadDeClases() >= 2 ? 0.15: 0;
	}
	
	public double calcularCosto() {
		double costo = this.calcularCantDias() * 400;
		return costo * (1 - this.calcularDescuento());
	}

}
