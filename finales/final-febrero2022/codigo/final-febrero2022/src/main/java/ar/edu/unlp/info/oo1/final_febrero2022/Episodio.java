package ar.edu.unlp.info.oo1.final_febrero2022;

public abstract class Episodio {
	
	protected int duracion; //es en minutos
	protected int escuchas;
	
	public Episodio(int duracion) {
		this.duracion = duracion;
		this.escuchas = 0;
	}
	
	
	public void setEscuchas(int escuchas) {
		this.escuchas = escuchas;
	}
	
	public int getEscuchas() {
		return this.escuchas;
	}
	
	public abstract int calcularPuntaje();

}
