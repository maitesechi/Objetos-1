package ar.edu.unlp.info.oo1.final_julio2025;

public class DadoExplosivo extends Dado{
	
	public DadoExplosivo() {}

	public int lanzar() {
		int suma = 0;
		
		int aux = 6;
		while (aux == 6) {
			aux = super.lanzar();
			suma += aux;
		}
		
		return suma;
	}
}
