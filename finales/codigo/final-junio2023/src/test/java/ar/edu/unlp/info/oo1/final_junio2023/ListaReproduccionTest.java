package ar.edu.unlp.info.oo1.final_junio2023;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListaReproduccionTest {
	
	private Usuario user;
	private ListaReproduccion lista;
	private Cancion cancion1;
	private Cancion cancion2;
	private Cancion cancion3;
	
	@BeforeEach
	public void setUp() {
		user = new Usuario("maite", "3yui886s", "mai@gmail.com");
		
		cancion1 = new Cancion("22", 5, "balada", new Artista("Tini"));
		cancion2 = new Cancion("favorita", 3, "pop", new Artista("Angela Torres"));
		cancion3 = new Cancion("loca", 4, "rock", new Artista("Los autenticos decadentes"));
		
		lista = new ListaReproduccion("mezcla");
		
		lista.agregarCancion(cancion1);
		lista.agregarCancion(cancion2);
		lista.agregarCancion(cancion3);
	}
	
	@Test
	public void reproducirNormal() {
		lista.setEstrategia(new ReproduccionNormal());
		
		List<Cancion> aux = new ArrayList<Cancion>(lista.getCanciones());
		assertEquals(lista.reproducir(), aux);
	}
	
	@Test
	public void reproducirAleatorio() {
		 lista.setEstrategia(new ReproduccionAleatoria());
		 
		 List<Cancion> resultado = lista.reproducir();

		 boolean distinto = false;
		 for (int i = 0; i < lista.getCanciones().size(); i++) {
			 if (!lista.getCanciones().get(i).equals(resultado.get(i))) {
		            distinto = true;
		            break;
		     }
		 }
		 assertTrue(distinto);   
	}
	
	@Test
	public void reproducirInverso() {
		lista.setEstrategia(new ReproduccionInversa());
		
		List<Cancion> aux = new ArrayList<Cancion>();
		aux.add(cancion3);
		aux.add(cancion2);
		aux.add(cancion1);
		
		int cont = lista.getCanciones().size() - 1;
		boolean distinto = false;
		for (int i = 0; i < lista.getCanciones().size(); i++) {
			if (!lista.getCanciones().get(i).equals(aux.get(cont))) {
				distinto = true;
				break;
			}
			cont--;
		}
		
		assertFalse(distinto);
	}
	
}
