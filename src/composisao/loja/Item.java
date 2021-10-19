package composisao.loja;

public class Item {

	// EU POSSO DECLARAR O PRODUTO E QUANTIDADE COMO CONSTANTES PORQUE EU ESTOU RECEBENDO ELES NO CONSTRUTOR
	final Produto produto;
	final int quantidade;
	
	// CONTRUTO PARA QUE QUANDO UM ITEM FOR INSTANCIADO, NO PRÓPRIO CONSTRUTOR SEJA PASSADO O PRODUTO E QUANTIDADE
	Item(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
}
