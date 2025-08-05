package ar.edu.unlp.info.oo1.final_noviembre2023;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AmateurTest {
	
	private Servicio serv1, serv2, serv3;
	private ItemPedido item1, item2, item3;
	private Montañista amateur;
	private List<ItemPedido> items1;
	
	@BeforeEach
	public void setUp() {
		serv1 = new Servicio(200, 150, 3);
		serv2 = new Servicio(100, 50, 4);
		serv3 = new Servicio(200, 100, 3);
		
		item1 = new ItemPedido(2, serv1);
		item2 = new ItemPedido(2, serv2);
		item3 = new ItemPedido(6, serv3);
		
		amateur = new Amateur();
		
		items1 = new ArrayList<ItemPedido>();
		
		items1.add(item1);
		amateur.confirmarPedido(items1);
	}
	
	@Test
	public void cotizarSinSuperarDoble() {
		List<ItemPedido> itemCotizar1 = new ArrayList<ItemPedido>();
		itemCotizar1.add(item2);
		
		assertTrue(amateur.cotizarPedido(itemCotizar1) == 200);
			
	}
	
	public void cotizarSupenadoDoble() {
		List<ItemPedido> itemCotizar2 = new ArrayList<ItemPedido>();
		itemCotizar2.add(item2);
		itemCotizar2.add(item3);
		
		assertTrue(amateur.cotizarPedido(itemCotizar2) == 760);
	}

}
