package ar.edu.unlp.info.oo1.final_junio2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReproduccionInversa implements Reproduccion {
	
	public List<Cancion> ordenar(List<Cancion> canciones){
		List<Cancion> orden = new ArrayList<Cancion>(canciones);
		Collections.reverse(orden);
		return orden;
	}

}
