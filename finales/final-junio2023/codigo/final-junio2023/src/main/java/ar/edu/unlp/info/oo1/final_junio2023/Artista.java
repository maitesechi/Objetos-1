package ar.edu.unlp.info.oo1.final_junio2023;

import java.util.ArrayList;
import java.util.List;

public class Artista {
	
	private String nombre;
	private List<Cancion> canciones;
	
	public Artista(String nombre) {
		this.nombre = nombre;
		this.canciones = new ArrayList<Cancion>();
	}
	
	public void agregarCancion( Cancion cancion) {
		this.canciones.add(cancion);
	}
	
	public List<Cancion> getCanciones(){
		return this.canciones;
	}

}
