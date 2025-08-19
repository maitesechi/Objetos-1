package ar.edu.unlp.info.oo1.parcial_veterinaria;

public class ConsultaMedica extends ServicioConVeterinario{
	
	public ConsultaMedica (Veterinario veterinario) {
		super(veterinario);
	}
	
	public double getAdicional() {
		return this.getVeterinario().getAntiguedad() * 100;
	}
	
	public double getCostoMaterialDescartable() {
		return 300;
	}

}
