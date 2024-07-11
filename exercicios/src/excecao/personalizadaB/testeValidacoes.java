package excecao.personalizadaB;

import excecao.Aluno;

public class testeValidacoes {
	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Stanley",7);
			Validar.aluno(aluno);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Fim :)");
	}
}
