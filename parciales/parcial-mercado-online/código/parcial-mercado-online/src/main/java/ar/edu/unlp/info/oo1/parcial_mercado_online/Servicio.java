package ar.edu.unlp.info.oo1.parcial_mercado_online;

public class Servicio extends Publicacion{
	
	public Servicio (String nombre, String localidad, String descripcion, double precio, Usuario usuario) {
		super(nombre, localidad, descripcion, precio, usuario);
	}
	
	public double montoAPagar() {
		double total;
		String aux = "AMBA";
		if (getLocalidad().equals(aux)) {
			total = 500;
		}
		else {
			total = 800;
		}
		return getPrecio() + total + aplicarDescuento(total);
	}
	
	private double aplicarDescuento(double monto) {
		return (getUsuario().getAniosEnElSistema() > 10) ? (monto * 0.08) : 0;
	}

}
