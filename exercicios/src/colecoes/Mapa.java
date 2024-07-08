package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Stanley");
		usuarios.put(2, "Ana");
		
		System.out.println(usuarios);
		System.out.println(usuarios.size());
		System.out.println(usuarios.get(1));
		System.out.println(usuarios.containsKey(1));
	}
}
