package programacao_orientada_objetos_II.exemplos_padroes_criacionais.factory;

public class Main {
	public static void main(String[] args) {
		IProduto produto = FabricaProduto.criarProduto(TipoProduto.LIVRO);
		System.out.println(produto.getNome());
		
		produto = FabricaProduto.criarProduto(TipoProduto.ELETRONICO);
		System.out.println(produto.getNome());
		
		produto = FabricaProduto.criarProduto(TipoProduto.ROUPA);
		System.out.println(produto.getNome());
	}
}
