package ar.edu.unlp.info.oo1.parcial_gestor_entradas;

import java.time.LocalDate;

public class EventoVirtual extends Evento{
	
	private double costoEnvio;
	
	public EventoVirtual (String nombre, LocalDate fecha, String temaPrincipal, double precioInscripcion, double precioRemera, double costoEnvio) {
		super(nombre, fecha, temaPrincipal, precioInscripcion, precioRemera);
		this.costoEnvio = costoEnvio;
	}
	
	public double costoAdicional() {
		return this.costoEnvio;
	}

}
