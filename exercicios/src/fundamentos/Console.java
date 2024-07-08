package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("Bom");
		System.out.println(" dia!");
		
		System.out.printf("MegaSena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salário:  %.1f%n",123.5678);
		System.out.printf("Nome: %s%n", "João");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite Seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite Seu Sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n",
				nome, sobrenome, idade);
		
	
		 
	    System.out.println("Qual a sua idade?");
	    idade = entrada.nextInt();
	    entrada.nextLine(); // ler o \n que o nextint deixa pra tras.
	    System.out.println("Qual o seu nome?");
	    nome = entrada.nextLine();
	    System.out.println("Qual o seu sobrenome?");
	    sobrenome = entrada.nextLine();

	    entrada.close();
	}
}
