package ex7;

import java.util.ArrayList;

public class Veiculo {
	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private double kmRodados;
	private ArrayList<Manutencao> historicoManutencoes;
	
	//Manutenção: tipo da variavel
	//manutencao: variavel
	public void adicionarManutencao(Manutencao manutencao) {
		historicoManutencoes.add(manutencao);
	}
	
	public void exibirInformacoes() {
		System.out.println("Placa do carro: " + this.placa);
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ano de lançamento: " + this.ano);
		System.out.println("Km rodados: " + this.kmRodados);
		if(historicoManutencoes.isEmpty()) {
			System.out.println("Nenhuma manutenção registrada.");
		}else {
			//usado pra imprimir arrays
			//tipo, nome da variável, array que eu quero que percorra
			for (Manutencao manutencao : historicoManutencoes) {
				System.out.println(manutencao);
			}
		}
	}
	
	public void calcularProximaManutencao(){
		double proximaManutencao = this.kmRodados + 1000;
		System.out.println("Manutenção recomendada quando atingir " + proximaManutencao + "Km");
	}
	public Veiculo() {
		super();
	}

	public Veiculo(String placa, String marca, String modelo, int ano, double kmRodados,
			ArrayList<Manutencao> historicoManutencoes) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.kmRodados = kmRodados;
		this.historicoManutencoes = historicoManutencoes;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getKmRodados() {
		return kmRodados;
	}

	public void setKmRodados(double kmRodados) {
		this.kmRodados = kmRodados;
	}

	public ArrayList<Manutencao> getHistoricoManutencoes() {
		return historicoManutencoes;
	}

	public void setHistoricoManutencoes(ArrayList<Manutencao> historicoManutencoes) {
		this.historicoManutencoes = historicoManutencoes;
	}

	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", kmRodados="
				+ kmRodados + ", historicoManutencoes=" + historicoManutencoes + "]";
	}
	
	
	
}