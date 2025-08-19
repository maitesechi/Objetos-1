package ar.edu.unlp.info.oo1.parcial_debate;

import java.time.LocalDate;

public class Respuesta {
	
	private String contenido;
	private LocalDate fechaEmision;
	private Usuario user;
	
	public Respuesta(String contenido, Usuario user) {
		this.contenido = contenido;
		this.fechaEmision = LocalDate.now();
		this.user = user;
	}

}
