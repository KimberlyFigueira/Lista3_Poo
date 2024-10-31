package ex5;

public class Main {

	public static void main(String[] args) {
		PagamentoCartao cartao = new PagamentoCartao(100, "Compra no site Nike", "8463970402");
		cartao.processarPagamento();
		
		PagamentoBoleto boleto = new PagamentoBoleto(250, "Shampoo", "9238493729");
		boleto.processarPagamento();
		boleto.processarPagamento(true);
	}

}
