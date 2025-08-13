package ar.edu.unlp.info.oo1.final_marzo2025;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class Clase extends Servicio{

	protected Profesor profesor;
	
	public Clase (Profesor profesor) {
		super();
		this.profesor = profesor;
	}
	
	protected boolean esDomingo() {
		return fecha.getDayOfWeek() == DayOfWeek.SUNDAY;
	}
	
	protected double calcularAdicionalPorAntiguedad() {
		return this.profesor.calcularAntiguedad() * 150;
	}
	
	public boolean esClase() {
		return true;
	}
	
	public abstract double calcularCosto();
}
