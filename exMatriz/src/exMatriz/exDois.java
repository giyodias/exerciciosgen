package exMatriz;

import java.util.Scanner;
import java.util.Arrays;

public class exDois {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float matriz[][] = new float[2][4];
		float vetMedias[] = new float [10];
		int linha, coluna;
		float somaLinha = 0f;
		
		
		for(linha = 0; linha < matriz.length; linha++) {
			for(coluna = 0; coluna < matriz[linha].length; coluna++) {
			System.out.println("Digite um número para ocupar a linha " + linha + " e coluna " + coluna);
			matriz[linha][coluna] = leia.nextFloat();
			}
		}

		for(linha = 0; linha < matriz.length; linha++) {
			for(coluna = 0; coluna < matriz[linha].length; coluna++) {
				//matriz[linha][coluna] é desse jeito pra poder navegar pelas linhas, pois é
				//uma matriz.
				somaLinha = somaLinha + matriz[linha][coluna];
			}
			vetMedias[linha] = somaLinha / matriz[linha].length;
			//a soma é zerada pois o valor ja foi inserido no vetor
			somaLinha = 0f;
		}
		//for each - para cada item media (variavel criada agora), mostre um elemento do 
		//vetor vetMedias. toda vez que o item media é mostrado, na proxima vez vai mostrar o
		//próximo
		
		System.out.println();
		for(float media : vetMedias) {
			System.out.printf("%.1f", media, " ");
			System.out.println(" ");
		}	
	
		leia.close();
		}
	}