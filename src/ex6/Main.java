package ex6;

public class Main {

	public static void main(String[] args) {
		VideoAula videoaula =  new VideoAula("Matemática vetorial", "matemática vetorial e matricial", 136);
		videoaula.exibirDetalhes();
		videoaula.exibirDuracaoFormatada();
		videoaula.exibirDetalhes(true);
		
		Artigo artigo = new Artigo("Me dá nota 10, sor. Te adoro <3");
		artigo.exibirDetalhes();
		
	}

}
