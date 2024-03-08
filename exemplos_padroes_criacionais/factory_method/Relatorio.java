package programacao_orientada_objetos_II.exemplos_padroes_criacionais.factory_method;

public class Relatorio implements IDocumento{
	@Override
	public String getConteudo() {
		return "Conteudo do relatorio";
	}
	
	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return "Titulo do relatorio";
	}
	
	@Override
	public void salvar() {
		System.out.println("relatorio salvo");	
	}
}