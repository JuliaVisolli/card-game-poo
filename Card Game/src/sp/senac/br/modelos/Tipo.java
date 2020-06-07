package sp.senac.br.modelos;

public enum Tipo {
	FOGO(1, "TIPO FOGO"), AGUA(2, "TIPO AGUA"), VENTO(3, "TIPO VENTO"), GELO(4, "TIPO GELO"),
	TERRA(5, "TIPO TERRA"), FORCA(6, "TIPO FORCA"), PSIQUICO(7, "TIPO PSIQUICO"), PEDRA(8, "TIPO PEDRA"),
	VENENOSO(9, "TIPO VENENOSO"), LUTADOR(10, "TIPO LUTADOR"), MAGIA(11, "TIPO MAGIA");

	public int valor;
	public String descricao;

	Tipo(int valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}

}