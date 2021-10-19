package composisao.loja;

public class SitemaCompra {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem(new Produto("Caneta", 1 ), 100);
		compra1.adicionarItem("Notebook", 2000, 2);

		Compra compra2 = new Compra();
		compra2.adicionarItem(new Produto("Caderno", 10 ), 10);
		compra2.adicionarItem("Folha A4", 25, 4);
		
		Cliente cliente1 = new Cliente("Lorena");
		cliente1.compras.add(compra1);
		cliente1.compras.add(compra2);
		
		System.out.println(cliente1.obterValorTotal());
	}
}
