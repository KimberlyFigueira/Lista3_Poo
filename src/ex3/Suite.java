package ex3;

public class Suite extends Quarto{
	
	private String servicoExtra;

	public Suite(int numeroQuarto, double precoPorNoite, String tipo, String servicoExtra) {
		super(numeroQuarto, precoPorNoite, tipo);
		this.servicoExtra = servicoExtra;
	}
	
	@Override
	public double calcularDiaria(int noites) {
		double diariaSuite = this.getPrecoPorNoite() * noites;
		diariaSuite += diariaSuite * 0.5;
		return diariaSuite;
	}
	
	@Override
	public void exibirInformacoes(int noites) {
		super.exibirInformacoes(noites);
		System.out.println("Serviços extras: " + this.servicoExtra);
	}
}
