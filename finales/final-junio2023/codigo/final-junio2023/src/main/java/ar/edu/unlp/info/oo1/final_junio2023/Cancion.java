package ar.edu.unlp.info.oo1.final_junio2023;

public class Cancion {
	
	private String titulo;
	private int duracion; //en segundos
	private String genero;
	private Artista artista;
	
	public Cancion (String titulo, int duracion, String genero, Artista artista) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.genero = genero;
		this.artista = artista;
	}

}
