package controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a nota: ");
		double nota = entrada.nextDouble();

		if (nota > 10.0 || nota < 0.0) {
			System.out.print("Nota Invalida");
		} else if (nota >= 9.0) {
			System.out.print("A");
		} else if (nota >= 7.0) {
			System.out.print("B");
		} else if (nota >= 5.0) {
			System.out.print("C");
		} else if (nota >= 3.0) {
			System.out.print("D");
		} else if (nota >= 1.0) {
			System.out.print("E");
		} else {
			System.out.print("F");
		}

		entrada.close();
	}
}
