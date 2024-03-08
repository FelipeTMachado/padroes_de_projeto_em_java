package programacao_orientada_objetos_II.exemplos_padroes_criacionais.factory_method;

public class Apresentacao implements IDocumento{
	@Override
	public String getConteudo() {
		return "Conteudo da Apresentacao";
	}
	
	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return "Titulo da Apresentacao";
	}
	
	@Override
	public void salvar() {
		System.out.println("Apresentacao salva");	
	}
}