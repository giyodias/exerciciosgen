package exSwitch;

import java.util.Scanner;

public class ExQuatro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int cod;
		float saldo = 1000;
		float saque, deposito;
		
		System.out.println("Digite o código da operação: ");
		cod = leia.nextInt();
		
		switch(cod) {
		case 1:
			System.out.println("Você escolheu checar saldo.");
			System.out.printf("Saldo disponível: R$ %.2f", + saldo);
			break;
		case 2:
			System.out.println("Você escolheu realizar saque.");
			System.out.println("Digite o valor do saque: ");
			saque = leia.nextFloat();
				if(saque <= saldo) {
					System.out.printf("Saque de R$ %.2f", saque, " realizado.");
					System.out.printf("\nNovo saldo: R$%.2f", + (saldo - saque));
				}else {
					System.out.println("Saldo insuficiente.");
				}
			break;
		case 3:
			System.out.println("Você escolheu realizar depósito.");
			System.out.println("Digite valor do depósito: ");
			deposito = leia.nextFloat();
			System.out.printf("Novo saldo: R$ %.2f", + (saldo + deposito));
			break;
		default:
			System.out.println("Opção indisponível.");
			
		leia.close();
		}
		
		
		
	}

}
