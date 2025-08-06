package ar.edu.unlp.info.oo1.final_febrero2022;

import java.util.ArrayList;
import java.util.List;

public class Podcast {
	
	private List<Episodio> episodios;
	
	public Podcast(List<Episodio> episodios) {
		this.episodios = episodios;
	}
	
	public Podcast() {
		this.episodios = new ArrayList<Episodio>();
	}
	
	public void agregarEpisodio(Episodio epi) {
		this.episodios.add(epi);
	}
	
	public int calcularPuntaje() {
		return this.episodios.stream()
				.mapToInt(epi -> epi.calcularPuntaje())
				.sum();
	}
	
	public int getEsuchasDeEpisodios() {
		return this.episodios.stream()
				.mapToInt(epi -> epi.getEscuchas())
				.sum();
	}
	
	public int calcularPromedioEscuhas() {
		return this.getEsuchasDeEpisodios() / this.episodios.size();
	}

}
