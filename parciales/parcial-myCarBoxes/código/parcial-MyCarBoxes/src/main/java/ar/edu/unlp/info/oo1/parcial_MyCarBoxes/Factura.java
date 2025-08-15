package ar.edu.unlp.info.oo1.parcial_MyCarBoxes;

import java.time.LocalDate;

public class Factura {
	
	private LocalDate fechaEmision;
	private Vehiculo vehiculo;
	private double montoFinal;
	private double descuento;
	
	public Factura (Vehiculo vehiculo, double montoFinal, double descuento) {
		this.vehiculo = vehiculo;
		this.montoFinal = montoFinal;
		this.descuento = descuento;
		this.fechaEmision = LocalDate.now();
	}

}
