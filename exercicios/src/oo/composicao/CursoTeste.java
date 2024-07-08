package oo.composicao;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java completo");
		Curso curso2 = new Curso("web 2023");
		Curso curso3 = new Curso("react native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso 1");
			System.out.println(aluno.nome);
		}
		
		System.out.println(aluno1.cursos.get(0).alunos); 
		
		Curso c = aluno1.obterCursoPorNome("Java completo");
		
		System.out.println(c.alunos);
	}
}
