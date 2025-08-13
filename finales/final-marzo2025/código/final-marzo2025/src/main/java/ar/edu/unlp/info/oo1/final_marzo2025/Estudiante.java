package ar.edu.unlp.info.oo1.final_marzo2025;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Estudiante {
	
	private String nombre;
	private LocalDate fechaNacimiento;
	private String instrumento;
	private List<Servicio> sirviciosTomados; 
	
	public Estudiante (String nombre, LocalDate fechaNacimiento, String instrumento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.instrumento = instrumento;
		this.sirviciosTomados = new ArrayList<Servicio>();
	}
	
	public void agregarServicio(Servicio servicio) {
		this.sirviciosTomados.add(servicio);
	}
	
	public int calcularCantidadDeClases() {
		return (int)this.sirviciosTomados.stream()
				.filter(s -> s.esClase())
				.count();
	}
	
	public double getRecaudacionEnFecha (LocalDate fecha) {
		return this.sirviciosTomados.stream()
				.filter(s -> s.getFecha().isEqual(fecha))
				.mapToDouble(s -> s.calcularCosto())
				.sum();
	}

}
