package sp.senac.br.modelos;

abstract public class Armadura {

	private String nome;
	private int defesa;
	private Tipo tipo;

	public Armadura(int defesa, Tipo tipo, String nome) {
		super();
		this.defesa = defesa;
		this.tipo = tipo;
		this.nome = nome;
	}

	public int getDefesa() {
		return defesa;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return " Armadura [nome=" + nome + ", defesa=" + defesa + ", tipo=" + tipo + "]\n";
	}

}
