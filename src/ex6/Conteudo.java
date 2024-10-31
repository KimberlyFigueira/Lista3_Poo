package ex6;

public class Conteudo {
	private String titulo;
	private String descricao;
	
	public void exibirDetalhes() {
		System.out.println("Nome: " + this.titulo);
		System.out.println("Descrião: " + this.descricao);
	}
	
	public void exibirDetalhes(boolean comResumo) {
		if (comResumo == true) {
			System.out.println("Resumo: " + ("resumo aqui"));
		}else {
			exibirDetalhes();
		}
	}
	
	public Conteudo() {
		super();
	}

	public Conteudo(String titulo, String descricao) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
