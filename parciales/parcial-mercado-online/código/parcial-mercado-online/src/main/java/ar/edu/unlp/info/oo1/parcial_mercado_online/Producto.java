package ar.edu.unlp.info.oo1.parcial_mercado_online;

public class Producto extends Publicacion{
	
	private int cantDisponible;
	private TipoDeEntrega tipoEntrega;
	
	public Producto (String nombre, String localidad, String descripcion, double precio, Usuario usuario, int cantDisponible, TipoDeEntrega tipo) {
		super(nombre, localidad, descripcion, precio, usuario);
		this.cantDisponible = cantDisponible;
		this.tipoEntrega = tipo;
	}

	public double montoAPagar() {
		if (this.cantDisponible >= 1) {
			this.cantDisponible--;
			return getPrecio() + tipoEntrega.getCosto(getUsuario().getLocalidad(), getLocalidad(), getPrecio());
		}
		return 0;
	}
	
	public void setTipoDeEntrega (TipoDeEntrega tipo) {
		this.tipoEntrega = tipo;
	}
}
