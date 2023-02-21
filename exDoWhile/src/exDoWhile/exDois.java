package exDoWhile;

import java.util.Scanner;

public class exDois {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		float media, soma = 0, contador = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
				soma = soma + numero;
				contador++;
			}
		}while(numero != 0);
		
		media = soma / contador;
		
		System.out.println("Média entre números digitados que são múltiplos de 3: " + media);
		
		leia.close();
	}

}
