package sp.senac.br.factory;

import java.util.HashMap;
import java.util.Map;

import sp.senac.br.armaduras.ArmaduraDaJustica;
import sp.senac.br.armaduras.ArmaduraDeAgua;
import sp.senac.br.armaduras.ArmaduraDeFogo;
import sp.senac.br.armaduras.ArmaduraDeGelo;
import sp.senac.br.armaduras.ArmaduraDeLava;
import sp.senac.br.armaduras.ArmaduraDeTerra;
import sp.senac.br.armaduras.ArmaduraDoBarbaro;
import sp.senac.br.armaduras.ArmaduraDoCacador;
import sp.senac.br.armaduras.ArmaduraDoDuque;
import sp.senac.br.armaduras.ArmaduraDoEspirito;
import sp.senac.br.armaduras.ArmaduraDoGuardiao;
import sp.senac.br.armaduras.ArmaduraDoPurgatorio;
import sp.senac.br.armaduras.ArmaduraDoSoberano;
import sp.senac.br.armaduras.ArmaduraEspadachim;
import sp.senac.br.armaduras.ArmaduraEstacaSangue;
import sp.senac.br.armaduras.ArmaduraMagica;
import sp.senac.br.armaduras.ArmaduraPesada;
import sp.senac.br.armaduras.ArmaduraProtetora;
import sp.senac.br.armaduras.ArmaduraSenhorDasFeras;
import sp.senac.br.armaduras.ArmaduraTremeTerra;
import sp.senac.br.modelos.Armadura;
import sp.senac.br.modelos.Tipo;

public class FactoryArmadura {

	public Map<Integer, Armadura> classesMap = new HashMap<Integer, Armadura>();

	public FactoryArmadura() {
		classesMap.put(0, new ArmaduraDaJustica(50, Tipo.PSIQUICO, "ARMADURA DA JUSTICA"));
		classesMap.put(1, new ArmaduraDeAgua(75, Tipo.AGUA, "ARMADURA DE AGUA"));
		classesMap.put(2, new ArmaduraDoEspirito(30, Tipo.PSIQUICO, "ARMADURA DO ESPIRITO"));
		classesMap.put(3, new ArmaduraDeFogo(100, Tipo.FOGO, "ARMADURA DE FOGO"));
		classesMap.put(4, new ArmaduraDoBarbaro(85, Tipo.FORCA, "ARMADURA DO BARBARO"));
		classesMap.put(5, new ArmaduraMagica(100, Tipo.MAGIA, "ARMADURA MAGICA"));
		classesMap.put(6, new ArmaduraDeGelo(50, Tipo.GELO, "ARMADURA DE GELO"));
		classesMap.put(7, new ArmaduraDeLava(75, Tipo.FOGO, "ARMADURA DE LAVA"));
		classesMap.put(8, new ArmaduraDeTerra(30, Tipo.TERRA, "ARMADURA DE TERRA"));
		classesMap.put(9, new ArmaduraDoCacador(100, Tipo.FORCA, "ARMADURA DO CACADOR"));
		classesMap.put(10, new ArmaduraDoDuque(85, Tipo.VENTO, "ARMADURA DO DUQUE"));
		classesMap.put(11, new ArmaduraDoGuardiao(100, Tipo.FORCA, "ARMADURA DO GUARDIAO"));
		classesMap.put(12, new ArmaduraDoPurgatorio(75, Tipo.MAGIA, "ARMADURA DO PURGATORIO"));
		classesMap.put(13, new ArmaduraDoSoberano(150, Tipo.PEDRA, "ARMADURA DO DOBERANO"));
		classesMap.put(14, new ArmaduraEspadachim(100, Tipo.LUTADOR, "ARMADURA ESPADACHIM"));
		classesMap.put(15, new ArmaduraSenhorDasFeras(85, Tipo.LUTADOR, "ARMADURA SENHOR DAS FERAS"));
		classesMap.put(16, new ArmaduraEstacaSangue(100, Tipo.VENENOSO, "ARMADURA ESTACA DE SANGUE"));
		classesMap.put(17, new ArmaduraPesada(200, Tipo.FORCA, "ARMADURA PESADA"));
		classesMap.put(18, new ArmaduraTremeTerra(100, Tipo.PEDRA, "ARMADURA TREME TERRA"));
		classesMap.put(19, new ArmaduraProtetora(300, Tipo.FORCA, "ARMADURA PROTETORA"));

	}

	public Armadura escolherClasse(int valor) {
		return classesMap.get(valor);
	}

}
