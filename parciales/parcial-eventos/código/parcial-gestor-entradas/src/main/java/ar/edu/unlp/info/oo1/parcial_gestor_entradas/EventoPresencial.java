package ar.edu.unlp.info.oo1.parcial_gestor_entradas;

import java.time.LocalDate;
import java.util.List;

public class EventoPresencial extends Evento{
	
	private List<Sede> sedes;
	
	public EventoPresencial (String nombre, LocalDate fecha, String temaPrincipal, double precioInscripcion, double precioRemera, List<Sede> sedes){
		super(nombre, fecha, temaPrincipal, precioInscripcion, precioRemera);
		this.sedes = sedes;
	}
	
	public double costoAdicional() {
		return this.sedes.stream()
				.mapToDouble(sede -> sede.getPrecio())
				.sum();
	}

}
