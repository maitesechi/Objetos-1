package ar.edu.unlp.info.oo1.parcial_veterinaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mascota {
	
	private String nombre;
	private LocalDate fechaNacimiento;
	private String especie;
	private List<Servicio> serviciosTomados;
	
	public Mascota (String nombre, LocalDate fechaNacimiento, String especie) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.especie = especie;
		this.serviciosTomados = new ArrayList<Servicio>();
	}
	
	public void agregarServicio(Servicio serv) {
		this.serviciosTomados.add(serv);
	}
	
	public int getCountServiciosTomados() {
		return this.serviciosTomados.size();
	}
	
	public double getRecaudacionEnFecha (LocalDate fechaConsulta) {
		return this.serviciosTomados.stream()
				.filter(serv -> serv.getFecha().equals(fechaConsulta))
				.mapToDouble(serv -> serv.getCosto(this))
				.sum();
	}

}
