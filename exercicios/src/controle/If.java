package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("informe a media:");
		double nota = entrada.nextDouble();
		
		if (nota >= 7.0 && nota <= 10) {
			System.out.print("Aluno Aprovado");
		}
		else if (nota < 7.0 && nota >= 4.5) {
			System.out.print("Aluno Está de recuperação");
		} 
		else if (nota >= 0 && nota < 4.5){
			System.out.print("Aluno Reprovado");
		}
		else {
			System.out.print("Nota invalida, insira um valor de 0 a 10");
		}
		
		
		entrada.close();
	}
}
