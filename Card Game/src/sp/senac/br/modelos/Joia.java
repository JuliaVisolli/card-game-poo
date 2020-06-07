package sp.senac.br.modelos;

abstract public class Joia {

	private String nome;
	private int poder;
	private Tipo tipoJoia;

	public Joia(Tipo tipoJoia, int poder, String nome) {
		this.tipoJoia = tipoJoia;
		this.poder = poder;
		this.nome = nome;
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}

	public Tipo getTipoJoia() {
		return tipoJoia;
	}

	public void setTipoJoia(Tipo tipoJoia) {
		this.tipoJoia = tipoJoia;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return " Joia [nome=" + nome + ", poder=" + poder + ", tipoJoia=" + tipoJoia + "]\n";
	}

}
