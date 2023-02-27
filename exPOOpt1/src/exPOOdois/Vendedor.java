package exPOOdois;

public class Vendedor extends Funcionario{
	float bonus;
	int qtVendas;
	
	public Vendedor(int idade, float salario, String empresa, String formacao, String nome, float bonus, int qtVendas) {
		super(idade, salario, empresa, formacao, nome);
		this.bonus = bonus;
		this.qtVendas = qtVendas;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	public int getQtVendas() {
		return qtVendas;
	}

	public void setQtVendas(int qtVendas) {
		this.qtVendas = qtVendas;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Bonus: " + this.bonus);
		System.out.println("Quantidade de vendas: " + this.qtVendas);
		System.out.println("---------------------------------------------");
	}
	
	
	
}
