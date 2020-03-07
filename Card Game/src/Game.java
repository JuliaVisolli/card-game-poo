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
		dragao.setNome("Drag�o");
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
		System.out.println("Digite 2 para Drag�o");
		System.out.println("Digite 3 para Orc do Deserto");
		System.out.println("Digite 4 para Orc da Montanha");
		System.out.println();
		System.out.println("======");
		System.out.println();

		int jogadorEscolhido = entraTeclado.nextInt();
		Personagem personagem1 = new Personagem();

		switch (jogadorEscolhido) {
		case 1:
			personagem1 = arqueiro;
			break;
		case 2:
			personagem1 = dragao;
			break;
		case 3:
			personagem1 = orcDaMontanha;
			break;
		case 4:
			personagem1 = orcDoDeserto;
			break;

		default:
			break;
		}

		System.out.println("O personagem escolhido: " + personagem1.getNome());
		System.out.println("");

		List<Personagem> personagensAdversario = new ArrayList<Personagem>();
		personagensAdversario.add(arqueiro);
		personagensAdversario.add(dragao);
		personagensAdversario.add(orcDoDeserto);
		personagensAdversario.add(orcDaMontanha);
		
		Random rand = new Random();
		Personagem personagem2 = personagensAdversario.get(rand.nextInt(personagensAdversario.size()));

		System.out.println("O personagem advers�rio: " + personagem2.getNome());
		
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
			forcaAtaque = personagem1.desfereAtaque();
			break;

		default:
			break;
		}

		

		while (personagem2.isVivo() && personagem1.isVivo()) {
			int ataqueDesferidoSegundoPerson = personagem2.desfereAtaque();
			forcaAtaque = personagem1.desfereAtaque();
			
			personagem2.recebeAtaque(forcaAtaque, 0);
			System.out.println("Seu Dano: " + forcaAtaque);
			personagem1.recebeAtaque(ataqueDesferidoSegundoPerson, 0);
			System.out.println("Dano do advers�rio: " + ataqueDesferidoSegundoPerson);
			
			System.out.println("Vida personagem 1:" + personagem1.getEnergia());
			System.out.println("Vida personagem 2:" + personagem2.getEnergia());
		}
		if (personagem2.getEnergia() <= 0) {

			System.out.println("O vencedor �: " + personagem1.getNome());
		} else {

			System.out.println("O vencedor �: " + personagem2.getNome());
		}
	}

}