package streams;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import arrays.ForEach;

public class DesafioFilter {
	public static void main(String[] args) {
		


		
		ContasaPagar conta1 = new ContasaPagar("CEMIG", 859.23, 10);
		ContasaPagar conta2 = new ContasaPagar("CARTAO", 2000, 1);
		ContasaPagar conta3 = new ContasaPagar("DMAE", 790, -1);
		ContasaPagar conta4 = new ContasaPagar("ALGAR", 500, 3);
		ContasaPagar conta5 = new ContasaPagar("TIM", 100, 30);
		
		List<ContasaPagar> contas = Arrays.asList(conta1,conta2,conta3,conta4,conta5);
		
		Predicate<ContasaPagar> pertodovencimento = a -> a.diasvencimento <= 10;
		Predicate<ContasaPagar> menorquemil = a -> a.valor < 1000;
		
		contas.stream()
			.filter(pertodovencimento)
			.filter(menorquemil)
			.map(a -> "A Conta da " + a.descricao + " Está a " + a.diasvencimento + " de vencer, no valor de " + a.valor)
			.forEach(System.out::println);
		
	}
}
