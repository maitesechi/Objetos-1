package ar.edu.unlp.info.oo1.final_marzo2025;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServicioTest {
	
	private Servicio serv1, serv2, serv3, serv4;
	private Profesor profesor;
	private Estudiante est1, est2;
	
	@BeforeEach
	public void setUp() {
		profesor = new Profesor("Maitena Sechi", LocalDate.of(2020, 2, 2), 500);
		
		est1 = new Estudiante("Valentina Camio", LocalDate.of(2005, 2, 5), "Violin");
		est2 = new Estudiante("Agustina Soto", LocalDate.of(2000, 9, 23), "Piano");
		
		serv1 = new ClaseIndividual(profesor, est1);
		serv2 = new ClaseIndividual(profesor, est2);
		serv4 = new PrestamoInstrumento(LocalDate.of(2025, 8, 20), "Guitarra", est1);
		
		List<Estudiante> lista = new ArrayList<Estudiante>();
		lista.add(est1);
		lista.add(est2);
		serv3 = new ClaseGrupal(profesor, lista);
	}
	
	@Test
	public void costoClaseGrupal() {
		assertTrue(serv3.calcularCosto() == 625);
	}
	
	@Test
	public void costoClaseIndividual() {
		assertTrue(serv1.calcularCosto() == 1250);
	}
	
	@Test
	public void costoPrestamoInstrumento() {
		assertTrue(serv4.calcularCosto() == 2720); //con descuento
	}
	
	public void recaudacionEstudianteHoy() {
		double costoEst1 = serv1.calcularCosto() + serv3.calcularCosto();
		assertTrue(est1.getRecaudacionEnFecha(LocalDate.now()) == costoEst1);
	}

}
