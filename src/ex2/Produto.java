package ex2;

public class Produto {
	private String nome;
	private double preco;
	private String descricao;
	protected int estoque;
	
	public double calcularPrecoFinal() {
		return this.preco;
	}
	
	public void exibirDetalhes() {
		System.out.println("Nome = " + this.nome);
		System.out.println("Preco = " + this.preco);
		System.out.println("Descrição = " + this.descricao);
	}
	
	public void exibirDetalhes(boolean emEstoque) {
		if(this.estoque >= 1) {
			System.out.println("Nome = " + this.nome);
			System.out.println("Preco = " + this.preco);
			System.out.println("Descrição = " + this.descricao);
			System.out.println("Produto em estoque! " + this.estoque + " peças disponíveis.");
		}else {
			System.out.println("Produto em falta!");
		}
	}
	
	public Produto() {
		super();
	}

	public Produto(String nome, double preco, String descricao, int estoque) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.estoque = estoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
}
