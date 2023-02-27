package exPOOdois;

public class Gerente extends Funcionario{
	int qtFuncionarios;
	int nivel;
	
	public Gerente(int idade, float salario, String empresa, String formacao, String nome, int qtFuncionarios,
			int nivel) {
		super(idade, salario, empresa, formacao, nome);
		this.qtFuncionarios = qtFuncionarios;
		this.nivel = nivel;
	}

	public int getQtFuncionarios() {
		return qtFuncionarios;
	}

	public void setQtFuncionarios(int qtFuncionarios) {
		this.qtFuncionarios = qtFuncionarios;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Quantidade de funcionários: " + this.qtFuncionarios);
		System.out.println("Nível: " + this.nivel);
		System.out.println("---------------------------------------------");
	}
}
