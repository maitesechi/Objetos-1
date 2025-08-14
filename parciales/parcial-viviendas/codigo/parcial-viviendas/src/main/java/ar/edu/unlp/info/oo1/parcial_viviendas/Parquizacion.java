package ar.edu.unlp.info.oo1.parcial_viviendas;

public class Parquizacion extends Servicio{
	
	private int cantMaquinas;
	private double costoMantenimiento;
	
	public Parquizacion (double precioPorHora, int cantHoras, int cantMaquinas, double costoMantenimiento) {
		super(precioPorHora, cantHoras);
		this.cantMaquinas = cantMaquinas;
		this.costoMantenimiento = costoMantenimiento;
	}
	
	public double montoAbonar() {
		return this.calcularSubtotal() + (this.cantMaquinas * this.costoMantenimiento);
	}

}
