package ar.edu.unlp.info.oo1.parcial_viviendas;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContratoTest {
	
	private Limpieza limpieza1, limpieza2;
	private ContratoUnicaVez contratoUnico1, contratoUnico2;
	private ContratoProlongado prolongado1, prolongado2;
	
	@BeforeEach
	public void setUp() {
		limpieza1 = new Limpieza(200, 8, 2000);
		limpieza2 = new Limpieza(200, 8, 1000);
		
		contratoUnico1 = new ContratoUnicaVez(limpieza1, LocalDate.of(2025, 8, 10));
		contratoUnico2 = new ContratoUnicaVez(limpieza1, LocalDate.of(2025, 8, 13));
		
		prolongado1 = new ContratoProlongado(limpieza2, LocalDate.of(2025, 8, 13), 3);
		prolongado2 = new ContratoProlongado(limpieza2, LocalDate.of(2025, 8, 13), 6);
	}
	
	@Test
	public void calcularMontoUnicaVez() {
		assertTrue(contratoUnico1.montoAbonar() == 2300);
		assertTrue(contratoUnico2.montoAbonar() == 2000);
	}
	
	@Test
	public void calcularMontoProlongado() {
		assertTrue(prolongado1.montoAbonar() == 4800);
		assertTrue(prolongado2.montoAbonar() == 8640);
	}

}
