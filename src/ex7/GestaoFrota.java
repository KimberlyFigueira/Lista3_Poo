package ex7;

import java.util.ArrayList;
import java.util.Scanner;

import ex2.Produto;

public class GestaoFrota {
	
	static ArrayList<Veiculo> listaVeiculo = new ArrayList<>();
	
	public static void bemVindo() {
		System.out.println("Sja muito bem vinde! Oque deseja fazer?");
		System.out.println("1 - Cadastrar veiculo");
		System.out.println("2 - Listar veículos");
		System.out.println("3 - Registrar manutencao");
		System.out.println("4 - Consultar histórico de manutenções");
		System.out.println("5 - Exibir próxima manutenção");
		System.out.println("6 - Sair");
	}

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
		Veiculo novoVeiculo = new Veiculo(placa, marca, modelo, ano, kmRodado, historicoManutencoes);
		listaVeiculo.add(novoVeiculo);
		System.out.println();
		bemVindo();
	}
	
	public static void listarVeiculos() {
		for (int i = 0; i < listaVeiculo.size(); i++) {
		    Veiculo veiculo = listaVeiculo.get(i);
		    System.out.println();
		    System.out.println(i + ": " + veiculo);
		    System.out.println();
		    bemVindo();
	}}
		
	public static void registrarManutencao() {
		Scanner input = new Scanner (System.in);
		ArrayList<Manutencao> historicoManutencoes = new ArrayList<>();
		System.out.println();
		System.out.println("Digite a data da sua ultima manutenção.");
		String manutencaoData = input.next();
		System.out.println("Digite sua ultima manutenção (uma palavra)");
		String manutencaoDescri = input.next();
		System.out.println("Digite os quilometros rodados na sua ultima manutenção");
		double manutencaoKm = input.nextDouble();
		
		Manutencao manutencao = new Manutencao(manutencaoData, manutencaoDescri, manutencaoKm);
		historicoManutencoes.add(manutencao);
		System.out.println();
		bemVindo();
}
	
	public static void consultarHistorico() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a placa do carro que deseja consultar manutenção: ");
		String placaConsulta = input.next();
		boolean veiculoEncontrado = false;
	    for (Veiculo veiculo : listaVeiculo) {
	        if (veiculo.getPlaca().equalsIgnoreCase(placaConsulta)) {
	            veiculoEncontrado = true;
	            System.out.println("Histórico de Manutenções para o veículo com placa " + placaConsulta + ":");
	            if (veiculo.getHistoricoManutencoes().isEmpty()) {
	                System.out.println("Nenhuma manutenção registrada.");
	            } else {
	                for (Manutencao manutencao : veiculo.getHistoricoManutencoes()) {
	                    System.out.println(manutencao);
	                }
	            }
	            break;
	        }
	    }
	    if (!veiculoEncontrado) {
	        System.out.println("Veículo com a placa " + placaConsulta + " não encontrado.");
	    }
	}
	
	public static void proximaManutencao() {
		
	}
	
	public static void sair() {
		System.out.println("Saindo do sistema. Volte sempre!");
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		bemVindo();
		
		while(true) {
			int opcao = input.nextInt();
			switch(opcao) {
			case 1: cadastrarVeiculo();
			break;
			case 2: listarVeiculos();
			break;
			case 3: registrarManutencao();
			break;
			case 4: consultarHistorico();
			break;
			case 5: proximaManutencao();
			break;
			case 6: sair();
			break;
			default: System.out.println("Opção inválida! Tente novamente!");
			}
		}
	}

}
