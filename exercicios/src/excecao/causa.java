package excecao;

public class causa {
	public static void main(String[] args) {
		try {
			metodoA(null);
		} catch (Exception e) {
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
	}
	
	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}

	}
	
	static void metodoB(Aluno aluno) {
		if (aluno == null) {
			throw new NullPointerException("Aluno está nulooooooooooo!");
		}
		System.out.println(aluno.nome);
	}
}
