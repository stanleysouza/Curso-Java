package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo numero");
		
		System.out.println(valor1 + valor2);
		
		int numero1 = Integer.parseInt(valor1);
		int numero2 = Integer.parseInt(valor2);
		
		int soma =  numero1+numero2;
		System.out.println("Soma é :" + soma);
		System.out.println("Media é :" + soma / 2);
	}
}
