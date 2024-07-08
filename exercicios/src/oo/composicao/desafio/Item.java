package oo.composicao.desafio;

public class Item {
	int qtd;
	Produto produto;
	
	Item(int quantidade, Produto produto){
		this.produto = produto;
		this.qtd = quantidade;
	}
}
