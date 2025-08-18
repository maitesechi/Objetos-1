package ar.edu.unlp.info.oo1.parcial_cobros;

import java.time.LocalDate;

public class Cheque extends EscrituraDePago{
	
	public Cheque (double monto, String destinatario, String originante, LocalDate fechaEmision) {
		super(monto, destinatario, originante, fechaEmision);
	}
	
	public LocalDate getFechaVencimiento() {
		return this.getFechaEmision().plusDays(30);
	}
	
	public double valorLiquido() {
		return (this.estaVencido()) ? 0: this.getMonto();
	}

}
