package ar.edu.unlp.info.oo1.parcial_gestor_entradas;

import java.time.LocalDate;
import java.time.Period;

public class Entrada {
	
	
	
	private LocalDate fecha;
	private boolean tieneSeguro;
	private Evento evento;
	private double costo;
	
	public Entrada (boolean tieneSeguro, Evento evento) {
		this.fecha = LocalDate.now();
		this.tieneSeguro = tieneSeguro;
		this.evento = evento;
		this.costo = this.calcularCosto(evento, tieneSeguro);
	}
	
	private double calcularCosto(Evento evento, boolean tieneSeguro) {
		double costo = evento.calcularPrecioAsistencia(LocalDate.now());
		return tieneSeguro ? costo + 500 : costo;
	}
	
	public double montoARecuperar() {
		double monto = this.evento.calcularPrecioAsistencia(LocalDate.now());
		return this.rebolsoPorCantDias(monto) + this.adicionalPorSeguro(monto);
	}
	
	private double rebolsoPorCantDias(double monto) {
		int dias = Period.between(fecha, this.evento.getFecha()).getDays();
		return dias >= 30 ? (monto * 0.5) : 0;
	}
	
	private double adicionalPorSeguro(double monto) {
		return this.tieneSeguro ? (monto * 0.15) : 0;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public double getCosto() {
		return this.costo;
	}
	
	public Evento getEvento() {
		return this.evento;
	}
	
	public boolean estaEnRango(LocalDate fecha1, LocalDate fecha2) {
		return this.fecha.isAfter(fecha1) && this.fecha.isBefore(fecha2);
	}

}
