package ar.edu.unlp.info.oo1.final_julio2025;

import java.util.ArrayList;
import java.util.List;

public class DadoPonderado extends Dado{
	
	private List<Integer> valorPonderado;
	
	public DadoPonderado(int valorPonderado) {
		this.valorPonderado = new ArrayList<Integer>();
		
		agregarValoresPosibles();
		agregarValorDelPonderado(valorPonderado);
	}
	
	private void agregarValoresPosibles() {
		for (int i = 1; i <= 6; i++) {
			this.valorPonderado.add(i);
		}
	}
	
	private void agregarValorDelPonderado(int valor) {
		for (int i = 0; i < 10; i++) {
			this.valorPonderado.add(valor);
		}
	}

	public int lanzar() {
		int index = this.random.nextInt(this.valorPonderado.size());
		return this.valorPonderado.get(index);
	}
}
