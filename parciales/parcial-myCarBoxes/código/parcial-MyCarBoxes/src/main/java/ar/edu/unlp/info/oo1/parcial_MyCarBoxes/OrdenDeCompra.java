package ar.edu.unlp.info.oo1.parcial_MyCarBoxes;

import java.time.LocalDate;
import java.util.List;

public class OrdenDeCompra extends Orden{
	
	public OrdenDeCompra (Vehiculo vehiculo, List<Repuesto> repuestos) {
		super(vehiculo, repuestos);
	}
	
	public double calcularCosto() {
		double costo = this.costoRepuestos();
		if (repuestoConMas5Anios()) {
			return (costo * 0.08) + costo;
		}
		return (costo * 0.15) + costo;
	}
	
	private boolean repuestoConMas5Anios() {
	    LocalDate hace5Anios = LocalDate.now().minusYears(5);
	    return this.repuestos.stream()
	            .anyMatch(r -> r.getFechaFabricacion().isBefore(hace5Anios));
	}

}
