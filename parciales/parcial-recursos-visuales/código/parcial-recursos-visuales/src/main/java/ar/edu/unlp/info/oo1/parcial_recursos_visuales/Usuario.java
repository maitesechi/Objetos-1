package ar.edu.unlp.info.oo1.parcial_recursos_visuales;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nombre;
	private String email;
	private int puntos;
	private List<Recurso> recursosCreados;
	private List<Recurso> compras;
	
	public Usuario(String nombre, String email) {
		this.nombre = nombre;
		this.email = email;
		this.puntos = 0;
		this.recursosCreados = new ArrayList<Recurso>();
		this.compras = new ArrayList<Recurso>();
	}
	
	public void registrarRecurso(Recurso recurso) {
		this.recursosCreados.add(recurso);
	}
	
	public void comprarRecurso(Recurso recurso) {
		this.compras.add(recurso);
		recurso.registrarCompra();
	}
	
	public void incrementarPuntaje(int puntaje) {
		this.puntos += puntaje;
	}
	
	public int getCountRecursosCreados() {
		return (int) this.recursosCreados.stream()
				.filter(r -> r.creadoElUltMes())
				.count();
	}
	
	public int getCountComprasRealizadas() {
		return this.compras.size();
	}

}
