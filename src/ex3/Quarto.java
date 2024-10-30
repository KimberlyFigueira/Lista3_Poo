package ex3;

public class Quarto {
	private int numeroQuarto;
	private double precoPorNoite;
	private String tipo;
	
	public double calcularDiaria(int noites) {
		double valorEstadia = precoPorNoite * noites;
		return valorEstadia;
	}
	
	public void exibirInformacoes(int noites) {
		System.out.println("Número do quarto: " + this.numeroQuarto);
		System.out.println("Preço por noite: " + this.precoPorNoite);
		System.out.println("Tipo do quarto: " + this.tipo);
		System.out.println("Valor da estadia: " + calcularDiaria(noites));
	}

	public Quarto() {
		super();
	}

	public Quarto(int numeroQuarto, double precoPorNoite, String tipo) {
		super();
		this.numeroQuarto = numeroQuarto;
		this.precoPorNoite = precoPorNoite;
		this.tipo = tipo;
	}

	public int getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public double getPrecoPorNoite() {
		return precoPorNoite;
	}

	public void setPrecoPorNoite(double precoPorNoite) {
		this.precoPorNoite = precoPorNoite;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
