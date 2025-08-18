package ar.edu.unlp.info.oo1.parcial_gestor_entradas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Usuario {
	
	private String nombre;
	private List<Entrada> entradasCompradas;
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		this.entradasCompradas = new ArrayList<Entrada>();
	}
	
	public void comprarEntrada(Entrada entrada) {
		this.entradasCompradas.add(entrada);
	}
	
	public double montoEntradaCompradasEntre (LocalDate fecha1, LocalDate fecha2) {
		return this.entradasCompradas.stream()
				.filter(e -> e.estaEnRango(fecha1, fecha2))
				.mapToDouble(e -> e.getCosto())
				.sum();
	}
	
	public Entrada getEntradaAlSiguienteEvento() {
	    return this.entradasCompradas.stream()
	            .filter(e -> e.getEvento().getFecha().isAfter(LocalDate.now()))
	            .min(Comparator.comparing(e -> e.getEvento().getFecha()))
	            .orElse(null);
	}

}
