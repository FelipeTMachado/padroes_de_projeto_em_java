package programacao_orientada_objetos_II.exemplos_padroes_criacionais.builder;

public abstract class ConstrutorCasa {
	public abstract void construirBase();
	public abstract void construirParedes();
	public abstract void construirTelhado();
	public abstract ICasa getCasa();
}
