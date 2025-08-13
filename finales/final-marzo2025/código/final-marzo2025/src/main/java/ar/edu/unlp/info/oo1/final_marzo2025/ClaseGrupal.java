package ar.edu.unlp.info.oo1.final_marzo2025;

import java.time.LocalDate;
import java.util.List;

public class ClaseGrupal extends Clase{
	
	private List<Estudiante> estudiantes;
	
	public ClaseGrupal(Profesor profesor, List<Estudiante> estudiantes) {
		super(profesor);
		this.estudiantes = estudiantes;
		this.agregarServicioAEstudiantes();
	}
	
	private void agregarServicioAEstudiantes() {
		for (Estudiante est: this.estudiantes) {
			est.agregarServicio(this);
		}
	}
	
	public double calcularCosto() {
		double adicionalDomingo = this.esDomingo() ? 500: 0;
		if (this.estudiantes != null) { //evitar la division por cero
			return (this.profesor.getHonorario() / this.estudiantes.size()) + adicionalDomingo + (this.calcularAdicionalPorAntiguedad() / this.estudiantes.size());
	
		}
		return 0;
	}

}
