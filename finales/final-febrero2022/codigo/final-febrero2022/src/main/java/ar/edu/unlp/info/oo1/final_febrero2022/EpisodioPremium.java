package ar.edu.unlp.info.oo1.final_febrero2022;

import java.util.ArrayList;
import java.util.List;

public class EpisodioPremium extends Episodio{
	
	private double precio;
	private List<EpisodioBonus> bonus;
	
	public EpisodioPremium (int duracion, double precio) {
		super(duracion);
		this.precio = precio;
		this.bonus = new ArrayList<EpisodioBonus>();
	}
	
	public void agregarEpisodioBonus(EpisodioBonus epi) {
		this.bonus.add(epi);
	}
	
	public int calcularPuntaje() {
		return (int)(this.duracion * this.escuchas * this.precio * 10) + calcularPuntajeDeEpiBonus();
	}
	
	private int calcularPuntajeDeEpiBonus() {
		return this.bonus.stream()
				.mapToInt(b -> b.calcularPuntaje())
				.sum();
	}

}
