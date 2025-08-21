package ar.edu.unlp.info.oo1.parcial_impuesto;

import java.util.ArrayList;
import java.util.List;

public class Contribuyente {
	
	private String nombre;
	private String dni;
	private String email;
	private String localidad;
	private List<Bien> bienes;
	
	public Contribuyente (String nombre, String dni, String email, String localidad) {
		this.nombre = nombre;
		this.dni = dni;
		this.email = email;
		this.email = email;
		this.localidad = localidad;
		this.bienes = new ArrayList<Bien>();
	}
	
	public void agregarBien (Bien bien) {
		this.bienes.add(bien);
	}
	
	public double getMontoImpuestoAPagar() {
		return this.bienes.stream()
				.mapToDouble(bien -> bien.getMontoImpuesto())
				.sum();
	}
	
	

}
