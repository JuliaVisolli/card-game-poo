package sp.senac.br.teste;

import java.util.Scanner;

import sp.senac.br.factory.FactoryArma;
import sp.senac.br.factory.FactoryArmadura;
import sp.senac.br.factory.FactoryJoia;
import sp.senac.br.factory.FactoryPersonagem;
import sp.senac.br.modelos.Arma;
import sp.senac.br.modelos.Armadura;
import sp.senac.br.modelos.Carta;
import sp.senac.br.modelos.Dado;
import sp.senac.br.modelos.Jogador;
import sp.senac.br.modelos.Joia;
import sp.senac.br.template.TemplateJogo;

public class TestaGame {

	public static void main(String[] args) throws InterruptedException {

		FactoryPersonagem factoryPersonagem1 = null;
		FactoryPersonagem factoryPersonagem2 = null;
		FactoryArma factoryArma = new FactoryArma();
		FactoryArmadura factoryArmadura = new FactoryArmadura();
		FactoryJoia factoryJoia = new FactoryJoia();
		Jogador jogador1 = new Jogador();
		Jogador jogador2 = new Jogador();
		Carta carta = null;
		Carta cartaJogador1 = new Carta();
		Carta cartaJogador2 = new Carta();
		Dado dado = new Dado();
		int posicaoArmaEscolhida2 = 0;
		int posicaoCartaEscolhida2 = 0;
		int posicaoJoiaEscolhida2 = 0;
		int posicaoArmaduraEscolhida2 = 0;
		int posicaoArmaEscolhida = 0;
		Arma armaEscolhida = null;
		int posicaoJoiaEscolhida = 0;
		Joia joiaEscolhida = null;
		int posicaoArmaduraEscolhida = 0;
		Armadura armaduraEscolhida = null;
		int numeroRodada = 0;

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		/**
		 * Inicio do jogo
		 */

		TemplateJogo.iniciaGame();
		jogador1.setNome(entrada.next());
		jogador2.setNome("Computador");

		TemplateJogo.quebraDeLinha();

		/**
		 * Selecao aleatoria das cartas, armdura, joias e armas dos jogadores
		 */

		if (jogador1.getNome() != null) {
			cartaJogador1.factoryCarta(carta, factoryPersonagem1, factoryArma, factoryArmadura, factoryJoia, jogador1);

		}

		cartaJogador2.factoryCarta(carta, factoryPersonagem2, factoryArma, factoryArmadura, factoryJoia, jogador2);

		/**
		 * Mostra as cartas, armas, armadura e joias selecionadas aleatoriamente
		 */

		cartaJogador1.mostraCartaseAcessoriosSelecionados(jogador1);
		cartaJogador2.mostraCartaseAcessoriosSelecionados(jogador2);


		TemplateJogo.quebraDeLinha();
		
		/*
		 * Inicio do loop da batalha ate que um dos jogadores tenha o seu deck de cartas zerado
		 */

		while (jogador1.mapCartas.size() > 0 && jogador2.mapCartas.size() > 0) {

			Thread.sleep(2000);

			TemplateJogo.quebraDeLinha();
			System.out.println();

			/*
			 * Escolha de cartas do primeiro jogador
			 */

			System.out.println("Digite o numero correspondente para escolher a carta:");
			System.out.println(jogador1.getMapCartas());

			int posicaoCartaEscolhida = entrada.nextInt();

			Carta cartaEscolhida = jogador1.escolherCarta(posicaoCartaEscolhida);
			TemplateJogo.quebraDeLinha();
			System.out.println();

			System.out.println("Voce escolheu a" + cartaEscolhida.toString());

			TemplateJogo.quebraDeLinha();
			System.out.println();

			/*
			 * Escolha de arma
			 */
			if (jogador1.mapArmas.size() > 0) {

				System.out.println("Digite o numero correspondente para escolher a arma:");
				System.out.println(jogador1.getMapArmas());

				posicaoArmaEscolhida = entrada.nextInt();

				armaEscolhida = jogador1.escolherArma(posicaoArmaEscolhida);

				if (armaEscolhida.getTipo().equals(cartaEscolhida.getPersonagem().getTipo())) {
					cartaEscolhida.getPersonagem().setEnergia(20);
				}
				TemplateJogo.quebraDeLinha();
				System.out.println();

				System.out.println("Voce escolheu a" + armaEscolhida.toString());
				cartaEscolhida.getPersonagem().setEnergia(armaEscolhida.getPoder());
			}

			TemplateJogo.quebraDeLinha();
			System.out.println();
			
			/*
			 * Escolha de joias
			 */

			if (jogador1.mapJoias.size() > 0) {
				System.out.println("Digite o numero correspondente para escolher a joia:");
				System.out.println(jogador1.getMapJoias());

				posicaoJoiaEscolhida = entrada.nextInt();

				joiaEscolhida = jogador1.escolherJoia(posicaoJoiaEscolhida);

				if (joiaEscolhida.getTipoJoia().equals(cartaEscolhida.getPersonagem().getTipo())) {
					cartaEscolhida.getPersonagem().setEnergia(20);
				}

				TemplateJogo.quebraDeLinha();
				System.out.println();

				System.out.println("Voce escolheu a" + joiaEscolhida.toString());
				cartaEscolhida.getPersonagem().setEnergia(joiaEscolhida.getPoder());

			}
			
			/*
			 * Escolha de armaduras
			 */

			if (jogador1.mapArmaduras.size() > 0) {
				System.out.println("Digite o numero correspondente para escolher a armadura:");
				System.out.println(jogador1.getMapArmaduras());

				posicaoArmaduraEscolhida = entrada.nextInt();

				armaduraEscolhida = jogador1.escolherArmadura(posicaoArmaduraEscolhida);

				if (armaduraEscolhida.getTipo().equals(cartaEscolhida.getPersonagem().getTipo())) {
					cartaEscolhida.getPersonagem().setEnergia(20);
				}

				TemplateJogo.quebraDeLinha();
				System.out.println();

				System.out.println("Voce escolheu a" + armaduraEscolhida.toString());
				cartaEscolhida.getPersonagem().setEnergia(armaduraEscolhida.getDefesa());
			}

			TemplateJogo.quebraDeLinha();
			
			/*
			 * Mostra a carta equipada om a joia, armadura e arma
			 */

			System.out.println("Carta equipada com a joia, armadura e arma -" + cartaEscolhida.toString());

			/*
			 * Fim da escolha do pimeiro jogador
			 */
			

			/*
			 * Inicio escolha segundo jogador
			 */

			Carta cartaEscolhida2 = null;
			
			/*
			 * Selecao aleatoria de carta segundo jogador
			 */

			while (true) {
				posicaoCartaEscolhida2 = dado.escolhaAleatoria();
				cartaEscolhida2 = jogador2.escolherCarta(posicaoCartaEscolhida2);
				if (jogador2.mapCartas.containsKey(posicaoCartaEscolhida2)) {
					break;
				}
			}

			System.out.println("O Computador escolheu a" + cartaEscolhida2.toString());

			Thread.sleep(2000);

			Arma armaEscolhida2 = null;
			
			/*
			 * Selecao aleatoria de arma do segundo jogador
			 */

			if (jogador2.mapArmas.size() > 0) {
				while (true) {
					posicaoArmaEscolhida2 = dado.escolhaAleatoria();
					armaEscolhida2 = jogador2.escolherArma(posicaoArmaEscolhida2);
					if (jogador2.mapArmas.containsKey(posicaoArmaEscolhida2)) {
						break;
					}

				}

				/*
				 * Acrescenta 20 pontos a energia do personagem caso a arma e o personagem sejam
				 * do mesmo tipo
				 */

				if (armaEscolhida2.getTipo().equals(cartaEscolhida2.getPersonagem().getTipo())) {
					cartaEscolhida2.getPersonagem().setEnergia(20);
				}
				TemplateJogo.quebraDeLinha();
				System.out.println();

				System.out.println("O Computador escolheu a " + armaEscolhida2.toString());
				cartaEscolhida2.getPersonagem().setEnergia(armaEscolhida2.getPoder());

			}

			Thread.sleep(2000);
			
			/*
			 * Selecao aleatoria de joia do segundo jogador
			 */

			Joia joiaEscolhida2 = null;
			if (jogador2.mapJoias.size() > 0) {

				while (true) {
					posicaoJoiaEscolhida2 = dado.escolhaAleatoria();
					joiaEscolhida2 = jogador2.escolherJoia(posicaoJoiaEscolhida2);
					if (jogador2.mapJoias.containsKey(posicaoJoiaEscolhida2)) {
						break;
					}

				}

				/*
				 * Acrescenta 20 pontos a energia do personagem caso a joia e o personagem sejam
				 * do mesmo tipo
				 */

				if (joiaEscolhida2.getTipoJoia().equals(cartaEscolhida2.getPersonagem().getTipo())) {
					cartaEscolhida2.getPersonagem().setEnergia(20);
				}

				TemplateJogo.quebraDeLinha();
				System.out.println();

				System.out.println("O Computador escolheu a " + joiaEscolhida2.toString());

				cartaEscolhida2.getPersonagem().setEnergia(joiaEscolhida2.getPoder());

			}

			Thread.sleep(2000);
			
			/*
			 * Selecao aleatoria de armadura do segundo jogador
			 */
			Armadura armaduraEscolhida2 = null;

			if (jogador2.mapArmaduras.size() > 0) {
				while (true) {
					posicaoArmaduraEscolhida2 = dado.escolhaAleatoria();
					armaduraEscolhida2 = jogador2.escolherArmadura(posicaoArmaduraEscolhida2);
					if (jogador2.mapArmaduras.containsKey(posicaoArmaduraEscolhida2)) {
						break;
					}

				}

				/*
				 * Acrescenta 20 pontos a energia do personagem caso a armadura e o personagem
				 * sejam do mesmo tipo
				 */

				if (armaduraEscolhida2.getTipo().equals(cartaEscolhida2.getPersonagem().getTipo())) {
					cartaEscolhida2.getPersonagem().setEnergia(20);
				}

				TemplateJogo.quebraDeLinha();
				System.out.println();

				System.out.println("O Computador escolheu a " + armaduraEscolhida2.toString());

				TemplateJogo.quebraDeLinha();

				cartaEscolhida2.getPersonagem().setEnergia(armaduraEscolhida2.getDefesa());
			}
			
			/*
			 * Mostra a carta equipada om a joia, armadura e arma
			 */

			System.out.println("Carta equipada com a joia, armadura e arma -" + cartaEscolhida2.toString());

			/*
			 * Fim escolha do segundo jogador
			 */

			TemplateJogo.quebraDeLinha();

			Thread.sleep(2000);
			
			/*
			 * Mostra numero da rodada atual
			 */

			System.out.println("Rodada " + numeroRodada);
			
			/*
			 * Mostra os jogadores que batalharam durante a rodada
			 */

			System.out.println("A batalha sera entre:");

			System.out.println();
			System.out.println("Carta de " + jogador1.getNome() + " = " + cartaEscolhida.toString());
			System.out.println("----------------------------------------- VS -------------------------------------");
			System.out.println();
			System.out.println("Carta de " + jogador2.getNome() + " = " + cartaEscolhida2.toString());
			TemplateJogo.quebraDeLinha();

			int escolheJogador1 = dado.escolheJogador();
			int escolheJogador2 = dado.escolheJogador();

			Thread.sleep(2000);
			
			/*
			 * Seleciona o jogador que iniciara a rodada
			 */

			if (escolheJogador1 > escolheJogador2) {
				int ataqueDesferido1 = cartaEscolhida.desfereAtaque();
				System.out.println("Quem desfere o primeiro ataque eh " + jogador1.getNome());
				TemplateJogo.quebraDeLinha();

				/*
				 * Decrementa 10 pontos a energia do personagem caso os personagens sejam do
				 * mesmo tipo
				 */
				if (cartaEscolhida.getPersonagem().getTipo().equals(cartaEscolhida2.getPersonagem().getTipo())) {
					System.out.println("Jogador(a) " + jogador1.getNome() + " desfere ataque " + 10);
					System.out.println("Jogador(a)" + jogador2.getNome() + " recebe ataque de " + 10);
					cartaEscolhida2.recebeAtaque(10);
				} else {
					System.out.println("Jogador(a) " + jogador1.getNome() + " desfere ataque " + ataqueDesferido1);
					System.out.println("Jogador(a)" + jogador2.getNome() + " recebe ataque de " + ataqueDesferido1);
					cartaEscolhida2.recebeAtaque(ataqueDesferido1);
				}

				TemplateJogo.quebraDeLinha();
			} else {
				int ataqueDesferido2 = cartaEscolhida2.desfereAtaque();
				System.out.println("Quem desfere o primeiro ataque eh " + jogador2.getNome());
				TemplateJogo.quebraDeLinha();

				/*
				 * Decrementa 10 pontos a energia do personagem caso os personagens sejam do
				 * mesmo tipo
				 */
				if (cartaEscolhida2.getPersonagem().getTipo().equals(cartaEscolhida.getPersonagem().getTipo())) {
					System.out.println("Jogador(a) " + jogador1.getNome() + " desfere ataque " + 10);
					System.out.println("Jogador(a)" + jogador2.getNome() + " recebe ataque de " + 10);
					cartaEscolhida.recebeAtaque(10);
				} else {
					System.out.println("Jogador(a) " + jogador2.getNome() + " desfere ataque de " + ataqueDesferido2);
					System.out.println("Jogador(a)" + jogador1.getNome() + " recebe ataque de " + ataqueDesferido2);

					cartaEscolhida.recebeAtaque(ataqueDesferido2);

				}

			}

			Thread.sleep(2000);
			
			/*
			 * Loop que seleciona quem desfere ataque e quem defende ate que um dos personagens tenha energia
			 */

			while (cartaEscolhida.getPersonagem().isVivo() && cartaEscolhida2.getPersonagem().isVivo()) {
				TemplateJogo.quebraDeLinha();

				/*
				 * Decrementa 10 pontos a energia do personagem caso os personagens sejam do
				 * mesmo tipo
				 */
				if (cartaEscolhida.getPersonagem().getTipo().equals(cartaEscolhida2.getPersonagem().getTipo())) {
					System.out.println("Jogador(a) " + jogador1.getNome() + " desfere ataque " + 10);
					System.out.println("Jogador(a)" + jogador2.getNome() + " recebe ataque de " + 10);
					cartaEscolhida2.recebeAtaque(10);

				} else {
					int ataqueDesferido1 = cartaEscolhida.desfereAtaque();
					System.out.println("Jogador(a) " + jogador1.getNome() + " desfere ataque " + ataqueDesferido1);

					System.out.println("Jogador(a) " + jogador2.getNome() + " recebe ataque de " + ataqueDesferido1);
					cartaEscolhida2.recebeAtaque(ataqueDesferido1);

				}

				Thread.sleep(2000);

				TemplateJogo.quebraDeLinha();

				/*
				 * Decrementa 10 pontos a energia do personagem caso os personagens sejam do
				 * mesmo tipo
				 */
				if (cartaEscolhida2.getPersonagem().getTipo().equals(cartaEscolhida.getPersonagem().getTipo())) {
					System.out.println("Jogador(a) " + jogador1.getNome() + " desfere ataque " + 10);
					System.out.println("Jogador(a)" + jogador2.getNome() + " recebe ataque de " + 10);
					cartaEscolhida.recebeAtaque(10);
				} else {

					int ataqueDesferido2 = cartaEscolhida2.desfereAtaque();
					System.out.println("Jogador(a) " + jogador2.getNome() + " desfere ataque " + ataqueDesferido2);

					System.out.println("Jogador(a) " + jogador1.getNome() + " recebe ataque de " + ataqueDesferido2);
					cartaEscolhida.recebeAtaque(ataqueDesferido2);
				}

			}

			TemplateJogo.quebraDeLinha();
			System.out.println();
			
			/*
			 * Resulta da partida
			 */
			System.out.println("************************ Resultado da Partida *******************");
			System.out.println();

			System.out.println("Carta de " + jogador1.getNome() + " = " + cartaEscolhida.toString());
			System.out.println("Carta de " + jogador2.getNome() + " = " + cartaEscolhida2.toString());
			
			/*
			 * Remove as armas, joias e armaduras utilizadas durante a rodada
			 */

			jogador1.mapArmas.remove(posicaoArmaEscolhida, armaEscolhida);
			jogador1.mapArmaduras.remove(posicaoArmaduraEscolhida, armaduraEscolhida);
			jogador1.mapJoias.remove(posicaoJoiaEscolhida, joiaEscolhida);

			jogador2.mapArmas.remove(posicaoArmaEscolhida2, armaEscolhida2);
			jogador2.mapArmaduras.remove(posicaoArmaduraEscolhida2, armaduraEscolhida2);
			jogador2.mapJoias.remove(posicaoJoiaEscolhida2, joiaEscolhida2);
			
			/*
			 * Remove carta do deck dos jogadores caso a energia seja menor ou igual a zero
			 */

			if (cartaEscolhida.getPersonagem().getEnergia() <= 0) {
				jogador1.mapCartas.remove(posicaoCartaEscolhida, cartaEscolhida);
				System.out.println("A " + cartaEscolhida.toString() + " morreu");

			}

			if (cartaEscolhida2.getPersonagem().getEnergia() <= 0) {
				jogador2.mapCartas.remove(posicaoCartaEscolhida2, cartaEscolhida2);
				System.out.println("A " + cartaEscolhida2.toString() + " morreu");
			}

			TemplateJogo.quebraDeLinha();

			Thread.sleep(2000);
			
			/*
			 * Exibe o vencedor da rodada
			 */

			if (cartaEscolhida.getPersonagem().getEnergia() > 0) {

				System.out.println("O vencedor desta rodada " + numeroRodada + " é : " + jogador1.getNome());
			} else {

				System.out.println("O vencedor desta rodada é : " + jogador2.getNome());
			}

			TemplateJogo.quebraDeLinha();
			
			/*
			 * Mostra as cartas, joias, armas e armaduras disponiveis
			 */

			System.out
					.println("Cartas disponiveis " + jogador1.getNome() + " = \n" + jogador1.getMapCartas().toString());
			System.out.println("Joias disponiveis " + jogador1.mapJoias.toString());
			System.out.println("Armas disponiveis " + jogador1.mapArmas.toString());
			System.out.println("Armaduras disponiveis " + jogador1.mapArmaduras.toString());

			TemplateJogo.quebraDeLinha();

			System.out
					.println("Cartas disponiveis " + jogador2.getNome() + " = \n" + jogador2.getMapCartas().toString());
			System.out.println("Joias disponiveis " + jogador2.mapJoias.toString());
			System.out.println("Armas disponiveis " + jogador2.mapArmas.toString());
			System.out.println("Armaduras disponiveis " + jogador2.mapArmaduras.toString());

			numeroRodada++;

			TemplateJogo.quebraDeLinha();

		}

		TemplateJogo.quebraDeLinha();
		
		/*
		 * Exibe o vencedor do jogo
		 */

		if (jogador1.mapCartas.size() > 0) {
			System.out.println("O vencedor do jogo eh " + jogador1.getNome() + ", parabens!!!!!");
		} else {
			System.out.println("O vencedor do jogo eh " + jogador2.getNome() + ", parabens!!!!!");

		}

	}

}
