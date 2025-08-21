package ar.edu.unlp.info.oo1.parcial_mercado_online;

public abstract class Publicacion {
	
	private String nombre;
	private String localidad;
	private String descripcion;
	private double precio;
	private Usuario usuario;
	
	public Publicacion (String nombre, String localidad, String descripcion, double precio, Usuario usuario) {
		this.nombre = nombre;
		this.localidad = localidad;
		this.descripcion = descripcion;
		this.precio = precio;
		this.usuario = usuario;
	}
	
	public boolean getPublicacionDe (String localidadConsultar) {
		return this.localidad.equals(localidadConsultar);
	}
	
	public String getLocalidad() {
		return this.localidad;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public abstract double montoAPagar();
	
}
