package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		//Ler num1
		//Ler num2
		// + - * / %
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um numero:");
		double num1 = entrada.nextDouble();
		
		System.out.print("Informe outro numero:");
		double num2 = entrada.nextDouble();
		
		System.out.print("Informe o operador:");
		String op =  entrada.next();
		
		double resultado;
		resultado = "-".equals(op) ? num1 - num2 : 0;
		resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "*".equals(op) ? num1 * num2 : 0;
		resultado = "/".equals(op) ? num1 / num2 : 0;
		resultado = "%".equals(op) ? num1 % num2 : 0;
		
		System.out.printf("%.2f %s %.2f = %.2f",
				num1, op, num2, resultado);
		
		
		
		
		
		
		entrada.close();
	}
}
