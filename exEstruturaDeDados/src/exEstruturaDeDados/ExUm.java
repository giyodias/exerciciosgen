package exEstruturaDeDados;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;



public class ExUm {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int cod;
		Queue<String> fila = new LinkedList<String>();
		
		do {
			System.out.println("****************************************");
			System.out.println("\n");
			System.out.println("               --- FILA ---             ");
			System.out.println("        1 - Adicionar novo cliente      ");
			System.out.println("        2 - Listar os clientes          ");
			System.out.println("        3 - Chamar um cliente            ");
			System.out.println("        0 - Finalizar programa          ");
			System.out.println("\n");
			System.out.println("****************************************");
			System.out.println("Digite um número: ");
			cod = leia.nextInt();
				
				switch(cod) {
				case 1:
					System.out.println("Digite o nome do cliente: ");
					leia.skip("\\R?");
					fila.add(leia.nextLine());
					System.out.println("Cliente adicionado!");
					System.out.println("Lista de clientes na fila:");
					System.out.println(fila);
					System.out.println("\n\n");
					
					break;
					
				case 2:
					System.out.println("Lista de clientes na fila:");
					if(fila.isEmpty()) {
						System.out.println("(...)");
						System.out.println("A fila está vazia.");
					}else {
						System.out.println(fila);
					}
					System.out.println("\n\n");
					
					break;
					
				case 3:
					System.out.println("Chamando cliente... ");
					System.out.println("(...)");
					
					if(fila.isEmpty()) {
						System.out.println("A fila está vazia.");
					}else {
					fila.remove();
					System.out.println("O cliente foi chamado!");
					System.out.println("Lista de clientes na fila:");
					System.out.println(fila);
					}
					System.out.println("\n\n");
					break;
				case 0:
					System.out.println("Finalizando programa...");
					System.exit(0);
					break;
				}
		}while(cod != 0);	
		leia.close();
	}
}
