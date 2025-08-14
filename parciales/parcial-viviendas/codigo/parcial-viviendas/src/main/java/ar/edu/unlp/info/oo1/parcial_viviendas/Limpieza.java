package ar.edu.unlp.info.oo1.parcial_viviendas;

public class Limpieza extends Servicio{
	
	private double tarifaMinima;
	
	public Limpieza (double precioPorHora, int cantHoras, double tarifaMinima) {
		super(precioPorHora, cantHoras);
		this.tarifaMinima = tarifaMinima;
	}
	
	public double montoAbonar() {
		return (this.calcularSubtotal() < this.tarifaMinima) ? this.tarifaMinima : this.calcularSubtotal();
	}

}
