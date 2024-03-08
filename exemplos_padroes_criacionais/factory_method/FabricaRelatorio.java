package programacao_orientada_objetos_II.exemplos_padroes_criacionais.factory_method;

public class FabricaRelatorio extends FabricaDocumento{
	@Override
	public IDocumento criarDocumento(TipoDocumento tipo) {
		if (tipo == TipoDocumento.RELATORIO) {
			return new Relatorio();
		} else {
			System.err.println("TIPO DE DOCUMENTO INVALIDO");
			return null;
		}
	}
}
