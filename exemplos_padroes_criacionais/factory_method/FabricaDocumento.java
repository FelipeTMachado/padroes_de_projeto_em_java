package programacao_orientada_objetos_II.exemplos_padroes_criacionais.factory_method;

public abstract class FabricaDocumento {
	public abstract IDocumento criarDocumento(TipoDocumento tipo);
}
