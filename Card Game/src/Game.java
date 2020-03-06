import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
	static Scanner entradaTeclado = new Scanner(System.in);

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entraTeclado = new Scanner(System.in);

		Personagem arqueiro = new Arqueiro();
		arqueiro.setNome("Arqueiro");
		arqueiro.setEnergia(10);
		arqueiro.setVivo(true);

		Personagem dragao = new Dragao();
		dragao.setNome("Dragão");
		dragao.setEnergia(10);
		dragao.setVivo(true);

		Personagem orcDaMontanha = new OrcDaMontanha();
		orcDaMontanha.setNome("Orc do Deserto");
		orcDaMontanha.setEnergia(10);
		orcDaMontanha.setVivo(true);

		Personagem orcDoDeserto = new OrcDoDeserto();
		orcDoDeserto.setNome("Orc da Montanha");
		orcDoDeserto.setEnergia(10);
		orcDoDeserto.setVivo(true);

		System.out.println("Escolha o seu personagem");
		System.out.println();
		System.out.println("Digite 1 para Arqueiro");
		System.out.println("Digite 2 para Dragão");
		System.out.println("Digite 3 para Orc do Deserto");
		System.out.println("Digite 4 para Orc da Montanha");
		System.out.println();
		System.out.println("======");
		System.out.println();

		int jogadorEscolhido = entraTeclado.nextInt();
		Personagem primeiroPersonagemEscolhido = new Personagem();

		switch (jogadorEscolhido) {
		case 1:
			primeiroPersonagemEscolhido = arqueiro;
			break;
		case 2:
			primeiroPersonagemEscolhido = dragao;
			break;
		case 3:
			primeiroPersonagemEscolhido = orcDaMontanha;
			break;
		case 4:
			primeiroPersonagemEscolhido = orcDoDeserto;
			break;

		default:
			break;
		}

		System.out.println("O personagem escolhido: " + primeiroPersonagemEscolhido.getNome());
		System.out.println("");

		List<Personagem> personagensAdversario = new ArrayList<Personagem>();
		personagensAdversario.add(arqueiro);
		personagensAdversario.add(dragao);
		personagensAdversario.add(orcDoDeserto);
		personagensAdversario.add(orcDaMontanha);
		
		Random rand = new Random();
		Personagem randomPersonagem = personagensAdversario.get(rand.nextInt(personagensAdversario.size()));

		System.out.println("O personagem adversário: " + randomPersonagem.getNome());
		
		List<Personagem> personagens = new ArrayList<Personagem>();
		personagens.add(arqueiro);
		personagens.add(dragao);
		personagens.add(orcDoDeserto);
		personagens.add(orcDaMontanha);

		System.out.println();
		System.out.println("Digite 1 para desferir o ataque:");
		int ataqueDesferido = entraTeclado.nextInt();
		int forcaAtaque = 0;
		switch (ataqueDesferido) {
		case 1:
			forcaAtaque = primeiroPersonagemEscolhido.desfereAtaque();
			break;

		default:
			break;
		}

		int ataqueDesferidoSegundoPerson = randomPersonagem.desfereAtaque();

		while (randomPersonagem.getEnergia() >= 0 || primeiroPersonagemEscolhido.getEnergia() >= 0) {
			randomPersonagem.recebeAtaque(forcaAtaque, randomPersonagem.getEnergia());
			System.out.println("Seu Dano: " + forcaAtaque);
			primeiroPersonagemEscolhido.recebeAtaque(ataqueDesferidoSegundoPerson,
					primeiroPersonagemEscolhido.getEnergia());
			System.out.println("Dano do adversário: " + ataqueDesferidoSegundoPerson);
		}
		if (randomPersonagem.getEnergia() <= 0) {

			System.out.println("O vencedor é: " + primeiroPersonagemEscolhido.getNome());
		} else {

			System.out.println("O vencedor é: " + randomPersonagem.getNome());
		}
	}

}