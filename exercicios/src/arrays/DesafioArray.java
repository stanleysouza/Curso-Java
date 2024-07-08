package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas: ");
		int qtdNotas = entrada.nextInt();
		
		double[] notas = new double[qtdNotas];
		
		
		for (int i = 0; i < notas.length;i++) {
			System.out.println("Nota "+i);
			notas[i] = entrada.nextInt();
		}
		
		double total = 0;
		for(double nota:notas) {
			total += nota;
		}
		
		double media = total/qtdNotas;
		
		System.out.println("A media das notas informadas é: " + media);
		
		System.out.println(Arrays.toString(notas));
		
		
		entrada.close();
	}
	
	
}
