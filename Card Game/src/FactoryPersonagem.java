import java.util.HashMap;
import java.util.Map;

public class FactoryPersonagem {

	public Map<Integer, Personagem> classesMap = new HashMap<Integer, Personagem>();

	public FactoryPersonagem() {
		classesMap.put(0, new Personagem("Humano", 50, true));
		classesMap.put(1, new Personagem("Orc", 50, true));
		classesMap.put(2, new Personagem("Dragao", 50, true));
	}

	public Personagem escolherClasse(int valor) {
		return classesMap.get(valor);
	}

}
