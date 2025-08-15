package ar.edu.unlp.info.oo1.parcial_MyCarBoxes;

import java.time.LocalDate;
import java.util.List;

public abstract class Orden {
	
	private LocalDate fechaActual;
	protected Vehiculo vehiculo;
	protected List<Repuesto> repuestos;
	
	public Orden (Vehiculo vehiculo, List<Repuesto> repuestos) {
		this.vehiculo = vehiculo;
		this.fechaActual = LocalDate.now();
		this.repuestos = repuestos;
	}
	
	protected double costoRepuestos() {
		return this.repuestos.stream()
				.mapToDouble(r -> r.getCosto())
				.sum();
	}
	
	public LocalDate getFechaActual() {
		return this.fechaActual;
	}
	
	public Factura generarFactura() {
		return new Factura (this.vehiculo, this.calcularCosto(), this.aplicarDescuento());
	}
	
	private double aplicarDescuento () {
		if (this.vehiculo.ordenRegistradoUlt12meses()) {
			return this.calcularCosto() * 0.05;
		}
		return 0;
	}
	
	public abstract double calcularCosto();

}
