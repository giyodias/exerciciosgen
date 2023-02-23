package collections;

import java.util.Scanner;
import java.util.ArrayList;

public class ExUm {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite uma cor: ");
			leia.skip("\\R?"); //pois é uma string
			cores.add(leia.nextLine());// adiciona o que foi lido
			//pelo scanner
		}
		
		System.out.println("Lista não ordenada: ");
		for(String cor : cores) {
			System.out.println(cor);
		}
		
		cores.sort(null);
		System.out.println("Lista ordenada: ");
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		leia.close();
	}
}
