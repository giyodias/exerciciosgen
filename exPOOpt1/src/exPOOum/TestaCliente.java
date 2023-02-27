package exPOOum;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("lorelai.gmail.com", "Lorelai Gilmore", "Stars Hollow", "11-9xxxxxxxx", "Feminino");
		Cliente c2 = new Cliente("luke@gmail.com", "Luke", "Stars Hollow", "11 9xxxxxxxx", "Masculino");
		
		c1.visualizar();
		System.out.println("\n\n");
		c2.visualizar();
		
		PessoaJuridica pj1 = new PessoaJuridica("luke@gmail.com", "Luke", "Stars Hollow", "11 9xxxxxxxx", "Masculino", "Luke's", "989438829994");
		PessoaFisica pf1 = new PessoaFisica("lorelai.gmail.com", "Lorelai Gilmore", "Stars Hollow", "11-983948204", "Feminino", "Rory", "12894388902");
		
		pj1.visualizar();
		System.out.println("\n\n");
		pf1.visualizar();
		
	
	
	}
}
