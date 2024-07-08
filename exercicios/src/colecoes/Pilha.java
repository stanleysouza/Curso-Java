package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Pequeno Príncipe");
		livros.push("A culpa é das estrelas");
		livros.push("Don Quixote");
		
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.peek()); 
	}
}
