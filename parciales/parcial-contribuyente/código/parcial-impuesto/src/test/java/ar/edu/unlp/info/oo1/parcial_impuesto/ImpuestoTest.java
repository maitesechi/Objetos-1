package ar.edu.unlp.info.oo1.parcial_impuesto;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ImpuestoTest {

	private Inmueble inmueble;
	private Mueble mue1, mue2;
	private Contribuyente contribuyente;
	
	@BeforeEach
	public void setUp() {
		inmueble = new Inmueble(2002, 12000, 300);
		
		mue1 = new Mueble("25AC", "Toyota", LocalDate.of(2020, 8, 12), 10000);
		mue2 = new Mueble ("37DZ", "Toyota", LocalDate.of(2002, 8, 12), 10000);
		
		contribuyente = new Contribuyente("Maitena Sechi", "38951486", "maite@gmail.com", "Del Carril");
		
		contribuyente.agregarBien(inmueble);
		contribuyente.agregarBien(mue1);
		contribuyente.agregarBien(mue2);
	}
	
	@Test
	public void calcularImpuestoInmueble() {
		assertTrue(inmueble.getMontoImpuesto() == 123);
	}
	
	@Test
	public void calcularMuebleViejosYJovenes() {
		assertTrue(mue1.getMontoImpuesto() == 500);
		assertTrue(mue2.getMontoImpuesto() == 0);
	}
	
	@Test
	public void calcularImpuestosDeContribuyente() {
		assertTrue(contribuyente.getMontoImpuestoAPagar() == 623);
	}
	
	
}
