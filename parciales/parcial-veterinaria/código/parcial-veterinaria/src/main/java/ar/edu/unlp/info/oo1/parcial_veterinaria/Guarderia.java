package ar.edu.unlp.info.oo1.parcial_veterinaria;

public class Guarderia extends Servicio{
	
	static final double COSTO_DIARIO = 500;
	
	private int cantDias;
	
	public Guarderia (int cantDias) {
		super();
		this.cantDias = cantDias;
	}
	
	public double getCosto(Mascota mascota) {
		double monto = this.cantDias * COSTO_DIARIO; 
		return monto - aplicarDescuento(mascota, monto);
	}
	
	private double aplicarDescuento(Mascota mascota, double monto) {
		return mascota.getCountServiciosTomados() >= 5 ? (monto * 0.1) : 0;
	}

}
