package ex3;

public class QuartoSimples extends Quarto{
	private int ocupacaoMaxima;

	public QuartoSimples(int numeroQuarto, double precoPorNoite, String tipo, int ocupacaoMaxima) {
		super(numeroQuarto, precoPorNoite, tipo);
		this.ocupacaoMaxima = ocupacaoMaxima;
	}
	
	@Override
	public void exibirInformacoes(int noites) {
		super.exibirInformacoes(noites);
		System.out.println("Ocupação máxima: " + ocupacaoMaxima);
	}
	
}
