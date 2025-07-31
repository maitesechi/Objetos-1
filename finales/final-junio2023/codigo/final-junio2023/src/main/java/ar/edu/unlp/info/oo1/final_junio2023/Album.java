package ar.edu.unlp.info.oo1.final_junio2023;

import java.time.LocalDate;
import java.util.List;

public class Album {
	
	private String nombre;
	private LocalDate fechaEmision;
	private List<Cancion> canciones;
	
	public Album (String nombre, LocalDate fechaEmision, List<Cancion> canciones) {
		this.nombre = nombre;
		this.fechaEmision = fechaEmision;
		this.canciones = canciones;
	}
	
	public List<Cancion> getCanciones(){
		return this.canciones;
	}
	
	public void agregarCanciones(Cancion cancion) {
		this.canciones.add(cancion);
	}

}
