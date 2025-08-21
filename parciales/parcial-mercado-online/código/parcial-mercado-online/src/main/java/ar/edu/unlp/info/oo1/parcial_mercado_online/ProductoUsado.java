package ar.edu.unlp.info.oo1.parcial_mercado_online;

public class ProductoUsado extends Producto{
	

	public ProductoUsado (String nombre, String localidad, String descripcion, double precio, Usuario usuario) {
		super(nombre, localidad, descripcion, precio, usuario, 1, new RetiroEnDomicilio());
	}
	
}