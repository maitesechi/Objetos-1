package ar.edu.unlp.info.oo1.final_febrero2024;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private List<Item> items;
	
	public Pedido() {
		this.items = new ArrayList<Item>();
	}
	
	public void agregarItem (Item item) {
		this.items.add(item);
	}
	
	public double costoTotal() {
		return this.items.stream()
				.mapToDouble(item -> item.getCosto())
				.sum();
	}
	
	public List<Item> getItems(){
		return this.items;
	}

}
