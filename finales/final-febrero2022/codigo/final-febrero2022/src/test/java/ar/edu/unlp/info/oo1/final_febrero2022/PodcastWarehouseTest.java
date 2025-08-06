package ar.edu.unlp.info.oo1.final_febrero2022;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PodcastWarehouseTest {
	
	private Podcast pod1, pod2, pod3;
	private Autor autor1, autor2;
	private Episodio epi2, epi3;
	private EpisodioPremium epi1, epi4;
	private EpisodioBonus bonus1, bonus2;
	private PodcastWarehouse sistema = new PodcastWarehouse();
	
	@BeforeEach
	public void setUp() {
		bonus1 = new EpisodioBonus(2);
		bonus1.setEscuchas(3);
		
		bonus2 = new EpisodioBonus(3);
		bonus2.setEscuchas(3);
		
		epi1 = new EpisodioPremium(2, 200);
		epi1.setEscuchas(3);
		
		epi2 = new EpisodioGratuito(3);
		epi2.setEscuchas(4);
		
		epi3 = new EpisodioGratuito(4);
		epi3.setEscuchas(2);
		
		epi4 = new EpisodioPremium(4, 110);
		epi4.setEscuchas(5);
		epi4.agregarEpisodioBonus(bonus1);
		epi4.agregarEpisodioBonus(bonus2);
		
		pod1 = new Podcast();
		pod1.agregarEpisodio(epi1);
		pod1.agregarEpisodio(epi2);
		
		pod2 = new Podcast();
		pod2.agregarEpisodio(epi3);
		
		pod3 = new Podcast();
		pod3.agregarEpisodio(epi4);
		
		autor1 = new Autor();
		autor1.agregarPodcast(pod1);
		autor1.agregarPodcast(pod2);
		
		autor2 = new Autor();
		autor2.agregarPodcast(pod3);
		
		sistema.agregarAutor(autor1);
		sistema.agregarAutor(autor2);
	}
	
	@Test
	public void autorConMayorPuntaje() {
		assertTrue(sistema.calcularAutorConMayorPuntaje().equals(autor2));
		assertTrue(sistema.calcularAutorConMayorPuntaje().calcularPuntaje() == 22015);
	}
	
	@Test
	public void podcastConMasEscuchas() {
		assertTrue(sistema.calcularPodcastConMasEscuchas().equals(pod1));
		assertTrue(sistema.calcularPodcastConMasEscuchas().getEsuchasDeEpisodios() == 7);
		assertFalse(sistema.calcularPodcastConMasEscuchas().equals(pod2));
	}
	
	@Test
	public void promedioEscuchasDePodcast() {
		assertTrue(sistema.calcularPromedioEscuchasDePodcast(pod1) == 3);
		Podcast podAux = null;
		assertTrue(sistema.calcularPromedioEscuchasDePodcast(podAux) == 0);
	}

}
