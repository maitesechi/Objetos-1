package ar.edu.unlp.info.oo1.final_agosto2022;

import java.util.List;

public class Comedor extends Receptor{
	
	public Comedor() {
		super();
	}
	
	public boolean puedeRecibirDonacion(Donacion donacion, List<Donacion> donacionesDelMes) {
		return true;
	}

}
