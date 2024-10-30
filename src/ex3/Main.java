package ex3;

public class Main {

	public static void main(String[] args) {
		
		QuartoSimples simples = new QuartoSimples(112, 120, "Simples", 2);
		simples.exibirInformacoes(3);
		System.out.println();
		
		Suite suite = new Suite(210, 260, "Suite", "Serviço de quarto");
		suite.exibirInformacoes(2);

	}

}
