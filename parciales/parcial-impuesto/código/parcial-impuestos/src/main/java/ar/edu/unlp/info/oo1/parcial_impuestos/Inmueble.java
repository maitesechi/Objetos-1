package ar.edu.unlp.info.oo1.parcial_impuestos;

public class Inmueble implements Bien{
	
	private int numPartida;
	private double valorLote;
	private double valorEdificacion;
	
	public Inmueble (int numPartida, double valorLote, double valorEdificacion) {
		this.numPartida = numPartida;
		this.valorLote = valorLote;
		this.valorEdificacion = valorEdificacion;
	}
	
	public double calcularImpuesto() {
		return this.valorEdificacion + this.valorLote;
	}

}
