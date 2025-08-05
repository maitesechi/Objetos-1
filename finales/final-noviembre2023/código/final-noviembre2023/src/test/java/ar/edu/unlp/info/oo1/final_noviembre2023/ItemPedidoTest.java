package ar.edu.unlp.info.oo1.final_noviembre2023;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ItemPedidoTest {
	
	private Servicio servicio1;
	private Servicio servicio2;
	private ItemPedido item1;
	private ItemPedido item2;
	
	@BeforeEach
	public void setUp() {
		servicio1 = new Servicio(200, 150, 3);
		servicio2 = new Servicio(300, 210, 4);
		
		item1 = new ItemPedido(4, servicio1);
		item2 = new ItemPedido(2, servicio2);
	}
	
	@Test
	public void costosItems() {
		assertTrue(item1.getCosto() == 600);
		assertTrue(item2.getCosto() == 600);
	}

}
