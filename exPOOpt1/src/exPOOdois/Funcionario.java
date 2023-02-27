package exPOOdois;

public class Funcionario {
	
	private int idade;
	private float salario;
	private String cargo;
	private String formacao;
	private String nome;
	
	public Funcionario(int idade, float salario, String cargo, String formacao, String nome) {
		super();
		this.idade = idade;
		this.salario = salario;
		this.cargo = cargo;
		this.formacao = formacao;
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void visualizar() {
		
		System.out.println("---------------------------------------------");
		System.out.println("           Dados do funcionário:             ");
		System.out.println("---------------------------------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Formação: " + this.formacao);
		System.out.println("Salário: R$" + this.salario);
		System.out.println("---------------------------------------------");
	}

}
