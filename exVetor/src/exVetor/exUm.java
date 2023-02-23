package exVetor;

import java.util.Arrays;
import java.util.Scanner;

public class exUm {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int vetor[] = {9, 8, 7, 10, 6, 1, 2, 3, 4, 5};
		int numero;

		System.out.println("Digite o número que deseja encontrar: ");
		numero = leia.nextInt();
		
		for(int posicao = 0; posicao < vetor.length; posicao ++) {
			if (vetor[posicao] == numero){
				System.out.println("O número " + numero + " está localizado na posição " + posicao);
				posicao = vetor.length;
				
			}else if(posicao == vetor.length -1) {
				
				if(vetor[posicao] != numero)
				System.out.println("O número " + numero + " não pôde ser encontrado.");
			}
		}

		leia.close();
	}

}
