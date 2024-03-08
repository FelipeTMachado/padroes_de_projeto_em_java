package programacao_orientada_objetos_II.exemplos_padroes_criacionais.factory_method;

public class Planilha implements IDocumento{
	@Override
	public String getConteudo() {
		return "Conteudo da planilha";
	}
	
	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return "Titulo da planilha";
	}
	
	@Override
	public void salvar() {
		System.out.println("Planilha salva");	
	}
}
