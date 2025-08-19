package ar.edu.unlp.info.oo1.parcial_veterinaria;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class ServicioConVeterinario extends Servicio{
	
	private Veterinario veterinario;
	
	public ServicioConVeterinario(Veterinario veterinario) {
		super();
		this.veterinario = veterinario;
	}
	
	public Veterinario getVeterinario() {
		return this.veterinario;
	}
	
	public double getCosto(Mascota mascota) {
		return this.veterinario.getHonorario() + getAdicional() + getCostoMaterialDescartable() + adicionalPorDomingo();
	}
	
	public double adicionalPorDomingo() {
		return LocalDate.now().getDayOfWeek().equals(DayOfWeek.SUNDAY) ? 200 : 0;
	}
	
	public abstract double getAdicional();

	public abstract double getCostoMaterialDescartable();

}
