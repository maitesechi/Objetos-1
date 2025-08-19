package ar.edu.unlp.info.oo1.parcial_veterinaria;

public class Vacunacion extends ServicioConVeterinario{
	
	private String nombreVacuna;
	private double costoVacuna;
	
	public Vacunacion (String nombreVacuna, double costoVacuna, Veterinario veterinario) {
		super(veterinario);
		this.nombreVacuna = nombreVacuna;
		this.costoVacuna = costoVacuna;
	}
	
	public double getAdicional() {
		return this.costoVacuna;
	}
	
	public double getCostoMaterialDescartable() {
		return 500;
	}

}
