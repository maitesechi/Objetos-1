package ar.edu.unlp.info.oo1.final_febrero2024;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ItemTest {
	
	private Item servicio;
	private Item producto;
	
	@BeforeEach
	public void setUp() {
		this.servicio = new Servicio(5, 300, "Netflix");
		this.producto = new Producto(200, 50, 3, "Manzana");
	}
	
	@Test
	public void costoDeItems() {
		assertTrue(this.servicio.getCosto() == 1500);
		assertTrue(this.producto.getCosto() == 350);
	}

}
