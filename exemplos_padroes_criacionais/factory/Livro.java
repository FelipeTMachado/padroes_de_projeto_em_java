package programacao_orientada_objetos_II.exemplos_padroes_criacionais.factory;

public class Livro implements IProduto {
	@Override
	public int getEstoque() {
		return 5;
	}
	
	@Override
	public String getNome() {
		return "Livro";
	}
	
	@Override
	public double getPreco() {
		return 20.0f;
	}
}
