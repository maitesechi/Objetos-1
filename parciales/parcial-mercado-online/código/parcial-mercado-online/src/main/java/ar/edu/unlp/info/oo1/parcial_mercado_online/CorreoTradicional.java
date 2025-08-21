package ar.edu.unlp.info.oo1.parcial_mercado_online;

public class CorreoTradicional implements TipoDeEntrega{
	
	public double getCosto(String origen, String destino, double precioProd) {
		return 500 + (precioProd * 0.05);
	}

}
