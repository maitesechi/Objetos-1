package ar.edu.unlp.info.oo1.parcial_cobros;

import java.time.LocalDate;

public abstract class EscrituraDePago {
	
	private double monto;
	private String destinatario;
	private String originante;
	private LocalDate fechaEmision;
	
	public EscrituraDePago (double monto, String destinatario, String originante, LocalDate fechaEmision) {
		this.monto = monto;
		this.destinatario = destinatario;
		this.originante = originante;
		this.fechaEmision = fechaEmision;
	}
	
	public abstract LocalDate getFechaVencimiento();
	
	public abstract double valorLiquido();
	
	public boolean estaVencido() {
		return LocalDate.now().isAfter(getFechaVencimiento());
	}
	
	public LocalDate getFechaEmision() {
		return this.fechaEmision;
	}
	
	public double getMonto() {
		return this.monto;
	}

}
