package ar.edu.unlp.info.oo1.final_julio2025;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Lanzamiento {
	
	private List<ResultadoDado> resultados;
	private LocalDateTime timestamp;
	
	
	public Lanzamiento() {
		this.resultados = new ArrayList<ResultadoDado>();
		this.timestamp = LocalDateTime.now();
	}
	
	public void agregarResultado(ResultadoDado resultado) {
		this.resultados.add(resultado);
	}
	
	public LocalDateTime getTimeStamp() {
		return this.timestamp;
	}
	
	public List<ResultadoDado> getResultados(){
		return this.resultados;
	}
	
	public int getValorTotal() {
		return this.resultados.stream()
				.mapToInt(r -> r.getResultado())
				.sum();
	}

}
