package programacao_orientada_objetos_II.exemplos_padroes_criacionais.fluent_interface;

public class Cliente {
	private String nome;

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
}
