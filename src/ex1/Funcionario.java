package ex1;

public class Funcionario {
	protected String nome;
	protected double salarioBase;
	protected String cargo;
	private String departamento;
	
	public double calcularSalario() {
		return salarioBase;
	}
	
	public void exibirInformacao() {
		System.out.println(toString());
	}
	
	public void exibirInformacao(String informacaoExtra) {
		System.out.println(informacaoExtra);
	}
	
	public Funcionario() {
		super();
	}

	public Funcionario(String nome, double salarioBase, String cargo, String departamento) {
		super();
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.cargo = cargo;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "[Nome = " + nome + ", Salario Base = " + salarioBase + ", Cargo = " + cargo + ", Departamento = "
				+ departamento + "]";
	}
	
	
	
}
