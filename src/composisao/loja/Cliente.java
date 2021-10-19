package composisao.loja;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String nome;
	
	// LISTA DE COMPRAS (RELA��O DE UM PRA MUITOS, UM CLIENTE FAZ V�RIAS COMPRAS)
	List<Compra> compras = new ArrayList<Compra>();
	
	
	// CONSTRUTOR QUE PEDE O NOME DO CLIENTE NA CRIA��O DO OBJETO
	Cliente(String nome) {
		this.nome = nome;
	}
	
	// M�TODO QUE PERCORRE A LISTA DE COMPRA E CALCULA O VALOR TOTAL DO CLIENTE
	double obterValorTotal(){
		double total = 0;
		
		for (Compra compra : compras) {
			total += compra.obterValorTotal();
		}
		
		return total;
	} 
}
