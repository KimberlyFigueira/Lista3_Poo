package ex2;

public class ProdutoEletronico extends Produto{
	
	private boolean garantiaExtendida;
	
	public ProdutoEletronico(String nome, double preco, String descricao, int estoque, boolean garantiaExtendida) {
		super(nome, preco, descricao, estoque);
		this.garantiaExtendida = garantiaExtendida;
	}

	@Override
	public double calcularPrecoFinal() {
		if(garantiaExtendida == true) {
			double precoFinal = getPreco() + ((getPreco() * 0.15));
			return precoFinal;
		}else {
			return this.getPreco();
		}	
	}
	
	@Override
	public void exibirDetalhes() {
		System.out.println("Nome = " + getNome());
		System.out.println("Preço = " + calcularPrecoFinal());
		System.out.println("Descrição = " + getDescricao());
		System.out.println("Produto em estoque = " + getEstoque());
		System.out.println("Garantia extendida = " + garantiaExtendida);
	}
}
