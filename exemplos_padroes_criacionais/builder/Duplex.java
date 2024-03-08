package programacao_orientada_objetos_II.exemplos_padroes_criacionais.builder;

public class Duplex implements ICasa {
	@Override
	public int areaTotal() {
		return 200;
	}
	
	@Override
	public int numeroAndares() {
		return 2;
	}
	
	@Override
	public int quantQuartos() {
		return 5;
	}
}
