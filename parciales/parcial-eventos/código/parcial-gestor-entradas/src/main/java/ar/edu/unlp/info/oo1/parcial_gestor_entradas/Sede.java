package ar.edu.unlp.info.oo1.parcial_gestor_entradas;

public class Sede {
	
	private String nombre;
	private double precioPorDia;
	private int cantDias;
	
	public Sede(String nombre, double precioPorDia, int cantDias) {
		this.nombre = nombre;
		this.cantDias = cantDias;
		this.precioPorDia = precioPorDia;
	}
	
	public double getPrecio() {
		return this.precioPorDia * this.cantDias;
	}

}
