package ar.edu.unlp.info.oo1.parcial_viviendas;

import java.time.LocalDate;

public class ContratoProlongado extends Contrato{
	
	private LocalDate fechaInicio;
	private int cantDias;
	
	public ContratoProlongado(Servicio servicio, LocalDate fechaInicio, int cantDias) {
		super(servicio);
		this.fechaInicio = fechaInicio;
		this.cantDias = cantDias;
	}
	
	public double montoAbonar() {
		double subtotal = this.servicio.montoAbonar() * this.cantDias;
		return subtotal - (subtotal * calcularDescuento());
	}
	
	private double calcularDescuento() {
		return this.cantDias > 5 ? 0.1 : 0;
	}

}
