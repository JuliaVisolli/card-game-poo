import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
	static Scanner entradaTeclado = new Scanner(System.in);
	
	FactoryPersonagem factoryPersonagem = new FactoryPersonagem();

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entraTeclado = new Scanner(System.in);

		Personagem humano = new Humano(null, 0, false);
		humano.setNome("Humano");
		humano.setEnergia(50);
		humano.setVivo(true);

		Personagem dragoes = new Dragoes(null, 0, false);
		dragoes.setNome("Dragao");
		dragoes.setEnergia(50);
		dragoes.setVivo(true);

		Personagem orcs = new Orcs(null, 0, false);
		orcs.setNome("Orc");
		orcs.setEnergia(50);
		orcs.setVivo(true);

		//Personagem orcDoDeserto = new OrcDoDeserto();
		//orcDoDeserto.setNome("Orc da Montanha");
		//orcDoDeserto.setEnergia(10);
		//orcDoDeserto.setVivo(true);

		System.out.println("Escolha o seu personagem");
		System.out.println();
		System.out.println("Digite 1 para Humano");
		System.out.println("Digite 2 para Dragão");
		System.out.println("Digite 3 para Orc");
		//System.out.println("Digite 4 para Orc do Deserto");
		System.out.println();
		System.out.println("======");
		System.out.println();

		int jogadorEscolhido = entraTeclado.nextInt();
		Personagem personagem1 = new Personagem();

		switch (jogadorEscolhido) {
		case 1:
			personagem1 = humano;
			break;
		case 2:
			personagem1 = dragoes;
			break;
		case 3:
			personagem1 = orcs;
			break;
		//case 4:
			//personagem1 = orcDoDeserto;
			//break;

		default:
			break;
		}
		
		System.out.println("O primeiro personagem escolhido: " + personagem1.getNome());
		System.out.println("");
		
		
		System.out.println("Escolha o seu personagem");
		System.out.println();
		System.out.println("Digite 1 para Humano");
		System.out.println("Digite 2 para Dragão");
		System.out.println("Digite 3 para Orc");
		//System.out.println("Digite 4 para Orc do Deserto");
		System.out.println();
		System.out.println("======");
		System.out.println();

		int jogadorEscolhidoCard2 = entraTeclado.nextInt();
		Personagem personagemCard2 = new Personagem();

		switch (jogadorEscolhidoCard2) {
		case 1:
			personagemCard2 = humano;
			break;
		case 2:
			personagemCard2 = dragoes;
			break;
		case 3:
			personagemCard2 = orcs;
			break;
		//case 4:
			//personagem1 = orcDoDeserto;
			//break;

		default:
			break;
		}

		
		System.out.println("O segundo personagem escolhido: " + personagemCard2.getNome());
		System.out.println("");
		
		
		System.out.println("Escolha o seu personagem");
		System.out.println();
		System.out.println("Digite 1 para Humano");
		System.out.println("Digite 2 para Dragão");
		System.out.println("Digite 3 para Orc");
		//System.out.println("Digite 4 para Orc do Deserto");
		System.out.println();
		System.out.println("======");
		System.out.println();

		int jogadorEscolhidoCard3 = entraTeclado.nextInt();
		Personagem personagemCard3 = new Personagem();

		switch (jogadorEscolhidoCard3) {
		case 1:
			personagemCard3 = humano;
			break;
		case 2:
			personagemCard3 = dragoes;
			break;
		case 3:
			personagemCard3 = orcs;
			break;
		//case 4:
			//personagem1 = orcDoDeserto;
			//break;

		default:
			break;
		}

		
		System.out.println("O terceiro personagem escolhido: " + personagemCard3.getNome());
		System.out.println("");
		

		List<Personagem> personagensAdversario = new ArrayList<Personagem>();
		personagensAdversario.add(humano);
		personagensAdversario.add(dragoes);
		personagensAdversario.add(orcs);
		//personagensAdversario.add(orcDoDeserto);
		
		Random rand = new Random();
		Personagem personagem2 = personagensAdversario.get(rand.nextInt(personagensAdversario.size()));

		System.out.println("O primeiro personagem adversário: " + personagem2.getNome());
		
		Random rand1 = new Random();
		Personagem personagemDeck2 = personagensAdversario.get(rand1.nextInt(personagensAdversario.size()));

		System.out.println("O segundo personagem adversário: " + personagemDeck2.getNome());
		
		
		Random rand2 = new Random();
		Personagem personagemDeck3 = personagensAdversario.get(rand2.nextInt(personagensAdversario.size()));

		System.out.println("O terceiro personagem adversário: " + personagemDeck3.getNome());
		
		
		List<Personagem> personagens = new ArrayList<Personagem>();
		personagens.add(humano);
		personagens.add(dragoes);
		personagens.add(orcs);
		//personagens.add(orcDoDeserto);

		System.out.println();
		System.out.println("Digite 1 para desferir o ataque:");
		int ataqueDesferido = entraTeclado.nextInt();
		int forcaAtaque = 0;
		switch (ataqueDesferido) {
		case 1:
			forcaAtaque = personagem1.desfereAtaque();
			break;
		case 2:
			forcaAtaque = personagemCard2.desfereAtaque();
			break;
		case 3:
			forcaAtaque = personagemCard3.desfereAtaque();
			break;

		default:
			break;
		}
		

		while (personagem2.isVivo() && personagem1.isVivo()) {
			int ataqueDesferidoSegundoPerson = personagem2.desfereAtaque();
			forcaAtaque = personagem1.desfereAtaque();
			
			personagem2.recebeAtaque(forcaAtaque, 0);
			System.out.println("Seu Dano: " + forcaAtaque);
			System.out.println("======");
			personagem1.recebeAtaque(ataqueDesferidoSegundoPerson, 0);
			System.out.println("Dano do adversário: " + ataqueDesferidoSegundoPerson);
			System.out.println("======");
			System.out.println("Vida personagem 1: " + personagem1.getEnergia());
			System.out.println("======");
			System.out.println("Vida personagem 2: " + personagem2.getEnergia());
		}
		
		while (personagemDeck2.isVivo() && personagemCard2.isVivo()) {
			int ataqueDesferidoSegundoPerson = personagemDeck2.desfereAtaque();
			forcaAtaque = personagemCard2.desfereAtaque();
			
			personagemDeck2.recebeAtaque(forcaAtaque, 0);
			System.out.println("Seu Dano: " + forcaAtaque);
			personagemCard2.recebeAtaque(ataqueDesferidoSegundoPerson, 0);
			System.out.println("Dano do adversário: " + ataqueDesferidoSegundoPerson);
			
			System.out.println("Vida Card 2 personagem 1: " + personagemCard2.getEnergia());
			System.out.println("======");
			System.out.println("Vida Card 2 personagem 2: " + personagemDeck2.getEnergia());
		}
		
		while (personagemDeck3.isVivo() && personagemCard3.isVivo()) {
			int ataqueDesferidoSegundoPerson = personagemDeck3.desfereAtaque();
			forcaAtaque = personagemCard3.desfereAtaque();
			
			personagemDeck3.recebeAtaque(forcaAtaque, 0);
			System.out.println("Seu Dano: " + forcaAtaque);
			personagemCard3.recebeAtaque(ataqueDesferidoSegundoPerson, 0);
			System.out.println("Dano do adversário: " + ataqueDesferidoSegundoPerson);
			
			System.out.println("Vida Card 3 personagem 1: " + personagemCard3.getEnergia());
			System.out.println("======");
			System.out.println("Vida Card 3 personagem 2: " + personagemDeck3.getEnergia());
		}
		
		if (personagem2.getEnergia() <= 0) {
			System.out.println("Primeira rodada");
			System.out.println("O Card vencedor é jogador 1 : " + personagem1.getNome());
			System.out.println("======");
		} else {
			System.out.println("Primeira rodada");
			System.out.println("O Card vencedor é jogador 2 : " + personagem2.getNome());
		}if (personagemDeck2.getEnergia() <= 0) {
			System.out.println("Segunda rodada");
			System.out.println("O Card vencedor é jogador 1 : " + personagemCard2.getNome());
			System.out.println("======");
		} else {
			System.out.println("Segunda rodada");
			System.out.println("O Card vencedor é jogador 2 : " + personagemDeck2.getNome());
			System.out.println("======");
		}if (personagemDeck3.getEnergia() <= 0) {
			System.out.println("Terceira rodada");
			System.out.println("O Card vencedor é jogador 1 : " + personagemCard3.getNome());
			System.out.println("======");
		} else {
			System.out.println("Terceira rodada");
			System.out.println("O Card vencedor é jogador 2 : " + personagemDeck3.getNome());
		}
	}

}