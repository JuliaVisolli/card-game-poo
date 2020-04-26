import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cartas implements Batalha{

	private String nome;
	private int energia;
	private boolean vivo;
	public List<Personagem> cartas = new ArrayList<Personagem>();
	
	  public Cartas(List<Personagem> cartas, String nome, int energia, boolean vivo) {
	        this.nome = nome;
	        this.energia = energia;
	        this.vivo = vivo;
	        this.cartas = cartas;
	        
	    }
	  
	  
	  public List<Personagem> getCartas(){
		return cartas;
		  
	  }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}


	public int recebeAtaque(int ataque, int energia) {
		this.energia -= ataque;
		return this.energia;
	}


	public int desfereAtaque() {
		Random rand = new Random();
		int ataque = rand.nextInt(10);
		return ataque;
	}
	
	
	
	
}
