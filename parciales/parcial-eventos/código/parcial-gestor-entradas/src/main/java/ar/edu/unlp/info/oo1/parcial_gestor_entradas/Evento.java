package ar.edu.unlp.info.oo1.parcial_gestor_entradas;

import java.time.LocalDate;

public abstract class Evento {
	
	private String nombre;
	private LocalDate fecha;
	private String temaPrincipal;
	private double precioInscripcion;
	private double precioRemera;
	
	public Evento(String nombre, LocalDate fecha, String temaPrincipal, double precioInscripcion, double precioRemera) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.temaPrincipal = temaPrincipal;
		this.precioInscripcion = precioInscripcion;
		this.precioRemera = precioRemera;
	}
	
	public abstract double costoAdicional();
	
	public double calcularPrecioAsistencia(LocalDate fechaConsulta) {
		double subTotal = this.precioInscripcion + this.precioRemera + costoAdicional(); 
		return  subTotal + calcularRecargo(fechaConsulta, subTotal);
	}
	
	private double calcularRecargo(LocalDate fechaConsulta, double subTotal) {
		return fechaConsulta.equals(this.fecha) ? (subTotal * 0.2) : 0;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}

}
