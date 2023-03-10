package exSwitch;

import java.util.Scanner;

public class ExUm {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int cod, qt;
		double preco;
		
		System.out.println("Digite o código do produto: ");
		cod = leia.nextInt();
		System.out.println("Digite a quantidade do produto");
		qt = leia.nextInt();
		
		switch(cod) {
		
		case 1:
			preco = 10.00;
			System.out.println("Você selecionou " + qt + " cachorro(s) quente!");
			System.out.printf("Valor total: R$ %.2f" , + preco * qt); 
			//nesse último sysout foi utilizado o printf (pois permite a formatação
			//texto do float de acordo com o comando %.2f- 2 caracteres depois do .)
			//e, diferente do println, após a frase é necessária uma vírgula. nesse
			//caso, utilizei a vírgula para separar e o + para adicionar a operação.
			break;
		
		case 2:
			preco = 15.00;
			System.out.println("Você selecionou " + qt + " X-salada(s)!");
			System.out.printf("Valor total: R$ %.2f" , + preco * qt);
			break;
		
		case 3:
			preco = 18.00;
			System.out.println("Você selecionou " + qt + " X-bacon(s)!");
			System.out.printf("Valor total: R$ %.2f" , + preco * qt);
			break;
		
		case 4:
			preco = 12.00;
			System.out.println("Você selecionou " + qt + " bauru(s)!");
			System.out.printf("Valor total: R$ %.2f" , + preco * qt);
			break;
		
		case 5:
			preco = 8.00;
			System.out.println("Você selecionou " + qt + " refrigerante(s)!");
			System.out.printf("Valor total: R$ %.2f" , + preco * qt);
			break;
		
		case 6:
			preco = 13.00;
			System.out.println("Você selecionou " + qt + " suco(s) de laranja!");
			System.out.printf("Valor total: R$ %.2f" , + preco * qt);
			break;
			
		default:
			System.out.println("Produto indisponível!");
		}
	}

}
