package ex6;

public class Artigo extends Conteudo{
	
	private String texto;
	private int numeroPalavras;
	
	private int contarPalavras() {
        if (texto == null || texto.isEmpty()) {
            return 0;
        }
     // Divide o texto em palavras usando espaço como delimitador
        //trim: remove espaços desnecessários
        //split\\s+: divide a string em partes menores e remove os espaços em branco
        String[] palavras = texto.trim().split("\\s+");
        return palavras.length;
	}
	
	public void exibirDetalhes() {
		System.out.println("Número de palavras: " + contarPalavras());
	}

	public Artigo(String texto) {
		super();
		this.texto = texto;
		this.numeroPalavras = numeroPalavras;
	}

    
}

