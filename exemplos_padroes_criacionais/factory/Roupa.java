package programacao_orientada_objetos_II.exemplos_padroes_criacionais.factory;

public class Roupa implements IProduto{
	@Override
	public int getEstoque() {
		return 10;
	}
	
	@Override
	public String getNome() {
		return "Roupa";
	}
	
	@Override
	public double getPreco() {
		return 300.0f;
	}
}
