package sp.senac.br.modelos;

import java.util.Random;

import sp.senac.br.factory.FactoryArma;
import sp.senac.br.factory.FactoryArmadura;
import sp.senac.br.factory.FactoryJoia;
import sp.senac.br.factory.FactoryPersonagem;

public class Carta implements Batalha {

	private Personagem personagem;

	public Carta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carta(Personagem personagem) {
		this.personagem = personagem;

	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	@Override
	public String toString() {
		return " Carta [" + personagem + "]\n";
	}

	public void factoryCarta(Carta carta, FactoryPersonagem factoryPersonagem, FactoryArma factoryArma,
			FactoryArmadura factoryArmadura, FactoryJoia factoryJoia, Jogador jogador) {
		int count = 0;

		while (true) {
			int personagemRandom = (int) Math.floor(Math.random() * 30);
			int armaduraRandom = (int) Math.floor(Math.random() * 20);
			int armaRandom = (int) Math.floor(Math.random() * 20);
			int joiaRandom = (int) Math.floor(Math.random() * 6);
			
			factoryPersonagem = new FactoryPersonagem();

			Personagem personagem = factoryPersonagem.escolherClasse(personagemRandom);
			Arma arma = factoryArma.escolherClasse(armaRandom);
			Armadura armadura = factoryArmadura.escolherClasse(armaduraRandom);
			Joia joia = factoryJoia.escolherClasse(joiaRandom);

			carta = new Carta(personagem);

			jogador.populaJogador(count, jogador.getNome(), carta, joia, arma, armadura);

			if (count >= 5) {
				break;
			}

			++count;

		}
	}

	public void mostraCartaseAcessoriosSelecionados(Jogador jogador) throws InterruptedException {
		System.out.println(
				">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Selecionando as cartas para o player " + jogador.getNome());
		System.out.println(
				">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		Thread.sleep(2000);

		System.out.println();
		System.out.println("As cartas selecionadas para o player " + jogador.getNome() + " foram: ");
		System.out.println(jogador.getMapCartas().toString());
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("As armas selecionadas para o player " + jogador.getNome() + " foram: ");
		System.out.println(jogador.getMapArmas().toString());
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("As armaduras selecionadas para o player " + jogador.getNome() + " foram: ");
		System.out.println(jogador.getMapArmaduras().toString());
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("As joias selecionadas para o player " + jogador.getNome() + " foram: ");
		System.out.println(jogador.getMapJoias().toString());
		System.out.println();
	}

	public int recebeAtaque(int ataque) {
		this.personagem.energia -= ataque;
		return this.personagem.getEnergia();
	}

	public int desfereAtaque() {
		Random rand = new Random();
		int ataque = rand.nextInt(100);
		return ataque;
	}

}
