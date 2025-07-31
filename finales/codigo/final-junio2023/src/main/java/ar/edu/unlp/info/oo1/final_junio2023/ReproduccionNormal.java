package ar.edu.unlp.info.oo1.final_junio2023;

import java.util.ArrayList;
import java.util.List;

public class ReproduccionNormal implements Reproduccion{
	
	public List<Cancion> ordenar(List<Cancion> canciones){
		return new ArrayList<Cancion>(canciones);
	}

}
