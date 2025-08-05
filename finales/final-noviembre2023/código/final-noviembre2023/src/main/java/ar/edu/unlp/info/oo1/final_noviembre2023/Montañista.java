package ar.edu.unlp.info.oo1.final_noviembre2023;

import java.util.ArrayList;
import java.util.List;

public abstract class Montañista {
	
	protected List<Pedido> pedidos;
	
	public Montañista() {
		this.pedidos = new ArrayList<Pedido>();
	}
	
	public void agregarPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}
	
	public List<Pedido> getPedidos(){
		return this.pedidos;
	}
	
	public double cotizarPedido(List<ItemPedido> items) {
        double totalSinDescuento = items.stream()
                .mapToDouble(item -> item.getCosto())
                .sum();
        double descuento = this.calcularDescuento(totalSinDescuento);
        return totalSinDescuento - descuento;
    }

    public Pedido confirmarPedido(List<ItemPedido> items) {
    	double totalFinal = cotizarPedido(items);
        Pedido nuevoPedido = new Pedido(items, totalFinal);
        this.agregarPedido(nuevoPedido);
        return nuevoPedido;
    }
	
	public abstract double calcularDescuento(double totalPedidoActual);

}
