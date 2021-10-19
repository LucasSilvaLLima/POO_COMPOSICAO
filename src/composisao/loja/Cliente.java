package composisao.loja;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String nome;
	
	// LISTA DE COMPRAS (RELAÇÃO DE UM PRA MUITOS, UM CLIENTE FAZ VÁRIAS COMPRAS)
	List<Compra> compras = new ArrayList<Compra>();
	
	
	// CONSTRUTOR QUE PEDE O NOME DO CLIENTE NA CRIAÇÃO DO OBJETO
	Cliente(String nome) {
		this.nome = nome;
	}
	
	// MÉTODO QUE PERCORRE A LISTA DE COMPRA E CALCULA O VALOR TOTAL DO CLIENTE
	double obterValorTotal(){
		double total = 0;
		
		for (Compra compra : compras) {
			total += compra.obterValorTotal();
		}
		
		return total;
	} 
}
