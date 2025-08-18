package ar.edu.unlp.info.oo1.parcial_cobros;

import java.time.LocalDate;

public class Pagare extends EscrituraDePago{
	
	private LocalDate fechaVencimiento;
	
	public Pagare (double monto, String destinatario, String originante, LocalDate fechaEmision, LocalDate fechaVencimiento) {
		super(monto, destinatario, originante, fechaEmision);
		this.fechaVencimiento = fechaVencimiento;
	}
	
	public LocalDate getFechaVencimiento() {
		return this.fechaVencimiento;
	}
	
	public double valorLiquido() {
		return (this.estaVencido()) ? this.getMonto() : 0;
	}

}
