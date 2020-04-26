import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entraTeclado = new Scanner(System.in);

		List<Personagem> lista = new ArrayList<Personagem>();
		List<Personagem> listaPersonagensAdversarios = new ArrayList<Personagem>();
		FactoryPersonagem factory = new FactoryPersonagem();

		while (true) {
			System.out.println("Escolha 3 personagens");
			System.out.println();
			System.out.println("Digite 0 para Humano");
			System.out.println("Digite 1 para Dragão");
			System.out.println("Digite 2 para Orc");
			System.out.println();
			System.out.println("======");
			System.out.println();

			int jogadorEscolhido = entraTeclado.nextInt();
			Personagem personagem = factory.escolherClasse(jogadorEscolhido);



			lista.add(personagem);
			
			if (lista.size() >= 3) {
				break;
			}

			System.out.println();
			System.out.println("Pesonagem escolhido: " + personagem.getNome());
			System.out.println();

		}

		while (true) {
			double floor = Math.floor(Math.random() * 3);

			Personagem personagemAdversario = factory.escolherClasse((int) floor);

			listaPersonagensAdversarios.add(personagemAdversario);
			
			if (listaPersonagensAdversarios.size() >= 4) {
				break;
			}

			System.out.println();
			System.out.println("O personagem adversário: " + personagemAdversario.getNome());
			System.out.println();

		}


		System.out.println();
		System.out.println("Digite 1 para desferir o ataque:");
		int ataqueDesferido = entraTeclado.nextInt();
		int forcaAtaque = 0;
		switch (ataqueDesferido) {
		case 1:
			forcaAtaque = lista.get(0).desfereAtaque();
			break;

		default:
			break;
		}

		while (listaPersonagensAdversarios.get(0).isVivo() && listaPersonagensAdversarios.get(0).isVivo()) {
			int ataqueDesferidoSegundoPerson = listaPersonagensAdversarios.get(0).desfereAtaque();
			forcaAtaque = lista.get(0).desfereAtaque();

			listaPersonagensAdversarios.get(0).recebeAtaque(forcaAtaque, 0);
			System.out.println("Seu Dano: " + forcaAtaque);
			lista.get(0).recebeAtaque(ataqueDesferidoSegundoPerson, 0);
			System.out.println("Dano do adversário: " + ataqueDesferidoSegundoPerson);

			System.out.println("Vida personagem 1: " + lista.get(0).getEnergia());
			System.out.println("Vida personagem 2: " + listaPersonagensAdversarios.get(0).getEnergia());
		}

		if (listaPersonagensAdversarios.get(0).getEnergia() <= 0) {

			System.out.println("O vencedor é 1: " + lista.get(0).getNome());
		} else {

			System.out.println("O vencedor é 2: " + listaPersonagensAdversarios.get(0).getNome());
		}
		
		System.out.println();
		System.out.println("Digite 1 para desferir o ataque:");
		int ataqueDesferido1 = entraTeclado.nextInt();
		int forcaAtaque1 = 0;
		switch (ataqueDesferido1) {
		case 1:
			forcaAtaque1 = lista.get(1).desfereAtaque();
			break;
			
		default:
			break;
		}
		
		while (listaPersonagensAdversarios.get(1).isVivo() && listaPersonagensAdversarios.get(1).isVivo()) {
			int ataqueDesferidoSegundoPerson = listaPersonagensAdversarios.get(1).desfereAtaque();
			forcaAtaque1 = lista.get(1).desfereAtaque();
			
			listaPersonagensAdversarios.get(1).recebeAtaque(forcaAtaque1, 0);
			System.out.println("Seu Dano: " + forcaAtaque1);
			lista.get(1).recebeAtaque(ataqueDesferidoSegundoPerson, 0);
			System.out.println("Dano do adversário: " + ataqueDesferidoSegundoPerson);
			
			System.out.println("Vida personagem 1: " + lista.get(1).getEnergia());
			System.out.println("Vida personagem 2: " + listaPersonagensAdversarios.get(1).getEnergia());
		}
		
		if (listaPersonagensAdversarios.get(0).getEnergia() <= 0) {
			
			System.out.println("O vencedor é 1: " + lista.get(1).getNome());
		} else {
			
			System.out.println("O vencedor é 2: " + listaPersonagensAdversarios.get(1).getNome());
		}
		
		System.out.println();
		System.out.println("Digite 1 para desferir o ataque:");
		int ataqueDesferido2 = entraTeclado.nextInt();
		int forcaAtaque2 = 0;
		switch (ataqueDesferido2) {
		case 1:
			forcaAtaque2 = lista.get(2).desfereAtaque();
			break;
			
		default:
			break;
		}
		
		while (listaPersonagensAdversarios.get(2).isVivo() && listaPersonagensAdversarios.get(2).isVivo()) {
			int ataqueDesferidoSegundoPerson = listaPersonagensAdversarios.get(2).desfereAtaque();
			forcaAtaque2 = lista.get(2).desfereAtaque();
			
			listaPersonagensAdversarios.get(2).recebeAtaque(forcaAtaque2, 0);
			System.out.println("Seu Dano: " + forcaAtaque2);
			lista.get(2).recebeAtaque(ataqueDesferidoSegundoPerson, 0);
			System.out.println("Dano do adversário: " + ataqueDesferidoSegundoPerson);
			
			System.out.println("Vida personagem 1: " + lista.get(2).getEnergia());
			System.out.println("Vida personagem 2: " + listaPersonagensAdversarios.get(2).getEnergia());
		}
		
		if (listaPersonagensAdversarios.get(2).getEnergia() <= 0) {
			
			System.out.println("O vencedor é 1: " + lista.get(2).getNome());
		} else {
			
			System.out.println("O vencedor é 2: " + listaPersonagensAdversarios.get(2).getNome());
		}
	}

}