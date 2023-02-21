package exSwitch;

import java.util.Scanner;

public class ExTres {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float n1, n2, res;
		int cod;
		
		
		System.out.println("Digite o primeiro número da operação: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número da operação: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o código da operação: ");
		cod = leia.nextInt();
		
		switch(cod) {
		case 1:
			res = n1 + n2;
			System.out.println("Você escolheu soma!");
			System.out.println(n1 + " + " + n2 + " = " + res);
			break;
			// mas e se nesse caso eu quisesse que o numero aparecesse
			//com .00?
			
		case 2:
			res = n1 - n2;
			System.out.println("Você escolheu subtração!");
			System.out.println(n1 + " - " + n2 + " = " + res);
			break;
			
		case 3:
			res = n1 * n2;
			System.out.println("Você escolheu multiplicação!");
			System.out.println(n1 + " x " + n2 + " = " + res);
			break;
			
		case 4: 
			res = n1 / n2;
			System.out.println("Você escolheu divisão!");
			System.out.println(n1 + " / " + n2 + " = " + res);
			break;
		default:
			System.out.println("Opção inválida!");
		}
	}

}
