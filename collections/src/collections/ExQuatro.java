package collections;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class ExQuatro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Digite um número para buscar: ");
		int busca = leia.nextInt();
			if(numeros.contains(busca)) {
				System.out.println("O número " + busca + "foi encontrado!");
			}else {
				System.out.println("O número " + busca + " não foi encontrado.");
			}
		leia.close();
	}

}
