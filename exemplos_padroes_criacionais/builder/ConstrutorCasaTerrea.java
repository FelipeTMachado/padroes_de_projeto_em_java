package programacao_orientada_objetos_II.exemplos_padroes_criacionais.builder;

public class ConstrutorCasaTerrea extends ConstrutorCasa {
	@Override
	public void construirBase() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void construirParedes() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void construirTelhado() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ICasa getCasa() {
		// TODO Auto-generated method stub
		return new CasaTerrea();
	}
}
