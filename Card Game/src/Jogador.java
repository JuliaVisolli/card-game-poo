import java.util.List;

public class Jogador {
	
	public String nome;
    public Cartas cartas;

    public Jogador( String nome, Cartas cartas){
        this.nome = nome;
        this.cartas = cartas;
    }

    
    public List<Personagem> cartasJogadas(){
        return this.cartas.getCartas();

    }

        
}
	
	

