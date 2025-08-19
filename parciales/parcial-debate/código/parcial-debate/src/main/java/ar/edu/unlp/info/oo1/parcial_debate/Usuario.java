package ar.edu.unlp.info.oo1.parcial_debate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nombre;
	private String contraseña;
	private LocalDate fechaRegistro;
	private List<Usuario> seguidos;
	private Recomendador recomendador;
	private List<Publicación> publicaciones;
	
	public Usuario(String nombre, String contraseña, Recomendador recomendador) {
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.fechaRegistro = LocalDate.now();
		this.seguidos = new ArrayList<Usuario>();
		this.recomendador = recomendador;
		this.publicaciones = new ArrayList<Publicación>();
	}
	
	public void agregarUsuarios(Usuario user) {
		this.seguidos.add(user);
	}
	
	public void setRecomendador(Recomendador recomendador) {
		this.recomendador = recomendador;
	}
	
	public List<Publicación> obtenerFeed() {
		return this.recomendador.getFeed(this.seguidos);
	}
	
	public List<Publicación> getPublicaciones(){
		return this.publicaciones;
	}

}
