package ar.edu.unlp.info.oo1.parcial_viviendas;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nombre;
	private String direccion;
	private List<Contrato> contratos;
	
	public Cliente (String nombre, String direccion) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.contratos = new ArrayList<Contrato>();
	}
	
	public void agregarContrato(Contrato contrato) {
		this.contratos.add(contrato);
	}
	
	public double calcularMontoAPagar() {
		return this.contratos.stream()
				.mapToDouble(c -> c.montoAbonar())
				.sum();
	}

}
