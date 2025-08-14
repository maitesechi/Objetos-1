package ar.edu.unlp.info.oo1.parcial_impuestos;

import java.util.ArrayList;
import java.util.List;

public class Contribuyente {
	
	private String nombre;
	private String dni;
	private String email;
	private String localidad;
	private List<Bien> bienes;
	
	public Contribuyente (String nombre, String dni, String emial, String localidad) {
		this.nombre = nombre;
		this.dni = dni;
		this.email = emial;
		this.localidad = localidad;
		this.bienes = new ArrayList<Bien>();
	}
	
	public double getMontoAPagar() {
		return this.bienes.stream()
				.mapToDouble(bien -> bien.calcularImpuesto())
				.sum();
	}
	
	public void agregarBien(Bien bien) {
		this.bienes.add(bien);
	}
	
	public String getLocalidad() {
		return this.localidad;
	}

}
