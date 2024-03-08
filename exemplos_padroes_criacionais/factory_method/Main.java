package programacao_orientada_objetos_II.exemplos_padroes_criacionais.factory_method;

public class Main {
	public static void main(String[] args) {
		FabricaDocumento fabrica = new FabricaApresentacao();
		IDocumento apresentacao = fabrica.criarDocumento(TipoDocumento.APRESENTACAO);
		
		System.out.println(apresentacao.getConteudo());
		System.out.println(apresentacao.getTitulo());
		apresentacao.salvar();
		
		System.out.println();
		
		fabrica = new FabricaRelatorio();
		IDocumento relatorio = fabrica.criarDocumento(TipoDocumento.RELATORIO);
		
		
		System.out.println(relatorio.getConteudo());
		System.out.println(relatorio.getTitulo());
		relatorio.salvar();
		
		System.out.println();
		
		fabrica = new FabricaPlanilha();
		IDocumento planilha = fabrica.criarDocumento(TipoDocumento.PLANILHA);
		
		
		System.out.println(planilha.getConteudo());
		System.out.println(planilha.getTitulo());
		planilha.salvar();
	}
}
