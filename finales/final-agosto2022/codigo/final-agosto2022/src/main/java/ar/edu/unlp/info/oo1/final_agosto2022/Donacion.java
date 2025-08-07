package ar.edu.unlp.info.oo1.final_agosto2022;

public class Donacion {
	
	private Donante donante;
	private Receptor receptor;
	private double monto;
	
	public Donacion (Donante donante, Receptor receptor, double monto) {
		this.donante = donante;
		this.receptor = receptor;
		this.monto = monto;
	}
	
	public Donante getDonante() {
		return this.donante;
	}
	
	public Receptor getReceptor() {
		return this.receptor;
	}
	
	public double getMonto() {
		return this.monto;
	}

}
