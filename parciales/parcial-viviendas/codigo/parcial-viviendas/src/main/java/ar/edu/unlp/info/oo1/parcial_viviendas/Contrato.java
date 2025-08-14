package ar.edu.unlp.info.oo1.parcial_viviendas;

public abstract class Contrato {
	
	protected Servicio servicio;
	
	public Contrato(Servicio servicio) {
		this.servicio = servicio;
	}
	
	public abstract double montoAbonar();
	
	

}
