package ar.edu.unlp.info.oo1.final_febrero2024;

public class Servicio implements Item{
	
	private int horasTrabajadas;
	private double valorHora;
	private String objetivo;
	
	public Servicio(int horasTrabajadas, double valorHora, String objetivo) {
		this.horasTrabajadas = horasTrabajadas;
		this.valorHora = valorHora;
		this.objetivo = objetivo;
	}

	public double getCosto() {
		return this.horasTrabajadas * this.valorHora;
	}
	
}
