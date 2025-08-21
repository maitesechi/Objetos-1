package ar.edu.unlp.info.oo1.parcial_mercado_online;

import java.time.LocalDate;
import java.time.Period;

public class Usuario {
	
	private String email;
	private String localidad;
	private LocalDate fechaIngreso;
	
	public Usuario (String email, String localidad) {
		this.email = email;
		this.localidad = localidad;
		this.fechaIngreso = LocalDate.now();
	}
	
	public int getAniosEnElSistema() {
		return Period.between(fechaIngreso, LocalDate.now()).getYears();
	}
	
	public String getLocalidad() {
		return this.localidad;
	}

}
