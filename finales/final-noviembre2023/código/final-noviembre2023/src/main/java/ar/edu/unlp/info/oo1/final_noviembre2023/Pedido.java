package ar.edu.unlp.info.oo1.final_noviembre2023;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private List<ItemPedido> items;
	private double totalConDescuento;
	
	public Pedido(List<ItemPedido> items, double totalConDescuento) {
		this.items = items;
		this.totalConDescuento = totalConDescuento; 
	}
	
	public double getTotalConDescuento() {
		return this.totalConDescuento;
	}
	
	public void agregarItemPedido(ItemPedido pedido) {
		this.items.add(pedido);
	}
	
	public List<ItemPedido> getItems(){
		return this.items;
	}
	
	public double getTotalSinDescuento() {
		return this.items.stream()
				.mapToDouble(item -> item.getCosto())
				.sum();
	}

}
