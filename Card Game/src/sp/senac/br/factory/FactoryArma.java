package sp.senac.br.factory;

import java.util.HashMap;
import java.util.Map;

import sp.senac.br.armas.ArmaDaJustica;
import sp.senac.br.armas.ArmaDasFeras;
import sp.senac.br.armas.ArmaDeAgua;
import sp.senac.br.armas.ArmaDeFogo;
import sp.senac.br.armas.ArmaDeForca;
import sp.senac.br.armas.ArmaDeGelo;
import sp.senac.br.armas.ArmaDeLava;
import sp.senac.br.armas.ArmaDeSangue;
import sp.senac.br.armas.ArmaDeTerra;
import sp.senac.br.armas.ArmaDoCacador;
import sp.senac.br.armas.ArmaDoEspadachim;
import sp.senac.br.armas.ArmaDoGuerreiro;
import sp.senac.br.armas.ArmaDoPurgatorio;
import sp.senac.br.armas.ArmaDoSoberano;
import sp.senac.br.armas.ArmaEspiritual;
import sp.senac.br.armas.ArmaGuardia;
import sp.senac.br.armas.ArmaMagica;
import sp.senac.br.armas.ArmaProtetora;
import sp.senac.br.armas.ArmaTremeTerra;
import sp.senac.br.armas.ArmaVendaval;
import sp.senac.br.modelos.Arma;
import sp.senac.br.modelos.Tipo;

public class FactoryArma {
	
	public Map<Integer, Arma> classesMap = new HashMap<Integer, Arma>();

	public FactoryArma() {
		classesMap.put(0, new ArmaDaJustica(60, Tipo.PSIQUICO, "ARMA DA JUSTICA"));
		classesMap.put(1, new ArmaDeAgua(75, Tipo.AGUA, "ARMA DE AGUA"));
		classesMap.put(2, new ArmaEspiritual(30, Tipo.PSIQUICO, "ARMA ESPIRITUAL"));
		classesMap.put(3, new ArmaDeFogo(100, Tipo.FOGO, "ARMA DE FOGO"));
		classesMap.put(4, new ArmaDoGuerreiro(85, Tipo.FORCA, "ARMA DO GUERREIRO"));
		classesMap.put(5, new ArmaDeSangue(100, Tipo.MAGIA, "ARMA DE SANGUE"));
		classesMap.put(6, new ArmaDeGelo(50, Tipo.GELO, "ARMA DE GELO"));
		classesMap.put(7, new ArmaDasFeras(75, Tipo.FOGO, "ARMA DAS FERAS"));
		classesMap.put(8, new ArmaDeTerra(30, Tipo.TERRA, "ARMA DE TERRA"));
		classesMap.put(9, new ArmaDoEspadachim(100, Tipo.FORCA, "ARMA DO ESPADACHIM"));
		classesMap.put(10, new ArmaVendaval(85, Tipo.VENTO, "ARMA VENDAVAL"));
		classesMap.put(11, new ArmaDeLava(100, Tipo.FOGO, "ARMA DE LAVA"));
		classesMap.put(12, new ArmaMagica(75, Tipo.MAGIA, "ARMA MAGICA"));
		classesMap.put(13, new ArmaDoCacador(150, Tipo.PEDRA, "ARMA DO CACADOR"));
		classesMap.put(14, new ArmaDoPurgatorio(100, Tipo.LUTADOR, "ARMA DO PRUGATORIO"));
		classesMap.put(15, new ArmaDeForca(100, Tipo.FORCA, "ARMA DE FORCA"));
		classesMap.put(16, new ArmaDoSoberano(200, Tipo.FORCA, "ARMA DO SOBERANO"));
		classesMap.put(17, new ArmaTremeTerra(100, Tipo.PEDRA, "ARMA TREME TERRA"));
		classesMap.put(18, new ArmaProtetora(300, Tipo.FORCA, "ARMA PROTETORA"));
		classesMap.put(19, new ArmaGuardia(300, Tipo.FORCA, "ARMA GUARDIA"));

	}

	public Arma escolherClasse(int valor) {
		return classesMap.get(valor);
	}


}
