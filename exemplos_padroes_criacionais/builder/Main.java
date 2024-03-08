package programacao_orientada_objetos_II.exemplos_padroes_criacionais.builder;

public class Main {
	public static void main(String[] args) {
		ConstrutorCasa construtor = new ConstrutorCasaTerrea();
		construtor.construirBase();
		construtor.construirParedes();
		construtor.construirTelhado();
		ICasa casaTerrea = construtor.getCasa();
		
		System.out.println("Area da casa Terrea:  " + casaTerrea.areaTotal());

		construtor = new ConstrutorCasaSobrado();
		construtor.construirBase();
		construtor.construirParedes();
		construtor.construirTelhado();
		ICasa sobrado = construtor.getCasa();

		System.out.println("Area da casa Sobrado: " + sobrado.areaTotal());
		
		construtor = new ConstrutorCasaDuplex();
		construtor.construirBase();
		construtor.construirParedes();
		construtor.construirTelhado();
		ICasa duplex = construtor.getCasa();
		
		System.out.println("Area da casa Duplex:  " + duplex.areaTotal());
	}
}
