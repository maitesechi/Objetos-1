package ar.edu.unlp.info.oo1.final_agosto2022;

import java.util.List;

public class Persona extends Receptor{
	
	public Persona() {
		super();
	}
	
	public boolean puedeRecibirDonacion(Donacion donacion, List<Donacion> donacionesDelMes) {
		return (calcularMontoDonacionesFiltrado(donacionesDelMes) + donacion.getMonto()) <= calcularMontoDonaciones(this.donaciones);
	}
	
	private double calcularMontoDonacionesFiltrado(List<Donacion> auxDonaciones) {
		return auxDonaciones.stream()
				.filter(d -> d.getReceptor().equals(this))
				.mapToDouble(d -> d.getMonto())
				.sum();
	}
	
	private double calcularMontoDonaciones(List<Donacion> auxDonaciones) {
		return auxDonaciones.stream()
				.mapToDouble(d -> d.getMonto())
				.sum();
	}

}
