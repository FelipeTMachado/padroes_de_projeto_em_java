package programacao_orientada_objetos_II.exemplos_padroes_criacionais.factory;

public class FabricaProduto {
	public static IProduto criarProduto(TipoProduto tipo) {
	    switch (tipo) {
	      case LIVRO:
	        return new Livro();
	      case ROUPA:
	        return new Roupa();
	      case ELETRONICO:
	        return new Eletronico();
	      default:
	        throw new IllegalArgumentException("Tipo de produto inválido");
	    }
	}
}
