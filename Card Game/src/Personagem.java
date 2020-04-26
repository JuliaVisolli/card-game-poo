import java.util.Random;

public class Personagem implements Batalha {

	private String nome;
	private int energia;
	private boolean vivo;

	public Personagem(String nome, int energia, boolean vivo) {
		super();
		this.nome = nome;
		this.energia = energia;
		this.vivo = vivo;
	}

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
		// return vivo;

		return (energia > 0);
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public int recebeAtaque(int ataque, int energia) {
		// TODO Auto-generated method stub
//		int restoEnergia = energia - ataque;
//		this.setEnergia(restoEnergia);
//		return restoEnergia;

		this.energia -= ataque;
		return this.energia;
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
