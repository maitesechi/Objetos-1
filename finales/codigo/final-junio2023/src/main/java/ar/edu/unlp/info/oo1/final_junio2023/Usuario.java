package ar.edu.unlp.info.oo1.final_junio2023;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nombre;
	private String clave;
	private String correo;
	private List<Artista> artistasSeguidos;
	private List<ListaReproduccion> listasDeReproduccion;
	
	public Usuario(String nombre, String clave, String correo) {
		this.nombre = nombre;
		this.clave = clave;
		this.correo = correo;
		this.artistasSeguidos = new ArrayList<Artista>();
		this.listasDeReproduccion = new ArrayList<ListaReproduccion>();
	}
	
	public void seguirArtista(Artista artista) {
		if (!this.artistasSeguidos.contains(artista)) {
			this.artistasSeguidos.add(artista);
		}
	}
	
	public ListaReproduccion crearLista(String nombre, Cancion cancion) {
		ListaReproduccion lista = new ListaReproduccion(nombre);
		lista.agregarCancion(cancion);
		this.listasDeReproduccion.add(lista);
		return lista;
	}
	
	public void eliminarLista(String nombre) {
		if(this.listasDeReproduccion.contains(nombre)) {
			this.listasDeReproduccion.remove(nombre);
		}
	}
	
	

}
