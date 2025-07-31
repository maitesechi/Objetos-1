package ar.edu.unlp.info.oo1.final_julio2025;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CubileteTest {
	
	private Cubilete cubilete;
	private Dado dado1;
	private Dado dado2;
	private Dado dado3;
	
	@BeforeEach
	public void setUp() {
		this.cubilete = new Cubilete();
		this.dado1 = new DadoEstandar();
		this.dado2 = new DadoConModificador(4);
		this.dado3 = new DadoExplosivo();
		
		this.cubilete.agregarDado(dado1);
		this.cubilete.agregarDado(dado2);
		this.cubilete.agregarDado(dado3);
	}
	
	@Test
	public void dadosDelCubilete() {
		assertTrue(this.cubilete.getDados().size() == 3);
	}
	
	public void contarLanzamientos() {
		for(int i = 0; i < 4; i++) {
			this.cubilete.lanzar();
		}
		assertTrue(this.cubilete.getLanzamientos().size() == 4);
	}

}
