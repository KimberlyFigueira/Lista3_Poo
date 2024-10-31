package ex5;

public class PagamentoCartao extends Pagamento{
	private String numeroCartao;
	
	@Override
	public double processarPagamento() {
		System.out.println("Pagamento realizado com o cartão de núemero " + numeroCartao + " no valor de R$ " + getValor());
		return getValor();
	}

	public PagamentoCartao(double valor, String descricao, String numeroCartao) {
		super(valor, descricao);
		this.numeroCartao = numeroCartao;
	}
}
