package ar.edu.unlp.info.oo1.parcial_recursos_visuales;

import java.time.LocalDate;

public class EstrategiaOferta implements Estrategia{
	
	private LocalDate fechaLimite;
	private double porcentajeDescuento;
	
	public EstrategiaOferta(LocalDate fechaLimite, double porcentajeDescuento) {
		this.fechaLimite = fechaLimite;
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	private boolean isVencido() {
		return this.fechaLimite.isEqual(LocalDate.now()) || this.fechaLimite.isBefore(LocalDate.now());
	}
	
	public double calcularCosto(double precioBase) {
		if (isVencido()) {
			return precioBase;
		}
		return precioBase - (precioBase * this.porcentajeDescuento);
	}
	
	public double calcularPuntaje(double precioBase) {
		if (isVencido()) {
			return precioBase * 10;
		}
		return precioBase * 5;
	}

}
