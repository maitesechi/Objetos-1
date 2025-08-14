package ar.edu.unlp.info.oo1.parcial_impuestos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SistemaImpuesto {
	
	private List<Contribuyente> contribuyentes;
	
	public SistemaImpuesto() {
		this.contribuyentes = new ArrayList<Contribuyente>();
	}
	
	public void agregarContribuyente(Contribuyente cont) {
		this.contribuyentes.add(cont);
	}
	
	public List<Contribuyente> contribuyenteQueMasPaganEn (String localidad, int numContri){
		return this.contribuyentes.stream()
				.filter(c -> c.getLocalidad().equals(localidad))
				.sorted((c1, c2) -> Double.compare(c2.getMontoAPagar(), c1.getMontoAPagar()))
				.limit(numContri)
				.collect(Collectors.toList());
	}

}
