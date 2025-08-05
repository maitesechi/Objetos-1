package ar.edu.unlp.info.oo1.final_noviembre2023;

public class Servicio {
	
	private double precioNormal;
	private double precioSuperaMinimo;
	private int cantidadMinima;
	
	public Servicio (double precioNormal, double precioSuperaMinimo, int cantidadMinima) {
		this.precioNormal = precioNormal;
		this.precioSuperaMinimo = precioSuperaMinimo;
		this.cantidadMinima = cantidadMinima;
	}

	public double getPrecioNormal() {
		return precioNormal;
	}

	public void setPrecioNormal(double precioNormal) {
		this.precioNormal = precioNormal;
	}

	public double getPrecioSuperaMinimo() {
		return precioSuperaMinimo;
	}

	public void setPrecioSuperaMinimo(double precioSuperaMinimo) {
		this.precioSuperaMinimo = precioSuperaMinimo;
	}

	public int getCantidadMinima() {
		return cantidadMinima;
	}

	public void setCantidadMinima(int cantidadMinima) {
		this.cantidadMinima = cantidadMinima;
	}
	
	public double getCostoParaCantidadX (int cantidad) {
		return this.cantidadMinima < cantidad ? this.precioSuperaMinimo: this.precioNormal;
	}

}
