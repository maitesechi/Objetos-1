package ar.edu.unlp.info.oo1.parcial_debate;

import java.util.List;

public interface Recomendador {
	
	public List<Publicación> getFeed(List<Usuario> usuarios);

}
