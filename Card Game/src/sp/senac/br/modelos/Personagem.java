package sp.senac.br.modelos;

abstract public class Personagem {

	private String nome;
	protected int energia;
	private boolean vivo;
	private Tipo tipo;

	public Personagem(String nome, Tipo tipo, boolean vivo, int energia) {
		super();
		this.nome = nome;
		this.vivo = vivo;
		this.energia = energia;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia += energia;
	}

	public boolean isVivo() {
		return (energia > 0);
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	@Override
	public String toString() {
		return "nome=" + nome + ", energia=" + energia + ", vivo=" + vivo + ", tipo=" + tipo;
	}

}
