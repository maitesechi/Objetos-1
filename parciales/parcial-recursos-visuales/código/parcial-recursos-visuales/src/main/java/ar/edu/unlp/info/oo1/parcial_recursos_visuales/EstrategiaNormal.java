package ar.edu.unlp.info.oo1.parcial_recursos_visuales;

public class EstrategiaNormal implements Estrategia{
	
	public EstrategiaNormal() {}
	
	public double calcularCosto(double precioBase) {
		return precioBase;
	}
	
	public double calcularPuntaje(double precioBase) {
		return precioBase * 10;
	}

}
