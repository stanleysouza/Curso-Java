package controle;

import java.util.Scanner;


public class DesafioDiaDaSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um dia da semana: ");
		String DayOfWeek = entrada.next();
		
		//String DayOfWeek = texto.toUpperCase();
		
		/**if (DayOfWeek == "DOMINGO" ||
			DayOfWeek == "SEGUNDA" || 
			DayOfWeek == "TERÇA" || 
			DayOfWeek == "QUARTA" || 
			DayOfWeek == "QUINTA" || 
			DayOfWeek == "SEXTA" || 
			DayOfWeek == "SABADO") {
			
			System.out.print("Invalido");
			System.out.print(DayOfWeek);
		}else*/ 
		if (DayOfWeek.equalsIgnoreCase("domingo")) {
			System.out.print("1");
		}else if (DayOfWeek.equalsIgnoreCase("SEGUNDA")) {
			System.out.print("2");
		}else if (DayOfWeek.equalsIgnoreCase("TERÇA")) {
			System.out.print("3");
		}else if (DayOfWeek.equalsIgnoreCase("QUARTA")) {
			System.out.print("4");
		}else if (DayOfWeek.equalsIgnoreCase("QUINTA")) {
			System.out.print("5");			
		}else if (DayOfWeek.equalsIgnoreCase("SEXTA")) {
			System.out.print("6");
		}else if (DayOfWeek.equalsIgnoreCase("SABADO")) {
			System.out.print("7");			
		}else {
			System.out.println("Invalido");
		}
		
		
		entrada.close();
	}
}
