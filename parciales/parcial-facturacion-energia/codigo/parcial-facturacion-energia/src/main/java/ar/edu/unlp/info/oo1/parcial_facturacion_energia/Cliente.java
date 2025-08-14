package ar.edu.unlp.info.oo1.parcial_facturacion_energia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	
	private String direccion;
	private double tarifario;
	private List<Medicion> mediciones;
	
	public Cliente(String direccion) {
		this.direccion = direccion;
		this.tarifario = 0; //pongo un valor por defecto 
		this.mediciones = new ArrayList<Medicion>();
	}
	
	public void actualizarTarifario(double tarifario) {
		this.tarifario = tarifario;
	}
	
	public void agregarMedicion(Medicion med) {
		this.mediciones.add(med);
	}
	
	protected Medicion buscarConsumo(int anio, int mes) {
		return this.mediciones.stream()
				.filter(m -> m.getAnio() == mes && m.getMes() == mes)
				.findFirst().orElse(null);
	}
	
	public double facturarConsumo (int mes, int anio) {
		Medicion medicion = buscarConsumo(anio, mes);
		if (medicion != null) {
			double costo = medicion.getConsumo() * this.tarifario;
			return costo  - (costo * calcularDescuento(medicion));
		}
		return 0;
	}
	
	protected abstract double calcularDescuento(Medicion medicion);

}
