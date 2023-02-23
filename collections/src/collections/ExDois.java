package collections;

import java.util.Scanner;
import java.util.ArrayList;

public class ExDois {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Integer numInput, numero = 0;
		
		Integer num1 = 2;
		Integer num2 = 5;
		Integer num3 = 1;
		Integer num4 = 3;
		Integer num5 = 4;
		Integer num6 = 9;
		Integer num7 = 7;
		Integer num8 = 8;
		Integer num9 = 10;
		Integer num10 = 6;
		
		numeros.add(num1);
		numeros.add(num2);
		numeros.add(num3);
		numeros.add(num4);
		numeros.add(num5);
		numeros.add(num6);
		numeros.add(num7);
		numeros.add(num8);
		numeros.add(num9);
		numeros.add(num10);
		
	
		System.out.println("Digite um número inteiro: ");
		numInput = leia.nextInt();

		
		for(int contador = 0; contador < numeros.size(); contador++) {
			numero = numeros.get(contador);
			
			if(numero == numInput) {
				System.out.println("O número " + numInput + " está localizado na posição " + contador);
				contador = numeros.size();
			//senao, se ele já tiver chegado na ultima posição,(numeros.size - 1)
			//cheque se ele se encaixa nessa condição.
			}else if(contador == numeros.size() - 1) {
				if(numero != numInput) {
					System.out.println("O número não foi localizado.");
				}		
			}
		}
		leia.close();
	}

}
