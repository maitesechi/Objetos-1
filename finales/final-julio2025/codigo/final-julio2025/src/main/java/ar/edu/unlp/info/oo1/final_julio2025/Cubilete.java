package ar.edu.unlp.info.oo1.final_julio2025;

import java.util.ArrayList;
import java.util.List;

public class Cubilete {
	
	private List<Dado> dados;
	private List<Lanzamiento> lanzamientos;
	
	public Cubilete() {
		this.dados = new ArrayList<Dado>();
		this.lanzamientos = new ArrayList<Lanzamiento>();
	}
	
	public void agregarDado(Dado dato) {
		this.dados.add(dato);
	}
	
	public void lanzar() {
		Lanzamiento lanzamiento = new Lanzamiento();
		
		for (Dado dado: this.dados) {
			lanzamiento.agregarResultado(new ResultadoDado(dado, dado.lanzar()));
		}
		
		this.lanzamientos.add(lanzamiento);
	}
	
	public List<Lanzamiento> getLanzamientos(){
		return this.lanzamientos;
	}
	
	public List<Dado> getDados(){
		return this.dados;
	}

}
