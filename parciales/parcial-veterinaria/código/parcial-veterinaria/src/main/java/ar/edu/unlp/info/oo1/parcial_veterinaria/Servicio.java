package ar.edu.unlp.info.oo1.parcial_veterinaria;

import java.time.LocalDate;

public abstract class Servicio {
	
	public LocalDate fecha;
	
	public Servicio() {
		this.fecha = LocalDate.now();
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public abstract double getCosto(Mascota mascota);

}
