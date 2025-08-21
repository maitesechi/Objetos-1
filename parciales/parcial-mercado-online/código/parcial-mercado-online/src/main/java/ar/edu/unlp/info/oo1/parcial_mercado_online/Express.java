package ar.edu.unlp.info.oo1.parcial_mercado_online;

public class Express implements TipoDeEntrega{
	
	public Express () {}
	
	public double getCosto(String origen, String destino, double precioProd) {
		//double distancia = Map.distanceBetween(origen, destino);
		double distancia = 2;
		return (distancia * 10) + (precioProd * 0.1);
	}

}
