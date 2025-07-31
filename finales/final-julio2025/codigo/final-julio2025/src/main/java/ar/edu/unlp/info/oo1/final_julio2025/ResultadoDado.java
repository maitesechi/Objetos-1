package ar.edu.unlp.info.oo1.final_julio2025;

public class ResultadoDado {
	
	private Dado dado;
	private int resultado;
	
	public ResultadoDado(Dado dado, int resultado) {
		this.dado = dado;
		this.resultado = resultado;
	}

	public Dado getDado() {
		return dado;
	}

	public void setDado(Dado dado) {
		this.dado = dado;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	

}
