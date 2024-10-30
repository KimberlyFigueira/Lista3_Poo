package ex1;

public class Main {

	public static void main(String[] args) {
		
		Vendedor vendedor1 = new Vendedor("Thiago", 1200, "Supervisor", "Logística", 10000, 0.05);
		vendedor1.exibirInformacao();
		
		Gerente gerente1 = new Gerente ("Rubens", 2500, "Gerente", "Gerência", 0.2);
		gerente1.exibirInformacao();
	}			
}