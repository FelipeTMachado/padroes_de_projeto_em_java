package programacao_orientada_objetos_II.exemplos_padroes_criacionais.builder;

public class Sobrado implements ICasa {
	@Override
	public int areaTotal() {
		return 40;
	}
	
	@Override
	public int numeroAndares() {
		return 1;
	}
	
	@Override
	public int quantQuartos() {
		return 1;
	}
}
