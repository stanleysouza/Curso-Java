package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		//trabalho na terça
		//trabalho na quinta 
		
		//os 2 trabalhos tv 50 polegadas 
		//1 trabalho tv 32 polegadas
		//1 ou 2 tomar sorvete
		//nehum não toma sorvete e nem vai ao shopping 
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		if ((trabalho1 && trabalho2) == true) {
			System.out.println("TV de 50 Polegadas");
			System.out.println("tomar Sorvete");
		}else if ((trabalho2 || trabalho1) == true) {
			System.out.println("TV de 32 Polegadas");
			System.out.println("tomar Sorvete");
		}else if ((trabalho2 && trabalho1) == false) {
			System.out.println("Não compramos a TV");
			System.out.println("Não iremos tomar sorvete");
			System.out.println("Vida mais saudavel");
			System.out.println("Sem dinheiro no Bolso");
		}
	}
}
