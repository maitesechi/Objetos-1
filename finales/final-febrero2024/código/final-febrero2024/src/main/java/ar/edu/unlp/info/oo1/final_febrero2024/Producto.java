package ar.edu.unlp.info.oo1.final_febrero2024;

public class Producto implements Item {
	
	private double costo;
	private double costoDeEnvioPorKilo;
	private double peso;
	private String nombre;
	
	public Producto (double costo, double costoEnvio, double peso, String nombre) {
		this.costo = costo;
		this.costoDeEnvioPorKilo = costoEnvio;
		this.peso = peso;
		this.nombre = nombre;
	}

	public double getCosto() {
		return this.costo + (this.costoDeEnvioPorKilo * this.peso);
	}
}
