package ar.edu.unlp.info.oo1.final_noviembre2023;

public class ItemPedido {
	
	private int cantidad;
	private Servicio servicio;
	
	public ItemPedido(int cantidad, Servicio servicio) {
		this.cantidad = cantidad;
		this.servicio = servicio;
	}
	
	public double getCosto() {
		return this.cantidad * this.servicio.getCostoParaCantidadX(cantidad);
	}

}
