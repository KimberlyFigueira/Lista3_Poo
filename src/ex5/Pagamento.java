package ex5;

public class Pagamento {
	private double valor;
	private String descricao;
	
	public double processarPagamento() {
		return this.valor;
	}
	
	public double processarPagamento(boolean comTaxa) {
		double taxa = valor + (valor * 0.05);
		return taxa;
	}

	public Pagamento() {
		super();
	}

	public Pagamento(double valor, String descricao) {
		super();
		this.valor = valor;
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
