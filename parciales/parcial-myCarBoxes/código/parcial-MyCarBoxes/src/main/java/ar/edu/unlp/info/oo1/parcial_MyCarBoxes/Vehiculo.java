package ar.edu.unlp.info.oo1.parcial_MyCarBoxes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
	
	private String patente;
	private List<Orden> ordenes;
	
	public Vehiculo (String patente) {
		this.patente = patente;
		this.ordenes = new ArrayList<Orden>();
	}
	
	public void agregarOrden(Orden orden) {
		this.ordenes.add(orden);
	}
	
	public boolean ordenRegistradoUlt12meses() {
	    LocalDate hace12Meses = LocalDate.now().minusMonths(12);
	    return this.ordenes.stream()
	            .anyMatch(o -> o.getFechaActual().isAfter(hace12Meses) || o.getFechaActual().isEqual(hace12Meses));
	}

}
