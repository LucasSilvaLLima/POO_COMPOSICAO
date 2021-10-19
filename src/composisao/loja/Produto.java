package composisao.loja;

public class Produto {

	
	// EU POSSO DECLARAR O NOME E PREÇO COMO CONSTANTES PORQUE EU ESTOU RECEBENDO ELES NO CONSTRUTOR
	final String nome;
	final double preco;
	
	
	// CONTRUTO PARA QUE QUANDO UM PRODUTO FOR INSTANCIADO, NO PRÓPRIO CONSTRUTOR SEJA PASSADO O NOME E PREÇO DO PRODUTO
	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
}
