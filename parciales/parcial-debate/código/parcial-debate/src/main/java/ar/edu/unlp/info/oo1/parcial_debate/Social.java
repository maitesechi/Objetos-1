package ar.edu.unlp.info.oo1.parcial_debate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Social implements Recomendador{
	
	public Social() {
		
	}
	
	public List<Publicación> getFeed(List<Usuario> usuarios) {
	    return usuarios.stream()
	            .flatMap(u -> u.getPublicaciones().stream())   // junta todas las publicaciones
	            .sorted((p1, p2) -> p2.getFechaEmision().compareTo(p1.getFechaEmision())) // ordena descendente
	            .collect(Collectors.toList());
	}

}
