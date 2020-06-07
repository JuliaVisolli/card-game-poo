package sp.senac.br.modelos;

import java.util.Random;

public class Dado {
	public int escolheJogador() {
		Random rand = new Random();
		return rand.nextInt(10);
	}
	
	public int escolhaAleatoria() {
		Random rand = new Random();
		return rand.nextInt(6);
	}
}
