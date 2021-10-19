package composisao.loja;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	// LISTA DE ITENS (RELA��O DE UM PRA MUITOS, UMA COMPRA TEM V�RIOS ITENS)
	List<Item> itens = new ArrayList<Item>();
	
	// M�TODO QUE PERCORRE A LISTA DE ITENS E CALCULA O VALOR TOTAL DA LISTA E RETORNA O MESMO
	double obterValorTotal() {
		double total = 0;
		
		for (Item item : itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
	
	// M�TODO QUE ADICIONA ITENS NA LISTA DE ITENS "ESSE M�TODO EXIGE QUE VOC� INSTANCIE UM PRODUTO NA CRIA��O DO OBJETO" 
	void adicionarItem(Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));
	}
	
	// M�TODO QUE ADICIONA ITENS NA LISTA DE ITENS "ESSE M�TODO PEDE O NOME, PRE�O E QTDE NA CRIA��O DO OBJETO, SEM A NECESSIDADE DE INSTANCIAR UM PRODUTO"	
	void adicionarItem(String nome, double preco, int qtde) {
		Produto produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qtde));
	}
} 
