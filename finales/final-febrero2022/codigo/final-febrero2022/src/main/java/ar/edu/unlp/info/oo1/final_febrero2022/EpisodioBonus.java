package ar.edu.unlp.info.oo1.final_febrero2022;

public class EpisodioBonus extends Episodio{
	
	public EpisodioBonus(int duracion) {
		super(duracion);
	}
	
	public int calcularPuntaje() {
		return this.duracion * this.escuchas;
	}

}
