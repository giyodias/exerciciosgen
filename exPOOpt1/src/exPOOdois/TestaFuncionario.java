package exPOOdois;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario(19, 2500.00f, "Generation BR", "Graduando", "Giyo Dias");
		Funcionario f2 = new Funcionario(25, 4500.00f, "Generation BR", "Tecnólogo", "João Silva");

		f1.visualizar();
		System.out.println("\n\n");
		f2.visualizar();

		Gerente g1 = new Gerente(23, 2500.00f, "Mercado", "Graduando", "Maria Santos", 20, 2);
		Vendedor v1 = new Vendedor(18, 4500.00f, "Mercado", "Tecnólogo", "Enzo Pereira", 500.00f, 20);
		
		g1.visualizar();
		System.out.println("\n\n");
		v1.visualizar();
		
	}
}
