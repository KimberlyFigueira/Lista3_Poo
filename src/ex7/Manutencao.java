package ex7;

public class Manutencao {
	private String data;
	private String descricao;
	private double kmRealizada;
	
	public void exibirDetalhes() {
		System.out.println("Data da manutenção: " + this.data);
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Quilometragem Realizada: " + this.kmRealizada + " km");
	}
	
	public Manutencao(String placaManutencao, String manutencaoData, String manutencaoDescri, double manutencaoKm) {
		super();
	}

	public Manutencao(String data, String descricao, double kmRealizada) {
		super();
		this.data = data;
		this.descricao = descricao;
		this.kmRealizada = kmRealizada;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getKmRealizada() {
		return kmRealizada;
	}

	public void setKmRealizada(double kmRealizada) {
		this.kmRealizada = kmRealizada;
	}

	@Override
	public String toString() {
		return "Descricao = " + descricao + ", Data = " + data + ", Km realizada = " + kmRealizada;
	}
	
	
}
