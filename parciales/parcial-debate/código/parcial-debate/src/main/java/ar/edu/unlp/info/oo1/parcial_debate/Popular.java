package ar.edu.unlp.info.oo1.parcial_debate;

import java.util.List;
import java.util.stream.Collectors;

public class Popular implements Recomendador{
	
	public Popular() {
		
	}
	
	public List<Publicación> getFeed(List<Usuario> usuarios) {
	    return usuarios.stream()
	            .flatMap(u -> u.getPublicaciones().stream())   // junta todas las publicaciones
	            .sorted((p1, p2) -> Integer.compare(p2.getLikes(), p1.getLikes())) // ordena descendente
	            .collect(Collectors.toList());
	}

}
