package ar.edu.unlp.info.oo1.final_agosto2022;

import java.util.ArrayList;
import java.util.List;

public class ONG {
	
	private List<Donante> donantes;
	private List<Receptor> receptores;
	private List<Donacion> donacionesExtras;
	private double montoExtraEsperado;
	
	public ONG () {
		this.donantes = new ArrayList<Donante>();
		this.receptores = new ArrayList<Receptor>();
		this.donacionesExtras = new ArrayList<Donacion>();
	}
	
	public void agregarDonacionExtra(Donacion donacion) {
		this.donacionesExtras.add(donacion);
	}
	
	public void agregarDonante (Donante donante) {
		this.donantes.add(donante);
	}
	
	public void agregarReceptor(Receptor receptor) {
		this.receptores.add(receptor);
	}
	
	public boolean esCorrectaLaEntrega(List<Entrega> entregas) {
		for (Entrega entrega: entregas) {
			for (Donacion donacion: entrega.getDonaciones()) {
				if (!entrega.getReceptor().puedeRecibirDonacion(donacion, entrega.getDonaciones())){
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean donacionExtra(double montoExtra) {
	    double recaudado = 0;
	    this.montoExtraEsperado = montoExtra;
	    List<Donacion> usadas = new ArrayList<>();

	    for (Donacion d : donacionesExtras) {
	        recaudado += d.getMonto();
	        usadas.add(d);
	        if (recaudado >= montoExtra) break;
	    }

	    if (recaudado >= montoExtra) {
	        // Se concretan las donaciones, por ejemplo, entregándolas
	        donacionesExtras.removeAll(usadas);
	        return true;
	    } else {
	        return false;
	    }
	}
	
	public boolean recaudoSuficiente() {
	    double total = donacionesExtras.stream()
	        .mapToDouble(Donacion::getMonto)
	        .sum();
	    return total >= montoExtraEsperado;
	}


}
