package ex7;

import java.util.ArrayList;
import java.util.Scanner;

import ex2.Produto;

public class GestaoFrota {
	
	static ArrayList<Veiculo> listaVeiculo = new ArrayList<>();

	public static void cadastrarVeiculo() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu tipo de veículo (Carro ou caminhão)");
		String tipoVeiculo = input.next();
		System.out.println("Qual a placa do seu carro?");
		String placa = input.next();
		System.out.println("Qual a marca do seu carro?");
		String marca = input.next();
		System.out.println("Qual o modelo do seu carro?");
		String modelo = input.next();
		System.out.println("Qual o ano de lançamento do seu carro?");
		int ano = input.nextInt();
		System.out.println("Quantos km rodado?");
		double kmRodado = input.nextDouble();
		ArrayList<Manutencao> historicoManutencoes = new ArrayList<>();
		System.out.println("Descreva manutenções do seu veículo");
		
		Veiculo novoVeiculo = new Veiculo(placa, marca, modelo, ano, kmRodado, historicoManutencoes);
		listaVeiculo.add(novoVeiculo);
	}
	
	public static void listarVeiculos() {
		for (int i = 0; i < listaVeiculo.size(); i++) {
		    Veiculo veiculo = listaVeiculo.get(i);
		    System.out.println(i + ": " + veiculo);
	}
}
	public static void main(String[] args) {
		
		cadastrarVeiculo();
		listarVeiculos();

	}

}
