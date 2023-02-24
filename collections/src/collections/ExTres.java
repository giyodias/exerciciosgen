package collections;

import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;
import java.util.HashSet;

public class ExTres {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();

		
		for(int contador= 0; contador < 10; contador++) {
			System.out.println("Digite um número: ");
			numeros.add(leia.nextInt());
		}
		
		Iterator<Integer> iNumeros = numeros.iterator();
		
		while(iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}	
		
		leia.close();
	}
}
