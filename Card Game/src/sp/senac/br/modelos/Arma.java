package sp.senac.br.modelos;

abstract public class Arma {

	private String nome;
	private int poder;
	private Tipo tipo;

	public Arma(int poder, Tipo tipo, String nome) {
		super();
		this.poder = poder;
		this.tipo = tipo;
		this.nome = nome;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public int getPoder() {
		return poder;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return " Arma [nome=" + nome + ", poder=" + poder + ", tipo=" + tipo + "]\n";
	}

}
