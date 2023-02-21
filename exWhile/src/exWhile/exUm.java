package exWhile;

import java.util.Scanner;

public class exUm {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int maior = 0, menor = 0, idade = 0;
		
		while(idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if(idade < 21 && idade >= 0) {
				menor++;
				
			}else if(idade > 50) {
				maior++;
			}
		}
		
		System.out.println("Quantidade de pessoas com menos de 21 anos: " + menor);
		System.out.println("Quantidade de pessoas com mais de 50 anos: " + maior);
		
		leia.close();
	}

}
