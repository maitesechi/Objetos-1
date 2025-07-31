package ar.edu.unlp.info.oo1.final_junio2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReproduccionAleatoria implements Reproduccion{
	
	public List<Cancion> ordenar(List<Cancion> canciones){
		List<Cancion> orden = new ArrayList<Cancion>(canciones);
		Collections.shuffle(orden);
		return orden;
	}

}
