package ex1;

public class Gerente extends Funcionario{
	
	private double bonusPercentual = 0.2;
	
	public Gerente(String nome, double salarioBase, String cargo, String departamento, double bonusPercentual) {
		super(nome, salarioBase, cargo, departamento);
		this.bonusPercentual =  bonusPercentual;
	}
	
	public double calcularSalario() {
		return (salarioBase + (salarioBase * bonusPercentual));
	}
	
	public void exibirInformacao() {
		System.out.println("[Nome = " + getNome() + ", Cargo = " + getCargo() + ", Departamento = " + getDepartamento() + ", Salario base = " + getSalarioBase()
		+ ", Salario comissionado = " + calcularSalario() + "]");
	}

	@Override
	public String toString() {
		return "[Nome = " + getNome() + ", Cargo = " + getCargo() + ", Departamento = " + getDepartamento() + ", Salario base = " + getSalarioBase() + 
				", Salario comissionado = " + calcularSalario() + "]";
	}
	
	
}
