package ar.edu.unlp.info.oo1.final_marzo2025;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Profesor {
	
	private String nombre;
	private LocalDate fechaIngreso;
	private double honorarioPorClase;

	
	public Profesor(String nombre, LocalDate fechaIngreso, double honorarioPorClase) {
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.honorarioPorClase = honorarioPorClase;
	}
	
	public int calcularAntiguedad() {
		return (int)ChronoUnit.YEARS.between(this.fechaIngreso, LocalDate.now());
	}
	
	public double getHonorario() {
		return this.honorarioPorClase;
	}
}
