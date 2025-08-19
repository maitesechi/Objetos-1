package ar.edu.unlp.info.oo1.parcial_recursos_visuales;

import java.util.List;
import java.util.stream.Collectors;

public class Sistema {
	
	private List<Usuario> usuarios;
	
	public Sistema() {}
	
	public List<Usuario> List5UserConMasRecuUltMes(){
		return this.usuarios.stream()
				.sorted((user1, user2) -> Integer.compare(user2.getCountRecursosCreados() , user1.getCountRecursosCreados()))
				.limit(5)
				.collect(Collectors.toList());
	}
	
	public List<Usuario> List10UserConMasCompras(){
		return this.usuarios.stream()
				.sorted((user1, user2) -> Integer.compare(user2.getCountComprasRealizadas(), user1.getCountComprasRealizadas()))
				.limit(10)
				.collect(Collectors.toList());
	}

}
