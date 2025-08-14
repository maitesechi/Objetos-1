package ar.edu.unlp.info.oo1.parcial_impuestos;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ImpuestoTest {
	
	private Bien inmueble, inmueble2;
	private PropiedadMueble automotor, embarcacion;
	private Contribuyente cont1, cont2, cont3;
	private SistemaImpuesto sistema;
	
	@BeforeEach
	public void setUp() {
		automotor = new Automotor("73ac", LocalDate.of(2020, 1, 2), 2000, "Toyota", "2002");
		inmueble = new Inmueble(221, 300, 200);
		inmueble2 = new Inmueble(566, 400, 300);
		embarcacion = new Embarcacion("23af", LocalDate.of(2021, 1, 15), 2000, "yate");
		
		sistema = new SistemaImpuesto();
		
		cont1 = new Contribuyente("Maitena Sechi", "38951438", "maite@gmail.com", "Del Carril");
		cont2 = new Contribuyente("Valentina Camio", "46533833", "valen@gmail.com", "Del Carril");
		cont3 = new Contribuyente("Sofia Avila", "42589741", "sofi@gmail.com", "Lobos");
		
		sistema.agregarContribuyente(cont1);
		sistema.agregarContribuyente(cont2);
		sistema.agregarContribuyente(cont3);
	}
	
	@Test
	public void calcularImpuestoInmueble() {
		assertTrue(inmueble.calcularImpuesto() == 500);
	}
	
	@Test
	public void calcularImpuestoAutomotor() {
		assertTrue(automotor.calcularImpuesto() == 100);
		automotor.setFechaFabricacion(LocalDate.of(2000, 1, 2));
		assertTrue(automotor.calcularImpuesto() == 0);
	}
	
	@Test
	public void calcularImpuestoEmbarcacion() {
		assertTrue(embarcacion.calcularImpuesto() == 200);
		embarcacion.setValor(12000);
		assertTrue(embarcacion.calcularImpuesto() == 1800);
		embarcacion.setFechaFabricacion(LocalDate.of(2000, 1, 1));
		assertTrue(embarcacion.calcularImpuesto() == 0);
	}
	
	@Test
	public void contribuyenteConMayorMonto() {
		assertTrue(sistema.contribuyenteQueMasPaganEn("La Plata", 7).size() == 0);
		
		cont1.agregarBien(inmueble);
		cont1.agregarBien(inmueble2);
		
		cont2.agregarBien(automotor);
		
		cont3.agregarBien(embarcacion);
		
		assertTrue(sistema.contribuyenteQueMasPaganEn("Del Carril", 5).get(0).equals(cont1));
		assertTrue(sistema.contribuyenteQueMasPaganEn("Del Carril", 5).get(1).equals(cont2));
	}

}
