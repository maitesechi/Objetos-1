package ar.edu.unlp.info.oo1.final_julio2025;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DadoTest {
	
	private Dado estandar, modificado, explosivo;
	
	@BeforeEach
	public void setUp() {
		this.estandar = new DadoEstandar();
		this.modificado = new DadoConModificador(3);
		this.explosivo = new DadoExplosivo();
	}
	
	@Test
	public void lanzarDadoEstandar() {
		int resultado = this.estandar.lanzar();
		assertTrue(resultado > 0 && resultado < 7);
	}
	
	@Test
	public void lanzarDadoModificado() {
		int resultado = this.modificado.lanzar();
		assertTrue(resultado > 3 && resultado < 10);
	}
	
	@Test
	public void lanzarDadoExplosivo() {
		int resultado = this.explosivo.lanzar();
		assertTrue(resultado > 0);
	}
}
