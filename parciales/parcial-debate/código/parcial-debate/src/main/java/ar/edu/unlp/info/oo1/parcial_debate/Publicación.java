package ar.edu.unlp.info.oo1.parcial_debate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Publicación {
	
	private String titulo;
	private String contenido;
	private LocalDate fechaEmision;
	private int cantLike;
	private int cantDislike;
	private List<Respuesta> repuestas;
	
	public Publicación (String titulo, String contenido) {
		this.titulo = titulo;
		this.contenido = contenido;
		this.fechaEmision = LocalDate.now();
		this.cantLike = 0;
		this.cantDislike = 0;
		this.repuestas = new ArrayList<Respuesta>();
	}
	
	public void darLike() {
		this.cantLike++;
	}
	
	public void darDislike() {
		this.cantDislike++;
	}
	
	public LocalDate getFechaEmision() {
		return this.fechaEmision;
	}
	
	public int getLikes() {
		return this.cantLike;
	}
	
	public int getDislike() {
		return this.cantDislike;
	}
	
	public void agregarRespuesta(Respuesta respuesta) {
		this.repuestas.add(respuesta);
	}
}
