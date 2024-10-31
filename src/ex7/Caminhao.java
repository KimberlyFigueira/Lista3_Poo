package ex7;

import java.util.ArrayList;

public class Caminhao extends Veiculo{
	
	private double capacidadeCarga;

	public Caminhao(String placa, String marca, String modelo, int ano, double kmRodados, ArrayList<Manutencao> historicoManutencoes, double capacidadeCarga) {
		super(placa, marca, modelo, ano, kmRodados, historicoManutencoes);
		this.capacidadeCarga = capacidadeCarga;
	}
	
	@Override
	public void calcularProximaManutencao() {
		double proximaManutencao = getKmRodados() + 15000;
		System.out.println("Manutenção recomendada quando atingir " + proximaManutencao + "Km");
	}
	
	public void exibirInformacoes(boolean detalhada) {
		if(detalhada == true) {
			calcularProximaManutencao();
		}else {
			System.out.println(toString());
		}
	}

	@Override
	public String toString() {
		return "Caminhao [Capacidade de Carga = " + capacidadeCarga + ", Placa = " + getPlaca() + ", Marca () ="
				+ getMarca() + ", Modelo = " + getModelo() + ", Ano = " + getAno() + ", Km Rodados = "
				+ getKmRodados() + ", Historico de Manutencoes = " + getHistoricoManutencoes() + "]";
	}
	
	
}
