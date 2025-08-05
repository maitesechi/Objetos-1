package ar.edu.unlp.info.oo1.final_noviembre2023;


public class Profesional extends Montañista{
	
	public Profesional() {
		super();
	}
	
	public double calcularDescuento(double totalPedidoActual) {
		double promedioUlt3 = promedioUlt3Pedidos();
		if (pedidos.size() >= 3 && promedioUlt3 < totalPedidoActual) {
			return totalPedidoActual * 0.07;
		}
		return 0;
	}
		
	private double promedioUlt3Pedidos() {
		return pedidos.stream()
	            .skip(Math.max(0, pedidos.size() - 3))   // toma los últimos 3
	            .mapToDouble(p -> p.getTotalConDescuento())
	            .average()
	            .orElse(0);
	}

}
