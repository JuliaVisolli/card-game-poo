
public class FactoryPersonagem {
	


    public Personagem getPersonagem(String nome, int energia, boolean vivo, int cartasNumero){
    	
        if(cartasNumero == 1){
            return new Humano(nome, energia, vivo );
        }
           
        if(cartasNumero == 2){ 
            return new Dragoes(nome, energia, vivo );
        }

        if(cartasNumero == 3){
            return new Orcs(nome, energia, vivo);
        }

        return null;

    }
}


