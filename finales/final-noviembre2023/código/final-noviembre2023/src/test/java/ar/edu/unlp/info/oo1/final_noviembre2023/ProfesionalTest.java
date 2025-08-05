package ar.edu.unlp.info.oo1.final_noviembre2023;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProfesionalTest {
	
	private Servicio serv1, serv2, serv3;
	private ItemPedido item1, item2, item3;
	private Montañista profesional;
	private List<ItemPedido> pedido1, pedido2, pedido3, cotizarPedido;
	
	@BeforeEach
	public void setUp() {
		serv1 = new Servicio(200, 150, 3);
		serv2 = new Servicio(100, 50, 4);
		serv3 = new Servicio(200, 100, 3);
		
		item1 = new ItemPedido(2, serv1);
		item2 = new ItemPedido(2, serv2);
		item3 = new ItemPedido(6, serv3);
		
		profesional = new Profesional();
		
		
		pedido1 = new ArrayList<ItemPedido>();
		pedido2 = new ArrayList<ItemPedido>();
		pedido3 = new ArrayList<ItemPedido>();
		
		pedido1.add(item1);
		pedido2.add(item2);
		pedido3.add(item3);
		
		cotizarPedido = new ArrayList<ItemPedido>();
		cotizarPedido.add(new ItemPedido(3, new Servicio(50, 20, 2)));
	}
	
	
	@Test
	public void cotizarConUnSoloPedidoHistorico() {
		profesional.confirmarPedido(pedido1);
		assertTrue(profesional.cotizarPedido(cotizarPedido) == 60);
	}
	
	@Test
	public void cotizarConDosPedidoHistorico() {
		profesional.confirmarPedido(pedido1);
		profesional.confirmarPedido(pedido2);
		assertTrue(profesional.cotizarPedido(cotizarPedido) == 60);
	}
	
	@Test
	public void cotizarSinSuperarPromedioUlt3Pedidos() {
		profesional.confirmarPedido(pedido1);
		profesional.confirmarPedido(pedido2);
		profesional.confirmarPedido(pedido3);
		assertTrue(profesional.cotizarPedido(cotizarPedido) == 60);
	}
	
	@Test
	public void cotizarSuperandoPromedioUlt3Pedidos() {
		profesional.confirmarPedido(pedido1);
		profesional.confirmarPedido(pedido2);
		profesional.confirmarPedido(pedido3);
		
		List<ItemPedido> cotizarPedido2 = new ArrayList<ItemPedido>();
		cotizarPedido2.add(new ItemPedido(3, new Servicio(20, 500, 2)));
		
		assertTrue(profesional.cotizarPedido(cotizarPedido2) == 1395);
	}

}
