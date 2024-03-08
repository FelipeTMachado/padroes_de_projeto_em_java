package programacao_orientada_objetos_II.exemplos_padroes_criacionais.singleton;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class GerenciadorArquivos {
	private static GerenciadorArquivos gerenciador;
	private String localArquivo = "local/arquivo.txt"; 
	private File arquivo;
	private ArrayList<String> conteudo = new ArrayList<String>();
	
	
	// CONSTRUTOR
	private GerenciadorArquivos() {
		
	}
	
	
	// INSTANCIADOR
	public static GerenciadorArquivos getInstance() {
		if (gerenciador == null) 
			gerenciador = new GerenciadorArquivos();
	
		return gerenciador;
	}
	
	
	
	// METODOS
	public void abrirArquivo() {
		arquivo = new File(localArquivo);
	}
	
	@SuppressWarnings("resource")
	public ArrayList<String> carregarConteudo() {
		if (arquivo != null) {
			if (arquivo.exists()) {
				try {
					FileReader leitor = new FileReader(arquivo);
					BufferedReader buffer = new BufferedReader(leitor);
					String linha;
					while ((linha = buffer.readLine()) != null) {
						conteudo.add(linha);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		return conteudo;
	}

	
	// GETTERS AND SETTERS
	public String getLocalArquivo() {
		return localArquivo;
	}
	public void setLocalArquivo(String localArquivo) {
		this.localArquivo = localArquivo;
	}
}
