package exFor;

import java.util.Scanner;

public class ExDois {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		int contador = 0, par = 0, impar = 0;
		
		for(contador = 1; contador <= 10; contador ++) {
			System.out.println("Digite o " + contador + "º número");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				par++;
			}else{
				impar++;
			}
		}
		
		System.out.println("Quantidade de números ímpares: " + impar);
		System.out.println("Quantidade de números pares: " + par);
		
		leia.close();
	}

}
