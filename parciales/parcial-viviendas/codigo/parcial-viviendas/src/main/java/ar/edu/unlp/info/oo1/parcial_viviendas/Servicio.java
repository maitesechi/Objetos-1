package ar.edu.unlp.info.oo1.parcial_viviendas;

public abstract class Servicio {
	
	private double precioPorHora;
	private int cantHoras;
	
	public Servicio (double precioPorHora, int cantHoras) {
		this.precioPorHora = precioPorHora;
		this.cantHoras = cantHoras;
	}
	
	protected double calcularSubtotal() {
		return this.precioPorHora * this.cantHoras;
	}
	
	public abstract double montoAbonar();

}
