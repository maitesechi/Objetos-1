package ar.edu.unlp.info.oo1.parcial_recursos_visuales;

import java.time.LocalDate;

public class Recurso {
	
	private String descripcion;
	private LocalDate fechaCarga;
	private double precioBase;
	private Usuario creador;
	private Estrategia estrategia;
	
	public Recurso (String descripcion, double precioBase, Usuario creador, Estrategia estrategia) {
		this.descripcion = descripcion;
		this.fechaCarga = LocalDate.now();
		this.precioBase = precioBase;
		this.creador = creador;
		this.estrategia = estrategia;
	}
	
	public void registrarCompra() {
		this.creador.incrementarPuntaje((int)this.estrategia.calcularPuntaje(precioBase));
	}
	
	public double getCosto() {
		return this.estrategia.calcularCosto(precioBase);
	}
	
	public boolean creadoElUltMes() {
	    LocalDate hoy = LocalDate.now();
	    LocalDate hace30Dias = hoy.minusDays(30);
	    return (fechaCarga.isAfter(hace30Dias) || fechaCarga.isEqual(hace30Dias))
	            && (fechaCarga.isBefore(hoy) || fechaCarga.isEqual(hoy));
	}

}
