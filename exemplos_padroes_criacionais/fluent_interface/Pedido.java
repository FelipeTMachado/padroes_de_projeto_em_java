package programacao_orientada_objetos_II.exemplos_padroes_criacionais.fluent_interface;

public class Pedido implements IPedido {
	private Cliente cliente;
	private Produto produto;
	private int quantidade;
	private FormaPagamento formaPagamento;
	
	@Override
	public IPedido finalizaPedido() {
		System.out.println("PEDIDO FINALIZADO");
		return this;
	}
	
	@Override
	public IPedido noCliente(Cliente cliente) {
		this.cliente = cliente;
		return this;
	}
	
	@Override
	public IPedido adicionaFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
		return this;
	}
	
	@Override
	public IPedido comProduto(Produto produto) {
		this.produto = produto;
		return this;
	}
	
	@Override
	public IPedido deQuantidade(int quantidade) {
		this.quantidade = quantidade;
		return this;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public Produto getProduto() {
		return produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}
}
