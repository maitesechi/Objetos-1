package ar.edu.unlp.info.oo1.parcial_mercado_online;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sistema {
	
	private List<Publicacion> publicaciones;
	
	public Sistema() {
		this.publicaciones = new ArrayList<Publicacion>();
	}
	
	public void agregarPublicacion(Publicacion publi) {
		this.publicaciones.add(publi);
	}
	
	public List<Publicacion> get10PublicacionesMasCarasEn (String localidad){
		return getPublicacionesMasCarasEn(localidad).stream()
				.limit(10)
				.collect(Collectors.toList());
	}
	
	public List<Publicacion> getPublicacionesMasCarasEn (String localidad){
		return this.publicaciones.stream()
				.filter(publi -> publi.getPublicacionDe(localidad))
				.sorted((p1, p2) -> Double.compare(p1.montoAPagar(), p2.montoAPagar()))
				.collect(Collectors.toList());
	}

}
