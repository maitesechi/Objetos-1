package ar.edu.unlp.info.oo1.parcial_viviendas;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServicioTest {
	
	private Limpieza limpieza1, limpieza2;
	private Parquizacion parquizacion;
	
	@BeforeEach
	public void setUp() {
		limpieza1 = new Limpieza (200, 8, 2000);
		limpieza2 = new Limpieza(200, 8, 1600);
		
		parquizacion = new Parquizacion(200, 6, 2, 300);
	}
	
	@Test
	public void calcularMontoLimpieza() {
		assertTrue(limpieza1.montoAbonar() == 2000);
		assertTrue(limpieza2.montoAbonar() == 1600);
	}
	
	@Test
	public void cacularMontoParquizacion() {
		assertTrue(parquizacion.montoAbonar() == 1800);
	}

}
