package fundamentos;

import java.util.Scanner;

public class DesafioConversão {
	public static void main(String[] args) {
		//Scanner
		Scanner entrada = new Scanner(System.in);
		
		
		//3 strings next line salario
		
		//1 string
		System.out.print("Digite seu primeiro Salario:");
		String salario1 = entrada.nextLine();
		
		//2string
		System.out.print("Digite seu segundo Salario:");
		String salario2 = entrada.nextLine();
		
		//3string
		System.out.print("Digite seu terceiro Salario:");
		String salario3 = entrada.nextLine();
		
		double media = (Double.parseDouble(salario1.replace(",", ".")) 
					  + Double.parseDouble(salario2.replace(",", ".")) 
					  + Double.parseDouble(salario3.replace(",", ".")))/3;
		
		System.out.println("A media Salarial é: " + media);
		
		entrada.close();
		//media
		//ponto ou virgula
		
		
		
		
	}

}
