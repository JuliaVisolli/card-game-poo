package sp.senac.br.modelos;

import java.util.HashMap;
import java.util.Map;

public class Jogador {

	private String nome;
	public Map<Integer, Carta> mapCartas = new HashMap<Integer, Carta>();
	public Map<Integer, Joia> mapJoias = new HashMap<Integer, Joia>();
	public Map<Integer, Arma> mapArmas = new HashMap<Integer, Arma>();
	public Map<Integer, Armadura> mapArmaduras = new HashMap<Integer, Armadura>();

	public Jogador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void populaJogador(int count, String nome, Carta cartas, Joia joias, Arma armas, Armadura armaduras) {
		this.nome = nome;
		mapCartas.put(count, cartas);
		mapJoias.put(count, joias);
		mapArmas.put(count, armas);
		mapArmaduras.put(count, armaduras);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Armadura escolherArmadura(int valor) {
		return mapArmaduras.get(valor);
	}

	public Arma escolherArma(int valor) {
		return mapArmas.get(valor);
	}

	public Joia escolherJoia(int valor) {
		return mapJoias.get(valor);
	}

	public Carta escolherCarta(int valor) {
		return mapCartas.get(valor);
	}

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", mapCartas=" + mapCartas + ", mapJoias=" + mapJoias + ", mapArmas="
				+ mapArmas + ", mapArmaduras=" + mapArmaduras + "]";
	}

	public Map<Integer, Carta> getMapCartas() {
		return mapCartas;
	}

	public Map<Integer, Joia> getMapJoias() {
		return mapJoias;
	}

	public Map<Integer, Arma> getMapArmas() {
		return mapArmas;
	}

	public Map<Integer, Armadura> getMapArmaduras() {
		return mapArmaduras;
	}

}
