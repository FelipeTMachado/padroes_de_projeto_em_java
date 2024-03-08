package programacao_orientada_objetos_II.exemplos_padroes_criacionais.fluent_interface;

public interface IPedido {
	IPedido noCliente(Cliente cliente);
	IPedido comProduto(Produto produto);
	IPedido deQuantidade(int quantidade);
	IPedido adicionaFormaPagamento(FormaPagamento formaPagamento);
	IPedido finalizaPedido();
}
