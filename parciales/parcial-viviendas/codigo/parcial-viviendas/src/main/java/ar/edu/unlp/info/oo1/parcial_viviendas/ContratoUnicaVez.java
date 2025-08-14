package ar.edu.unlp.info.oo1.parcial_viviendas;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ContratoUnicaVez extends Contrato{
	
	private LocalDate fecha;
	
	public ContratoUnicaVez (Servicio servicio, LocalDate fecha) {
		super(servicio);
		this.fecha = fecha;
	}
	
	private boolean esFinde() {
		 DayOfWeek dia = DayOfWeek.from(fecha);
		 return dia.equals(DayOfWeek.SATURDAY) || dia.equals(DayOfWeek.SUNDAY);
	}

	public double montoAbonar() {
		double subtotal = this.servicio.montoAbonar();
		if (esFinde()) {
			return subtotal + (subtotal * 0.15);
		}
		return subtotal;
	}
}
