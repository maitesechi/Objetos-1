package ar.edu.unlp.info.oo1.parcial_veterinaria;

import java.time.LocalDate;
import java.time.Period;

public class Veterinario {
	
	private String nombre;
	private LocalDate fechaIngreso;
	private double honorario;
	
	public Veterinario (String nombre, LocalDate fechaIngreso, double honorario) {
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.honorario = honorario;
	}
	
	public double getHonorario() {
		return this.honorario;
	}
	
	public int getAntiguedad() {
		return Period.between(fechaIngreso, LocalDate.now()).getYears();
	}

}
