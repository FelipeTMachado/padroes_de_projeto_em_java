package programacao_orientada_objetos_II.exemplos_padroes_criacionais.factory_method;

public class FabricaPlanilha extends FabricaDocumento{
	@Override
	public IDocumento criarDocumento(TipoDocumento tipo) {
		if (tipo == TipoDocumento.PLANILHA) {
			return new Planilha();
		} else {
			System.err.println("TIPO DE DOCUMENTO INVALIDO");
			return null;
		}
	}
}
