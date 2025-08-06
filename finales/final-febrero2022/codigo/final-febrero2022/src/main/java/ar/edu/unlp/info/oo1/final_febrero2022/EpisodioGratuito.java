package ar.edu.unlp.info.oo1.final_febrero2022;

public class EpisodioGratuito extends Episodio{
	
	public EpisodioGratuito(int duracion) {
		super(duracion);
	}
	
	public int calcularPuntaje() {
		return this.duracion * this.escuchas;
	}

}
