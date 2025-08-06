package ar.edu.unlp.info.oo1.final_febrero2022;

import java.util.ArrayList;
import java.util.List;

public class PodcastWarehouse {
	
	private List<Autor> autores;
	
	public PodcastWarehouse() {
		this.autores = new ArrayList<Autor>();
	}
	
	public void agregarAutor(Autor autor) {
		this.autores.add(autor);
	}
	
	public Autor calcularAutorConMayorPuntaje() {
		return this.autores.stream()
				.max((autor1, autor2) -> Integer.compare(autor1.calcularPuntaje(), autor2.calcularPuntaje()))
				.orElse(null);
	}

	
	public Podcast calcularPodcastConMasEscuchas() {
		return this.autores.stream()
				.map(pod -> pod.calcularPodcastConMasEscuchas())
				.max((pod1, pod2) -> Integer.compare(pod1.getEsuchasDeEpisodios(), pod2.getEsuchasDeEpisodios()))
				.orElse(null);
	}
	
	public int calcularPromedioEscuchasDePodcast (Podcast podcast) {
		
		return podcast != null ? podcast.calcularPromedioEscuhas() : 0;
	}
}
