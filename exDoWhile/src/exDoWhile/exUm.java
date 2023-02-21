package exDoWhile;

import java.util.Scanner;

public class exUm {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero, soma = 0;
		
		do{
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero > 0) {
				soma = soma + numero;
			}
			
		}while(numero != 0);
		
		System.out.println("Soma dos números positivos: " + soma);
		
		leia.close();
	}

}
