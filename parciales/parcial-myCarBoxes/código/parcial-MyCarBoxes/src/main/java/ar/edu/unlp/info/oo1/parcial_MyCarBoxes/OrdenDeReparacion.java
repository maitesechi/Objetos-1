package ar.edu.unlp.info.oo1.parcial_MyCarBoxes;

import java.util.List;

public class OrdenDeReparacion extends Orden{
	
	private String descripcion;
	private int cantHoras;
	private List<Empleado> empleados;
	
	public OrdenDeReparacion (Vehiculo vehiculo, List<Repuesto> repuestos, String descripcion, int cantHoras, List<Empleado> empleados) {
		super(vehiculo, repuestos);
		this.descripcion = descripcion;
		this.cantHoras = cantHoras;
		this.empleados = empleados;
	}
	
	public double calcularCosto() {
		double costo = this.calcularCostoEmpleados() + this.costoRepuestos();
		return costo + (costo * 0.1) ;
	}
	
	public double calcularCostoEmpleados() {
		return this.empleados.stream()
				.mapToDouble(e -> e.getValorPorHora() * this.cantHoras)
				.sum();
	}

}
