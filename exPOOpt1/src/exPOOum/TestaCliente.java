package exPOOum;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente(31, "Lorelai Gilmore", "Stars Hollow", "11 984280458", "Feminino");
		Cliente c2 = new Cliente(33, "Luke", "Stars Hollow", "11 984280458", "Masculino");
		
		c1.visualizar();
		System.out.println("\n\n");
		c2.visualizar();
	
	}
}
