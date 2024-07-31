package teste.muitospramuitos;

import infra.DAO;
import modelo.muitopramuitos.Ator;
import modelo.muitopramuitos.Filme;

public class FilmeAtor {
	public static void main(String[] args) {
		
		Filme filmeA = new Filme("Star Wars Ep 4", 8.1);
		Filme filmeB = new Filme("O Fugitivo", 8.9);
		
		
		Ator atorA = new Ator("Harrison Ford");
		Ator atrizB = new Ator("Carrie Fisher");
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atrizB);
		
		filmeB.adicionarAtor(atorA);
		
		
		DAO<Filme> dao = new DAO<Filme>();
		dao
			.incluirAtomico(filmeA);
		
	}
}
