package exPOOdois;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario(19, 2500.00f, "Desenvolvedor Jr", "Graduando", "Giyo Dias");
		Funcionario f2 = new Funcionario(25, 4500.00f, "Desenvolvedor Jr", "Tecnólogo", "João Silva");

		f1.visualizar();
		System.out.println("\n\n");
		f2.visualizar();

	}
}
