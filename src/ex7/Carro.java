package ex7;

import java.util.ArrayList;

public class Carro extends Veiculo{
	private int quantidadePortas;

	@Override
	public void calcularProximaManutencao() {
		double proximaManutencao = getKmRodados() + 10000;
		System.out.println("Manutenção recomendada quando atingir " + proximaManutencao + "Km");
	}
	
	public void exibirInformacoes(boolean detalhada) {
		if(detalhada == true) {
			calcularProximaManutencao();
		}else {
			System.out.println(toString());
		}
	}
	
	public Carro(String placa, String marca, String modelo, int ano, double kmRodados, ArrayList<Manutencao> historicoManutencoes, int quantidadePortas) {
		super(placa, marca, modelo, ano, kmRodados, historicoManutencoes);
		this.quantidadePortas = quantidadePortas;
	}

	@Override
	public String toString() {
		return "Carro [Quantidade de Portas = " + quantidadePortas + ", Placa = " + getPlaca() + ", Marca = "
				+ getMarca() + ", Modelo = " + getModelo() + ", Ano = " + getAno() + ", Km Rodados = "
				+ getKmRodados() + ", Historico Manutencoes = " + getHistoricoManutencoes() + "]";
	}
	
}
