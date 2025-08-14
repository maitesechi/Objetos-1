package ar.edu.unlp.info.oo1.parcial_facturacion_energia;

import java.time.LocalDate;

public class Medicion {
	
	private double consumo;
	private int anio;
	private int mes;
	
	
	public Medicion (double consumo, int mes, int anio) {
		this.consumo = consumo;
		this.anio = anio;
		this.mes = mes;
	}
	
	public double getConsumo() {
		return this.consumo;
	}
	
	public int getAnio(){
		return this.anio;
	}
	
	public int getMes() {
		return mes;
	}

}
