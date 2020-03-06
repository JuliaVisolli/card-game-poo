import java.util.Random;

public class Personagem implements Batalha {

	private String nome;
	private int energia;
	private boolean vivo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public int recebeAtaque(int ataque, int energia) {
		// TODO Auto-generated method stub
		int restoEnergia = energia - ataque;
		this.setEnergia(restoEnergia);
		return restoEnergia;
	}

	public int desfereAtaque() {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int ataque = rand.nextInt(10);

		return ataque;
	}

	@Override
	public String toString() {
		return "Personagem [nome=" + nome + ", energia=" + energia + ", vivo=" + vivo + "]";
	}

}
