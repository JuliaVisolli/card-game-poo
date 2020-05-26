import java.util.Random;

public class Dado {
	protected int calculaAtaque() {
		Random rand = new Random();
		return rand.nextInt(10);
	}
}
