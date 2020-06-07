package sp.senac.br.factory;
import java.util.HashMap;
import java.util.Map;

import sp.senac.br.modelos.Personagem;
import sp.senac.br.modelos.Tipo;
import sp.senac.br.personagens.Alakazam;
import sp.senac.br.personagens.AnaoDaTerra;
import sp.senac.br.personagens.AnaoDeFogo;
import sp.senac.br.personagens.AnaoDeGelo;
import sp.senac.br.personagens.Arqueiro;
import sp.senac.br.personagens.BarbaroDaMontanha;
import sp.senac.br.personagens.BruxaDaFloresta;
import sp.senac.br.personagens.DragaoAzul;
import sp.senac.br.personagens.DragaoBranco;
import sp.senac.br.personagens.DragaoDeGelo;
import sp.senac.br.personagens.DragaoVermelho;
import sp.senac.br.personagens.ElfoDaEscuridao;
import sp.senac.br.personagens.ElfoDaFloresta;
import sp.senac.br.personagens.ElfoDaLuz;
import sp.senac.br.personagens.ElfoVenenoso;
import sp.senac.br.personagens.EnguiaDasAguas;
import sp.senac.br.personagens.EspadachimDaChamaAzul;
import sp.senac.br.personagens.Exodia;
import sp.senac.br.personagens.FadaDasAguas;
import sp.senac.br.personagens.FadaMistica;
import sp.senac.br.personagens.Gigante;
import sp.senac.br.personagens.GuardiaoDasAguas;
import sp.senac.br.personagens.MagoDeLuz;
import sp.senac.br.personagens.MagoNegro;
import sp.senac.br.personagens.MonstroDePedra;
import sp.senac.br.personagens.MonstroMarinho;
import sp.senac.br.personagens.OrcDaMontanha;
import sp.senac.br.personagens.OrcDoDeserto;
import sp.senac.br.personagens.ReiCaveira;
import sp.senac.br.personagens.Sacerdote;

public class FactoryPersonagem {

	public Map<Integer, Personagem> classesMap = new HashMap<Integer, Personagem>();

	public FactoryPersonagem() {
		classesMap.put(0, new Alakazam("ALAKAZAM", Tipo.MAGIA, true, 400));
		classesMap.put(1, new AnaoDaTerra("ANAO DE TERRA", Tipo.TERRA, true, 200));
		classesMap.put(2, new AnaoDeGelo("ANAO DE GELO", Tipo.GELO, true, 250));
		classesMap.put(3, new AnaoDeFogo("ANAO DE FOGO", Tipo.FOGO, true, 210));
		classesMap.put(4, new Arqueiro("ARQUEIRO", Tipo.FORCA, true, 420));
		classesMap.put(5, new BarbaroDaMontanha("BARBARO DA MONTANHA", Tipo.FORCA, true, 420));
		classesMap.put(6, new BruxaDaFloresta("BRUXA DA FLORESTA", Tipo.MAGIA, true, 330));
		classesMap.put(7, new DragaoAzul("DRAGAO AZUL", Tipo.GELO, true, 500));
		classesMap.put(8, new DragaoBranco("DRAGAO BRANCO", Tipo.FOGO, true, 500));
		classesMap.put(9, new DragaoDeGelo("DRAGAO DE GELO", Tipo.GELO, true, 500));
		classesMap.put(10, new DragaoVermelho("DRAGAO VERMELHO", Tipo.FOGO, true, 500));
		classesMap.put(11, new ElfoDaEscuridao("ELFO DA ESCURIDAO", Tipo.VENTO, true, 360));
		classesMap.put(12, new ElfoDaFloresta("ELFO DA FLORESTA", Tipo.VENTO, true, 390));
		classesMap.put(13, new EnguiaDasAguas("ENGUIA DAS AGUAS", Tipo.AGUA, true, 400));
		classesMap.put(14, new EspadachimDaChamaAzul("ESPADACHIM DA CHAMA AZUL", Tipo.LUTADOR, true, 390));
		classesMap.put(15, new Exodia("EXODIA", Tipo.LUTADOR, true, 440));
		classesMap.put(16, new FadaDasAguas("FADA DAS AGUAS", Tipo.AGUA, true, 290));
		classesMap.put(17, new FadaMistica("FADA MISTICA", Tipo.MAGIA, true, 450));
		classesMap.put(18, new Gigante("GIGANTE", Tipo.PEDRA, true, 490));
		classesMap.put(19, new GuardiaoDasAguas("GUARDIAO DAS AGUAS", Tipo.AGUA, true, 380));
		classesMap.put(20, new MagoDeLuz("MAGO DE LUZ", Tipo.MAGIA, true, 400));
		classesMap.put(21, new MagoNegro("MAGO NEGRO", Tipo.MAGIA, true, 450));
		classesMap.put(22, new MonstroDePedra("MONSTRO DE PEDRA", Tipo.PEDRA, true, 260));
		classesMap.put(23, new MonstroMarinho("MONSTRO MARINHO", Tipo.AGUA, true, 190));
		classesMap.put(24, new OrcDaMontanha("ORC DA MONTANHA", Tipo.TERRA, true, 330));
		classesMap.put(25, new OrcDoDeserto("ORC DO DESERTO", Tipo.TERRA, true, 360));
		classesMap.put(26, new ReiCaveira("REI CAVEIRA", Tipo.FORCA, true, 500));
		classesMap.put(27, new Sacerdote("SACERDOTE", Tipo.PSIQUICO, true, 270));
		classesMap.put(28, new ElfoVenenoso("ELFO VENENOSO", Tipo.VENENOSO, true, 190));
		classesMap.put(29, new ElfoDaLuz("ELFO DA LUZ", Tipo.PSIQUICO, true, 300));
	}

	public Personagem escolherClasse(int valor) {
		return classesMap.get(valor);
	}

}
