package sp.senac.br.factory;

import java.util.HashMap;
import java.util.Map;

import sp.senac.br.joias.JoiaDaTerra;
import sp.senac.br.joias.JoiaDeAgua;
import sp.senac.br.joias.JoiaDeAr;
import sp.senac.br.joias.JoiaDeFogo;
import sp.senac.br.joias.JoiaDeForca;
import sp.senac.br.joias.JoiaDeMagia;
import sp.senac.br.modelos.Joia;
import sp.senac.br.modelos.Tipo;

public class FactoryJoia {
	
	public Map<Integer, Joia> classesMap = new HashMap<Integer, Joia>();

	public FactoryJoia() {
		classesMap.put(0, new JoiaDaTerra(Tipo.TERRA, 50, "JOIA DE TERRA"));
		classesMap.put(1, new JoiaDeAgua(Tipo.AGUA, 75, "JOIA DE AGUA"));
		classesMap.put(2, new JoiaDeAr(Tipo.VENTO, 30, " JOIA DE AR"));
		classesMap.put(3, new JoiaDeFogo(Tipo.FOGO, 100, "JOIA DE FOGO"));
		classesMap.put(4, new JoiaDeForca(Tipo.FORCA, 85, "JOIA DE FORCA"));
		classesMap.put(5, new JoiaDeMagia(Tipo.MAGIA, 100, "JOIA DE MAGIA"));
		
	}

	public Joia escolherClasse(int valor) {
		return classesMap.get(valor);
	}

}
