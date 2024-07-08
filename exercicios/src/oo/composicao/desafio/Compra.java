package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	final ArrayList<Item> itens = new ArrayList<Item>();
	
	
	void adicionarItem(Produto produto, int qtd) {
		itens.add(new Item(qtd, produto));
	}
	
	void adicionarItem(String nome, int qtd, double preco) {
		var produto = new Produto(nome,preco);
		itens.add(new Item(qtd, produto));
	}
	
	double ObterValorTotal() {
		double total = 0;
		for(Item item: itens) {
			total += (item.qtd * item.produto.preco);
		}
		return total;
	}
}
