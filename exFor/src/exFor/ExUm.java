package exFor;

import java.util.Scanner;

public class ExUm {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1, num2, contador;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextInt();
		
		if(num2 > num1) {
			System.out.println("No intervalo entre " + num1 + " e " + num2 + ":");
			
			for(contador = num1; contador <= num2; contador++) {
				
				if(contador % 3 == 0 && contador % 5 == 0) {
					System.out.println("O número " + contador + " é múltiplo de 3 e de 5");
				}
			}	
		}else {
			System.out.println("Intervalo inválido.");
		}
		leia.close();
	}

}
