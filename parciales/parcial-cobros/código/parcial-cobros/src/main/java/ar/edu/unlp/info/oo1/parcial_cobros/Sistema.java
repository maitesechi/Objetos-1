package ar.edu.unlp.info.oo1.parcial_cobros;

import java.util.List;

public class Sistema {
	
	private List<EscrituraDePago> cobros;
	
	public Sistema (List<EscrituraDePago> cobros) {
		this.cobros = cobros;
	}
	
	public double valorLiquido() {
		return this.cobros.stream()
				.mapToDouble(c -> c.valorLiquido())
				.sum();
	}

}
