package composisao.loja;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	// LISTA DE ITENS (RELAÇÃO DE UM PRA MUITOS, UMA COMPRA TEM VÁRIOS ITENS)
	List<Item> itens = new ArrayList<Item>();
	
	// MÉTODO QUE PERCORRE A LISTA DE ITENS E CALCULA O VALOR TOTAL DA LISTA E RETORNA O MESMO
	double obterValorTotal() {
		double total = 0;
		
		for (Item item : itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
	
	// MÉTODO QUE ADICIONA ITENS NA LISTA DE ITENS "ESSE MÉTODO EXIGE QUE VOCÊ INSTANCIE UM PRODUTO NA CRIAÇÃO DO OBJETO" 
	void adicionarItem(Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));
	}
	
	// MÉTODO QUE ADICIONA ITENS NA LISTA DE ITENS "ESSE MÉTODO PEDE O NOME, PREÇO E QTDE NA CRIAÇÃO DO OBJETO, SEM A NECESSIDADE DE INSTANCIAR UM PRODUTO"	
	void adicionarItem(String nome, double preco, int qtde) {
		Produto produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qtde));
	}
} 
