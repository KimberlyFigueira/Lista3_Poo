package ex2;

public class Main {

	public static void main(String[] args) {
		
		ProdutoEletronico eletro1 = new ProdutoEletronico("Celular", 1350, "Moto G23", 3, false);
		eletro1.exibirDetalhes();
		eletro1.exibirDetalhes(true);
		
		ProdutoVestuario vestuario1 = new ProdutoVestuario("Camiseta", 45, "Camisa masculina Nike", 5, "M", true);
		vestuario1.exibirDetalhes();
	}


}
