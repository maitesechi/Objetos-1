package ar.edu.unlp.info.oo1.final_marzo2025;

import java.time.LocalDate;

public class ClaseIndividual extends Clase{
	
	private Estudiante estudiante;
	
	public ClaseIndividual(Profesor profesor, Estudiante estudiante) {
		super(profesor);
		this.estudiante = estudiante;
		this.estudiante.agregarServicio(this);
	}
	
	public double calcularCosto() {
		double adicionalDomingo = esDomingo() ? 300: 0;
		return this.profesor.getHonorario() + adicionalDomingo + this.calcularAdicionalPorAntiguedad();
	}

}
