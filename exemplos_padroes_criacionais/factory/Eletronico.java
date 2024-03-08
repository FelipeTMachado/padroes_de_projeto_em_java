package programacao_orientada_objetos_II.exemplos_padroes_criacionais.factory;

public class Eletronico implements IProduto{
	@Override
	public int getEstoque() {
		return 30;
	}
	
	@Override
	public String getNome() {
		return "Eletronico";
	}
	
	@Override
	public double getPreco() {
		return 1000.0f;
	}
}
