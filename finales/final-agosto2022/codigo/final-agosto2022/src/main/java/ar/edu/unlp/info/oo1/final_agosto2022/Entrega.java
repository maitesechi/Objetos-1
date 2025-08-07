package ar.edu.unlp.info.oo1.final_agosto2022;

import java.util.List;

public class Entrega {
	
	private Receptor receptor;
	private List<Donacion> donaciones;
	
	public Entrega (Receptor receptor, List<Donacion> donaciones){
		this.donaciones = donaciones;
		this.receptor = receptor;
	}
	
	public List<Donacion> getDonaciones(){
		return this.donaciones;
	}
	
	public Receptor getReceptor() {
		return this.receptor;
	}
}

