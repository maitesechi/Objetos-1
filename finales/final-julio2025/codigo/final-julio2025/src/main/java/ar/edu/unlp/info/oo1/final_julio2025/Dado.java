package ar.edu.unlp.info.oo1.final_julio2025;

import java.util.Random;

public abstract class Dado {
	
	protected Random random = new Random();
	
	public int lanzar() {
		return random.nextInt(6) + 1;
	}

}
