package exEstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;


public class ExDois {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		int opcao = 0;
		
		do {
			System.out.println("*****************************************");
			System.out.println("            Pilha de livros!             ");
			System.out.println("\n");
			System.out.println("       1 - Adicionar livro na pilha      ");
			System.out.println("       2 - Listar todos os livros        ");
			System.out.println("       3 - Remover livro da pilha        ");
			System.out.println("       0 - Sair                          ");
			System.out.println("\n");
			System.out.println("*****************************************");
			System.out.println("Digite um número: ");
			opcao = leia.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("\n");
				System.out.println("Digite o nome do livro: ");
				leia.skip("\\R?");
				pilha.push(leia.nextLine());
				System.out.println("Livro adicionado!");
				System.out.println("\n");
				System.out.println("Pilha de livros: ");
				System.out.println(pilha);
				System.out.println("\n");
				break;
			case 2:
				System.out.println("\n");
				if(pilha.isEmpty()) {
					System.out.println("A pilha está vazia.");
				}
				System.out.println("Pilha de livros: ");
				System.out.println(pilha);
				System.out.println("\n");
				break;
			case 3:
				System.out.println("\n");
				if(pilha.isEmpty()) {
					System.out.println("A pilha está vazia.");
				}else {
					System.out.println("Livro removido!");
					pilha.pop();	
				}
				System.out.println("Pilha de livros: ");
				System.out.println(pilha);
				System.out.println("\n");
				break;
			case 0:
				System.out.println("\n");
				System.out.println("Finalizando sistema...");
				System.exit(0);
				break;
			default:
				System.out.println("\n");
				System.out.println("Opção indisponível.");
				System.out.println("\n");
			}

			
			
		}while(opcao != 0);
		
		
		
		leia.close();
	}

}
