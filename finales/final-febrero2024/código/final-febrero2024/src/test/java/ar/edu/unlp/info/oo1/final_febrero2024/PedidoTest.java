package ar.edu.unlp.info.oo1.final_febrero2024;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidoTest {
	
	private Item servicio;
	private Item producto;
	private Item servicio2;
	private Pedido pedido;
	
	@BeforeEach
	public void setUp() {
		this.pedido = new Pedido();
		this.servicio = new Servicio(5, 300, "Netflix");
		this.producto = new Producto(200, 50, 3, "Manzana");
		this.servicio = new Servicio(2, 200, "Limpiar");
	}
	
	@Test
	public void pedidoSinItems() {
		assertEquals(this.pedido.costoTotal(), 0);
	}
	
	public void pedidosConItems() {
		this.pedido.agregarItem(producto);
		this.pedido.agregarItem(servicio);
		this.pedido.agregarItem(servicio2);
		
		assertEquals(this.pedido.costoTotal(), 2250);
	}
}
