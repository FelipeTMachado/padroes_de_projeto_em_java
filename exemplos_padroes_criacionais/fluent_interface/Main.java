package programacao_orientada_objetos_II.exemplos_padroes_criacionais.fluent_interface;

public class Main {
	public static void main(String[] args) {
		IPedido pedido = new Pedido();
		
		Cliente cliente = new Cliente();
		cliente.setNome("FELIPE");
		
		Produto produto = new Produto();
		produto.setNome("PIZZA SEM QUEIJO");
		produto.setPreco(100.0);
		
		
		
		pedido
			.noCliente(cliente)
			.comProduto(produto)
			.adicionaFormaPagamento(FormaPagamento.CARTAO)
			.deQuantidade(10)
			.finalizaPedido();
	}
}
