package ar.edu.unlp.info.oo1.parcial_cobros;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EscrituraDePagoTest {
	
	private Pagare pagare1, pagare2;
	private Cheque cheque1, cheque2;
	
	
	@BeforeEach
	public void setUp() {
		pagare1 = new Pagare(200, "Maitena Sechi", "Agustina Soto", LocalDate.of(2025, 6, 12), LocalDate.of(2025, 7, 12));
		pagare2 = new Pagare(400, "Valentina Camio", "Lucia Ferrarotti", LocalDate.of(2025, 2, 3), LocalDate.of(2025, 12, 12));
		
		cheque1 = new Cheque(500, "Ornella Sechi", "Lorena Quattrini", LocalDate.of(2025, 5, 2));
		cheque2 = new Cheque(600, "Juan Sechi", "Felipe Sechi", LocalDate.of(2025, 7, 20));
	}
	
	@Test
	public void vencimientosPagare() {
		assertTrue(pagare1.estaVencido());
		assertFalse(pagare2.estaVencido());
	}
	
	@Test
	public void vencimientoCheque() {
		assertTrue(cheque1.estaVencido());
		assertFalse(cheque2.estaVencido());
	}

}
