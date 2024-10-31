package ex5;

public class PagamentoBoleto extends Pagamento{
	private String codigoBarras;
	
	@Override
	public double processarPagamento() {
		double taxaNova = getValor() + 5.00;
		System.out.println("Pagamento realizado no valor de R$" + getValor() + " com código de barras " + codigoBarras + " no valor de R$ " + taxaNova);
		return taxaNova;
	}
	
	public double processarPagamento(boolean comDesconto) {
		if(comDesconto == true) {
			double desconto = getValor() - (getValor() * 0.2);
			System.out.println("Pagamento realizado no valor de R$" + getValor() + " com código de barras " + codigoBarras + " no valor de R$ " + desconto);
			return desconto;
		}else {
			return processarPagamento();
		}
	}

	public PagamentoBoleto(double valor, String descricao, String codigoBarras) {
		super(valor, descricao);
		this.codigoBarras = codigoBarras;
	}
}
