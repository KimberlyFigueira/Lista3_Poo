package ex2;

public class ProdutoVestuario extends Produto{
	
	private String tamanho;
	private boolean emPromocao;
	
	public ProdutoVestuario(String nome, double preco, String descricao, int estoque, String tamanho, boolean emPromocao) {
		super(nome, preco, descricao, estoque);
		this.tamanho = tamanho;
		this.emPromocao = emPromocao;
	}

	@Override
	public double calcularPrecoFinal() {
		if(emPromocao == true) {
			double precoEmPromocao = (getPreco() - (getPreco() * 0.10));
			return precoEmPromocao;
		}else {
			return getPreco();
		}
	}
	
	@Override
	public void exibirDetalhes() {
		if(this.getEstoque() >=  1) {
			System.out.println("Nome = " + getNome());
			System.out.println("Preço = " + calcularPrecoFinal());
			System.out.println("Descrição = " + getDescricao());
			System.out.println("Tamanho = " + this.tamanho);
			System.out.println("Em promoção = " + this.emPromocao);
			System.out.println("Produto em estoque! " + this.getEstoque() + " peças disponíveis.");
		}else {
			System.out.println("Produto fora de estoque!");
		}
		
	}
}
