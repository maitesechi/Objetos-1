package ar.edu.unlp.info.oo1.final_agosto2022;

import java.util.ArrayList;
import java.util.List;

public abstract class Receptor {
	
	protected List<Donacion> donaciones;
	
	public Receptor () {
		this.donaciones = new ArrayList<Donacion>();
	}
	
	public void agregarDonacion(Donacion donacion) {
		this.donaciones.add(donacion);
	}
	
	public abstract boolean puedeRecibirDonacion(Donacion donacion, List<Donacion> donacionesDelMes);

}
