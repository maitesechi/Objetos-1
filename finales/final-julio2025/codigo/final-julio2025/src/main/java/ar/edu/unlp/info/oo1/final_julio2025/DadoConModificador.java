package ar.edu.unlp.info.oo1.final_julio2025;

public class DadoConModificador extends Dado {
	
	private int valorFijo;
	
	public DadoConModificador(int valor) {
		this.valorFijo = valor;
	}
	
	public int lanzar() {
		return super.lanzar() + this.valorFijo;
	}

}
