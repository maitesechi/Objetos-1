package ar.edu.unlp.info.oo1.final_noviembre2023;

public class Amateur extends Montañista{
	
	public Amateur() {
		super();
	}
	
	public double calcularDescuento(double totalPedidoActual) {
		double costoHistorico = this.costoPedidosHistoricos();
		if (costoHistorico != 0 && totalPedidoActual >= 2 * costoHistorico) {
			return totalPedidoActual * 0.05;
		}
		return 0;
	}
	
	private double costoPedidosHistoricos() {
		double aux = this.pedidos.stream()
				.mapToDouble(p -> p.getTotalConDescuento())
				.sum();
		System.out.println("el costo historico es " + aux);
		return aux;
	}

}
