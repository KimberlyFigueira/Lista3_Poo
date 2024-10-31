package ex6;

public class VideoAula extends Conteudo{
	private int duracao;

	public VideoAula(String titulo, String descricao, int duracao) {
		super(titulo, descricao);
		this.duracao = duracao;
	}
	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Duração: " + duracao + " minutos");
	}
	
	public void exibirDuracaoFormatada() {
		int horas = duracao / 60;
		int minutos = duracao % 60;
		System.out.println("Duração: " + horas + " horas e " + minutos + " minutos");
	}
}
