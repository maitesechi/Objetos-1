package ar.edu.unlp.info.oo1.parcial_mercado_online;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PublicacionTest {
	
	private Usuario user1;
	private Producto prod1;
	private ProductoUsado prod2;
	private Servicio serv1, serv2;
	private Sistema mercadoOnLine1, mercadoOnLine2;
	
	
	@BeforeEach
	public void setUp() {
		user1 = new Usuario("maite@gmail.com", "Saladillo");
		
		prod1 = new Producto("Tote bags", "Del Carril", "comoda", 12000, user1, 1, new RetiroEnDomicilio());
		
		prod2 = new ProductoUsado("Auto", "Villa Elisa", "buen estado", 200000, user1);
		
		serv1 = new Servicio("nails", "Del Carril", "buenos diseños", 7000, user1);
		serv2 = new Servicio("cm", "AMBA", "comunicate", 8000, user1);
		
		mercadoOnLine1 = new Sistema();
		mercadoOnLine2 = new Sistema();
		
		mercadoOnLine1.agregarPublicacion(prod1);
		mercadoOnLine1.agregarPublicacion(prod2);
		mercadoOnLine1.agregarPublicacion(serv1);
		mercadoOnLine1.agregarPublicacion(serv2);
	}
	
	@Test 
	public void EntregaProdUsado() {
		assertTrue(prod2.montoAPagar() == 200000);
		assertTrue(prod2.montoAPagar() == 0);
	}
	
	@Test
	public void EntregaEnDomicilioProdNuevo() {
		assertTrue(prod1.montoAPagar() == 12000);
		assertTrue(prod1.montoAPagar() == 0);
	}
	
	@Test
	public void EntregaExpressProdNuevo() {
		prod1.setTipoDeEntrega(new Express());
		assertTrue(prod1.montoAPagar() == 13220);
	}
	
	@Test
	public void EntregaCorreoTradicionalProdNuevo() {
		prod1.setTipoDeEntrega(new CorreoTradicional());
		assertTrue(prod1.montoAPagar() == 13100);
	}
	
	@Test
	public void montoServicioFueraYDentroDeAmba() {
		assertTrue(serv1.montoAPagar() == 7800);
		assertTrue(serv2.montoAPagar() == 8500);
	}
	
	@Test
	public void sistemaSinPublicaciones() {
		assertTrue(mercadoOnLine2.get10PublicacionesMasCarasEn("Del Carril").size() == 0);
		assertTrue(mercadoOnLine2.getPublicacionesMasCarasEn("AMBA").size() == 0);
	}
	
	@Test
	public void sistemaConPublicacionesMasCara() {
		assertTrue(mercadoOnLine1.getPublicacionesMasCarasEn("Lobos").size() == 0);
		assertTrue(mercadoOnLine1.getPublicacionesMasCarasEn("Del Carril").size() == 2);
		assertTrue(mercadoOnLine1.get10PublicacionesMasCarasEn("Del Carril").get(0).equals(prod1));
	}

}
