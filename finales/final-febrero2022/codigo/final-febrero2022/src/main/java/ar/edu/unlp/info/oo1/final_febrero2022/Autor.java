package ar.edu.unlp.info.oo1.final_febrero2022;

import java.util.ArrayList;
import java.util.List;

public class Autor {
	
	private List<Podcast> podcasts;
	
	public Autor(List<Podcast> podcasts) {
		this.podcasts = podcasts;
	}
	
	public Autor() {
		this.podcasts = new ArrayList<Podcast>();
	}
	
	public void agregarPodcast(Podcast podcast) {
		this.podcasts.add(podcast);
	}
	
	public int calcularPuntaje() {
		return this.podcasts.stream()
				.mapToInt(pod -> pod.calcularPuntaje())
				.sum();
	}
	
	public Podcast calcularPodcastConMasEscuchas() {
		return this.podcasts.stream()
				.max((a, b) -> Integer.compare(a.getEsuchasDeEpisodios(), b.getEsuchasDeEpisodios()))
				.orElse(null);
	}

}
