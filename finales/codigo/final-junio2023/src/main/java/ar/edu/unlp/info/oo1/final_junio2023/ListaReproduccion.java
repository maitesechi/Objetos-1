package ar.edu.unlp.info.oo1.final_junio2023;

import java.util.ArrayList;
import java.util.List;

public class ListaReproduccion {
	
	private String nombre;
	private List<Cancion> canciones;
	private Reproduccion estrategia;
	
	public ListaReproduccion(String nombre) {
		this.nombre = nombre;
		this.canciones = new ArrayList<Cancion>();
		this.estrategia = new ReproduccionNormal();
	}
	
	public void setEstrategia (Reproduccion estrategia) {
		this.estrategia = estrategia;
	}
	
	public void reproducir() {
		this.estrategia.ordenar(canciones);
	}
	
	public void agregarCancion(Cancion cancion) {
		this.canciones.add(cancion);
	}
	
	public void eliminarCancion(Cancion cancion) {
		if (this.canciones.contains(cancion)) {
			this.canciones.remove(cancion);
		}
	}
	
	public void agregarAlbum(Album album) {
		this.canciones.addAll(album.getCanciones());
	}

}
