package ex1;

public class Vendedor extends Funcionario{

	private double vendasMensais;
	private double comissaoPercentual;
	
	public Vendedor(String nome, double salarioBase, String cargo, String departamento, double vendasMensais, double comissaoPercentual) {
		super(nome, salarioBase, cargo, departamento);
		this.vendasMensais = vendasMensais;
		this.comissaoPercentual = comissaoPercentual;
	}

	public double calcularSalario() {
		double salarioComissao = salarioBase + (vendasMensais * comissaoPercentual);
		return salarioComissao;
	}
	
	public void exibirInformacao() {
		System.out.println("Nome = " + getNome() + ", Cargo = " + getCargo() + ", Departamento = " + getDepartamento() + ", Salário Base = " + getSalarioBase()
		+ ", Vendas Mensais = " + this.vendasMensais + ", Salário Comissionado = " + calcularSalario());
	}
	
	public void exibirInformacao(double vendasMensais, double comissaoDetalhada) {
		System.out.println("Vendas mensais = " + this.vendasMensais + ", Salário com comissão = " + calcularSalario());
	}
}
