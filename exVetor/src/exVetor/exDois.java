package exVetor;

import java.util.Arrays;
import java.util.Scanner;

public class exDois {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetor[] = new int [3];
		int contador;
		double soma = 0;
		double media = 0;
		
		//preenchendo o vetor
		for(contador = 0; contador < vetor.length; contador++) {
			System.out.println("Digite um número: ");
			vetor[contador] = leia.nextInt();
		}
		//fazendo o vetor rodar dentro do for pra checar quais elementos se enquadram
		//na condição e mostrando todos eles. Note que foi colocado um sysout antes e um
		//depois do for pois, se ficassem dentro, se repetiriam a cada cálculo.
		//no primeiro dizemos o que iremos mostrar mas sem o valor calculado.
		//no segundo, mostramos o valor, pois calculamos ele dentro do for.
		System.out.println("Elementos nos índices ímpares: ");
			for(contador = 0; contador < vetor.length; contador++) {
				if(contador % 2 != 0) {
					System.out.println(vetor[contador] + " ");
				}	
			}
		
		System.out.println("Elementos do vetor que são pares: ");
			for(contador = 0; contador < vetor.length; contador++){
				
				if(vetor[contador] % 2 == 0) {
					System.out.println(vetor[contador] + " ");
				}
			}
			
		System.out.println("Soma dos elementos do vetor: ");
			for(contador = 0; contador < vetor.length; contador++) {
				soma = soma + vetor[contador];
			}
			System.out.println(soma);
			
		System.out.println("Média dos elementos do vetor: ");
			for(contador = 0; contador < vetor.length; contador++) {
				media = soma / vetor.length;
			}
			System.out.printf("%.2f", media);
		
		leia.close();
	}

}
